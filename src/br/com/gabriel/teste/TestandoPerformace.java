package br.com.gabriel.teste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestandoPerformace {

    public static void main(String[] args) {

        List<String> colecao = new ArrayList<String>();
        for (int i = 0; i < 100000; i++) {
            colecao.add("Item" + i);
        }
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            colecao.contains("Item" + i);
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Demorou	" + tempo + "	MS	para	executar");

        //hashset
        Set<String> colecao2 = new HashSet<String>();
        for (int i = 0; i < 100000; i++) {
            colecao.add("Item" + i);
        }
        long inicio2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            colecao.contains("Item" + i);
        }
        long fim2 = System.currentTimeMillis();
        long tempo2 = fim - inicio;
        System.out.println("Demorou	" + tempo2 + "	MS	para	executar");

    }

}
