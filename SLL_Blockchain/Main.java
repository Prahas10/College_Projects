package end_sem2;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		SLL1 apbCoin = new SLL1();		// Creates a new Linked List
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 5) {			
			System.out.println("1.Enter data into blockchain");
			System.out.println("2.Display the Blockchain ");
			System.out.println("3.Get scammed");
			System.out.println("4.Validity");
			System.out.println("5.Stop");
			System.out.println();
			System.out.println("Enter a choice value : ");
			choice = sc.nextInt();		// Takes user input for Choice
			sc.nextLine();
			System.out.println();
			switch (choice) {		// Switch case
			case 1:
				String s1;
				System.out.println("Enter the string: ");
				s1 = sc.nextLine();
				Block1 a = new Block1(new java.util.Date(), s1);
				apbCoin.insertBack(a);
				break;
			case 2:
				apbCoin.displayChain();
				System.out.println();
				break;
			case 3:
				int y;
				System.out.println("Enter the block number to be scammed: ");
				y = sc.nextInt();
				apbCoin.GetNth(SLL1.head, y);
				apbCoin.displayChain();
				System.out.println();
				break;
			case 4:
				apbCoin.isValid();
				System.out.println();
				break;
			}
		}
		System.out.println("Code Implementation Completed");
	}
}
