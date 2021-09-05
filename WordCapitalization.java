import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;

	public String solve(String input){
		
		return Character.toUpperCase(input.charAt(0)) +  input.substring(1, input.length());
	}
	
	public void execute() throws IOException{
		int n = 0;

		String input = nextLine();
		

		println(solve(input));

		
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
