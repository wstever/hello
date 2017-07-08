package Other;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URLDecoder;
 
public class fileManageDemo {
    public static void main(String[] args) throws Exception {
        FileManager m1 = new FileManager("a.txt", new char[]{'\n'});
        FileManager m2 = new FileManager("b.txt", new char[]{'\n', ' '});
        FileWriter c = new FileWriter("c.txt");
        String aWord = null;
        String bWord = null;
         //�x�����е�A�ļ��e��ă���
        while((aWord = m1.nextWord()) != null){
            c.write(aWord + "\n");
            bWord = m2.nextWord();
            if(bWord != null){
                c.write(bWord + "\n");
            }
        }
        //�x�����е�B�ļ��e��ă���
        while((bWord = m2.nextWord()) != null){
            c.write(bWord + "\n");
        }
        c.close();
    }
}
 
 
class FileManager{
    String[] words = null;
    int pos = 0;
    public FileManager(String filename, char[] seperators) throws Exception{
//      ClassLoader.getSystemResource("")                                    
    	//file:\D:\Coding_Project\eclipse2\Java�������⼯\Chapter2\bin\a.txt
//      this.getClass().getResource("").getPath()                    
    	//D:/Coding_Project/eclipse2/Java�������⼯/Chapter2/bin/com/example/
        filename=this.getClass().getResource("/").getPath() + filename;
        filename=URLDecoder.decode(filename,"UTF-8");   //����·������
        //����ǰ�Ĕ��M�ȴ�ӡ������Ҫ��һ��·��
//      System.out.println(URLDecoder.decode(this.getClass().getResource("/").getPath(),"UTF-8"));
        
        File f = new File(filename);
        FileReader reader = new FileReader(f);
        char[] buf = new char[(int)f.length()];
        int len = reader.read(buf);
        String results = new String(buf, 0, len);
        String regex = null;
	        if(seperators.length > 1){
	            regex = "" + seperators[0] + "|" + seperators[1];
	        }else{
	            regex = "" + seperators[0];
	        }
          words = results.split(regex);
          reader.close();
  //      System.out.println();
    }
    public String nextWord(){
        if(pos == words.length){
            return null;
        }
        return words[pos++];
    }
}
 

 
