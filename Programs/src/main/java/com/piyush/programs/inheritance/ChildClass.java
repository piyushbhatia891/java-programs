package com.piyush.programs.inheritance;

public class ChildClass extends ParentClass{
    int val=50;
    public ChildClass(){
        super();
        System.out.println("Inside child class constructor");
    }
    public void firstFunction(){
        System.out.println("Inside first function of child class");
        System.out.println(val);
    }

    public void secondFunction(){
        System.out.println("Inside second function of child class");
    }
}
