import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(br.readLine());
        // 팀개수   문제개수   팀id   로그엔트리개수
        // n k t m
        
        // 팀id   문제번호   획득점수
        // i j s
        
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 팀 개수
            int k = Integer.parseInt(st.nextToken()); // 문제 개수
            int t = Integer.parseInt(st.nextToken()); // 팀 id
            int m = Integer.parseInt(st.nextToken()); // 로그 엔트리 개수
            
            int[][] array = new int[n+1][k+1]; // array[팀][문제]
            int[] total = new int[n+1]; // 팀 총합
            int[] count = new int[n+1]; // 풀이 제출 횟수
            int[] last = new int[n+1];  // 마지막 제출 시간
            int[] rank = new int[n+1]; // 최종 순위위
            
            for(int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(st.nextToken()); // 팀 id
                int no = Integer.parseInt(st.nextToken()); // 문제 번호
                int score = Integer.parseInt(st.nextToken()); // 획득 점수
                
                array[id][no] = Math.max(array[id][no], score); // 점수 최대값 저장
                count[id]++; // 제출 횟수 증가
                last[id] = j; // 마지막 제출 시간 업뎃뎃
            }
            
            for(int j = 1; j <= n; j++) {
                for(int l = 1; l <= k; l++) {
                    total[j] += array[j][l];
                }
            }
            
            for(int j = 1; j < n; j++) {
                for(int l = j + 1; l <= n; l++) {
                    if(total[j] == total[l]) {
                        if(count[j] == count[l]) {
                            if(last[j] > last[l]) {
                                rank[j]++;
                            } else {
                                rank[l]++;
                            }
                        } else {
                            if(count[j] > count[l]) {
                                rank[j]++;
                            } else {
                                rank[l]++;
                            }
                        }
                    } else if(total[j] < total[l]) {
                        rank[j]++;
                    } else {
                        rank[l]++;
                    }
                }
            }
            
            System.out.println(rank[t] + 1);
            
        }
    }
}