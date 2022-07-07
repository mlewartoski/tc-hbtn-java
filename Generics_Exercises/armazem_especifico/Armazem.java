import java.util.Map;
import java.util.TreeMap;

public abstract class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> map;

    public Armazem() {
        this.map = new TreeMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, T elemento) {
        map.put(nome, elemento);
    }

    @Override
    public T obterDoInventario(String nome) {
        return map.get(nome);
    }
}
