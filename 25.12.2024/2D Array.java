import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr=new ArrayList<>();

        for (int i=0;i < 6;i++){
            String[] arrRowTempItems=bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> arrRowItems=new ArrayList<>();

            for (int j=0;j < 6;j++){
                int arrItem=Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }

        bufferedReader.close();

        int maxHourglassSum=Integer.MIN_VALUE;

        for (int i=0;i < 4;i++){
            for (int j=0;j < 4;j++){
                int hourglassSum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)
                       +arr.get(i+1).get(j+1)
                       +arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);

                maxHourglassSum=Math.max(maxHourglassSum, hourglassSum);
            }
        }

        System.out.println(maxHourglassSum);
    }
}
