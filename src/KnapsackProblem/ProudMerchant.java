package KnapsackProblem;

import java.io.*;
import java.util.*;
public class ProudMerchant {
	int n,m,M=6000;
	int dp[]=new int[M];
	public static void main(String[] args) {
		new ProudMerchant().work();
	}
	void work(){
		Scanner sc=new Scanner(new BufferedInputStream(System.in));
		while(sc.hasNext()){
			n=sc.nextInt();
			m=sc.nextInt();
			Node node[]=new Node[n];
			for(int i=0;i<n;i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				node[i]=new Node(a,b,c);
			}
			Arrays.sort(node);//每件商品按 (this.qi-this.pi)>(o.qi-o.pi) 进行升序排序
			Arrays.fill(dp,0);
			for(int i=1;i<=n;i++){
				for(int j=m;j>=0;j--){
					if(j>=node[i-1].qi){
						int k1=node[i-1].pi;
						int k2=node[i-1].vi;
						dp[j]=Math.max(dp[j],dp[j-k1]+k2);
					}
				}
			}
			System.out.println(dp[m]);
		}
	}
	class Node implements Comparable<Node>{
		int pi;
		int qi;
		int vi;
		Node(int pi,int qi,int vi){
			this.pi=pi;
			this.qi=qi;
			this.vi=vi;
		}
		public int compareTo(Node o) {
			return (this.qi-this.pi)>(o.qi-o.pi)?1:-1;
		}
	}
}
