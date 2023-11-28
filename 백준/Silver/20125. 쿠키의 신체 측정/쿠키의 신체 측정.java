import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] array = new char[N][N];
        int heartX = 0;
        int heartY = 0;
        int leftArm = 0;
        int rightArm = 0;
        int waist = 0;
        int leftLeg = 0;
        int rightLeg = 0;
        
        for(int i = 0; i < N; i++) {
            array[i] = br.readLine().toCharArray();
        }
        
        // find heart
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(array[i][j] == '*') {
                    heartX = i + 1;
                    heartY = j;
                    break;
                }
            }
            if(heartX != 0) {
                break;
            }
        }
        
        // left arm
        for(int i = 0; i < heartY; i++) {
            if(array[heartX][i] == '*') {
                leftArm++;
            }
        }
        
        // right arm
        for(int i = heartY + 1; i < N; i++) {
            if(array[heartX][i] == '*') {
                rightArm++;
            } else {
                break;
            }
        }
        
        
        // waist
        for(int i = heartX + 1; i < N; i++) {
            if(array[i][heartY] == '*') {
                waist++;
            } else {
                break;
            }
        }
        
        // left leg
        for(int i = heartX + waist + 1; i < N; i++) {
            if(array[i][heartY - 1] == '*') {
                leftLeg++;
            } else {
                break;
            }
        }
        
        // right leg
        for(int i = heartX + waist + 1; i < N; i++) {
            if(array[i][heartY + 1] == '*') {
                rightLeg++;
            } else {
                break;
            }
        }
        
        System.out.println((heartX+1) + " " + (heartY+1));
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
    }
}