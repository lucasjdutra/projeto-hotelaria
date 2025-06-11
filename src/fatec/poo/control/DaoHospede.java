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
        return(objHospede);
    }
    
}
