
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
      if (!registros.contains(registro)) {
        registros.add(registro);
        registro.setHospede(this);
      }
    }
    
    public static boolean validarCPF(String cpf) {
        // checa se o CPF tem 11 dígitos ou se é uma sequência repetida
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            // calculo do primeiro dígito verificador
            int soma1 = 0;
            for (int i = 0; i < 9; i++) {
                int digito = Character.getNumericValue(cpf.charAt(i));
                soma1 += digito * (i + 1);
            }
            int resto1 = soma1 % 11;
            if (resto1 == 10) resto1 = 0;

            // checa se o decimo dígito (índice 9) é igual ao primeiro dígito verificador
            if (resto1 != Character.getNumericValue(cpf.charAt(9))) {
                return false;
            }

            // calculo do segundo dígito verificador
            int soma2 = 0;
            for (int i = 0; i < 9; i++) {
                int digito = Character.getNumericValue(cpf.charAt(i));
                soma2 += digito * (11 - i);
            }
            soma2 += resto1 * 2;

            int resto2 = (soma2 * 10) % 11;
            if (resto2 == 10) resto2 = 0;

            // checa se o dígito 11 (índice 10) é igual ao segundo dígito verificador
            return resto2 == Character.getNumericValue(cpf.charAt(10));
        } catch (Exception e) {
            return false;
        }
    }
}

