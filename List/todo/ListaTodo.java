import java.util.*;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo(){
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        for (Tarefa t: tarefas) {
            if (t.getIdentificador() == tarefa.getIdentificador()){
                throw new IllegalArgumentException(String.format("Tarefa com identificador %d ja existente na lista", t.getIdentificador()));
            }
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador){
        boolean marcado = false;
        for (Tarefa t: tarefas) {
            if (t.getIdentificador() == identificador){
                t.setEstahFeita(true);
                marcado = true;
            }
        }
        return marcado;
    }

    public boolean desfazerTarefa(int identificador){
        boolean marcado = false;
        for (Tarefa t: tarefas) {
            if (t.getIdentificador() == identificador){
                t.setEstahFeita(false);
                marcado = true;
            }
        }
        return marcado;
    }

    public void desfazerTodas(){
        for (Tarefa t: tarefas) {
            t.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for (Tarefa t: tarefas) {
            t.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        String marca;
        for (Tarefa t: tarefas) {
            if (t.isEstahFeita()) {
                marca = "X";
            } else {
                marca = " ";
            }
            System.out.printf("[%s]  Id: %d - Descricao: %s\n", marca, t.getIdentificador(), t.getDescricao());
        }
    }
}
