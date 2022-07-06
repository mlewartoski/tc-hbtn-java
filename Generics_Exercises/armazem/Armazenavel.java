public interface Armazenavel<T> {
    void adicionarAoInventario(String nome, T elemento);
    T obterDoInventario(String nome);
}
