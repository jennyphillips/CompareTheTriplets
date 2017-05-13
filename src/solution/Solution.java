package solution;

import java.util.*;

public class Solution {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int [] aScore = new int[3];
        int [] bScore = new int[3];
        
        for (int i = 0; i < 3; i++) {
            aScore[i] = scanner.nextInt();
            if (aScore[i] < 1 || aScore[i] > 100) return;
        }
        
        for (int i = 0; i < 3; i++) {
            bScore[i] = scanner.nextInt();
            if (bScore[i] < 1 || bScore[i] > 100) return;
        }
        
        int aResult = 0;
        int bResult = 0;
        
        for (int i = 0; i < 3; i++) {
            if (aScore[i] > bScore[i]) aResult +=1;
            else if (aScore[i] < bScore[i]) bResult += 1;
                
        }
        System.out.print(aResult + " " + bResult + "\n");
        scanner.close();
    }

}
