package fatec.poo.control;
import fatec.poo.model.Quarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lucas D. e Murilo K.
 */
public class DaoQuarto {
    private Connection conn;

    public DaoQuarto(Connection conn) {
        this.conn = conn;
    }
    
    public Quarto consultar(int numero){
        Quarto objQuarto = null;
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("SELECT * from tblQuarto where Numero_Quarto = ?");
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                objQuarto = new Quarto(rs.getInt("Numero_Quarto"), rs.getString("Tipo_Quarto"), rs.getDouble("ValorDiaria_Quarto"));
                objQuarto.setSituacao(rs.getBoolean("Situacao_Quarto"));
                objQuarto.setTotalFaturado(rs.getDouble("TotalFaturado_Quarto"));
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (objQuarto);
    }
    
    public void inserir(Quarto objQuarto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblQuarto(Numero_Quarto, Tipo_Quarto, ValorDiaria_Quarto, Situacao_Quarto, TotalFaturado_Quarto) VALUES(?,?,?,?,?)");
            ps.setInt(1, objQuarto.getNumero());
            ps.setString(2, objQuarto.getTipo());
            ps.setDouble(3, objQuarto.getValorDiaria());
            ps.setBoolean(4, objQuarto.isSituacao()); //quarto começa disponivel
            ps.setDouble(5, objQuarto.getTotalFaturado()); //valor faturado começa em 0 
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
        
    public void alterar(Quarto objQuarto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblQuarto set Tipo_Quarto = ?, ValorDiaria_Quarto = ?, Situacao_Quarto = ?, TotalFaturado_Quarto = ? where Numero_Quarto = ?");
            
            ps.setString(1, objQuarto.getTipo());
            ps.setDouble(2, objQuarto.getValorDiaria());
            ps.setBoolean(3, objQuarto.isSituacao());
            ps.setDouble(4, objQuarto.getTotalFaturado());
            ps.setInt(5, objQuarto.getNumero());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
    public void excluir(Quarto objQuarto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblQuarto where Numero_Quarto = ?");
            ps.setInt(1, objQuarto.getNumero());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }   
}
