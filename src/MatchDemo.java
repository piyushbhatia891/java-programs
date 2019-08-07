import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by piyushbha on 12/14/2017.
 */
public class MatchDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();
        List<String> finalList = Arrays.asList("piyush", "surender", "pradeep","ajay");


        boolean flag=list.stream().map(p->p.name).allMatch(p->finalList.contains(p));
                System.out.println(flag);
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
        //Streams intermediate function will not execute unless untill its closed by a terminal operation like count or foreach etc
        System.out.println(Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                }).count());

    }
    public static List<Employee> getEmpList2(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "piyush"));
        list.add(new Employee(2, "pradeep"));
        list.add(new Employee(3, "surender"));
        list.add(new Employee(4, "ajay"));
        //list.add(new Employee(5, "amit"));
        return list;
    }
}