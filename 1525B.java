
import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;

	void solve(Integer[] nums){
		int sorted = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i] == i + 1) sorted++;
		}
		if(sorted == nums.length){
			println(0);
		}else if(nums[0] == nums.length && nums[nums.length-1] == 1){
			println(3);
		}else if(nums[0] == 1 || nums[nums.length-1] == nums.length){
			println(1);
		}
		else{
			println(2);
		}
		// More than 1 element don't need sort


		/// None of element is sorted

	}

	boolean isReveredSorted(Integer[] nums){
		for(int i=nums.length-1; i>0; i--){
			if(nums[i] > nums[i-1]) return false;
		}
		return true;
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

	Integer[] toArray(int n, String s){
		Integer[] res = new Integer[n];
		
		String[] nums = s.split(" ");
		

		for(int i=0; i<n; i++){
			res[i] = Integer.parseInt(nums[i]);
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
