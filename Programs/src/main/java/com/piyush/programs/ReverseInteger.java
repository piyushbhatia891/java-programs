package com.piyush.programs;

/**
 * Created by piyushbha on 2/27/2019.
 */
public class ReverseInteger {
    public static void main(String[] args){
        int test=123;
        System.out.println(reverse(test));
    }
    public static int reverse(int test){
        int reverse=0;
        while (test!=0){
            reverse=reverse*10+test%10;
            test=test/10;
        }
        return reverse;
    }
}
