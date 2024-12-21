import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String args) {
        String n = scanner.nextLine();

        scanner.close();

        BigInteger number = new BigInteger(n);

        if (number.isProbablePrime(100)) { // 100 is a confidence level
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
