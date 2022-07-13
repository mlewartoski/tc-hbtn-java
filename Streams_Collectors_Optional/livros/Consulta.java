import java.util.ArrayList;
import java.util.List;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> livros = new ArrayList<>();
        livros = pedido.getProdutos().stream().filter(p -> p.getCategoria() == CategoriaProduto.LIVRO).toList();
        return livros;
    }
}
