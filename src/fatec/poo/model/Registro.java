package fatec.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Lucas/Murilo
 */
public class Registro {
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem; 
    
    private Recepcionista recepcionista;
    private Hospede hospede;
    private Quarto quarto;

    private ArrayList<ServicoQuarto> servicosQuarto;
    

    public Registro(int codigo, LocalDate dataEntrada, Recepcionista recepcionista){
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.recepcionista = recepcionista;
        this.servicosQuarto = new ArrayList<>();        
    }
    public void setDataSaida(LocalDate dataSaida){;
        this.dataSaida = dataSaida;
    }
    public int getCodigo(){
        return codigo;
    }
    public LocalDate getEntrada() {
        return dataEntrada;
    }
    public LocalDate getDataSaida() {
        return dataSaida;
    }
    public double getValorHospedagem() {
        return valorHospedagem;
    }
    public void reservarQuarto(Hospede hospede, Quarto quarto) {
        this.hospede = hospede;
        this.quarto = quarto;
        quarto.reservar();
    }
    public double liberarQuarto() {
        double valorHospedagem = quarto.liberar(dataEntrada.until(dataSaida).getDays());
        double valorDesconto =  valorHospedagem * (hospede.getTaxaDesconto()/100);
        double totalServicos = 0.0;
        for (int indiceAtual = 0; indiceAtual<servicosQuarto.size();indiceAtual++) {
            double valorDoServicoAtual = servicosQuarto.get(indiceAtual).getValor();
            totalServicos += valorDoServicoAtual;
        }
        return (valorHospedagem - valorDesconto) + totalServicos;

    }
    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
        recepcionista.adicionarRegistro(this);
            }
    public void adicionarServicoQuarto(ServicoQuarto servico){
        servicosQuarto.add(servico);
    }
    public void setHospede(Hospede hospede){
        this.hospede = hospede;
        hospede.adicionarRegistro(this);
    }
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }
}    