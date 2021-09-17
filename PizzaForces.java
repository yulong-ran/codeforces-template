import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	/**

	n = 15
		
	15 - 6 *2 = 3 

	15 - 8 = 7

	15 - 10 = 5

	**/
	void solve(long n){
		long sum =0;
		long  x = 0, y=0;

		x = n / 6;
		y = n % 6;

		if(y == 0){
			sum += 0;
		}		
		else if(y <= 2){
			sum += 5;
		} else if(y <=4){
			sum += 10;
		} else{
			sum += 15;
		}

		sum += x * 15;

		println( n <= 6 ? 15 : sum);
	}

	
	public void execute() throws IOException{
		int n = nextInt();
	
		for(int i=0; i<n; i++){
			solve(nextLong());
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
