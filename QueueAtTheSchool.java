import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;

	public String solve(String input, int n){
		// At each iteration, if input[i] is a B and input[i+1} is a gril,
		// and we do this n time
		char[] line = input.toCharArray();
		
		for(int i=0; i<n; i++){
			int j = 0;
			while(j + 1 < input.length()){
				if(line[j] == 'B' && line[j+1] == 'G'){
					line[j] = 'G';
					line[j+1] = 'B';
					j = j+2;
				}else{
					j++;
				}
			}
			
		}

		return String.valueOf(line);
	}
	
	public void execute() throws IOException{
		int n = nextInt();
		int m = nextInt();
		String line = next();
		
		println(solve(line, m));

		
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
