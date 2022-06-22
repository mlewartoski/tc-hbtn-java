import retangulo.FormaGeometrica;

public class Retangulo extends FormaGeometrica {
    protected double altura;
    protected double largura;

    @Override
    public double area() {
        return altura*largura;
    }

    @Override
    public String toString() {
        return String.format("[Retangulo] %.2f / %.2f", largura, altura);
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        if (altura < 0.0) {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        } else {
            this.altura = altura;
        }
    }

    public void setLargura(double largura) {
        if (largura < 0.0) {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        } else {
            this.largura = largura;
        }
    }
}