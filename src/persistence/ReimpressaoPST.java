/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import dbutil.Conn;
import java.sql.CallableStatement;
import java.sql.Connection;
import bean.DadosCarregBean;

/**
 *
 * @author anderson
 */
public class ReimpressaoPST {

    public ReimpressaoPST() {
    }
    
    public DadosCarregBean retReimpressao(String idPreOrdCarreg) {

        DadosCarregBean dadosCarregBean = new DadosCarregBean();
        Connection conn = null;
        CallableStatement callableStatement = null;
        String sql = "{call usinas.pk_pre_oc_totem.pb_perm_reimpressao(?,?,?,"
                + "?,?,?,?)}";
        
        try {

            conn = Conn.getInstance().getConnection();
            callableStatement = conn.prepareCall(sql);
            
            System.out.println("dadosCarregTO.getIdPreOrdCarreg() = " + idPreOrdCarreg);

            callableStatement.setInt(1, Integer.parseInt(idPreOrdCarreg));
            callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
            callableStatement.registerOutParameter(3, java.sql.Types.VARCHAR);
            callableStatement.registerOutParameter(4, java.sql.Types.VARCHAR);
            callableStatement.registerOutParameter(5, java.sql.Types.VARCHAR);
            callableStatement.registerOutParameter(6, java.sql.Types.VARCHAR);
            callableStatement.registerOutParameter(7, java.sql.Types.VARCHAR);

            callableStatement.executeUpdate();
            
            dadosCarregBean.setIdCarreg(idPreOrdCarreg);
            dadosCarregBean.setPlaca1(callableStatement.getString(2));
            
            if (callableStatement.getString(3) == null) {
                dadosCarregBean.setPlaca2("");
            }
            else{
                dadosCarregBean.setPlaca2(callableStatement.getString(3));
            }
            
            if (callableStatement.getString(4) == null) {
                dadosCarregBean.setPlaca3("");
            }
            else{
                dadosCarregBean.setPlaca3(callableStatement.getString(4));
            }
            
            if (callableStatement.getString(5) != null) {
                dadosCarregBean.setNomeMotorista(callableStatement.getString(5));
            }
            else{
                dadosCarregBean.setNomeMotorista("0");
            }
            
            dadosCarregBean.setSenha(callableStatement.getString(6));
            
            if (callableStatement.getString(7) == null) {
                dadosCarregBean.setMsg("");
            }
            else{
                dadosCarregBean.setMsg(callableStatement.getString(7));
            }
            
            System.out.println("dadosCarregTO.setPlaca1 = " + callableStatement.getString(2));
            System.out.println("dadosCarregTO.setPlaca2 = " + callableStatement.getString(3));
            System.out.println("dadosCarregTO.setPlaca3 = " + callableStatement.getString(4));
            System.out.println("dadosCarregTO.setNomeMotorista = " + callableStatement.getString(5));
            System.out.println("dadosCarregTO.setSenha = " + callableStatement.getString(6));
            System.out.println("dadosCarregTO.setMsg = " + callableStatement.getString(7));
            
        } catch (Exception e) {
            System.out.println("Erro = " + e);
        }

        return dadosCarregBean;
    }
    
    public void addReimpressao(DadosCarregBean dadosCarregTO) {

        Connection conn = null;
        CallableStatement callableStatement = null;
        String sql = "{call usinas.pk_pre_oc_totem.pb_ins_pre_oc_imprime(?)}";
        
        try {

            conn = Conn.getInstance().getConnection();
            callableStatement = conn.prepareCall(sql);
            
            System.out.println("dadosCarregTO.getIdPreOrdCarreg() = " + dadosCarregTO.getIdPreOrdCarreg());
            callableStatement.setInt(1, Integer.parseInt(dadosCarregTO.getIdPreOrdCarreg()));
            
            callableStatement.executeUpdate();
            
            conn.commit();
            
        } catch (Exception e) {
            System.out.println("Erro = " + e);
        }

    }
    
}
