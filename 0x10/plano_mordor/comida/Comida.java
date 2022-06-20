package comida;

public abstract class Comida {
    protected int pontosDeFelicidade;

    public Comida(int pontosDeFelicidade){
        this.pontosDeFelicidade = pontosDeFelicidade;
    }
    public Comida() {
        this.pontosDeFelicidade = 0;
    }

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }
}