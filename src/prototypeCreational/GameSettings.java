/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package prototypeCreational;


public class GameSettings implements Cloneable {
    
    private int brightness;
    
    private int volume;
    
    private String difficulty;
    
    
    //método construtor
    public GameSettings(int brightness, int volume, String difficulty){
        this.brightness = brightness;
        this.volume = volume;
        this.difficulty = difficulty;
    }
    
    
    //Implementação do prototype
    @Override
    protected GameSettings clone(){
        try{
            return (GameSettings) super.clone();
        }
        catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
            
        }
    }
    
    //Getters e Setters
    
    public int getBrightness(){
        return brightness;
    }
    
    
    public void setBrightness(int brightness){
        this.brightness = brightness;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public String getDifficulty(){
        return difficulty;
    }
    
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }
    

}
