
package Functions;
import javax.swing.table.DefaultTableModel;

import SQLConnection.SQLConnector;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.swing.JOptionPane;
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
    
    public boolean annadir(String codigo, String nombre, String categoria,String cantidad){
        boolean complete = false;
        int cantidadTotal = 0;
        String result[][] = db.querySQLResultado("Select Cantidad from Inventario where Productos = '".concat(nombre).concat("' and Codigo = '".
                concat(codigo).concat("'")));
        if(result.length!=0){
            cantidadTotal = Integer.parseInt(result[0][0])+Integer.parseInt(cantidad);
            if(cantidadTotal>0){
                complete = db.querySQL("Update Inventario set Cantidad='".concat(String.valueOf(cantidadTotal)).concat("' where Productos = '").concat(nombre).concat("' and Categoria = '").
                concat(categoria).concat("' and Codigo = '").concat(String.valueOf(codigo)).concat("'"));
            }else{
                JOptionPane.showMessageDialog(null, "No hay la cantidad suficiente para eliminar", "Cantidad Insuficiente", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            complete = db.querySQL("Insert into Inventario values ('".concat(nombre).concat("','").concat(codigo).concat("','").
                concat(categoria).concat("','").concat(String.valueOf(cantidad)).concat("')"));
        }
        return complete;
    }
    
    public boolean elminar(String codigo, String nombre, String categoria,String cantidad){
        boolean complete = false;
        int cantidadTotal = 0;
        String result[][] = db.querySQLResultado("Select Cantidad from Inventario where Productos = '".concat(nombre).concat("' and Codigo = '".
                concat(codigo).concat("'")));
        if(result.length!=0){
            cantidadTotal = Integer.parseInt(result[0][0])-Integer.parseInt(cantidad);
            if(cantidadTotal>0){
                complete = db.querySQL("Update Inventario set Cantidad='".concat(String.valueOf(cantidadTotal)).concat("' where Productos='").concat(nombre).concat("' and Categoria='").
                concat(categoria).concat("'"));
            }else{
                if(cantidadTotal==0){
                    complete = db.querySQL("delete from Inventario where Productos='".concat(nombre).concat("' and Codigo='").concat(codigo).concat("' and Categoria ='").
                            concat(categoria).concat("'"));
                }else{
                JOptionPane.showMessageDialog(null, "No hay la cantidad suficiente para eliminar", "Cantidad Insuficiente", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El producto no existe", "Inexistente", JOptionPane.ERROR_MESSAGE);              
        }
        return complete;
    }
    
    public boolean crearReporte(){
        LocalDate now =LocalDate.now();
        boolean create = false;
        String data [][] = null;
        try{
            PrintWriter report = new PrintWriter("./reporte.txt","UTF-8");
            data = db.querySQLResultado("Select * from Inventario");
            report.println("Reporte del dia:".concat(String.valueOf(now)));
            if(data.length != 0){
                for(int i = 0 ; i < data.length;i++){
                    report.println(data[i][0].concat(" ").concat(data[i][1]).concat(" ").concat(data[i][2]).concat(" ").concat(data[i][3]));
                }
                report.close();
            }
            create = true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e,"Error al crear archivo",JOptionPane.ERROR_MESSAGE);
        }
        return create;
    }
    
    
}
