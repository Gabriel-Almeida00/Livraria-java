package br.com.gabriel.produtos;

import br.com.gabriel.livraria.Autor;
import br.com.gabriel.produtos.Livro;
import br.com.gabriel.produtos.Promocional;

public class LivroFisico extends Livro implements Promocional {

    public LivroFisico(Autor autor){
        super(autor);
    }
    public double getTavaImpressao(){
        return this.getValor() * 0.05;
    }
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem > 0.3){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no livro físico");
        return true;
    }
}
