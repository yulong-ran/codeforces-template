import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;

	public int solve(String a, String b){
		char[] a2 = a.toLowerCase().toCharArray();
		char[] b2 = b.toLowerCase().toCharArray();
		
		for(int i=0; i<a2.length; i++){
			if(a2[i] - b2[i] != 0){
				return a2[i] - b2[i] > 0 ? 1 : -1;
			}
		}

		return 0;
	}
	
	public void execute() throws IOException{
		int n = 2;

		String[] inputs = nextLines(n);
		

		println(solve(inputs[0], inputs[1]));

		
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
