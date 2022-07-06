import java.util.Map;
import java.util.TreeMap;

public class Armazem<T> implements Armazenavel {
    private Map<String, T> map;

    public Armazem() {
        this.map = new TreeMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, Object elemento) {
        map.put(nome, (T) elemento);
    }

    @Override
    public T obterDoInventario(String nome) {
        return map.get(nome);
    }
}
