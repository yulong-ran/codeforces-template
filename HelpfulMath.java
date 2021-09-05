import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;

	public String solve(String input){
		int[] count = new int[3];
		for(int i=0; i<input.length(); i++){
			if(i % 2 == 0){
				count[input.charAt(i) - '0' - 1]++;
			}
		}

		StringBuilder sb = new StringBuilder();

		for(int i=0; i<count.length; i++){
			while(count[i] > 0){
				sb.append(i + 1);
				sb.append("+");
				count[i]--;
			}
		}

		return sb.deleteCharAt(sb.length()-1).toString();

		
	}
	
	public void execute() throws IOException{
		int n = 1;

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
