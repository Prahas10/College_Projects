package end_sem3;

import java.util.ArrayList;
import java.security.SecureRandom;
import java.util.Random;

class MerkleTree {
	static ArrayList<String> child = new ArrayList<>();
	static ArrayList<String> parent = new ArrayList<>();

	public static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;

		return (int) (Math.ceil((Math.log(n) / Math.log(2)))) == (int) (Math.floor(((Math.log(n) / Math.log(2)))));
	}

	public static Node generateTree(ArrayList<Block> dataBlocks) {
		ArrayList<Node> childNodes = new ArrayList<>();
		for (Block message : dataBlocks) {
			childNodes.add(new Node(null, null, HashAlgorithm.generateHash(message)));
			child.add(HashAlgorithm.generateHash(message));
		}
		return buildTree(childNodes);
	}

	private static Node buildTree(ArrayList<Node> children) {
		ArrayList<Node> parents = new ArrayList<>();

		while (children.size() != 1) {
			int index = 0, length = children.size();
			while (index < length) {
				Node leftChild = children.get(index);
				Node rightChild = null;
				if ((index + 1) < length) {
					rightChild = children.get(index + 1);
				} else {
					rightChild = new Node(null, null, leftChild.getHash());
				}
				String parentHash = HashAlgorithm.generateHash1(leftChild.getHash() + rightChild.getHash());
				parents.add(new Node(leftChild, rightChild, parentHash));
				index += 2;
				parent.add(parentHash);
			}
			children = parents;
			parents = new ArrayList<>();
		}
		return children.get(0);
	}

	public static String printRoot(Node root) {
		String rootHash = null;
		if (root == null) {
			return null;
		}
		if ((root.getLeft() != null && root.getRight() != null)) {
			rootHash = root.getHash();
		}
		return rootHash;
	}

	public static boolean Merkle_Proof(int n, Node root, String x) {
		String y = HashAlgorithm.generateHash1(x);
		String[] p = new String[n];
		for (int i = 0; i < p.length; i++) {
			p[i] = "";
		}
		if (n >= 2) {
			for(int i = 0; i<p.length;i++) {
				for (int k = 0; k < child.size(); k++) {
					if (y.equals(child.get(k))) {
						if (k % 2 == 0) {
							p[i] = HashAlgorithm.generateHash1(y + child.get(k + 1));
						} else if (k % 2 != 0) {
							p[i] = HashAlgorithm.generateHash1(child.get(k - 1) + y);
						}
					}
					if (p[i].equals(printRoot(root))) {
						return true;
					}
				}
				while(!p[i].equals(printRoot(root))) {
					for (int j = 1; j < parent.size() - 1; j++) {
						if (p[i].equals(parent.get(j)) || p[i].equals(parent.get(j))) {
							if (j % 2 == 0) {
								p[i] = HashAlgorithm.generateHash1(parent.get(j) + parent.get(j + 1));
							} else if (j % 2 != 0) {
								p[i] = HashAlgorithm.generateHash1(parent.get(j - 1) + parent.get(j));
							}
						}
					}
					if (p[i].equals(printRoot(root))) {
						return true;
					}
				}

			}
		}

		return false;
	}
	
	  public static String randomString(int length) {
		  final Random generator = new Random();
		  final String SOURCE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
		  SecureRandom secureRnd = new SecureRandom();
		  StringBuilder sb = new StringBuilder(length);
		    for (int i = 0; i < length; i++)
		      sb.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length())));
		    return sb.toString();
		  }
	  
	  static String x="Yes";
	  static String y="No";
	  
	  static boolean isCompany(String s) {
		  if(s.equals(x)) {
			  return true;
		  }
		  else {
			  return false;
		  }
	  }
}

