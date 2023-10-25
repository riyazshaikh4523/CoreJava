package switchstatement;
//4. Simple Menu: Develop a simple menu-driven program that presents options
//(1-3) to the user (e.g., "1. Print", "2. Save", "3. Exit") and performs actions
//based on the user's choice using a switch-case statement.
public class SwitchStatementEx03 {

	public static void main(String[] args) {
		int Simplemenu=1;
		switch(Simplemenu){
			
		case 1:
			System.out.println("1.Print");
			break;
		case 2:
			System.out.println("2.Save");
			break;
		case 3:
			System.out.println("3.Exit");
			break;
		
		}
	}

}
