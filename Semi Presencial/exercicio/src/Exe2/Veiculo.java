package Exe2;

class Veículo {
    String marca;
    String modelo;
    int ano;
    boolean ligado;

    public Veículo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false; // Por padrão, o veículo começa desligado
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O veículo foi ligado.");
        } else {
            System.out.println("O veículo já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O veículo foi desligado.");
        } else {
            System.out.println("O veículo já está desligado.");
        }
    }
}

