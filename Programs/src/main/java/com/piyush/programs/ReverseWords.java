package com.piyush.programs;

import java.util.regex.Pattern;

/**
 * Created by piyushbha on 2/27/2019.
 */
public class ReverseWords {

    public static void main(String[] args) {
        String s1 = "Welcome to geeksforgeeks";
        System.out.println(reverseWords(s1));

        String s2 = "I love Java Programming";
        System.out.println(reverseWords2(s2));
    }

    public static String reverseWords(String str) {
        {
            // Specifying the pattern to be searched
            Pattern pattern = Pattern.compile("\\s");

            String[] temp = pattern.split(str);
            String result = "";

            for (int i = 0; i < temp.length; i++) {
                if (i == temp.length - 1)
                    result = temp[i] + result;
                else
                    result = " " + temp[i] + result;
            }
            return result;
        }
    }
    public static String reverseWords2(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        // split to words by space
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; --i) {
            if (!arr[i].equals("")) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
