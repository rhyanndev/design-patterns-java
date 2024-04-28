/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractFactoryCreational;

/**
 *
 * @author rhyan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaVeiculos fabricaEsportiva = new FabricaVeiculosEsportivos();
        Carro carroEsportivo = fabricaEsportiva.criarCarro();
        Moto motoEsportiva = fabricaEsportiva.criarMoto();
        
        // Utilizando os produtos da fábrica esportiva
        carroEsportivo.tipo(); // Saída: Carro esportivo
        motoEsportiva.tipo(); // Saída: Moto esportiva
        
        FabricaVeiculos fabricaEconomica = new FabricaVeiculosEconomicos();
        Carro carroEconomico = fabricaEconomica.criarCarro();
        Moto motoEconomica = fabricaEconomica.criarMoto();
        
        
        // Utilizando os produtos da fábrica econômica
        carroEconomico.tipo(); // Saída: Carro sedan
        motoEconomica.tipo(); // Saída: Moto scooter
        
    }
    
    /*
    
    Neste exemplo, temos duas famílias de produtos: Carro e Moto. 
    Cada família tem suas próprias implementações concretas 
    (CarroEsportivo, CarroSedan, MotoEsportiva e MotoScooter).

    A interface FabricaVeiculos define métodos para criar objetos 
    de ambas as famílias de produtos. As classes concretas 
    FabricaVeiculosEsportivos e FabricaVeiculosEconomicos implementam
    esses métodos para criar produtos de acordo com a família desejada.

    O método main demonstra como criar fábricas de diferentes tipos e usar 
    os produtos criados por essas fábricas.
    
    
    */
    
}
