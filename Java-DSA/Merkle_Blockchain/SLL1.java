package end_sem3;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import com.google.zxing.WriterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SLL1 {
	
	Connection con = connection.connectDB();
	
	static String final_pid = null;
    static Node1 head;
    SLL1(){
        head = null;
    }

	void add_data(Block b1) {
		if (head == null) {
			head = new Node1(b1);
			head.setPreviousHash(0);
			head.computeHash();
		} else {
			Node1 temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			Node1 t1 = new Node1(b1);
			temp.next = t1;
			t1.setPreviousHash(temp.getHash());
			t1.computeHash();
		}
	}
    void deleteAll(){
            Node1 temp = head;
            while(temp!=null){
                temp = temp.next;
            }
            head=temp;
        }
    
    
	public static int noe() {
		Node1 temp = head;
		int i = 1;
		while (temp.next != null) {
			i++;
			temp = temp.next;
		}
		return i;
	}
    void display(){
    	if (head == null) {
			System.out.println("List is Empty!");
		} else {
			Node1 temp = head;
			while (temp != null) {
				int i = 0;
				for (i = 0; i < noe(); i++) {
					System.out.println("Block : " + (i));
					System.out.println("Data: " + temp.table_name);
					System.out.println();
					temp = temp.next;
				}
			}
		}
    }
    public void displayChain() {
		if (head == null) {
			System.out.println("List is Empty!");
		} else {
			Node1 temp = head;
			while (temp != null) {
				int i;
				for (i = 0; i < noe(); i++) {
					System.out.println("Block : " + (i));
					try {
			            if (temp.getTable_name().equals("nandini_poultry")){
			                String sql = "SELECT * FROM nandini_poultry";
			                PreparedStatement preparedStatement = con.prepareStatement(sql);
			                ResultSet results = preparedStatement.executeQuery();
			                System.out.println("These are Contents of the Table. ");
			                System.out.println();
			                System.out.println("product_id\tfarm_name\t\tlocation\torganic\t\tb_price\t\tco_name\t\t\tmrp");
			                while (results.next()) {
			               	 	int product_id = results.getInt("product_id");
			                    String farm_name = results.getString("farm_name");
			                    String location = results.getString("location");
			                    boolean organic=results.getBoolean("organic");
			                    float b_price=results.getFloat("b_price");
			                    String co_name=results.getString("co_name");
			                    float mrp=results.getFloat("mrp");
			                    System.out.println(product_id + "\t\t" + farm_name + "\t\t" + location + "\t\t" + organic + "\t\t" + b_price + "\t\t" + co_name + "\t\t" + mrp);
			               }
			            }

			            else if (temp.getTable_name().equals("nutrifeed")){
			                String sql = "SELECT * FROM nutrifeed";
			                PreparedStatement preparedStatement = con.prepareStatement(sql);
			                ResultSet results = preparedStatement.executeQuery();
			                System.out.println("These are Contents of the Table. ");
			                System.out.println();
			                System.out.println("product_id\tfarm_name\t\tlocation\torganic\t\tb_price\t\tco_name\t\t\tmrp");
			                while (results.next()) {
			               	 	int product_id = results.getInt("product_id");
			                    String farm_name = results.getString("farm_name");
			                    String location = results.getString("location");
			                    boolean organic=results.getBoolean("organic");
			                    float b_price=results.getFloat("b_price");
			                    String co_name=results.getString("co_name");
			                    float mrp=results.getFloat("mrp");
			                    System.out.println(product_id + "\t\t" + farm_name + "\t\t" + location + "\t\t" + organic + "\t\t" + b_price + "\t\t" + co_name + "\t\t" + mrp);
			               }
			            }

			            else if (temp.getTable_name().equals("eggos")){
			                String sql = "SELECT * FROM eggos";
			                PreparedStatement preparedStatement = con.prepareStatement(sql);
			                ResultSet results = preparedStatement.executeQuery();
			                System.out.println("These are Contents of the Table. ");
			                System.out.println();
			                System.out.println("product_id\tfarm_name\t\tlocation\torganic\t\tb_price\t\tco_name\t\t\tmrp");
			                while (results.next()) {
			               	 	int product_id = results.getInt("product_id");
			                    String farm_name = results.getString("farm_name");
			                    String location = results.getString("location");
			                    boolean organic=results.getBoolean("organic");
			                    float b_price=results.getFloat("b_price");
			                    String co_name=results.getString("co_name");
			                    float mrp=results.getFloat("mrp");
			                    System.out.println(product_id + "\t\t" + farm_name + "\t\t" + location + "\t\t" + organic + "\t\t" + b_price + "\t\t" + co_name + "\t\t" + mrp);
			               }
			            }

			            else if (temp.getTable_name().equals("just_organics")){
			                String sql = "SELECT * FROM just_organics";
			                PreparedStatement preparedStatement = con.prepareStatement(sql);
			                ResultSet results = preparedStatement.executeQuery();
			                System.out.println("These are Contents of the Table. ");
			                System.out.println();
			                System.out.println("product_id\tfarm_name\t\tlocation\torganic\t\tb_price\t\tco_name\t\t\tmrp");
			                while (results.next()) {
			               	 	int product_id = results.getInt("product_id");
			                    String farm_name = results.getString("farm_name");
			                    String location = results.getString("location");
			                    boolean organic=results.getBoolean("organic");
			                    float b_price=results.getFloat("b_price");
			                    String co_name=results.getString("co_name");
			                    float mrp=results.getFloat("mrp");
			                    System.out.println(product_id + "\t\t" + farm_name + "\t\t" + location + "\t\t" + organic + "\t\t" + b_price + "\t\t" + co_name + "\t\t" + mrp);
			               }
			            }

			            else if (temp.getTable_name().equals("eggway")){
			                String sql = "SELECT * FROM eggway";
			                PreparedStatement preparedStatement = con.prepareStatement(sql);
			                ResultSet results = preparedStatement.executeQuery();
			                System.out.println("These are Contents of the Table. ");
			                System.out.println();
			                System.out.println("product_id\tfarm_name\t\tlocation\torganic\t\tb_price\t\tco_name\t\t\tmrp");
			                while (results.next()) {
			               	 	int product_id = results.getInt("product_id");
			                    String farm_name = results.getString("farm_name");
			                    String location = results.getString("location");
			                    boolean organic=results.getBoolean("organic");
			                    float b_price=results.getFloat("b_price");
			                    String co_name=results.getString("co_name");
			                    float mrp=results.getFloat("mrp");
			                    System.out.println(product_id + "\t\t" + farm_name + "\t\t" + location + "\t\t" + organic + "\t\t" + b_price + "\t\t" + co_name + "\t\t" + mrp);
			               }
			            }
			            else if (temp.getTable_name().equals("labpro")){
			                 String sql = "SELECT * FROM labpro";
			                 PreparedStatement preparedStatement = con.prepareStatement(sql);
			                 ResultSet results = preparedStatement.executeQuery();
				             System.out.println("These are Contents of the Table. ");			              
				             System.out.println();
				             System.out.println("product_id\tfarm_name\t\tlocation\torganic\t\tb_price\t\tco_name\t\t\tmrp");
				             while (results.next()) {
				            	 int product_id = results.getInt("product_id");
				                 String farm_name = results.getString("farm_name");
				                 String location = results.getString("location");
				                 boolean organic=results.getBoolean("organic");
				                 float b_price=results.getFloat("b_price");
				                 String co_name=results.getString("co_name");
				                 float mrp=results.getFloat("mrp");
				                 System.out.println(product_id + "\t\t" + farm_name + "\t\t" + location + "\t\t" + organic + "\t\t" + b_price + "\t\t" + co_name + "\t\t" + mrp);
				               }
				           
			            }
			            
			            else if (temp.getTable_name().equals("capital_fresh")){
			                String sql = "SELECT * FROM capital_fresh";
			                PreparedStatement preparedStatement = con.prepareStatement(sql);
			                ResultSet results = preparedStatement.executeQuery();
			                System.out.println("These are Contents of the Table. ");
			                System.out.println();
			                System.out.println("product_id\tfarm_name\t\tlocation\torganic\t\tb_price\t\tco_name\t\t\tmrp");
			                while (results.next()) {
			               	 	int product_id = results.getInt("product_id");
			                    String farm_name = results.getString("farm_name");
			                    String location = results.getString("location");
			                    boolean organic=results.getBoolean("organic");
			                    float b_price=results.getFloat("b_price");
			                    String co_name=results.getString("co_name");
			                    float mrp=results.getFloat("mrp");
			                    System.out.println(product_id + "\t\t" + farm_name + "\t\t" + location + "\t\t" + organic + "\t\t" + b_price + "\t\t" + co_name + "\t\t" + mrp);
			               }
			           }
			           else{
			                String sql = "SELECT * FROM skm_eggs";
			                PreparedStatement preparedStatement = con.prepareStatement(sql);
			                ResultSet results = preparedStatement.executeQuery();
			                System.out.println("These are Contents of the Table. ");
			                System.out.println();
			                System.out.println("product_id\tfarm_name\t\tlocation\torganic\t\tb_price\t\tco_name\t\t\tmrp");
			                while (results.next()) {
			               	 	int product_id = results.getInt("product_id");
			                    String farm_name = results.getString("farm_name");
			                    String location = results.getString("location");
			                    boolean organic=results.getBoolean("organic");
			                    float b_price=results.getFloat("b_price");
			                    String co_name=results.getString("co_name");
			                    float mrp=results.getFloat("mrp");
			                    System.out.println(product_id + "\t\t" + farm_name + "\t\t" + location + "\t\t" + organic + "\t\t" + b_price + "\t\t" + co_name + "\t\t" + mrp);
			               }
			           }
			        }
					catch (SQLException e) {
			            // Print exception pop-up on screen
			            System.out.println(e);
			        }
					temp = temp.next;
				}

			}
		}
	}
    public String search(String x,int y) {
    	Node1 temp = head;
    	while(temp!=null) {
    		if(temp.getTable_name().equals(x)) {
    			try {
	                String sql = "SELECT * FROM  " +""+ x +""+ " WHERE product_id =" + y ;
	                PreparedStatement preparedStatement = con.prepareStatement(sql);
	                ResultSet results = preparedStatement.executeQuery();
	                System.out.println("These are Contents of the Table. ");
	                System.out.println();
	                //System.out.println("product_id\tfarm_name\t\tlocation\torganic\t\tb_price\t\tco_name\t\t\tmrp");
	                while (results.next()) {
	               	 	int product_id = results.getInt("product_id");
	                    String farm_name = results.getString("farm_name");
	                    String location = results.getString("location");
	                    boolean organic=results.getBoolean("organic");
	                    float b_price=results.getFloat("b_price");
	                    String co_name=results.getString("co_name");
	                    float mrp=results.getFloat("mrp");
	                    final_pid = "product_id : " + product_id + "\nfarm_name : " + farm_name +"\nlocation : " + location + "\norganic : "+ organic + "\nb_price : "+ b_price + "\nco_name : "+ co_name + "\nmrp : " + mrp;
	                    
	                    String path = "E:\\ASEB\\2nd Year\\3rd\\DSA-2\\Merkle_QR.png";  
	                    try {
							GenerateQRCode.generateQRcode(final_pid, 400, 400);
						} catch (WriterException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
	                    GenerateQRCode.Open_file(path);
               }
    		}
			catch (SQLException e) {
				// Print exception pop-up on screen
		        System.out.println(e);
		        }
    			break;
    		}
    		else {
    			temp = temp.next;
    		}
    	}
		return final_pid;
	}
    public void searchTable(String x) {
    	Node1 temp = head;
    	while(temp!=null) {
    		if(temp.getTable_name().equals(x)) {
    			try {
	                String sql = "SELECT * FROM  " + x  ;
	                PreparedStatement preparedStatement = con.prepareStatement(sql);
	                ResultSet results = preparedStatement.executeQuery();
	                System.out.println("These are Contents of the Table. ");
	                System.out.println();
	                System.out.println("product_id\tfarm_name\t\tlocation\torganic\t\tb_price\t\tco_name\t\t\tmrp");
	                while (results.next()) {
	               	 	int product_id = results.getInt("product_id");
	                    String farm_name = results.getString("farm_name");
	                    String location = results.getString("location");
	                    boolean organic=results.getBoolean("organic");
	                    float b_price=results.getFloat("b_price");
	                    String co_name=results.getString("co_name");
	                    float mrp=results.getFloat("mrp");
	                    System.out.println(product_id + "\t\t" + farm_name + "\t\t" + location + "\t\t" + organic + "\t\t" + b_price + "\t\t" + co_name + "\t\t" + mrp);
               }
    		}
			catch (SQLException e) {
				// Print exception pop-up on screen
		        System.out.println(e);
		        }
    			break;
    		}
    		else {
    			temp = temp.next;
    		}
    	}
	}
    
    public static boolean searchTableName(String s) {
    	Node1 temp = head;
    	while(temp!=null) {
    		if(temp.table_name.equals(s)) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	}
		return false;
    }
}

