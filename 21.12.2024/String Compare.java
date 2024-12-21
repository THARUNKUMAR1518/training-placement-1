import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
       Scanner input = new Scanner(System.in);
       String s;
       int subLength;
       s=input.nextLine();
       subLength=Integer.parseInt(input.nextLine());
       input.close();

        
       int iterations = s.length()-subLength;
       String largest = s.substring(0,subLength);
       String smallest = s.substring(0,subLength);
       for(int i = 0; i<=iterations;i++)
       {
           if(largest.compareTo(s.substring(i,i+subLength))<0)
           {
               largest = s.substring(i,i+subLength);
           }
           if(smallest.compareTo(s.substring(i,i+subLength))>0)
           {
               smallest = s.substring(i,i+subLength);
           }
       }
       System.out.println(smallest);
       System.out.println(largest);
    }
}
