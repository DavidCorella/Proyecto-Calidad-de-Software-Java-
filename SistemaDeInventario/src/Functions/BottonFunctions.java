
package Functions;

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
    
    
}
