public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero){
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object obj) {
        Telefone t = (Telefone) obj;
        return this.toString().equals(t.toString());
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", codigoArea, numero);
    }
}
