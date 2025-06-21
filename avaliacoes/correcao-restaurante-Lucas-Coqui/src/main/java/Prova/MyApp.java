package Prova;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class MyApp {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Casa Guedes 2", "516255975", "Praça dos Poveiros, 76");

        // Criar produtos
        Produto pizza = new Produto("Pizza", 50.0f);
        Produto suco = new Produto("Suco", 10.0f);
        Produto sobremesa = new Produto("Sobremesa", 15.0f);
        List<Produto> produtosMenu = Arrays.asList(pizza, suco, sobremesa);

        // Criar e exibir menu
        Menu menu = new Menu(produtosMenu);
        menu.exibirMenu();

        // Criar mesa
        Mesa mesa = new Mesa(1, "Ocupada");

        // Criar cliente
        Cliente cliente = new Cliente("João Silva", "joao@email.com");

        // Cliente faz pedido 
        List<Produto> produtosPedido = Arrays.asList(pizza, suco);

        // Calcular total com IVA (23%)
        float subtotal = 0;
        for (Produto p : produtosPedido) {
            subtotal += p.getPreco();
        }
        float total = subtotal * 1.23f;

        // Criar nota fiscal
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setIdentificacao(UUID.randomUUID());
        notaFiscal.setEmitente(restaurante.getCnpj());
        notaFiscal.addProduto(produtosPedido);
        notaFiscal.setTotal(total);

        // Criar pedido e associar nota
        Pedido pedido = new Pedido(mesa, cliente, produtosPedido, total, notaFiscal);

        // Simular pagamento
        Pagamento pagamento = new PagamentoDinheiro("Espécie");
        System.out.println("\nPagamento realizado via: " + pagamento.getForma());

        // Exibir nota fiscal
        System.out.println("\n---- NOTA FISCAL ----");
        notaFiscal.exibirNotaFiscal();
    }





    }
