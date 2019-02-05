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

		System.out.println("Email created" + this.firstName + " " + this.lastName);
	}

	// Ask for the department

	// Generate a random password

	// Set the mailbox capacity

	// Set the alternate email

	// Change the password


}