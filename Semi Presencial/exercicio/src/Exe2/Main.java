package Exe2;

public class Main {
    public static void main(String[] args) {
        Veículo carro = new Veículo("Toyota", "Corolla", 2022);
        Veículo moto = new Veículo("Honda", "CBR500R", 2021);

        carro.ligar();
        carro.desligar();

        moto.ligar();
        moto.ligar(); // Tentando ligar novamente

        moto.desligar();
    }
}
