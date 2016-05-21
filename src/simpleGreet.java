/**
 *   File Name: simpleGreet.java<br>
 *
 *   Dighe, Richa<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Richa Dighe<br>
 *   Created: May 21, 2016
 *   
 */

/**
 * simpleGreet //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      LastName, FirstName
 * @version     1.0.0
 * @since       1.0
 *
 */
import java.util.*;

public class simpleGreet {

	static Scanner scanner = new Scanner(System.in);

	// Farewell Message
	public static void exitApplication() {
		System.out.println("Thank you for using SQA sol");
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		System.out.println("Hello Welcome to SQA sol");
		System.out.print("could i get your name: ");
		name = scanner.nextLine();
		System.out.println("Welcome to Bootcamp " + name + "!");
		exitApplication();
	}

}
