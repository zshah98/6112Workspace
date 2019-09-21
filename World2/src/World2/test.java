package World2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Connection conn = null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    conn =
    	       DriverManager.getConnection("jdbc:mysql://localhost/test?" +
    	                                   "user=root&password=Cocostar18!");

    	    // Do something with the Connection
    	   
    	  
    	} catch (Exception ex) {
    	    // handle any errors
    	    System.out.println("SQLException: " + ex.getMessage());
    	   ;
    	} 
	}

}
