import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){

        /*
 
 div 5 - fizz
 div 10 - fizz

 div 3 - buzz

 div 5,3 - fizzbuzz

 div not 5,3  -same number 

        */

Scanner input = new Scanner(System.in);
System.out.print("Number: ");
int n = input.nextInt();


if(n%15==0){

System.out.println("FizzBuzz");

}
else if(n%3==0){
    System.out.println("Buzz");
}

else if(n%5==0){
    System.out.println("Fizz");
}
else{
    System.out.println(n);
}



    }
    
}