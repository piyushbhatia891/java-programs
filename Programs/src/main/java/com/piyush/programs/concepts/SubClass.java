package com.piyush.programs.concepts;

/**
 * Created by piyushbha on 6/12/2019.
 */
public class SubClass extends ParentClass {
    public SubClass() {
        System.out.println("base");
    }
    public void foo(){
        System.out.println("parent");
    }
    public static void main(String[] args){
        final int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {10, 20, 30, 40, 50};
        arr2 = arr1;
        //arr1 = arr2;
        for (int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);
        SubClass sub=new SubClass();
    }
}
