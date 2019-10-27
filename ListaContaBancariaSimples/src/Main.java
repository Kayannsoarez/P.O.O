import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(01, "Kayann");
        Conta conta = new Conta(11, 1000, cliente);


        Operacao saque = new Operacao("Sacar", 0.0);
        Operacao deposito = new Operacao("Depositar", 0.0);

        System.out.println("| Conta Bancária |");
        System.out.println("Cliente: " + conta.getCliente().nome);
        System.out.println("Conta: " + conta.getNumero() + " | " + "Saldo: " + conta.getSaldo());


        System.out.println("\n| Operação Realizada |");
        deposito.setValor(50.0);
        conta.depositar(deposito);
        System.out.println("Deposito: " + deposito.getValor() + " R$");
        System.out.println("Saldo Atual:" + conta.saldo);


        System.out.println("\n| Operação Realizada |");
        deposito.setValor(200.0);
        conta.depositar(deposito);
        System.out.println("Deposito: " + deposito.getValor() + " R$");
        System.out.println("Saldo Atual:" + conta.saldo);


        System.out.println("\n| Operação Realizada |");
        deposito.setValor(1.0);
        conta.depositar(deposito);
        System.out.println("Deposito: " + deposito.getValor() + " R$");
        System.out.println("Saldo Atual:" + conta.saldo);


        System.out.println("\n| Operação Realizada |");
        saque.setValor(350.0);
        conta.sacar(saque);
        System.out.println("Saque: " + saque.getValor() + " R$");
        System.out.println("Saldo Atual:" + conta.saldo);


        System.out.println("\n| Operação Realizada |");
        saque.setValor(10.0);
        conta.sacar(saque);
        System.out.println("Saque: " + saque.getValor() + " R$");
        System.out.println("Saldo Atual:" + conta.saldo);

    }
}