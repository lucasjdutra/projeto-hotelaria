package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas/Murilo
 */
public class Recepcionista extends Pessoa {
    private int regFunc;
    private String turno;
    private ArrayList<Registro> registros = new ArrayList();
    
    public Recepcionista (int rf, String n) {
        super (n);  //chamada do metodo construtor da superclasse Pessoa
        regFunc = rf;                       
    }
    public void setTurno(String t){
        turno = t;
    }
    public int getRegFunc() {
        return regFunc;
    }
    public String getTurno() {
        return turno;
    }
    public void adicionarRegistro(Registro registro){
        if (!registros.contains(registro)) {
            registros.add(registro);
            registro.setRecepcionista(this);
        }
    }
}
