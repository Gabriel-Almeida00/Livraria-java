package br.com.gabriel.produtos;

import br.com.gabriel.livraria.Autor;

public class Ebook extends Livro implements Promocional {
    private String WaterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    public String getWaterMark() {
        return WaterMark;
    }

    public void setWaterMark(String waterMark) {
        WaterMark = waterMark;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem > 0.15){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no br.com.Ebook");
        return true;
    }

    @Override
    public String toString(){
        return "Eu sou um Ebook";
    }
}
