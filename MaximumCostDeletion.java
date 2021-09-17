import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	/**

	000
	
	delete length 3  - 3 * 2 + 0 = 6

        100111
	
	00
	111

	


	**/

	void solve(int n, int a, int b, String s){
		if(b > 0){
			println(a*n + n * b);
			return;
		}
		
		//Negative b and we want to find ways to minimize group as much as possible

		int group = 1;
		char prev = s.charAt(0);

		for(int i=1; i<n; i++){
			if(s.charAt(i) != prev){
				group++;
				prev = s.charAt(i);
			}
		}

		// There are n / 2 + 1 ways to delete all ones or zeros 
		// b * k where k is the number of deletion performs

		println(a * n + (group/2 + 1) * b);
		return;
	}
	
	public void execute() throws IOException{
		int n = nextInt();
		
		for(int i=0; i<n; i++){
			solve(nextInt(), nextInt(), nextInt(), nextLine());
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
