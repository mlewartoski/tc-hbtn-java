import java.util.*;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> map;

    public ListaTelefonica(){
        this.map = new HashMap<>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone){
        this.map.forEach((k, v) -> {
            if (!k.equals(nome) && v.contains(telefone)){
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        });
        HashSet<Telefone> telefones = new HashSet<>();
        telefones.add(telefone);
        if (this.map.get(nome) == null){
            this.map.put(nome,telefones);
        } else {
            if (this.map.get(nome).contains(telefone)){
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }
            telefones.addAll(this.map.get(nome));
            this.map.replace(nome, telefones);
        }
        return telefones;
    }

    public HashSet<Telefone> buscar(String nome){
        return map.get(nome);
    }
}
