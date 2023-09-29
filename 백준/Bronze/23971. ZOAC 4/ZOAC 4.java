import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int answer = 1;
		
		answer *= H % (N + 1) != 0 ? (H / (N + 1)) + 1 : H / (N + 1);
		answer *= W % (M + 1) != 0 ? (W / (M + 1)) + 1 : W / (M + 1);
		
		System.out.println(answer);
		
		sc.close();
	}
}