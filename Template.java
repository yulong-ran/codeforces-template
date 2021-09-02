import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer st;

  private int solve(String[] input) throws IOException {
    return -1;
  }

  private void execute() throws IOException {
    int n = nextInt();

    String[] inputs = nextLines(n);

    print(solve(inputs));
    System.out.println();
    br.close();
  }

  public static void main(String[] args) throws IOException {
    new Solution().execute();
  }

  public static void print(Object obj) {
    System.out.print(obj);
  }

  public static void println(Object obj) {
    System.out.println(obj);
  }

  String next() {
    while (st == null || !st.hasMoreElements()) {
      try {
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

  String[] nextLines(int n) {
    String[] inputs = new String[n];

    for (int i = 0; i < n; i++) {
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
