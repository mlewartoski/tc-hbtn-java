import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nomeAgencia){
        int posicao = this.agencias.indexOf(new Agencia(nomeAgencia));
        if (posicao == -1) {
            return null;
        }
        return this.agencias.get(posicao);
    }

    public boolean adicionarAgencia(String nomeAgencia){
        if (buscarAgencia(nomeAgencia) != null) {
            return false;
        }
        Agencia a = new Agencia(nomeAgencia);
        this.agencias.add(a);
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacaoInicial){
        Agencia a = buscarAgencia(nomeAgencia);
        if (a == null) {
            return false;
        } else if (a.buscarCliente(nomeCliente) != null){
            return false;
        }
        a.novoCliente(nomeCliente, transacaoInicial);
        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double transacao){
        Agencia a = buscarAgencia(nomeAgencia);
        if (a == null) {
            return false;
        } else if (a.buscarCliente(nomeCliente) == null){
            return false;
        }
        a.adicionarTransacaoCliente(nomeCliente, transacao);
        return true;
    }

    public void listarClientes(String nomeAgencia, boolean imprimeTransacao){
        Agencia a = buscarAgencia(nomeAgencia);
        if (a != null) {
            int clienteIndex = 1, transacaoIndex;
            for (Cliente c:a.getClientes()){
                System.out.printf("Cliente: %s [%d]\n", c.getNome(), clienteIndex++);
                if (imprimeTransacao){
                    transacaoIndex = 1;
                    for (Double transacao:c.getTransacoes()) {
                        System.out.printf("\t[%d] valor %.2f\n", transacaoIndex++, transacao);
                    }

                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }
}
