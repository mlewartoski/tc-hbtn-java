public class Contato {
    private String nome;
    private String numero;
    private TipoNumero tipoNumero;

    public Contato(String nome, String numero, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numero = numero;
        this.tipoNumero = tipoNumero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contato)) return false;

        Contato contato = (Contato) obj;

        return this.nome.equals(contato.getNome());
    }
}
