package Prova;

public class Mesa {
    private int numero;
    private String Status;
    
    public Mesa(int numero, String status) {
        this.numero = numero;
        Status = status;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    
}
