public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor) {
        validarValor(valor);
        this.valor = valor;
    }

    public InteiroPositivo(String valor) {
        validarValor(Integer.parseInt(valor));
        this.valor = Integer.parseInt(valor);
    }

    public boolean validarValor(Integer valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        return true;
    }

    public Integer getValor(){
        return this.valor;
    }

    public void setValor(int valor) throws Exception {
        if (validarValor(valor)){
            this.valor = valor;
        }
    }

    public boolean ehPrimo() {
        if (this.valor == 0 || this.valor == 1) {
            return false;
        }
        for (int i = 2 ; i < this.valor/2 ; i++){
            if (this.valor % i == 0) {
                return false;
            }
        }
        return true;
    }
}
