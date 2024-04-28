/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package abstractFactoryCreational;


public class FabricaVeiculosEconomicos implements FabricaVeiculos {

    @Override
    public Carro criarCarro() {
        return new CarroSedan();
    }

    @Override
    public Moto criarMoto() {
        return new MotoScooter();
    }
    
    

}
