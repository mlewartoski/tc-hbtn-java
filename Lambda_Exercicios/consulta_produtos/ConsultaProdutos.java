import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    static ArrayList<Produto> filtrar(List<Produto> produtos, CriterioFiltro filtro){
        ArrayList<Produto> novosProdutos = new ArrayList<>();
        produtos.forEach((produto) -> {
            if (filtro.testar(produto)) {
                novosProdutos.add(produto);
            }
        });
        return novosProdutos;
    }
}
