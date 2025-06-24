package fatec.poo.control;

import fatec.poo.model.Registro;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import fatec.poo.model.ServicoQuarto;

import fatec.poo.control.DaoRecepcionista;
import fatec.poo.control.DaoHospede;
import fatec.poo.control.DaoQuarto;
import fatec.poo.control.DaoServicoQuarto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author Lucas D. e Murilo K.
 */
public class DaoRegistro {
    private Connection conn;

    public DaoRegistro(Connection conn) {
        this.conn = conn;
    }
    
    public Registro consultar(int codigo) {
        Registro objRegistro = null;
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("SELECT * from tblRegistro WHERE Codigo_Registro = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                //instanciando objetos Dao pra fazer a consulta
                DaoRecepcionista daoRecep = new DaoRecepcionista(conn);
                DaoHospede daoHosp = new DaoHospede(conn);
                DaoQuarto daoQuarto = new DaoQuarto(conn);
                DaoServicoQuarto daoServico = new DaoServicoQuarto(conn);
                
                //instanciando objetos Recepcionista, Hospede e Quarto pra usar na consulta
                Recepcionista objRecep = daoRecep.consultar(rs.getInt("RegFuncRecep_Registro"));
                Hospede objHosp = daoHosp.consultar(rs.getString("CpfHospede_Registro"));
                Quarto objQuarto = daoQuarto.consultar(rs.getInt("NumeroQuarto_Registro"));
                
                //instanciando o registro
                objRegistro = new Registro(rs.getInt("Codigo_Registro"), 
                        rs.getDate("DataEntrada_Registro").toLocalDate(), //conversão de data pra localdate
                        objRecep
                );
                objRegistro.setHospede(objHosp);
                objRegistro.setQuarto(objQuarto);
                
               //conversão de data pra localdate (se houver saída)
                Date dataSaida = rs.getDate("DataSaida_Registro");
                if (dataSaida != null) {
                    objRegistro.setDataSaida(dataSaida.toLocalDate());
                }
                
                objRegistro.setValorHospedagem(rs.getDouble("ValorHospedagem_Registro"));
                
                //crio um novo preparedstatement e resultset pra executar query numa tabela diferente (sem sobrescrever a outra)
                PreparedStatement psServicos = conn.prepareStatement("SELECT CodigoServQuarto_LS FROM tblListaServico WHERE CodigoRegistro_LS = ?");
                psServicos.setInt(1, codigo);
                ResultSet rsServicos = psServicos.executeQuery();
                
                while (rsServicos.next()) {
                    int codServico = rsServicos.getInt("CodigoServQuarto_LS"); //puxo o codigo do serviço numa variavel pra ficar legivel
                    ServicoQuarto servico = daoServico.consultar(codServico); //retorna um objeto serviço
                    if(servico != null) {
                        objRegistro.adicionarServicoQuarto(servico);
                    }
                }
                
            }   
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (objRegistro);
    }
    
    
    public void reservar (Registro objRegistro) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblRegistro(Codigo_Registro, DataEntrada_Registro, DataSaida_Registro, ValorHospedagem_Registro, CpfHospede_Registro, NumeroQuarto_Registro, RegFuncRecep_Registro) VALUES(?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, objRegistro.getCodigo());
            ps.setDate(2, Date.valueOf(objRegistro.getEntrada()));
            // checa se o valor já existe
            if (objRegistro.getDataSaida()!= null) {
                ps.setDate(3, Date.valueOf(objRegistro.getDataSaida()));
            } else {
                ps.setDate(3, null);
            }
            ps.setDouble(4, objRegistro.getValorHospedagem());
            ps.setString(5, objRegistro.getHospede().getCpf());
            ps.setInt(6, objRegistro.getQuarto().getNumero());
            ps.setInt(7, objRegistro.getRecepcionista().getRegFunc());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void liberar(Registro registro) {
        PreparedStatement ps;
        
        try {
            LocalDate dataSaída = registro.getDataSaida();
            double valorFinal = registro.liberarQuarto(); //retorna o valor da estadia + serviços com o desconto e atualiza o estado do quarto
            
            ps = conn.prepareStatement("UPDATE tblRegistro SET DataSaida_Registro = ?, ValorHospedagem_Registro = ? WHERE Codigo_Registro = ?");
            
            ps.setDate(1, Date.valueOf(dataSaída));
            ps.setDouble(2, valorFinal);
            ps.setInt(3, registro.getCodigo());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
