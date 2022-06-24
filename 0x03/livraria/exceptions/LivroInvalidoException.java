package exceptions;

public class LivroInvalidoException extends Exception{
    public LivroInvalidoException() {
        super("Titulo de livro invalido");
    }
}
