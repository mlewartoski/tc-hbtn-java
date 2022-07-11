import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro){
        List<Produto> novosProdutos = new ArrayList<>();
        produtos.forEach((produto) -> {
            if (criterioFiltro.testar(produto)) {
                novosProdutos.add(produto);
            }
        });
        return novosProdutos;
    }
}
