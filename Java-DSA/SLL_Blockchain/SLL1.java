package end_sem2;

class SLL1 {
	static Node head = null;
	// Constructors
	SLL1() {
		head = null;
	}
	SLL1(Block1 b1) {
		head = new Node(b1);
	}
	// Insertion Methods
	void insertFront(Block1 b1) {
		if (head == null) {
			head = new Node(b1);
		} else {
			Node temp = new Node(b1);
			temp.next = head;
			head = temp;
		}
	}
	
	void insertBack(Block1 b1) {
		if (head == null) {
			head = new Node(b1);
			head.setPreviousHash(0);
			head.computeHash();
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			Node t1 = new Node(b1);
			temp.next = t1;
			t1.setPreviousHash(temp.getHash());
			t1.computeHash();
		}
	}
	// Calculates the Number of Nodes in the Singly linked List
	public static int noe() {
		Node temp = head;
		int i = 1;
		while (temp.next != null) {
			i++;
			temp = temp.next;
		}
		return i;
	}
	// Displays the data and all other variable fields of all nodes
	public void displayChain() {
		if (head == null) {
			System.out.println("List is Empty!");
		} else {
			Node temp = head;
			while (temp != null) {
				int i = 0;
				for (i = 0; i < noe(); i++) {
					System.out.println("Block : " + (i));
					System.out.println("Timestamp: " + temp.Timestamp);
					System.out.println("PreviousHash: " + temp.previousHash);
					System.out.println("Data: " + temp.data);
					System.out.println("Hash: " + temp.hash);
					System.out.println();
					temp = temp.next;
				}
			}
		}
	}
	// Checks if the BlockChain is Valid or has been tampered with
	public void isValid() {
		Node temp = SLL1.head;
		Node temp1 = null;
		int flag = 0;
		while (temp.next != null) {
			temp1 = temp;
			temp = temp.next;
		}
		int i = SLL1.noe();
		while (temp != SLL1.head) {
			/*
			 * if(temp.hash!=temp.getHash()) { System.out.println("Chain is not valid"); }
			 */
			if (temp.previousHash != temp1.hash) {
				System.out.println("Chain is not valid at Block : " + (i - 1));
				flag = 1;
				return;
			}
			temp1 = SLL1.head;
			while ((temp1.next.next != temp)) {
				if ((SLL1.head.next != temp)) {
					temp1 = temp1.next;
				} else {
					temp = SLL1.head;
					break;
				}
			}
			if (temp != SLL1.head) {
				temp = temp1.next;
			}
			i--;
		}
		if (flag == 0) {
			System.out.println("Chain is valid");
		}
	}
	//Gets the node based on the value of n and sets Previous Hash value to the defined value
	int GetNth(Node head, int n) {
		int count = 0;
		if (head == null) // edge case - if head is null
			return -1;
		// if count equal too n return node.data
		if (count == n)
			return head.setPreviousHash(123);
		// recursively decrease n and increase
		// head to next pointer
		return GetNth(head.next, n - 1);
	}
	//Gets the node based on the value of n and sets Hash value to the defined value
	int GetNth1(Node head, int n) {
		int count = 0;
		if (head == null) // edge case - if head is null
			return -1;
		// if count equal too n return node.data
		if (count == n)
			return head.setHash(123);
		// recursively decrease n and increase
		// head to next pointer
		return GetNth(head.next, n - 1);
	}
	// Traverses through the Linked List and Sets the Previous Hash Value of the last node to the defined value
	public int getScam(){
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.setPreviousHash(123);
	}
}
