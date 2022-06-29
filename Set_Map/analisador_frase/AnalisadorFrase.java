import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase){
        frase = frase.toLowerCase();
        frase = frase.replace("?", "");
        frase = frase.replace(".", "");
        frase = frase.replace("!", "");
        String[] palavras = frase.split(" ");
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (String palavra:palavras){
            if (!map.containsKey(palavra)){
                map.put(palavra, 1);
            } else {
                Integer qtd = map.get(palavra) + 1;
                map.replace(palavra, qtd);
            }
        }

        return map;
    }
}
