package com.piyush.programs.array;

import com.piyush.models.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorSort {
    public static void main(String[] args){
        List<Employee> al = new ArrayList<Employee>();
        Employee e1=new Employee("puneet",235);
        Employee e2=new Employee("puneet",234);
        al.add(e1);
        al.add(e2);
        Collections.sort(al,new EmployeeComparisonComparator());
        Iterator<Employee> custIterator = al.iterator();

        System.out.println("After Sorting:\n");
        while (custIterator.hasNext()) {
            System.out.println(custIterator.next());
        }

    }
    static class EmployeeComparisonComparator implements Comparator<Employee>{


        public int compare(Employee e1,Employee e2){
            int NameCompare=e1.getName().compareTo(e2.getName());
            int rollCompare=e1.getRollNumber().compareTo(e2.getRollNumber());
            if (NameCompare == 0) {
                return ((rollCompare == 0) ? NameCompare : rollCompare);
            } else {
                return NameCompare;
            }
        }
    }
}

