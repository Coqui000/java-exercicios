package Prova;

import java.util.List;

public class Menu {
    private List<Produto> produtos;

    public Menu(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void exibirMenu() {
        System.out.println("--- MENU DO RESTAURANTE ---");
        for (Produto produto : produtos) {
            System.out.printf("%s - R$ %.2f%n", produto.getNome(), produto.getPreco());
        }
    }

}
