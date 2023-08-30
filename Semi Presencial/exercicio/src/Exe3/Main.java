package Exe3;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000);
        ContaSalario contaSalario = new ContaSalario(1500);

        System.out.println("Saldo da conta corrente: R$" + contaCorrente.consultarSaldo());
        System.out.println("Saldo da conta poupança: R$" + contaPoupanca.consultarSaldo());
        System.out.println("Saldo da conta salário: R$" + contaSalario.consultarSaldo());

        contaCorrente.depositar(500);
        contaPoupanca.depositar(300);
        contaSalario.depositar(200);

        contaCorrente.sacar(300);
        contaPoupanca.sacar(100);
        contaSalario.sacar(50);

        contaCorrente.transferir(200, contaPoupanca);
        contaPoupanca.transferir(500, contaSalario);
    }
}
