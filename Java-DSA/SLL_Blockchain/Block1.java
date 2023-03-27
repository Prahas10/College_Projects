package end_sem2;

import java.util.Arrays;
import java.util.Date;

public class Block1 {

	private int prevBlockHash = 0;
	private Date Timestamp;
	private int hash;
	private int previousHash;
	private String data;

	public Block1() { // Constructor for Block1

	}

	public Block1(Date timestamp, String data) { // Parameterized Constructor for Block1
		this.Timestamp = timestamp;
		this.data = data;
		this.hash = computeHash();
	}

	public int computeHash() { // Computes the Hash using the values of the Time Stamp, previous hash and data.
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

	public void setHash(int hash) {
		this.hash = hash;
	}

	public int getPreviousHash() {
		return previousHash;
	}

	public int setPreviousHash(int i) {
		return this.previousHash = i;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int get(int i) {
		return previousHash;
	}
}