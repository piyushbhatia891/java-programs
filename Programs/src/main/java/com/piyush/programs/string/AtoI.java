package com.piyush.programs.string;

public class AtoI {
    public static void main(String[] args){
        String str="42";
        System.out.println(convertStringToInt(str));
    }
    static int convertStringToInt(String str){
        str=str.trim();
        double result=0;
        char flag='+';
        int i=0;
        if(str.length()==0)
            return 0;
        if(str.charAt(0)=='-') {
            flag = '-';
            i++;
        }
        else if(str.charAt(0)=='+')
        {
            flag = '+';
            i++;
        }
        while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
        if (flag == '-')
            result = -result;

        // handle max and min
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int) result;

    }
}
