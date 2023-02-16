public class ComparandoReferencias {
    public static void main(String[] args) {

        Autor	autor	=	new	Autor();
        autor.setNome("Rodrigo	Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro	livro	=	new	Livro(autor);
        livro.setAutor(autor);

        livro.getAutor().setNome("Guilherme	Silveira");
        System.out.println(autor.getNome());

        Autor	autor2	=	new	Autor();
        autor2.setNome("Rodrigo	Turini");
        autor2.setEmail("rodrigo.turini@caelum.com.br");
        autor2.setCpf("123.456.789.10");

        if	(autor	==	autor2)	{
            System.out.println("Iguais,	mesmo	autor!");
        }	else	{
            System.out.println("hein!?	Por	que	diferentes?");
        }
    }
}
