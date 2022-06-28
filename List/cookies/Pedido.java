import java.util.ArrayList;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido(){
        cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedido){
        cookies.add(pedido);
    }

    public int obterTotalCaixas(){
        int total = 0;
        for (PedidoCookie pedido : cookies){
            total += pedido.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor){
        int totalRemovido = 0;
        int tamanhoLista = cookies.size();
        for (int i = 0; i<tamanhoLista; i++){
            if (cookies.get(i).getSabor().equals(sabor)){
                totalRemovido += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i--);
                tamanhoLista--;
            }
        }
        return totalRemovido;
    }
}
