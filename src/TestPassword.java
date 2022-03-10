

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class TestPassword {

	public static void main(String[] args) {
		 String regExpTest =
		            "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!]).{7,12}$";
		 
		 CharSequence passwordstr = regExpTest;
		 
		// Print a message asking the user to input a password via the console 
					System.out.println("The password must contain:\r\n"
							+ " At least one lowercase letter\r\n"
							+ " At least one uppercase letter\r\n"
							+ " At least minimum 7 characters\r\n"
							+ " At least maximum 12 characters\r\n"
							+ " An exclamation point: !"
							+ "Please enter a password: ");
					
					//Receive the input via the console
					Scanner scan = new Scanner(System.in);
					String passwordlgt = scan.nextLine();

		    
				//Validation Process	
			    Pattern pattern = Pattern.compile(regExpTest,Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(passwordlgt);
		    
		  //If the password is valid, print "Password valid and accepted"
		    if(matcher.matches())
		        System.out.println("Password valid and accepted");
		 // If the password isn’t valid, print "Error"
		    else
		    	System.out.println("Error!");

	}

}
