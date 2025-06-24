package fatec.poo.model;

/**
 *
 * @author Lucas/Murilo
 */
public class Quarto {
    private int numero;
    private String tipo;
    private boolean situacao;
    private double valorDiaria;
    private double totalFaturado;    
    
    
    public Quarto (int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
    }
    public void reservar(){
        this.situacao = true;
    }
    public double liberar(int dias){
        this.situacao = false;
        
        double valor = dias * valorDiaria;
        this.totalFaturado += valor;
        return valor;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public double getValorDiaria() {
        return valorDiaria;
    }
    public double getTotalFaturado() {
        return totalFaturado;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setTotalFaturado(double totalFaturado) {
        this.totalFaturado = totalFaturado;
    }
    
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    } 

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
