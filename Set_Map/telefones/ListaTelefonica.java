import java.util.*;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> map;

    public ListaTelefonica(){
        this.map = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        ArrayList<Telefone> telefones = this.map.get(nome);
        if (telefones == null){
            telefones = new ArrayList<>();
            telefones.add(telefone);
            this.map.put(nome,telefones);
        } else {
            telefones.add(telefone);
            this.map.replace(nome, telefones);
        }
    }

    public ArrayList<Telefone> buscar(String nome){
        return map.get(nome);
    }
}
