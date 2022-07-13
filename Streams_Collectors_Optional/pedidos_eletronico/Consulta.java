import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Consulta {

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedido){
        List<Pedido> eletronicos = new ArrayList<>();
        pedido.forEach(p -> {
            if (p.getProdutos().stream().anyMatch(produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO)){
                eletronicos.add(p);
            }
        });
        return eletronicos;
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double preco_minimo){
        List<Produto> produtos_minimo = new ArrayList<>();
        produtos_minimo = produtos.stream().filter(p -> p.getPreco() >= preco_minimo).toList();
        return produtos_minimo;
    }

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
