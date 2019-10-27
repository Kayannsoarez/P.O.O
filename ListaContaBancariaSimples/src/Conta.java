import java.util.List;

public class Conta {

    int numero;
    double saldo;
    List<Operacao> listOp;
    Cliente cliente;

    public Conta() {

    }

    public Conta(int numero, double saldo, List<Operacao> listOp, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.listOp = listOp;
        this.cliente = cliente;
    }

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Operacao> getListOp() {
        return listOp;
    }

    public void setListOp(List<Operacao> listOp) {
        this.listOp = listOp;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo +
                ", listOp=" + listOp + ", cliente=" + cliente + '}';
    }

    // Methods

    public String printExtrato() {
        return this.listOp.toString();
    }

    public String printExtrato(int nOp) {
        String aux, extrato = null;
        if (nOp <= this.listOp.size()) {
            for (int i = this.listOp.size() - 1; i >= 0; i--) {
                aux = this.listOp.get(i).toString();
                extrato = extrato.concat(aux);
            }
        }
        return extrato;
    }
    public boolean sacar(Operacao operacao){
        if(operacao.getTypeOp() == "sacar"){
            if(operacao.getValor()<=this.saldo || operacao.getValor()>0){
                this.saldo -= operacao.getValor();
                return true;
            }
        }
        return false;
    }
    public boolean depositar(Operacao operacao){
        if(operacao.getTypeOp() == "Depositar"){
            if(operacao.getValor()>=0){
                this.saldo += operacao.getValor();
                return true;
            }
        }
        return false;
    }
}
