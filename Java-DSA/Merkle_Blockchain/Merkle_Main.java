package end_sem3;
import java.util.ArrayList;
import java.util.Scanner;

public class Merkle_Main {
	
	public static void main(String[] args) {
		SLL1 dbChain = new SLL1(); // Creates a new Linked List
		Scanner sc = new Scanner(System.in);
		Node root = null;
		int n = 0;
		int choice = 0;
		while (choice != 6) {
			System.out.println("1.Insert Element to Block ");
			System.out.println("2.Display the SLL ");
			System.out.println("3.Search by table in the database ");
			System.out.println("4.Search by product id ");
			System.out.println("5.Display merkle root hash  ");
			System.out.println("6.Stop ");
			System.out.println();
			System.out.println("Enter a choice value : ");
			choice = sc.nextInt(); // Takes user input for Choice
			sc.nextLine();
			System.out.println();

			switch (choice) { // Switch case
			case 1:
				if(dbChain == null) {
					continue;
				}
				else {
					dbChain.deleteAll();
				}
				System.out.println("Enter the number of child nodes : ");
				n = sc.nextInt();
				if (!(MerkleTree.isPowerOfTwo(n)) || n == 0) {
					System.out.println("Cannot Build Merkle Tree!");
					System.out.println();
					break;
				} 
				else {
					ArrayList<Block> dataBlocks = new ArrayList<>();
					String[] string = new String[n];
					sc.nextLine();

					for (int i = 0; i < string.length; i++) {
						System.out.println("Enter the table name: ");
						string[i] = sc.nextLine();
						Block b = new Block(string[i]);
						dataBlocks.add(b);
						dbChain.add_data(b);
					}
					root = MerkleTree.generateTree(dataBlocks);
					System.out.println();
					System.out.println("Merkle Tree Created!");
					System.out.println();
				}
				
				break;
			case 2:
				dbChain.display();
				System.out.println();
				break;
			case 3:
				System.out.println("Enter company name: ");
				String name=sc.next();
				System.out.println("Do you belong to the Company? (Yes/No) ");
				if (MerkleTree.isCompany(sc.nextLine())) {
					System.out.println("Enter the table to be searched : ");
					String x = sc.nextLine();
					if (SLL1.searchTableName(x)) {
						System.out.println("Enter the Company Key: ");
						if (MerkleTree.randomString(x.length()).equals(sc.nextLine())) {
							if (MerkleTree.Merkle_Proof(n, root, x)) {
								dbChain.searchTable(x);
							} 
							else {
								System.out.println("The table searched doesn't validate the Merkle Tree!");
							}
						} 
						else {
							System.out.println("Invalid Company Key");
						}

					} 
					else {
						System.out.println("Table not Found!");
					}
				} 
				else {
					System.out.println("Access Denied!");
				}
				break;
			case 4: 
				System.out.println("Enter the table to be searched : ");
				String t = sc.nextLine();
				System.out.println("Enter The product_id in the table to be searched : ");
				int p = sc.nextInt();
				if (MerkleTree.Merkle_Proof(n, root, t)) {
					dbChain.search(t, p);
				} 
				else {
					System.out.println("The table searched doesn't validate the Merkle Tree!");
				}
				break;
			case 5:
				System.out.println("The Root Hash value of the Merkle Tree is : " + MerkleTree.printRoot(root));
				System.out.println();
				break;
			case 6:
				break;
			}
		}
		sc.close();
		System.out.println("Code Implementation Completed");
	}
}