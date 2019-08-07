import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by piyushbha on 9/25/2018.
 */
public class MapSort {

    public static void main(String[] args){
        final Map<String,Integer> wordCounts=new HashMap<>();
        wordCounts.put("USA",100);
        wordCounts.put("Canada",200);
        wordCounts.put("Australia",300);
        wordCounts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
    }
}
