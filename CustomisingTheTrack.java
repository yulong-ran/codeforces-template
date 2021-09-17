import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;

	/**

	0 1 1 0
	
	0 0 1 1
	
	(Brute force this with n^2)
	
	1 2 3 4 = 10 % 4 = 2 (2 elements that will be greater than other) 
		
	2 2 3 3 = 

		2 -3
		2 -3
		2 -3
		2 -3

	over = sum % n
	
	average = sum / n

	res = over *( n - over)

	- Case 1: sum < n
		- we  don't need to change anything

	- Case 2: sum % n == 0
		- We can equally distrubute cars into each track
		- return 0

	- Case 2: Try to fill in nums[i] with sum  / 2

	**/
	void solve(int n, String s){
		String[] numbers = s.split(" ");

		long  sum = 0;
		long  over = 0;

		for(int i=0; i<n; i++){
			sum += Long.parseLong(numbers[i]);
		}
	
		// Case 1: Equal distrubution
		if(sum % n == 0) println(0);
		else{
			// Elements that going to have more than others
			over = (sum  %  n);
			println(over * (n - over));
		}
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
