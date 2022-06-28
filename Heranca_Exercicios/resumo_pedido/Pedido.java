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
        return valorTotal;
    }

    public double calcularDesconto(){
        double valorDesconto = calcularTotal()*(percentualDesconto/100);
        return valorDesconto;
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item:itens) {
            double valorItem = item.getQuantidade() * item.getProduto().obterPrecoLiquido();
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                    item.getProduto().getClass().getSimpleName(), item.getProduto().getTitulo(), item.getProduto().obterPrecoLiquido(), item.getQuantidade(), valorItem);
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", calcularDesconto());
        System.out.printf("TOTAL PRODUTOS: : %.2f\n", calcularTotal());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal()-calcularDesconto());
        System.out.println("----------------------------");
    }
}
