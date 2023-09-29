import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main
{
    public static String isTriangle(int a, int b, int c) {
        int max = Math.max(a, b);
        max = (c > max) ? c : max;
        
        if(max >= (a + b + c - max)) {
            return "Invalid";
        } else {
            if( a == b && b == c ) {
                return "Equilateral";
            } else if(a == b || b == c || c == a) {
                return "Isosceles";
            }
        }
        
        return "Scalene";
    }
    
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        
        try {
            while(!(line = br.readLine()).equals("0 0 0"))
            {
                StringTokenizer st = new StringTokenizer(line);
    		    int a = Integer.parseInt(st.nextToken());
    		    int b = Integer.parseInt(st.nextToken());
    		    int c = Integer.parseInt(st.nextToken());
    		    System.out.println(isTriangle(a, b, c));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}