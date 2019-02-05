package emailapp;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;


	// Constructor to recieve first name and last name

	public Email(String firstName, String lastName) {

		// vv class var || vv local var
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created " + this.firstName + " " + this.lastName);

		// call a method asking for the department & return the department
		// private class department calls setDepartment method
		this.department = setDepartment();


	}

	// Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES:\n1 for sales Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");



		// creating a scanner object to read the "IT department's input of the above code"
		Scanner in = new Scanner(System.in);
		// this portion reads the integer entered in the command line
		int depChoice = in.nextInt();



		if (depChoice == 1) { return "sales"; } 
		else if (depChoice == 2) { return "development"; } 
		else if (depChoice == 3) { return "accounting"; } 
		else { return ""; }

	}



	// Generate a random password

	// Set the mailbox capacity

	// Set the alternate email

	// Change the password


}