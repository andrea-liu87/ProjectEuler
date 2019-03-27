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
            
            int result = 0;
            for (int i =100; i<1000; i++){
                for (int j= 100; j<1000; j++){
                    if (isPalindrome(i*j) && (i*j)<n){
                        if (result < i*j){
                            result = i*j;
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
    
    public static boolean isPalindrome (int a){
        String s = Integer.toString(a);
        char[] b = s.toCharArray();
        int size = b.length;
        for (int i= 0; i<size/2; i++){
            if (b[i] != b[size-1-i]){
                return false;
            }
        }
        return true;
    }
}