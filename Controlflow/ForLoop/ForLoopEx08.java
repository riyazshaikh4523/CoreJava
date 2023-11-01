package forloopassignment;
// Multiplication Table: Develop a program that takes an integer as input  and prints 
//the multiplication table for that number up to 10 using a `for`  loop. 
import java.util.Scanner;

public class ForLoopEx08 {

	public static void main(String[] args) {
		int a;
		int b=10;
		
		Scanner sc=new Scanner(System.in);
		System.out.println( "The value of a is: " );
		a=sc.nextInt();
		System.out.println("the value of a is " + a);
		for(b=1; b<=10; b++) {
			
			System.out.println(a*b);
		}
	}
	}

