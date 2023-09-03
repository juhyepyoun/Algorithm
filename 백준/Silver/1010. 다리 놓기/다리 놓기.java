import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] dp = new int[30][30];
		
		for(int i = 0; i < 30; i++) {
		    dp[i][0] = 1;
		    dp[i][i] = 1;
		}
		
		for(int i = 2; i < 30; i++) {
		    for(int j = 1; j < i; j++) {
		        dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
		    }
		}
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
		    st = new StringTokenizer(br.readLine());
		    int r = Integer.parseInt(st.nextToken());
		    int n = Integer.parseInt(st.nextToken());
		    System.out.println(dp[n][r]);
		}
	}
}