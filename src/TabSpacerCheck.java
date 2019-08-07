import java.util.Arrays;

/**
 * Created by piyushbha on 7/26/2018.
 */
public class TabSpacerCheck {

    public static void main(String[] args){
        String tabStringTest="My name is :  piyush bhatia";
        //System.out.println(tabStringTest);
        String[] tabStringedArray=tabStringTest.split("\\s+",2);
        Arrays.stream(tabStringedArray)
                .forEach(stringVal->{
                    System.out.println(stringVal);
                });
    }
}
