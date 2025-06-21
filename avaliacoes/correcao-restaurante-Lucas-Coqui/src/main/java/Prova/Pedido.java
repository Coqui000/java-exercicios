package Prova;

import java.util.List;

public class Pedido {
     private Mesa mesa;
    private Cliente cliente;
    private List<Produto> produtos;
    private float total;
    private NotaFiscal notaFiscal;
    
    public Pedido(Mesa mesa, Cliente cliente, List<Produto> produtos, float total, NotaFiscal notaFiscal) {
        this.mesa = mesa;
        this.cliente = cliente;
        this.produtos = produtos;
        this.total = total;
        this.notaFiscal = notaFiscal;
    }
    public Mesa getMesa() {
        return mesa;
    }
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

}
