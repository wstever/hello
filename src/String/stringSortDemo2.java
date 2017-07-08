package String;
import java.util.Arrays;
import java.util.Comparator;
/*	
 已知一个字符串字符串"aaaabbbbbcccbbbbbd"，要求最终排序是
bbbbb
bbbbb
aaaa
ccc
d
根据长度有多到少来排序。 
*/
public class stringSortDemo2 {   
    public static void main(String[] args) {   
        String str = "aaaabbbbbcccbbbbbd";   //定义这个字符串
        //使用正则表达式开始切割
        String[] strs = str.split("(?<=(\\w))(?!\\1)");   
        //进行排序
        Arrays.sort(strs, new Comparator<String>() {   
            public int compare(String a, String b) {   
                return b.length() - a.length();   
            }   
        });   
        for (String s : strs) 
        	System.out.println(s);   
    }   
}  