import java.util.ArrayList;
import java.util.List;
public class TheArrayList{
    public static void main(String[] args){

    //     List<String> colors = new ArrayList();   //Basically list can have elements of any type but by specifying <String> you only enter strings     
    //    colors.add("blue");
    //     colors.add("pink");
        // colors.add(1);
        // colors.add(new Object());

// System.out.println(colors); 
// System.out.println(colors.size());
// System.out.println(colors.contains("pink"));


// colors.forEach(System.out::println);  too loop through list


// System.out.println(colors.get(1));



List<String> colorsUnmodifiable = List.of("blue",  "pink", "yellow"); // this type of list is not modifible where you can't add or remove from list

// colorsUnmodifiable.add("green");  // Error where you can't add as immutable

// colorsUnmodifiable.forEach(System.out::println);


    }
}