import java.io.*;
import java.util.*;

public class Solution{

    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder s=new StringBuilder(A);
        System.out.println(s.reverse().toString().equals(A) ? "Yes" : "No");
        
    }
}
