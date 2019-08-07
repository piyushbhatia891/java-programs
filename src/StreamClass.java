import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by piyushbha on 5/24/2018.
 */
public class StreamClass {

    public static void main(String[] args){
        List<Employee> emp1=Employee.getEmpList();
        emp1.stream()
                .filter(distinctByKey(Employee::getId))
                .map(emp->emp.getName())
                .forEach(System.out::println);
                //.collect(Collectors.toList());
        Stream.of("piyush","bhatia","pradeep","amit","piyush")
                .distinct()
                .forEach(System.out::println);
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
