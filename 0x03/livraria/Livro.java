import livraria.exceptions.AutorInvalidoException;
import livraria.exceptions.LivroInvalidoException;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if (titulo.length() < 3) {
            throw new LivroInvalidoException();
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        if (autor.split(" ").length < 2){
            throw new AutorInvalidoException();
        }
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        if (preco <= 0.0) {
            throw new LivroInvalidoException();
        }
        this.preco = preco;
    }
}
