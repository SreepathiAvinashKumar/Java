import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TheMap{
    public static void main(String[] args){
        Map<Integer,Person>  map = new HashMap<>();    // where it does't contains duplicates of keys 
        map.put(1,new Person("Alex"));
        map.put(2,new Person("Alexa"));
        map.put(3,new Person("Mariam"));
        map.put(4,new Person("Kalik"));
        map.put(5,new Person("Kalik"));
        map.remove(3);  // remove using key
        

        System.out.println(map.getOrDefault(3,new Person("Default")));
                System.out.println(map.values());// returns values

        // System.out.println(map);
        // System.out.println(map.size());
        // System.out.println(map.get(5)); //get value by using key
        // System.out.println(map.containsKey(4)); // checks key exits or not  returns  boolean value

        // System.out.println(map.keySet());  // returns the keys of map as set or list of keys.

        //  System.out.println(map.entrySet());  // list of elements in map

        //  map.entrySet().forEach(System.out::println);
        // map.entrySet().forEach(x -> System.out.println(x.getkey() + " " + x.getValue()));   //  lambda not working but you can use when approite importing lambda 
       

        // System.out.println(map.size());

        
// Hashmap produce Hash for keys where it always produce same hash code 
        


    }

    record Person(String name){}  // custom datatype using record 
}