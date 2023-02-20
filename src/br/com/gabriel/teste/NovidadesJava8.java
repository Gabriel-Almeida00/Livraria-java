package br.com.gabriel.teste;

import br.com.gabriel.livraria.Autor;
import br.com.gabriel.produtos.Livro;
import br.com.gabriel.produtos.LivroFisico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class NovidadesJava8 {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turino");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java o.o.");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 prático");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        List<Livro> livros = Arrays.asList(java8, javaoo, ruby);

        livros.sort(comparing(l -> l.getNome()));
        
        Stream<Livro> stream = livros.stream();
        livros.stream()
                .filter(l -> l.getNome().contains("Java"))
                .forEach(l -> System.out.println(l.getNome()));
    }
}
