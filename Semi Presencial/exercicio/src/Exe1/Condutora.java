package Exe1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    String nome;
    double valor;
    String descricao;

    public Produto(String nome, double valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }
}

class CarrinhoDeCompras {
    List<Produto> produtos;
    double valorTotal;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
        valorTotal = 0;
    }

    public void adicionarAoCarrinho(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.valor;
    }

    public double getTotal() {
        return valorTotal;
    }
}

public class Condutora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        while (true) {
            System.out.println("\nDigite o nome do produto (ou 'sair' para encerrar):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("\nDigite o valor do produto:");
            double valor = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a descrição do produto:");
            String descricao = scanner.nextLine();

            Produto novoProduto = new Produto(nome, valor, descricao);
            carrinho.adicionarAoCarrinho(novoProduto);

            System.out.println("\nProduto adicionado ao carrinho.");
            System.out.println("\nValor total do carrinho: R$" + carrinho.getTotal());
        }

        System.out.println("\nProdutos no carrinho:");
        for (Produto produto : carrinho.produtos) {
            System.out.println("\nNome: " + produto.nome);
            System.out.println("Valor: R$" + produto.valor);
            System.out.println("Descrição: " + produto.descricao);
            System.out.println("-----");
        }

        System.out.println("\nValor total do carrinho: R$" + carrinho.getTotal());

        scanner.close();
    }
}
