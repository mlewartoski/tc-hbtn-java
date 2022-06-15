public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;

    public Empregado(String nome, int codigo, Endereco endereco){
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public void apresentar(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Bairro: "+ this.endereco.getBairro());
        System.out.println("Cidade: "+ this.endereco.getCidade());
        System.out.print("Pais: " + this.endereco.getPais());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}