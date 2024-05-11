/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builderCreational;

/**
 *
 * @author rhyan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto.Builder builder =  new Produto.Builder();
        Produto produto = builder.nome("Celular")
        .preco(4000).quantidadeEmEstoque(2).build();
        
        System.out.println(produto.getNome());
        System.out.println(produto.getQuantidadeEmEstoque());
        
    }
    
}
