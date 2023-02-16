public class RegrasDeDesconto {
    public static void main(String[] args) {

            Autor autor = new Autor();
            autor.setNome("gabriel");
            autor.setCpf("123-456-789-98");
            autor.setEmail("gabriel@gmail.com");
            Livro livro = new Livro(autor);
            livro.setValor(59.90);

            System.out.println("Valor atual: " + livro.getValor());

            if(!livro.aplicaDescontoDe(0.4)){
                System.out.println("Desconto não pode ser maior que 30%");
            } else{
                System.out.println("Valor com desconto: " + livro.getValor());
            }
    }
}
