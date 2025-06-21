package Prova;

public abstract class Pagamento {
    protected String forma;

    public Pagamento(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}
