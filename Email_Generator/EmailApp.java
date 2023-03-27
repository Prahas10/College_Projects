package email_app;

import java.util.*;

public class EmailApp {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String f_name = scn.next();
		System.out.println("Enter Last name: ");
		String l_name = scn.next();
		
		Email em1 = new Email(f_name,l_name);
		int choice = -1;
		do {
			System.out.println("\n******\nEnter your Choice\n1. To show info\n2. To change password\n3. To change mailbox capacity \n4. To set alternate mail \n5. Store data in file \n6. Display data in file \n7. TO EXIT");
			choice = scn.nextInt();
			switch(choice) {
			case 1:
				em1.getInfo();
				System.out.println();
				break;
			case 2:
				em1.set_password();
				break;
			case 3:
				em1.set_mailCap();
				break;
			case 4:
				em1.altMail();
				break;
			case 5:
				em1.storeFile();
				break;
			case 6: 
				em1.read_file();
				break;
			case 7:
				System.out.println("THANK YOU");
				break;
			default:
				System.out.println("Invalid choice.\n Enter correct choice");
			}
		}while (choice != 7);
		
	}

}
