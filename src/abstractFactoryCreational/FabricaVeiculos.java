/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstractFactoryCreational;

/**
 *
 * @author rhyan
 * // Interface da fábrica abstrata
 */
public interface FabricaVeiculos {
    
    Carro criarCarro();
    Moto criarMoto();
    
}
