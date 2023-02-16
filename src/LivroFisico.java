public class LivroFisico extends Livro  {

    public LivroFisico(Autor autor){
        super(autor);
    }
    public double getTavaImpressao(){
        return this.getValor() * 0.05;
    }
}
