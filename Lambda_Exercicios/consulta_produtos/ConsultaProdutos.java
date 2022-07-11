import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static ArrayList<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro){
        ArrayList<Produto> novosProdutos = new ArrayList<>();
        produtos.forEach((produto) -> {
            if (criterioFiltro.testar(produto)) {
                novosProdutos.add(produto);
            }
        });
        return novosProdutos;
    }
}
