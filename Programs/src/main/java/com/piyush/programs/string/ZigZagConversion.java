package com.piyush.programs.string;

public class ZigZagConversion {

    public static void main(String[] args){

        System.out.println(getUpdatedZigZagString("ABCDFR",3));
    }
    static String getUpdatedZigZagString(String str,int numRows){
        if(str.length()==1)
            return str;
        StringBuilder sb=new StringBuilder();
        int step=2*numRows-2;
        for(int i=0;i<numRows;i++){
            if(i==0 || i==numRows-1){
                for(int j=i;j<str.length();j=j+step){
                    sb.append(str.charAt(j));
                }
            }
            else{
                int j = i;
                boolean flag = true;
                int step1 = 2 * (numRows - 1 - i);
                int step2 = step - step1;

                while (j < str.length()) {
                    sb.append(str.charAt(j));
                    if (flag)
                        j = j + step1;
                    else
                        j = j + step2;
                    flag = !flag;
                }
            }
        }
        return sb.toString();
    }
}
