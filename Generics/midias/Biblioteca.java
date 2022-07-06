import java.util.ArrayList;

public class Biblioteca<T extends Midia> {
    private ArrayList<T> lista;

    public Biblioteca() {
        this.lista = new ArrayList<>();
    }

    public void adicionarMidia(T elemento){
        lista.add(elemento);
    }

    public ArrayList<T> obterListaMidias(){
        return lista;
    }
}
