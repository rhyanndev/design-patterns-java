/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package factoryMethodCreational;


public class MySQLFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

}
