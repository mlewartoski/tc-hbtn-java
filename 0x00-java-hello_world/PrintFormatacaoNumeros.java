import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale brasil = new Locale("pt", "BR");
        NumberFormat realFormat = NumberFormat.getCurrencyInstance(brasil);
        System.out.printf("Valor: %s\nTaxa: %.2f%%\n", realFormat.format(valor), taxa);
    }
}