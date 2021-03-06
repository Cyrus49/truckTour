import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the truckTour function below.
     */
    static int truckTour(int[][] petrolpumps) { 
        int[] diff = new int[petrolpumps.length];
        for(int i = 0; i<petrolpumps.length; i++){ //prepares diff array
            diff[i] = petrolpumps[i][0]-petrolpumps[i][1];
        }
        int curAmt = diff[0];
        int startIndx = 0;
        for(int end = 1; end!=startIndx || curAmt<0;){ //loops through each pump
            while(curAmt<0&&startIndx!= end){ //remove first index if the sum becomes negative
                curAmt -= diff[startIndx];
                startIndx++;
                startIndx%=petrolpumps.length;
            }
            curAmt+= diff[end];
            end++;
            end %=petrolpumps.length;
        }
        return startIndx;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        int[][] petrolpumps = new int[n][2];

        for (int petrolpumpsRowItr = 0; petrolpumpsRowItr < n; petrolpumpsRowItr++) {
            String[] petrolpumpsRowItems = scanner.nextLine().split(" ");

            for (int petrolpumpsColumnItr = 0; petrolpumpsColumnItr < 2; petrolpumpsColumnItr++) {
                int petrolpumpsItem = Integer.parseInt(petrolpumpsRowItems[petrolpumpsColumnItr].trim());
                petrolpumps[petrolpumpsRowItr][petrolpumpsColumnItr] = petrolpumpsItem;
            }
        }

        int result = truckTour(petrolpumps);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
