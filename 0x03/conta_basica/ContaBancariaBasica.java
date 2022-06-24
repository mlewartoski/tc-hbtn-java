import conta_basica.exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual){
        this.saldo = 0;
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (!(valor > 0)) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (!(valor > 0)) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        if ((valor > this.saldo)) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        this.saldo -= valor;
    }

    public double calcularTarifaMensal(){
        double tarifa = this.saldo/10;
        if (tarifa > 10.0) {
            tarifa = 10.0;
        }
        return tarifa;
    }

    public double calcularJurosMensal(){
        double juros = 0;
        double taxaMensal = taxaJurosAnual/12;
        if (this.saldo > 0) {
            juros = taxaMensal*this.saldo/100;
        }
        return juros;
    }

    public void aplicarAtualizacaoMensal(){
        double juros = calcularJurosMensal();
        double tarifa = calcularTarifaMensal();
        this.saldo = this.saldo + juros - tarifa;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}
