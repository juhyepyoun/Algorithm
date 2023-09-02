import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int startX = Integer.parseInt(st.nextToken());
		    int startY = Integer.parseInt(st.nextToken());
		    int endX = Integer.parseInt(st.nextToken());
		    int endY = Integer.parseInt(st.nextToken());
		    int n = Integer.parseInt(br.readLine());
		    int count = 0;
		    for(int j = 0; j < n; j++) {
		        st = new StringTokenizer(br.readLine());
		        int cx = Integer.parseInt(st.nextToken());
		        int cy = Integer.parseInt(st.nextToken());
		        int r = Integer.parseInt(st.nextToken());
		        
		        boolean isStartInside = isInside(cx, cy, r, startX, startY);
		        boolean isEndInside = isInside(cx, cy, r, endX, endY);
		        
		        if((isStartInside || isEndInside) && !(isStartInside && isEndInside)) {
		            count++;
		        }
		        
		    }
		    System.out.println(count);
		}
	}
	
	public static boolean isInside(int a, int b, int r, int x, int y) {
        return Math.sqrt(Math.pow((x-a), 2) + Math.pow((y-b), 2)) < r;
    }
}