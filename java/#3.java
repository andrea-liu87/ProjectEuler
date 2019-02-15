import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    //This algorithm will be timed out for Test Case #5
    //Please share it with me if you can find better solution :)
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            
            while (n % 2 == 0){
                n = n/2;
            }
            if (n ==1){n=2;}
            
            for(int i=3; i*i<=n;){
                if(n%i == 0){
                    n = n/i;}
                else{
                    i = i+2;
                }
            }
            System.out.println(Long.toString(n));
        }
    }
}
