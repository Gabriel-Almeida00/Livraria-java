public class Ebook extends Livro {

    private String WaterMark;

    public Ebook(Autor autor){
        super(autor);
    }
    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.15){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no Ebook");
        return true;
    }

    public String getWaterMark() {
        return WaterMark;
    }

    public void setWaterMark(String waterMark) {
        WaterMark = waterMark;
    }
}
