public class Ebook extends Livro {

    private String WaterMark;

    public Ebook(Autor autor){
        super(autor);
    }
    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.15){
            return false;
        }
        return super.aplicaDescontoDe(porcentagem);
    }

    public String getWaterMark() {
        return WaterMark;
    }

    public void setWaterMark(String waterMark) {
        WaterMark = waterMark;
    }
}
