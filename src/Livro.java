public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes(){
        System.out.println("Mostrando Detalhes do livro");
        System.out.println("Nome: "+nome);
        System.out.println("Descricao: "+descricao);
        System.out.println("Valor: "+valor);
        System.out.println("ISBN: "+isbn);
        System.out.println("--");
    }
}