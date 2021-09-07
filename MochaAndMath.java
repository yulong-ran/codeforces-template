import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	/**
	[3,11,3,7]

	- If all elements are odd then anwser is the smallest number
	- If there is an even number answer is 0
	
	0010
	0011

	[3,7,2]
	
	[2,7,2]

	**/
	public void solve(int n, String input){
		String[] numbers = input.split(" ");

		int mask = Integer.parseInt(numbers[0]);

		for(int i=1; i<n; i++){
			mask = mask & Integer.parseInt(numbers[i]);
		}

		println(mask);

		return;
	}
	
	public void execute() throws IOException{
		int n = nextInt();
		
		for(int i=0 ;i<n; i++){
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
