/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototypeCreational;

/**
 *
 * @author rhyan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Criando o protótipo de configurações do jogo
        
        GameSettings prototypeSettings = new GameSettings(50, 70, "Normal");
        System.out.println(prototypeSettings.hashCode());
        
        
        //Clonando e modificando para um novo jogador
        
        GameSettings playerSettings = prototypeSettings.clone();
        System.out.println(playerSettings.hashCode());
        playerSettings.setDifficulty("Hard");
        playerSettings.setBrightness(2);
        
        
        System.out.println("Player Setting: Difficulty is " + playerSettings.getDifficulty());
        System.out.println("Player Settings: Volume is " + playerSettings.getVolume());
        System.out.println("Player Settings: Brightness is " + playerSettings.getBrightness());
        
        //Houve utilização do método .hashCode() para mostrar a diferença entre os dois objetos.
    }
    
}
