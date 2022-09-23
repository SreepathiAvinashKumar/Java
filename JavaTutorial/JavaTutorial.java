import java.util.Date;
import java.awt.*;
import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Scanner;
public class JavaTutorial{
public static void main(String[] args){

// // primitive types
byte a = 3;
short b = 23;
int c = 3222;
long e = 3_33_33L;
double d = 323_22.33;
float f = 3.2F;
char letter = 'A';
boolean isOk = true;


// //Reference Types


// String s = new String();   s = "  Hello World  ";  // String  or   String s = "hello world" directly as shortcut  Strings are immutable in java
// Date date= new Date();


//     Point point1 = new Point(1,2);
//     Point point2 =point1;  // Copy by the references 
//     point1.x = 2;
//     // System.out.println(point1);
//     System.out.println(s.endsWith("!!"));  // Returns boolean value
//     System.out.println(s.startsWith("!!"));  // Returns boolean value
// System.out.println(s.length());  // Returns length of string
// System.out.println(s.indexOf('e')); // Returns index
// System.out.println(s.replace('e','a'));  // Returns replaced string as new String
// System.out.println(s.trim());  // Removes spaces on both sides


////Arrays    1D

////method 1 of declare array
// int[] numbers = new int[3];

// numbers[0] = 1;
// numbers[1]=2;

//  method 2

// int[] numbers = {2,3,1};

// System.out.println(numbers);  where it returns calculated address of arrays object

// System.out.println(Arrays.toString(numbers));
// Arrays.sort(numbers);  // Sort the Array 
// System.out.println(Arrays.toString(numbers));


// //Array  2D


// int[][] twoArray = {{2,3,4},{5,6,7}};

// System.out.println(Arrays.deepToString(twoArray));  // used to print 2D arrays

// final float pi = 3.14f;  // way to declare as constant

// System.out.println(pi);

// //Parsing

// String str ="2";
// System.out.println(Integer.parseInt(str)+2); // retuns 4 as 2+2 =4
// Float.parseFloat()
// Short.parseShort()
// Double.parseDouble() if str =2.1



// // Random Numbers  between 1 to 200

// System.out.println((int)(Math.random()*200));




// // Number formating


//  String result =   NumberFormat.getPercentInstance().format(123456.891); // getCurrencyInstance() for Dollor sign 


// System.out.println(result);



//  // Scanner Input method

// Scanner input = new Scanner(System.in);
// String dec = input.nextLine();  // next()  nextInt() nextFloat() nextDouble()
// System.out.println("Yours age "+ dec);



// foreach 

// String[] s = {"Apple","Mango","Grapes","Pomogranet","PineApple","Cherry"};

// for(String fruit :s){
// System.out.println(fruit);
// }







}

}