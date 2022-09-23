import java.util.HashSet;
import java.util.Set;

public class TheSet{
    public static void main(String[] args){

        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("black"));
        balls.add(new Ball("red"));
        balls.add(new Ball("blue")); // adds the element 
        balls.remove(new Ball("red"));// remove the element 

        System.out.println(balls.size());
        balls.forEach(System.out::println); 
        

    }

    record Ball(String color){}
}