import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
    System.out.println("enter a number");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    
    if(a>0){
        System.out.println("It is a Positive Number");
    }
    else{
        System.out.println("It is a Negative Number");
    }
}
}
