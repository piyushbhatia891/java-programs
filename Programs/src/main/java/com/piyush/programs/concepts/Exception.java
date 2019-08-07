package com.piyush.programs.concepts;

/**
 * Created by piyushbha on 6/12/2019.
 */
public class Exception {
    private static java.lang.Exception exception;
    public static void main(String[] args) throws java.lang.Exception{
        callOne();
    }

    public static void callOne() throws java.lang.Exception{
        callSecond();
    }
    public static void callSecond() throws java.lang.Exception{
        throw exception;
    }
}
