import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup;
    public Supplier<Double> precoComMarkup = () -> this.preco + this.preco*(percentualMarkup/100);
    public Consumer<Double> atualizarMarkup = (Double d) -> this.percentualMarkup = d;


    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 10;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }
}
