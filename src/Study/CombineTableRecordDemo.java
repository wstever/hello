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
			//��Ҫ����һ��ʹ��try_catch
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
		//ע�����������ʹ��
			BufferedReader mBufferReader=new BufferedReader(new InputStreamReader(System.in));
			Map <Integer,Integer> mTreeMap=new TreeMap<Integer,Integer>(); 
			//��Ҫ����һ��ʹ��try_catch
			System.out.println("��������Ҫ�����������");
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
