import java.util.ArrayList;

/**
 * Created by piyushbha on 1/10/2018.
 */
public class Escape {
    public static void main(String[] args)
    {
        ArrayList<String> colors = new ArrayList <String> ();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("White");
        colors.add("Pink");

        ArrayList <String> removeColors = new ArrayList <String> ();
        removeColors.add("Green");
        removeColors.add("jkn");

        Boolean bool=removeColors.removeAll(colors);
        System.out.println(bool);
    }
}
