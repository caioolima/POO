package Exe3;

abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("\nDepósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    public abstract void sacar(double valor);

    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("\nTransferência de R$" + valor + " da conta " + this.getClass().getSimpleName() + " para a conta " + destino.getClass().getSimpleName() + ". Saldo atual: R$" + saldo);
        } else {
            System.out.println("\nSaldo insuficiente para realizar a transferência.");
        }
    }
}

class ContaCorrente extends Conta {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("\nSaque de R$" + valor + " realizado da conta corrente. Saldo atual: R$" + saldo);
        } else {
            System.out.println("\nSaldo insuficiente para realizar o saque.");
        }
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("\nSaque de R$" + valor + " realizado da conta poupança. Saldo atual: R$" + saldo);
        } else {
            System.out.println("\nSaldo insuficiente para realizar o saque.");
        }
    }
}

class ContaSalario extends Conta {
    public ContaSalario(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("\nSaque de R$" + valor + " realizado da conta salário. Saldo atual: R$" + saldo);
        } else {
            System.out.println("\nSaldo insuficiente para realizar o saque.");
        }
    }
}

