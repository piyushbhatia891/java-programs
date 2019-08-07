package com.piyush.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


/**
 * Created by piyushbha on 11/1/2018.
 */
public class CommonElements {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 3, 5, 7, 9);

        //List<Integer> common = list1.stream()
    }
    /*public static Optional<String> getSubject(String subject){
        return stringStream(subject)
                .map(senderNote -> senderNote.split("\\|"))
                //.filter(senderNoteArr -> (senderNoteArr.length == 4))
                .map(strArr -> strArr[2])
                .findFirst();
    }*/

}
