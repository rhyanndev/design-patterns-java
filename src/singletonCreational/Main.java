/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonCreational;

/**
 *
 * @author rhyan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // DatabaseConnection databaseConnection = new DatabaseConnection(); - erro
        
        DatabaseConnection databaseConnection = new DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = new DatabaseConnection.getInstance();
        
        Connection connection = databaseConnection.getConnection();
        Connection connection2 = databaseConnection.getConnection();
        
        
        
    }
    
}
