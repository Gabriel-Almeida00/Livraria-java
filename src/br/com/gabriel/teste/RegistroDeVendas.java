package br.com.gabriel.teste;

import br.com.gabriel.CarrinhoDeCompras;
import br.com.gabriel.produtos.Ebook;
import br.com.gabriel.produtos.LivroFisico;
import br.com.gabriel.livraria.Autor;
import br.com.gabriel.produtos.Produto;

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

        Produto[] produtos = carrinho.getProdutos();

        for	(Produto produto : produtos) {
            try {
                if (produto != null) {
                    System.out.println(produto.getValor());
                }
            }	catch	(ArrayIndexOutOfBoundsException	e)	{
                System.out.println("deu	exception	no	indice:	");
            }	catch	(NullPointerException	e)	{
                System.out.println("A	array	não	foi	instanciado!");
            }
        }
        System.out.println("Fui	executado!");
        System.out.println(ebook);

    }
}
