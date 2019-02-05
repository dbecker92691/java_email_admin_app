package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity;
	private String alternateEmail;
	private String companySuffix = "myCompany.com";


	// Constructor to recieve first name and last name

	public Email(String firstName, String lastName) {

		// vv class var || vv local var
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created " + this.firstName + " " + this.lastName);

		// call a method asking for the department & return the department
		// private class department calls setDepartment method
		this.department = setDepartment();
		System.out.println("Department: " + this.department);


		// call a method that sets a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password: " + this.password);


		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
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

	private String randomPassword(int length) {

		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";

		// to set password we will look at passwordSet as an array and from there
		// select a charactor at any given index of that array

	//  (vv char array  equals new char array that takes in the length param)
		char[] password = new char[length];

		// iterating through the value of length
		for(int i = 0; i < length; i++) {

			// selecting a random int and assigning it to the var 'rand'
			int rand = (int) (Math.random() * passwordSet.length());

			// in the var 'password' at position i = passwordSet. at char (rand)
			password[i] = passwordSet.charAt(rand);
		} 

		return new String(password);
	}

	// Set the mailbox capacity

	// Set the alternate email

	// Change the password


}











