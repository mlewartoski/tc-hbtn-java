import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens){
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }
    public double calcularTotal(){
        double valorTotal = 0;
        double valorDesconto = 0;
        for (ItemPedido item:itens) {
            valorTotal += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        valorDesconto = valorTotal*(percentualDesconto/100);

        return valorTotal-valorDesconto;
    }
}
