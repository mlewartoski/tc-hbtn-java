public class Gerente extends Empregado {

    private double salarioFixo;

    public Gerente(double salarioFixo) {
        super(salarioFixo);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double bonus = 0;
        if (departamento.alcancouMeta()){
            double diferencaMeta = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            bonus = this.salarioFixo/5;
            bonus += diferencaMeta/100;
        }
        return bonus;
    }

    @Override
    public double calcularSalarioTotal(Departamento departamento) {
        return super.calcularSalarioTotal(departamento);
    }
}
