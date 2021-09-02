import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	

	public static void main(String[]args) throws IOException{
		new Solution().execute();
	}

	private void execute() throws IOException{
		String input = br.readLine();
		solve(input);
		System.out.println();
	}

	private void solve(String input) throws IOException{
		print(input);
	}

	public static void print(String print){
		System.out.print(print);
	}
}
