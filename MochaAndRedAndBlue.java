import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	

	public void solve(int n, String s){
		// ? is white R is red B is blue
		char[] colors = s.toCharArray();
		
		int c = 0;
		
		for(char color: colors){
			if(color != '?') c++;
		}		
		
		if(c < 1){
			colors[0] = 'B';
		}
		
		// Assigning the color depends on i-1
		for(int i=1; i<n; i++){
			if(colors[i] == '?' && colors[i-1] != '?'){
				colors[i] = colors[i-1] == 'B' ? 'R' : 'B';
			}
		}
		
		// Assigning the color depends on i + 1
		for(int i=n-2; i>=0; i--){
			if(colors[i] == '?' && colors[i+1] != '?'){
				colors[i] = colors[i+1] == 'B' ? 'R' : 'B';
			}
		} 

		println(String.valueOf(colors));
	}
	
	public void execute() throws IOException{
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
