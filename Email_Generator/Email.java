package email_app;

import java.util.*;
import java.io.*;

public class Email {

	public Scanner scn = new Scanner(System.in); // global scanner

	// setting variables

	private String fname; // Private to not give access directly
	private String lname;
	private String dept;
	private String mail;
	private String password;
	private int mailCapacity = 500;
	private String altMail;

	public Email(String fname, String lname) { // constructor

		this.fname = fname;
		this.lname = lname;

		System.out.println("New Employee: " + this.fname + " " + this.lname);

		this.dept = this.setDept();
		this.password = this.generate_password(8);
		this.mail = this.generate_email();

	}

	// method to generate email
	private String generate_email() {

		return this.fname.toLowerCase() + "." + this.lname.toLowerCase() + "@" + this.dept.toLowerCase()
				+ ".company.com";

	}

	// method to ask department
	private String setDept() {
		System.out.println("Department Codes \n 1 for Sales\n 2 for Development\n 3 for Accounts");

		boolean flag = false;
		do {

			System.out.println("Enter Department Code:");

			int choice = scn.nextInt();
			switch (choice) {
			case 1:
				return "sales";
			case 2:
				return "development";
			case 3:
				return "accounts";
			default:
				System.out.println("Invalid choice. Please choose again");
			}
		} while (!flag);
		return null;
	}

	// method for random password generation
	private String generate_password(int length) {

		Random rand = new Random();

		String Capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_char = "abcdefghijklmnopqrstuvwxyz";
		String Numbers = "0123456789";
		String Symbols = "!@#$%&_?";
		String value = Capital_char + Small_char + Numbers + Symbols;
		String password = "";
		for (int i = 0; i < length; i++) {
			password = password + value.charAt(rand.nextInt(value.length()));
		}
		return password;
	}

	// method to change password
	public void set_password() {
		boolean flag = false;
		do {
			System.out.println("Do you want to change your password? (Y/N)");
			char choice = scn.next().charAt(0); // to only choose first character i.e at zeroth index
			if (choice == 'Y' || choice == 'y') {
				flag = true;
				System.out.println("Enter current password:");
				String temp = scn.next();
				if (temp.equals(this.password)) {
					System.out.println("Enter new password:");

					this.password = scn.next();
					System.out.println("Password changed successfully");
				} else {
					System.out.println("Incorrect password");
				}

			} else if (choice == 'N' || choice == 'n') {
				flag = true;
				System.out.println("Password not changed.");
			} else {
				System.out.println("Enter Valid Choice");
			}
		} while (!flag);
	}

	public void set_mailCap() {
		try {

			System.out.println("Current Capacity = " + this.mailCapacity + "mb");
			System.out.println("Enter new mailbox capacity:");
			this.mailCapacity = scn.nextInt();
			System.out.println("Mailbox capacity has been updated to: " + this.mailCapacity);
		}

		catch (InputMismatchException z) {
			System.out.println("Wrong input");
			System.out.println("Please input integer value");
		}

	}

	public void altMail() {
		System.out.println("Enter alternate email id: ");
		this.altMail = scn.next();
		System.out.println("Your alternate email is set to: " + this.altMail);
	}

	// display user information
	public void getInfo() {

		System.out.println("Name: " + this.fname + " " + this.lname);
		System.out.println("Department: " + this.dept);
		System.out.println("Email id generated: " + this.mail);
		System.out.println("Password generated: " + this.password);
		System.out.println("Mailbox capacity: " + this.mailCapacity + "mb");
		System.out.println("Alternate mail id: " + this.altMail);

	}

	public void storeFile() {
		try {
			FileWriter in = new FileWriter("D:\\Java\\Email_information.txt");
			in.write("First Name: " + this.fname);
			in.append("Last name: " + this.lname + "\n");
			in.append("EmailId is: " + this.mail + "\n");
			in.append(password + "\n");
			in.append(altMail + "\n");
			in.close();
			System.out.println("Data Stored...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// reading
	public void read_file() {
		try {
			FileReader f1 = new FileReader("D:\\\\Java\\\\Email_information.txt");
			boolean i;

			while (i = f1.read() != -1) {
				System.out.println((boolean) i);
			}
			f1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
