import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    public static ArrayList<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicate){
        ArrayList<Produto> novosProdutos = new ArrayList<>();
        produtos.forEach((produto) -> {
            if (predicate.test(produto)) {
                novosProdutos.add(produto);
            }
        });
        return novosProdutos;
    }
}
