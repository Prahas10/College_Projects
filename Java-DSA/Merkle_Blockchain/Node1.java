package end_sem3;

import java.util.Arrays;
import java.util.Date;

class Node1 {
	private int prevBlockHash = 0;
	String table_name;
	Date Timestamp;
	int hash;
	int previousHash;
	Node1 next;

	public Node1(Block b1) {
		this.Timestamp = b1.getTimestamp();
		this.hash = b1.getHash();
		this.previousHash = b1.getPreviousHash();
		this.table_name = b1.getTable_name();
		next = null;
	}
	public int computeHash() {		// Computes the Hash using the values of the Time Stamp, previous hash and data.

		String dataToHash = "" + this.Timestamp + this.previousHash + this.table_name;
		int encoded = 0;
		encoded = Arrays.hashCode(new int[] { dataToHash.hashCode(), this.prevBlockHash });
		this.hash = encoded;
		return encoded;
	}
	public int getPrevBlockHash() {
		return prevBlockHash;
	}
	public void setPrevBlockHash(int prevBlockHash) {
		this.prevBlockHash = prevBlockHash;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public Date getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(Date timestamp) {
		Timestamp = timestamp;
	}
	public int getHash() {
		return hash;
	}
	public void setHash(int hash) {
		this.hash = hash;
	}
	public int getPreviousHash() {
		return previousHash;
	}
	public void setPreviousHash(int previousHash) {
		this.previousHash = previousHash;
	}
	public Node1 getNext() {
		return next;
	}
	public void setNext(Node1 next) {
		this.next = next;
	}

}
