package com.piyush.programs.inheritance;

public class InheritenceMainClass {
    public static void main(String[] args){
        ParentClass parentClass=new ParentClass();
        ParentClass parentChildClass=new ChildClass();
        ChildClass childClass=new ChildClass();
        //parentClass.firstFunction();
        parentChildClass.thirdFunction();
        childClass.firstFunction();
        Employee employee=new Employee();
        employee.setFirstName("piyush");
        updateAddressForEmployee(employee);
        System.out.println(employee.getAddress().getAddress1());
    }
    static void updateAddressForEmployee(Employee employee){
        Address address=new Address();
        address.setAddress1("address1");
        address.setAddress2("address2");
        employee.setAddress(address);

    }
}
