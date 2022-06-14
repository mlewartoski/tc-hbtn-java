public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome){
        setSaudeAtual(saudeAtual);
        setNome(nome);
    }

    public int getSaudeAtual(){
        return this.saudeAtual;
    }
    public void setSaudeAtual(int saudeAtual){
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual == 0) {
            this.status = "morto";
        } else {
            this.status = "vivo";
        }
    }
    public String getNome(){
        return this.nome;
    }
    public String getStatus() {
        return this.status;
    }
    public void setNome(String nome){
        if (!(nome == null || nome.isEmpty())) {
            this.nome = nome;
        }
    }
    public void tomarDano(int quantidadeDeDano) {
        int saudeNova = this.saudeAtual - quantidadeDeDano;
        if (saudeNova < 0) { saudeNova = 0; }
        setSaudeAtual(saudeNova);
    }

    public void receberCura(int quantidadeDeCura) {
        int saudeNova = this.saudeAtual + quantidadeDeCura;
        if (saudeNova > 100) { saudeNova = 100; }
        setSaudeAtual(saudeNova);
    }

}