package end_sem3;

import java.util.Arrays;
import java.util.Date;

public class Block {
	private int prevBlockHash = 0;
	private Date Timestamp;
	private int hash;
	private int previousHash;
	private String table_name;
	public Block() { // Constructor for Block

	}
	public Block(Date timestamp, String data) { // Parameterized Constructor for Block1
		this.Timestamp = timestamp;
		this.table_name = data;
		this.hash = computeHash();
	}
	public int computeHash() { // Computes the Hash using the values of the Time Stamp, previous hash and data.
		String dataToHash = "" + this.Timestamp + this.previousHash + this.table_name;
		int encoded = 0;
		encoded = Arrays.hashCode(new int[] { dataToHash.hashCode(), this.prevBlockHash });
		this.hash = encoded;
		return encoded;
	}

	public Block(String table_name) {
		super();
		this.table_name = table_name;
	}

	public byte[] getBytes() {
		// TODO Auto-generated method stub
		return this.table_name.getBytes();
	}
	public int getPrevBlockHash() {
		return prevBlockHash;
	}
	public void setPrevBlockHash(int prevBlockHash) {
		this.prevBlockHash = prevBlockHash;
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
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}


}