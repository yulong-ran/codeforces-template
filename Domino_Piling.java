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
		System.out.println(solve(input));
	}

	private Object solve(String input) throws IOException{
		String[] board = input.split(" ");
		int row = Integer.parseInt(board[0]);;
		int col = Integer.parseInt(board[1]);
		
		int extra = col % 2 == 0 ? 0 : row / 22;
		
		return row * col / 2 + extra;
	}

	public static void print(Object  print){
		System.out.print(print);
	}
}
