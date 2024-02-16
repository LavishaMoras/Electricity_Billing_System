
package elecricity.billing.system;

import java.sql.*;
public class Conn {
    
    Connection con;
    Statement s;
    Conn(){
        try{
       
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing", "root","1234");
     s = con.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
}
}