package maior_preco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Consulta {

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        Stream<Produto> sorted = produtos.stream().sorted(Comparator.comparing(Produto::getPreco).reversed());
        return sorted.findFirst().get();
    }
    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> livros = new ArrayList<>();
        livros = pedido.getProdutos().stream().filter(p -> p.getCategoria() == CategoriaProduto.LIVRO).toList();
        return livros;
    }
}
