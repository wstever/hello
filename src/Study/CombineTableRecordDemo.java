package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class CombineTableRecordDemo {

	public static void main(String[] args) {
		/*try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			Map<Integer, Integer> mTreeMap = new TreeMap<Integer, Integer>();
			//主要是这一句使得try_catch
			int i = Integer.parseInt(in.readLine());

			for (int j = 0; j < i; j++) {
				String s = in.readLine();
				String[] str = s.split(" ");
				int key = Integer.parseInt(str[0]);
				int value = mTreeMap.containsKey(key) ? Integer.parseInt(str[1]) + mTreeMap.get(key) : Integer.parseInt(str[1]);
				mTreeMap.put(key, value);
			}
			for (Integer k : mTreeMap.keySet()) {
				System.out.println(k + " " + mTreeMap.get(k));
			}
		} catch (IOException e) {
		}*/
		
		
		
		try {
		//注意这两个类的使用
			BufferedReader mBufferReader=new BufferedReader(new InputStreamReader(System.in));
			Map <Integer,Integer> mTreeMap=new TreeMap<Integer,Integer>(); 
			//主要是这一句使得try_catch
			System.out.println("请输入您要处理的行数：");
			int number=Integer.parseInt(mBufferReader.readLine()); 
			
			for(int j=0;j<number;j++){
				String [] mArray=mBufferReader.readLine().split(" ");
				int key=Integer.parseInt(mArray[0]);
				
		        int value=mTreeMap.containsKey(key)?Integer.parseInt(mArray[1])+mTreeMap.get(key):Integer.parseInt(mArray[1]); 
				mTreeMap.put(key,value);
			}
			
			for(Integer k:mTreeMap.keySet()){
				System.out.println(k + " " + mTreeMap.get(k));
			}
		} catch (NumberFormatException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
