package br.com.gabriel.teste;

import br.com.gabriel.CarrinhoDeCompras;
import br.com.gabriel.produtos.Ebook;
import br.com.gabriel.produtos.LivroFisico;
import br.com.gabriel.livraria.Autor;

public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Test-Driven development");
        livroFisico.setValor(59.90);

        if(livroFisico.aplicaDescontoDe10Porcento()){
         System.out.println("Valor agora é " + livroFisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(livroFisico);
        carrinho.adiciona(ebook);

        System.out.println("Total: " + carrinho.getTotal());
    }
}
