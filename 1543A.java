import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	/**

	8 5  + 1  = 9 6
	
	1 2  + 1  = 2 3

	4 4  + 0 =  0 0

	3 9  + 3 



	**/
	void solve(long a, long b){
		if(a == b){
			println("0 0");
			return;
		}
		
		long gcd = Math.abs(a - b);
		
		System.out.printf("%d %d", gcd, Math.min(a%gcd, gcd - a%gcd));
		println("");
	}
	
	public void execute() throws IOException{
		int n = nextInt();
		
		for(int i=0; i<n; i++){
			solve(nextLong(), nextLong());
		}

		
		br.close();
	}

	public static void main(String[] args) throws IOException{
		new Solution().execute();
	}

	void print(Object obj){
		System.out.print(obj);
	}
	
	void println(Object obj){
		System.out.println(obj);
	}
	
	String next() {
		while(st == null || !st.hasMoreElements()){
			try{
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return st.nextToken();
	}

	String nextLine() {
		String str = "";
	
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return str;
	}
	
	String[] nextLines(int lines) {
		String[] inputs = new String[lines];
	
		for(int i=0; i<lines; i++){
			inputs[i] = nextLine();
		}

		return inputs;
	}

	int nextInt() {
		return Integer.parseInt(next());
	}
	
	long nextLong() {
		return Long.parseLong(next());
	}
	
	double nextDouble() {
		return Double.parseDouble(next());
	}
	
}
