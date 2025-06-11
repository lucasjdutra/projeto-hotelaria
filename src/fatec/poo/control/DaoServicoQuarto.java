package fatec.poo.control;
import fatec.poo.model.ServicoQuarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lucas D. e Murilo K.
 */
public class DaoServicoQuarto {
    private Connection conn;

    public DaoServicoQuarto(Connection conn) {
        this.conn = conn;
    }
    
    public ServicoQuarto consultar(int codigo){
        ServicoQuarto objServico = null;
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("SELECT * from tblServicoQuarto where Codigo_ServQuarto = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                objServico = new ServicoQuarto(rs.getInt("Codigo_ServQuarto"), rs.getString("Descricao_ServQuarto"));
                objServico.setValor(rs.getDouble("Valor_ServQuarto"));
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (objServico);
    }
    
        public void inserir(ServicoQuarto objServico) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblServicoQuarto(Codigo_ServQuarto, Descricao_ServQuarto, Valor_ServQuarto) VALUES(?,?,?)");
            ps.setInt(1, objServico.getCodigo());
            ps.setString(2, objServico.getDescricao());
            ps.setDouble(3, objServico.getValor());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
        
        public void alterar(ServicoQuarto objServico) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblServicoQuarto set Descricao_ServQuarto = ?, Valor_ServQuarto = ? where Codigo_ServQuarto = ?");
            
            ps.setString(1, objServico.getDescricao());
            ps.setDouble(2, objServico.getValor());
            ps.setInt(3, objServico.getCodigo());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
        }
        
        public void excluir(ServicoQuarto objServico) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblServicoQuarto where Codigo_ServQuarto = ?");
            
            ps.setInt(1, objServico.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
}
