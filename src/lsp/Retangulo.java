package lsp;

public class Retangulo implements Forma{
    private int altura;
    private int largura;

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public int getArea() {
        return largura * altura;
    }
}
