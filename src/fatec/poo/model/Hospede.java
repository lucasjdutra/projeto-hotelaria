
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas/Murilo
 */
public class Hospede extends Pessoa {
    private String cpf;
    private double taxaDesconto;
    private ArrayList<Registro> registros = new ArrayList<>();
    
    public Hospede (String n, String c){
        super (n);//chamada do metodo construtor da supperclasse
        this.cpf = c;
    }
    public void setTaxaDesconto(double td){
        taxaDesconto = td;
    }
    public String getCpf() {
        return cpf;
    }
    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void adicionarRegistro(Registro registro) {
      registros.add(registro);
      registro.setHospede(this);
    }
}

