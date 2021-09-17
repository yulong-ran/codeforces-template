import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Arrays;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	

	/**

	**/

	void solve(Integer[]nums){
		int n = nums.length, res = 0;
		
		Arrays.sort(nums, new Comparator<Integer>(){
			public int compare(Integer a, Integer b){
				return a % 2 - b % 2;	
			}
		});
		

		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				res += gcd(nums[i], nums[j]* 2) > 1 ? 1 : 0;
			}		
		}

		println(res);
	}
	
	int gcd(int a, int b){
		if(b == 0) return a;
		
		return gcd(b, a%b);
	
	}
	public void execute() throws IOException{
		int n = nextInt();
		
		for(int i=0; i<n; i++){
			solve(toArray(nextInt(), nextLine()));
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

	Integer[] toArray(int n, String input){
		Integer[] res = new Integer[n];
		
		String[] number = input.split(" ");

		for(int i=0; i<n; i++){
			res[i] = Integer.parseInt(number[i]);
		}

		return res;
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
