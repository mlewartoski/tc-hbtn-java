import java.util.*;

public class Cliente implements Comparable {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, double transacaoInicial) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
        this.transacoes.add(transacaoInicial);
    }

    public void adicionarTransacao(double transacao){
        this.transacoes.add(transacao);
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Double> getTransacoes(){
        return this.transacoes;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;

        Cliente cliente = (Cliente) obj;

        return this.nome.equals(cliente.getNome());
    }

    @Override
    public int compareTo(Object o) {
        Cliente cliente = (Cliente) o;
        return this.nome.compareTo(cliente.nome);
    }
}
