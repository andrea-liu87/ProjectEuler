import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
        
            BigInteger sum = new BigInteger("0");
            int nr = n-1;
            int x3 = nr/3;
            int x5 = nr/5;
            int x15 = nr/15;

            BigInteger sum1 = BigInteger.valueOf(x3+1); 
            sum1 = sum1.multiply(BigInteger.valueOf(3*x3));

            BigInteger sum2 = BigInteger.valueOf(x5+1); 
            sum2 = sum2.multiply(BigInteger.valueOf(5*x5));
            
            BigInteger sum3 = BigInteger.valueOf(x15+1); 
            sum3 = sum3.multiply(BigInteger.valueOf(15*x15));

        sum = sum.add(sum1).add(sum2).subtract(sum3).divide(BigInteger.valueOf(2));
        System.out.println(sum);
        }
        
    }
}