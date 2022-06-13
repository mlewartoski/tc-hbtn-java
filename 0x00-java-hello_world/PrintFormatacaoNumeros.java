import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("Valor: R$ %s\nTaxa: %.2f%%\n", format.format(valor).substring(1), taxa);
    }
}