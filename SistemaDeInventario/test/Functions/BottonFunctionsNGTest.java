package Functions;

import javax.swing.table.DefaultTableModel;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BottonFunctionsNGTest {
    
    public BottonFunctionsNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Test(priority=1)
    public void testBtnLoginAccess() {
        System.out.println("Test Login");
        String user = "admin";
        String password = "admin";
        BottonFunctions instance = new BottonFunctions();
        boolean expResult = true;
        boolean result = instance.btnLogin(user, password);
        assertEquals(result, expResult);
    }
    @Test(priority=2)
    public void testBtnLoginNoAccess() {
        System.out.println("Test Login");
        String user = "System";
        String password = "admin";
        BottonFunctions instance = new BottonFunctions();
        boolean expResult = false;
        boolean result = instance.btnLogin(user, password);
        assertEquals(result, expResult);
    }
 
    @Test (priority = 3)
    public void testInventario() {
        System.out.println("Test Inventory");
        BottonFunctions instance = new BottonFunctions();
        DefaultTableModel expResult = new DefaultTableModel();
        expResult.addColumn("Productos");
        expResult.addColumn("Codigo");
        expResult.addColumn("Categoria");
        expResult.addColumn("Cantidad");
        expResult.addRow(new Object[]{"Fresa","100","Fruta","40"});
        DefaultTableModel result = instance.inventario();
        int result1 = String.valueOf(expResult.getValueAt(0, 0)).compareTo(String.valueOf(result.getValueAt(0, 0)));
        int result2 = String.valueOf(expResult.getValueAt(0, 1)).compareTo(String.valueOf(result.getValueAt(0, 1)));
        int result3 = String.valueOf(expResult.getValueAt(0, 2)).compareTo(String.valueOf(result.getValueAt(0, 2)));
        int result4 = String.valueOf(expResult.getValueAt(0, 3)).compareTo(String.valueOf(result.getValueAt(0, 3)));
        assertEquals(result1,0);
        assertEquals(result2,0);
        assertEquals(result3,0);
        assertEquals(result4,0);
    }
    
    @Test (priority = 8)
    public void testInventarioFail() {
        System.out.println("Test Inventory");
        BottonFunctions instance = new BottonFunctions();
        DefaultTableModel expResult = new DefaultTableModel();
        expResult.addColumn("Productos");
        expResult.addColumn("Codigo");
        expResult.addColumn("Categoria");
        expResult.addColumn("Cantidad");
        expResult.addRow(new Object[]{"Papaya","101","Repuesto","20"});
        DefaultTableModel result = instance.inventario();
        int result1 = String.valueOf(expResult.getValueAt(0, 0)).compareTo(String.valueOf(result.getValueAt(0, 0)));
        int result2 = String.valueOf(expResult.getValueAt(0, 1)).compareTo(String.valueOf(result.getValueAt(0, 1)));
        int result3 = String.valueOf(expResult.getValueAt(0, 2)).compareTo(String.valueOf(result.getValueAt(0, 2)));
        int result4 = String.valueOf(expResult.getValueAt(0, 3)).compareTo(String.valueOf(result.getValueAt(0, 3)));
        assertEquals(result1!=0,true);
        assertEquals(result2!=0,true);
        assertEquals(result3!=0,true);
        assertEquals(result4!=0,true);
    }

    @Test(priority = 4)
    public void testAnnadirNew() {
        System.out.println("Test Insert new product into Inventory");
        String codigo = "101";
        String nombre = "Papaya";
        String categoria = "Fruta";
        String cantidad = "40";
        BottonFunctions instance = new BottonFunctions();
        boolean expResult = true;
        boolean result = instance.annadir(codigo, nombre, categoria, cantidad);
        assertEquals(result, expResult);
    }

    @Test(priority = 5)
    public void testAnnadirSame() {
        System.out.println("Test Insert same product into Inventory");
        String codigo = "101";
        String nombre = "Papaya";
        String categoria = "Fruta";
        String cantidad = "10";
        BottonFunctions instance = new BottonFunctions();
        boolean expResult = true;
        boolean result = instance.annadir(codigo, nombre, categoria, cantidad);
        assertEquals(result, expResult);
    }
    
     @Test (priority = 6)
    public void testElminarSame() {
        System.out.println("Delete 10 products from Inventory");
        String codigo = "101";
        String nombre = "Papaya";
        String categoria = "Fruta";
        String cantidad = "10";
        BottonFunctions instance = new BottonFunctions();
        boolean expResult = true;
        boolean result = instance.elminar(codigo, nombre, categoria, cantidad);
        assertEquals(result, expResult);
    }
    @Test (priority = 7)
    public void testElminarComplete() {
        System.out.println("Delete all product from Inventory");
        String codigo = "101";
        String nombre = "Papaya";
        String categoria = "Fruta";
        String cantidad = "40";
        BottonFunctions instance = new BottonFunctions();
        boolean expResult = true;
        boolean result = instance.elminar(codigo, nombre, categoria, cantidad);
        assertEquals(result, expResult);
    }

    @Test (priority=8)
    public void testCrearReporte() {
        System.out.println("Test create report");
        BottonFunctions instance = new BottonFunctions();
        boolean expResult = true;
        boolean result = instance.crearReporte();
        assertEquals(result, expResult);
    }
    
}
