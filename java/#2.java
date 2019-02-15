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
            long n = in.nextLong();
            
            long fn = 0;
            long fn1 = 8;
            long fn2 = 2;
            long sum =10;
            
            fn = 4*fn1 + fn2;
            
            while(fn <= n){
                sum = sum +fn;
                fn2 = fn1;
                fn1 = fn;
                fn = 4*fn1 + fn2;
                }
            System.out.println(Long.toString(sum));
            }
        }
    }
