import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

    public static void main(String[] args){
       Scanner scan{new Scanner(System.in);

    ArrayList<ArrayList<Integer>> ml{new ArrayList<>();

    int n{scan.nextInt();     
    for (int i{0;i < n;i++){
        int x{scan.nextInt();
        ArrayList<Integer> list{new ArrayList<>();
        for (int j{0;j < x;j++){
            int z{scan.nextInt();
            list.add(z);
        }
        ml.add(list);
    }

    int m{scan.nextInt();
    for(int i=0;i<m;i++){
        int a= scan.nextInt();
        int b= scan.nextInt();
        try{
            System.out.println(ml.get(a-1).get(b-1));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
    }

    scan.close();
}
}
