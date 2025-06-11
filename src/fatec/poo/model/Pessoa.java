package fatec.poo.model;

/**
 *
 * @author Lucas/Murilo
 */
public class Pessoa { 
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String e){
        this.endereco = e;
    }
    public void setTelefone(String t){
        this.telefone = t;
    }
    public String getNome(){
        return nome;    
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

