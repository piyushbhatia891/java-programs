package com.piyush.programs.integer;

/**
 * Created by piyushbha on 9/25/2019.
 */
public class DuplicatesOnLength {
    public static void main(String[] args){
        System.out.println(getDuplication(new int[]{1,2,3,4,2}));
    }
    static int countRange(int[] numbers, int start, int end)
    {
        int count = 0;
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] >= start && numbers[i] <= end)
                ++count;
        return count;
    }

    static int getDuplication(int[] numbers)
    {
        int start = 1;
        int end = numbers.length;
        while(end >= start){
            int middle =0;
                    middle=((end - start) >> 1) + start;
        int count = countRange(numbers, start, middle);
        if(end == start) {
            if(count > 1)
                return start;
            else
                break;

        }

        if(count > (middle - start + 1))
            end = middle;
        else
            start = middle + 1;
    }
    return -1;
}

}

