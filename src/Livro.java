public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public Livro(){
        System.out.println("Novo Livro criado");
    }

    void mostrarDetalhes(){
        System.out.println("Mostrando Detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if(this.temAutor()){
            autor.mostrarDetalhes();
        }
        System.out.println("--");

    }

    public void aplicaDescontoDe(double porcentagem){
        this.valor -= this.valor * porcentagem;
    }

    boolean temAutor(){
        return this.autor != null;
    }
}
