import java.io.*;

public class Main {
    static int[] arr, dp;
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp = new int[N];
        int LIS = 0;
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < N; i++) {
            int idx = BinarySearch(arr[i], 0, LIS);
            if(idx == -1) {
                dp[LIS++] = arr[i];
            }
            else {
                dp[idx] = arr[i];
            }
        }
        System.out.println(N - LIS);
    }
    
    public static int BinarySearch(int num, int start, int end) {
        int res = -1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(num <= dp[mid]) {
                res = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        
        return res;
    }
}