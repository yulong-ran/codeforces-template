import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
	BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;

	public static void main(String[]args) throws IOException{
		new Solution().execute();
	}

	private void execute() throws IOException{
		int n  = nextInt();
		
		String[] inputs = new String[n];

		for(int i=0; i<n; i++){
			inputs[i] = next();			
		}
		print(solve(inputs));
		System.out.println();
		br.close();
	}

	private int solve(String[] input) throws IOException{
		int x = 0;
		for(String oper: input){
			x = oper.indexOf("+") == -1 ? x -1  : x + 1;
		}
		
		return x;
	}

	public static void print(Object print){
		System.out.print(print);
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
		}
		
		catch(IOException e){
			e.printStackTrace();
		}

		return str;
	}
}
