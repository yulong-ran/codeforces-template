import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	

	/**

	t = contest dur
	
	first p - start 0 and finish 5
	
	second p - start 2  and finish 7

	third p =  start 4 and finish 9
	
		 0 1 2 3 
	entTime	 5 7 9 11 
	starTime 0 2 4 6

	start time = ix

	finish time = t + ix
	
	i = 0 0 5
	i = 1 2 7
	i = 2 4 9

        endTime - startTime = t (5)

	2
	2
	1
	
	each participants will get t/x  dissatisfaction

	i + 1 and i + min(t/x, n); 
		
	
		
	**/
	void solve(int  n, int x, int t){
		long res = 0;

		long  v  = t / x;

		res = v * Math.max(0, n-v)  + Math.min(n-1, v-1) * Math.min(n, v)/2;
		
		println(res);
		
	}
	
	public void execute() throws IOException{
		int n = nextInt();
		
		for(int i=0; i<n; i++){
			solve(nextInt(), nextInt(), nextInt());
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
