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
        for (ItemPedido item:itens) {
            valorTotal += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        BigDecimal bd = new BigDecimal(Double.toString(valorTotal));
        bd = bd.setScale(2, RoundingMode.HALF_DOWN);
        valorTotal = bd.doubleValue();
        return valorTotal-(percentualDesconto*valorTotal/100);
    }
}
