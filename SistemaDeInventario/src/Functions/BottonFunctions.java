
package Functions;
import javax.swing.table.DefaultTableModel;

import SQLConnection.SQLConnector;
public class BottonFunctions {
    
    private SQLConnector db = null;
    
    public BottonFunctions(){
        db = new SQLConnector();
    }
    public boolean btnLogin(String user, String password){
        boolean login = false;
        String [][] users = db.querySQLResultado("Select * from Users where user='".concat(user.concat("'")));
        if(users.length!=0){
                login = (users[0][0].compareTo(user))== 0 && (users[0][1].compareTo(password) == 0);
        }
        return login;
    }
    
    public DefaultTableModel inventario(){
        String [][] result = db.querySQLResultado("Select * from Inventario");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Productos");
        model.addColumn("Codigo");
        model.addColumn("Categoria");
        model.addColumn("Cantidad");
        if(result.length != 0){
            for(int i = 0; i < result.length;i++){
                model.addRow(new Object[]{result[i][0],result[i][1],result[i][2],result[i][3]});
            }
        }
        return model;
    }
    
    
}
