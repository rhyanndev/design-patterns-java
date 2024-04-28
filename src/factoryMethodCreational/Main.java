/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factoryMethodCreational;

/**
 *
 * @author rhyan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectionFactory factory1 = new MySQLFactory();
        Connection connection1 = factory1.createConnection();
        
        ConnectionFactory factory2 = new SQLiteFactory();
        Connection connection2 = factory2.createConnection();
        
        
    }
    
}
