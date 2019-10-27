public class Operacao {

    String typeOp;
    double valor;

    public Operacao() {

    }

    public Operacao(String typeOp, double valor) {
        this.typeOp = typeOp;
        this.valor = valor;
    }

    public String getTypeOp() {
        return typeOp;
    }
    public void setTypeOp(String typeOp) {
        this.typeOp = typeOp;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Operacao{" + "typeOp='" + typeOp + '\'' + ", valor=" + valor + '}';
    }
}