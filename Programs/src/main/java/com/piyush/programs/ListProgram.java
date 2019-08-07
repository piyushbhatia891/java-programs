package com.piyush.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by piyushbha on 2/13/2019.
 */
public class ListProgram {
    public static void main(String[] args){
        List test= Collections.EMPTY_LIST;
        List test2= new ArrayList();
        test2.add("one");

        System.out.println(test.removeAll(test2));
        System.out.println(test2.size());
    }
}
