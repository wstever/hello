package String;
import java.util.Arrays;
import java.util.Comparator;
/*	
 ��֪һ���ַ����ַ���"aaaabbbbbcccbbbbbd"��Ҫ������������
bbbbb
bbbbb
aaaa
ccc
d
���ݳ����жൽ�������� 
*/
public class stringSortDemo2 {   
    public static void main(String[] args) {   
        String str = "aaaabbbbbcccbbbbbd";   //��������ַ���
        //ʹ��������ʽ��ʼ�и�
        String[] strs = str.split("(?<=(\\w))(?!\\1)");   
        //��������
        Arrays.sort(strs, new Comparator<String>() {   
            public int compare(String a, String b) {   
                return b.length() - a.length();   
            }   
        });   
        for (String s : strs) 
        	System.out.println(s);   
    }   
}  