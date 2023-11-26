
package SQLConnection;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConnector {
    
    private static final String URLSERVER = "jdbc:mysql://10.147.17.2:3306/SistemaInventario";
    private static final String USER = "System";
    private static final String PASSWORD = "123456";
    
    private Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(URLSERVER, USER, PASSWORD);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return connection;
    }
    
    public boolean querySQL(String query){
        PreparedStatement prepareStatementQuery = null;
        ResultSet resultSet = null;
        try {
            prepareStatementQuery = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            prepareStatementQuery.execute();
            resultSet = prepareStatementQuery.getGeneratedKeys();
        } catch (SQLException ex) {
            Logger.getLogger(SQLConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
        
    }
    
    public String[][] querySQLResultado(String query){
        ResultSet result = null;
        String resultQuery[][] = null;
        int columns = 0;
        int rows = 0;
        try{
            Statement statement = getConnection().createStatement();
            result = statement.executeQuery(query);
            columns = result.getMetaData().getColumnCount();
            while (result.next()){
                rows++;
            }
            result = statement.executeQuery(query);
            resultQuery = new String[rows][columns];
            int row = 0;
            while (result.next()) {
                for(int column = 1; column <= columns;column++){
                resultQuery[row][column-1] = result.getString(column);
                
                }
                row+=1;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return resultQuery;
    }
}
