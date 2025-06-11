package fatec.poo.control;
import fatec.poo.model.Recepcionista;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lucas D. e Murilo K.
 */
public class DaoRecepcionista {
    private Connection conn;

    public DaoRecepcionista(Connection conn) {
        this.conn = conn;
    }
    
    public Recepcionista consultar (int regFunc) {
        Recepcionista objRecep = null;
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblRecepcionista where RegFunc_Recep = ?");
            ps.setInt(1, regFunc);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                objRecep = new Recepcionista(rs.getInt("RegFunc_Recep"), rs.getString("Nome_Recep"));
                
                objRecep.setEndereco(rs.getString("Endereco_Recep"));
                objRecep.setTelefone(rs.getString("Telefone_Recep"));
                objRecep.setTurno(rs.getString("Turno_Recep"));
            }
        } 
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (objRecep);
    }
    
    public void inserir (Recepcionista objRecep) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblRecepcionista (RegFunc_Recep, Nome_Recep, Endereco_Recep, Telefone_Recep, Turno_Recep) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, objRecep.getRegFunc());
            ps.setString(2, objRecep.getNome());
            ps.setString(3, objRecep.getEndereco());
            ps.setString(4, objRecep.getTelefone());
            ps.setString(5, objRecep.getTurno());
            
            ps.execute();
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar (Recepcionista objRecep) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblRecepcionista SET Nome_Recep = ?, Endereco_Recep = ?, Telefone_Recep = ?, Turno_Recep = ? WHERE RegFunc_Recep = ?");
            ps.setString(1, objRecep.getNome());
            ps.setString(2, objRecep.getEndereco());
            ps.setString(3, objRecep.getTelefone());
            ps.setString(4, objRecep.getTurno());
            ps.setInt(5, objRecep.getRegFunc());
            
            ps.execute();
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void excluir (Recepcionista objRecep) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE from tblRecepcionista WHERE RegFunc_Recep = ?");
            ps.setInt(1, objRecep.getRegFunc());
            
            ps.execute();
        } 
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
