package Prova;

import java.util.List;
import java.util.UUID;

public class NotaFiscal implements INFCGenerator {
    private UUID id;
    private String emitente;
    private List<Produto> produtos;
    private float total;
    
    public NotaFiscal() {
    }
    public NotaFiscal(UUID id, String emitente, List<Produto> produtos, float total) {
        this.id = id;
        this.emitente = emitente;
        this.produtos = produtos;
        this.total = total;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getEmitente() {
        return emitente;
    }
    public void setEmitente(String emitente) {
        this.emitente = emitente;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }




    @Override
    public void setIdentificacao(UUID id) {
        this.id = id;
}

    @Override
     public void addProduto(List<Produto> produtos) {
        this.produtos = produtos;

}


    public void exibirNotaFiscal() {
        System.out.println("ID: " + id);
        System.out.println("Emitente: " + emitente);
        System.out.println("Produtos:");
        for (Produto p : produtos) {
            System.out.printf("- %s: R$ %.2f%n", p.getNome(), p.getPreco());
        }
        System.out.printf("TOTAL (com IVA 23%%): R$ %.2f%n", total);
    }
}
