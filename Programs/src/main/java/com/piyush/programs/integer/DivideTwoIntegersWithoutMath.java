package com.piyush.programs.integer;

public class DivideTwoIntegersWithoutMath {
    public static void main(String[] args){
        getQuotient(-2147483648L,1L);
    }
    static void getQuotient(Long dividend,Long divisor){
        int sign=((dividend<0)^(divisor<0)) ? -1 :1;
        Long quotient=0L;
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        while(dividend>=divisor){
            dividend-=divisor;
            ++quotient;
        }
        System.out.println(quotient*sign);
    }
}
