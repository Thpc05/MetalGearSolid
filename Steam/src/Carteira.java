public class Carteira {
    private double saldo;

    public Carteira() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) this.saldo += valor;
    }

    public boolean debitar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
