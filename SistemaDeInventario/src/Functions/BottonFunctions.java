
package Functions;

import SQLConnection.SQLConnector;
public class BottonFunctions {
    
    private SQLConnector db = null;
    
    public BottonFunctions(){
        db = new SQLConnector();
    }
    public boolean btnLogin(String user, String password){
        boolean login = false;
        String [][] users = db.querySQLResultado("Select * from Users");
        if(users!=null){
            for(int i = 0; i < users.length; i++){
                login = (users[0][0].compareTo(user))== 0 && (users[0][1].compareTo(password) == 0);
                i = (login == true)? users.length + 1 : i;
            }  
        }
        return login;
    }
    
    
}
