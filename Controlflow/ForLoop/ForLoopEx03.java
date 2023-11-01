package forloopassignment;
// Odd Numbers: Write a program to print all the odd numbers  between 30 and 50 using a `for` loop. 
public class ForLoopEx03 {

	public static void main(String[] args) {
		int a=30;
		int b=50;
		for (a=30;a<=50;a++) {
			if(a%2!=0){
				System.out.println(a);
			}
		}
	}

}
