package switchstatement;
//Language Selector: Write a program that asks the user to select a language
//(1-3) and displays a greeting message in the selected language (e.g., "1.
//English", "2. French", "3. Spanish") using a switch-case statement.
public class SwitchStatementEx04 {

	public static void main(String[] args) {
		int language=3;
		switch(language){
			
		case 1:
			System.out.println("1.English");
			break;
		case 2:
			System.out.println("2.French");
			break;
		case 3:
			System.out.println("3.Spanish");
			break;
		}
	}

}
