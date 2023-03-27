package end_sem2;

import java.util.Arrays;
import java.util.Date;

class Node {
	private int prevBlockHash = 0;	
	Date Timestamp;
	int hash;
	int previousHash;
	String data;
	Node next;

	Node(Block1 b1) {			// Parameterized Constructor for Node 
		this.Timestamp = b1.getTimestamp();
		this.hash = b1.getHash();
		this.previousHash = b1.getPreviousHash();
		this.data = b1.getData();
		next = null;
	}

	public int computeHash() {		// Computes the Hash using the values of the Time Stamp, previous hash and data.

		String dataToHash = "" + this.Timestamp + this.previousHash + this.data;
		int encoded = 0;
		encoded = Arrays.hashCode(new int[] { dataToHash.hashCode(), this.prevBlockHash });
		this.hash = encoded;
		return encoded;
	}
	// We use getters and setters to get and set the values of the variables
	public Date getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(Date timestamp) {
		Timestamp = timestamp;
	}

	public int getHash() {
		return hash;
	}

	public int setHash(int hash) {
		return this.hash = hash;
	}

	public int getPreviousHash() {
		return previousHash;
	}

	public int setPreviousHash(int previousHash) {
		return this.previousHash = previousHash;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
