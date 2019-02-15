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
            
            long x = (long)n;
            long a = (long)Math.pow(x*(x+1)/2,2); //all sum natural n number formula
            long b = x*(x+1)*(2*x+1)/6; //sum all square natural n number formula
            System.out.println(Long.toString(a-b));
        }
    }
}
