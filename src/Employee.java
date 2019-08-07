import java.util.ArrayList;
import java.util.List;

/**
 * Created by piyushbha on 12/14/2017.
 */
public class Employee {
    public int id;
    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;

    }
    public static List<Employee> getEmpList(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "piyush"));
        list.add(new Employee(2, "pradeep"));
        list.add(new Employee(3, "surender"));
        list.add(new Employee(1, "ajay"));
        return list;
    }
    public static List<Employee> getEmpList2(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "piyush"));
        list.add(new Employee(2, "pradeep"));
        list.add(new Employee(3, "surender"));
        list.add(new Employee(4, "ajay"));
        list.add(new Employee(4, "amit"));
        return list;
    }
}