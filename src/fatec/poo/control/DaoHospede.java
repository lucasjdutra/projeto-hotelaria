package fatec.poo.control;
import fatec.poo.model.Hospede;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lucas D. e Murilo K.
 */
public class DaoHospede {
    private Connection conn;

    public DaoHospede(Connection conn) {
        this.conn = conn;
    }
    
    public Hospede consultar (String cpf){
        Hospede objHospede = null;
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("SELECT * from tblHospede where CPF_Hospede = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                objHospede = new Hospede(rs.getString("Nome_Hospede"), rs.getString("CPF_Hospede"));
                objHospede.setEndereco(rs.getString("Endereco_Hospede"));
                objHospede.setTelefone(rs.getString("Telefone_Hospede"));
                objHospede.setTaxaDesconto(rs.getDouble("TaxaDesconto_Hospede"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(objHospede);
    }
    
    public void inserir(Hospede objHospede) {
        PreparedStatement ps;

        try {
            ps = conn.prepareStatement("INSERT INTO tblHospede (CPF_Hospede, Nome_Hospede, Endereco_Hospede, Telefone_Hospede, TaxaDesconto_Hospede) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, objHospede.getCpf());
            ps.setString(2, objHospede.getNome());
            ps.setString(3, objHospede.getEndereco());
            ps.setString(4, objHospede.getTelefone());
            ps.setDouble(5, objHospede.getTaxaDesconto());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Hospede objHospede) {
        PreparedStatement ps;

        try {
            ps = conn.prepareStatement("UPDATE tblHospede SET Nome_Hospede = ?, Endereco_Hospede = ?, Telefone_Hospede = ?, TaxaDesconto_Hospede = ? WHERE CPF_Hospede = ?");
            ps.setString(1, objHospede.getNome());
            ps.setString(2, objHospede.getEndereco());
            ps.setString(3, objHospede.getTelefone());
            ps.setDouble(4, objHospede.getTaxaDesconto());
            ps.setString(5, objHospede.getCpf());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void excluir(Hospede objHospede) {
        PreparedStatement ps;

        try {
            ps = conn.prepareStatement("DELETE FROM tblHospede WHERE CPF_Hospede = ?");
            ps.setString(1, objHospede.getCpf());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
