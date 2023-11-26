
package sistemadeinventario;

import Vista.Login;
import SQLConnection.SQLConnector;

public class SistemaDeInventario {

  
    public static void main(String[] args) {
        Login mainWindow = new Login();
        mainWindow.setVisible(true);
        SQLConnector bd = new SQLConnector();
        bd.querySQLResultado("Select * from Inventario");
        
    }
    
}
