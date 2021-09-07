import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	boolean[] prime = new boolean[100];

	public void  solve(int n, String s){
		// Case 1; Contains non-primie digits
		for(int i=0; i<n; i++){
			if(s.charAt(i) == '1' || s.charAt(i)== '4' 
			|| s.charAt(i) == '6' || s.charAt(i) == '9'){
				println(1);
				println(s.charAt(i));
				return;
			}
		}


		// Case 2+
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				int num =  (s.charAt(i) - '0') * 10  + (s.charAt(j)- '0');
				if(!prime[num]){
					println(2);
					println(num);
					return;
				}
			}
		}		

	}


	
	public void execute() throws IOException{
		for(int i=2; i<100; i++){
			prime[i] = true;
			for(int j=2; j*j <=i; j++){
				if(i % j == 0){
					prime[i] = false;
				}
			}
		}

		int n = nextInt();

		for(int i=0; i<n; i++){
			solve(nextInt(), nextLine());
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
