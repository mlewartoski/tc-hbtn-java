public class Autor implements Comparable {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.nome, this.sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public int compareTo(Object o) {
        Autor autor = (Autor) o;
        return this.nome.compareTo(autor.nome) + this.sobrenome.compareTo(autor.sobrenome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor)) return false;

        Autor autor = (Autor) o;

        if (!this.nome.equals(autor.getNome())) return false;
        return this.sobrenome.equals(autor.getSobrenome());
    }
}
