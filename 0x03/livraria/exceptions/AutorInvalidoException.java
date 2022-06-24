package exceptions;

public class AutorInvalidoException extends Exception {
    public AutorInvalidoException() {
        super("Nome de autor invalido");
    }
}
