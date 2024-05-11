/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package builderCreational;


public class Produto {
    
    private final String nome;
    
    private final double preco;
    
    private final String categoria;
            
    private final int quantidadeEmEstoque;
    
    
    //construtor privado
    //colocando o nome dos campos
    private Produto(Builder builder){
        this.nome = builder.nome;
        this.preco = builder.preco;
        this.categoria = builder.categoria;
        this.quantidadeEmEstoque = builder.quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    
    
    
    
    
    //classe que vai implementar o builder
    
    public static class Builder{
        
    private String nome;
    
    private double preco;
    
    private String categoria;
            
    private int quantidadeEmEstoque;
        
    //construtor do builder
    public Builder nome(String nome){
        this.nome = nome;
        return this;
    }
    
    public Builder preco(double preco){
        this.preco = preco;
        return this;
    }
    
    public Builder categoria(String categoria){
        this.categoria = categoria;
        return this;
    }
    
    public Builder quantidadeEmEstoque(int quantidadeEmEstoque){
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        return this;
    }
    
    //método para construir esse objeto
    public Produto build(){
        return new Produto(this);
    }
    
    }
            

}
