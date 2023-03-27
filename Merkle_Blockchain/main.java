package end_sem3;
import java.util.Scanner;


public class main {
	public static void main(String args[]) {
		SLL1 dbChain = new SLL1();		// Creates a new Linked List
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 6) {
			System.out.println("1.Insert Element to Block");
			System.out.println("2.Display the DLL ");
			System.out.println("3.Display the Chain ");
			System.out.println("4.Search");
			System.out.println("5.Remove");
			System.out.println("6.Stop");
			System.out.println();
			System.out.println("Enter a choice value : ");
			choice = sc.nextInt();		// Takes user input for Choice
			sc.nextLine();
			System.out.println();
			switch (choice) {		// Switch case
			case 1:
				String x;
				System.out.println("Enter the table name: ");
				x = sc.nextLine();
				Block b = new Block(x);
				dbChain.add_data(b);
				System.out.println();
				break;
			case 2:
				dbChain.display();
				System.out.println();
				break;
			case 3:
				dbChain.displayChain();
				System.out.println();
				break;
			case 4:
				
			case 5:
				System.out.println("Enter the location to be deleted: ");
				//apbCoin.remove_item(s);
				System.out.println();
				break;
			}
		}
		sc.close();
		System.out.println("Code Implementation Completed");
	}
}