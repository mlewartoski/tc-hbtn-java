import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos;

    public Celular(){
        this.contatos = new ArrayList<>();
    }

    public int obterPosicaoContato(String nome){
        Contato c = new Contato(nome, "", null);
        return this.contatos.indexOf(c);
    }

    public void adicionarContato(Contato contato){
        int posicao = obterPosicaoContato(contato.getNome());
        if (posicao != -1){
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        int posicaoAntigo = obterPosicaoContato(contatoAntigo.getNome());
        int posicaoNovo = obterPosicaoContato(novoContato.getNome());
        if (posicaoAntigo == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
        if (posicaoNovo != -1) {
            if (!contatoAntigo.getNome().equals(novoContato.getNome())) {
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            }
        }
        this.contatos.set(posicaoAntigo, novoContato);
    }

    public void removerContato(Contato contato){
        int posicao = obterPosicaoContato(contato.getNome());
        if (posicao == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
        contatos.remove(posicao);
    }

    public void listarContatos(){
        for (Contato contato:contatos) {
            System.out.printf("%s -> %s (%s)\n", contato.getNome(), contato.getNumero(), contato.getTipoNumero());
        }
    }
}
