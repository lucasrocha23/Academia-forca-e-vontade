/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armazenamento;

import connection.ConnectionFactory;
import fichas.FichaBD;
import fichas.FichaResumidaBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author lucas
 */
public class FichaDao {
    private Connection con = null;
    
    public void conectar(){
        this.con = ConnectionFactory.getConnection();
    }
    
    public int cadastrarFicha(FichaBD ficha){
        if (con == null) this.conectar();
        
        //
        String sql1 = "INSERT INTO ficha (nome,sexo,nascimento,naturalidade,dias,residente,numero,bairro,cidade,cep,telefone,profissão,estadoCivil,obsSaude,txtObsSaude,atvdFisica,txtObsAtvdFisica,horarios,txtObsHorarios,objetivos,objOutros,fuma,bebe,p_a,avPostural,txtObsGeral,numMatricula,iniBracoDir,iniBracoEsq,iniAnteBracoDir,iniAnteBracoEsq,iniTorax,iniCintura,iniQuadril,iniCoxaDir,iniCoxaEsq,iniPanturrilhaDir,iniPanturrilhaEsq,iniAbdomen,iniPeso,iniEstatura,iniData,tresBracoDir,tresBracoEsq,tresAnteBracoDir,tresAnteBracoEsq,tresTorax,tresCintura,tresQuadril,tresCoxaDir,tresCoxaEsq,tresPanturrilhaDir,tresPanturrilhaEsq,tresAbdomen,tresPeso,tresEstatura,tresData,seisBracoDir,seisBracoEsq,seisAnteBracoDir,seisAnteBracoEsq,seisTorax,seisCintura,seisQuadril,seisCoxaDir,seisCoxaEsq,seisPanturrilhaDir,seisPanturrilhaEsq,seisAbdomen,seisPeso,seisEstatura,seisData,noveBracoDir,noveBracoEsq,noveAnteBracoDir,noveAnteBracoEsq,noveTorax,noveCintura,noveQuadril,noveCoxaDir,noveCoxaEsq,novePanturrilhaDir,novePanturrilhaEsq,noveAbdomen,novePeso,noveEstatura,noveData,dozeBracoDir,dozeBracoEsq,dozeAnteBracoDir,dozeAnteBracoEsq,dozeTorax,dozeCintura,dozeQuadril,dozeCoxaDir,dozeCoxaEsq,dozePanturrilhaDir,dozePanturrilhaEsq,dozeAbdomen,dozePeso,dozeEstatura,dozeData) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String sql2 = "INSERT INTO dia_vencimento (diaVencimento,numMatricula) VALUES (?,?)";
        
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        
        try {
            stmt1 = con.prepareStatement(sql1);
            stmt1.setString(1, ficha.getNome());
            stmt1.setString(2, ficha.getSexo());
            stmt1.setDate(3, ficha.getD_nasc());
            stmt1.setString(4, ficha.getNaturalidade());
            stmt1.setString(5, ficha.getDias());
            stmt1.setString(6, ficha.getResidente());
            stmt1.setString(7, ficha.getNumero());
            stmt1.setString(8, ficha.getBairro());
            stmt1.setString(9, ficha.getCidade());
            stmt1.setString(10, ficha.getCEP());
            stmt1.setString(11, ficha.getTelefone());
            stmt1.setString(12, ficha.getProfissao());
            stmt1.setString(13, ficha.getE_civil());
            stmt1.setInt(14, ficha.getObs_saude());
            stmt1.setString(15, ficha.getString_obs_saude());
            stmt1.setString(16, ficha.getAtv_fisica());
            stmt1.setString(17, ficha.getObs_atv_fisica());
            stmt1.setString(18, ficha.getHorarios());
            stmt1.setString(19, ficha.getObs_horarios());
            stmt1.setString(20, ficha.getObjetivos());
            stmt1.setString(21, ficha.getObj_outros());
            stmt1.setInt(22, ficha.getFuma());
            stmt1.setInt(23, ficha.getBebe());
            stmt1.setString(24, ficha.getP_A());
            stmt1.setString(25, ficha.getPostura());
            stmt1.setString(26, ficha.getObs_geral());
            stmt1.setString(27, ficha.getNumMatricula());
            
            stmt1.setString(28, ficha.getIni_braco_D());
            stmt1.setString(29, ficha.getIni_braco_E());
            stmt1.setString(30, ficha.getIni_anteBraco_D());
            stmt1.setString(31, ficha.getIni_anteBraco_E());
            stmt1.setString(32, ficha.getIni_torax());
            stmt1.setString(33, ficha.getIni_cintura());
            stmt1.setString(34, ficha.getIni_quadril());
            stmt1.setString(35, ficha.getIni_coxa_D());
            stmt1.setString(36, ficha.getIni_coxa_E());
            stmt1.setString(37, ficha.getIni_pantu_D());
            stmt1.setString(38, ficha.getIni_pantu_E());
            stmt1.setString(39, ficha.getIni_abdomen());
            stmt1.setString(40, ficha.getIni_peso());
            stmt1.setString(41, ficha.getIni_estatura());
            stmt1.setDate(42, ficha.getIni_data());
            stmt1.setString(43, ficha.getTres_braco_D());
            stmt1.setString(44, ficha.getTres_braco_E());
            stmt1.setString(45, ficha.getTres_anteBraco_D());
            stmt1.setString(46, ficha.getTres_anteBraco_E());
            stmt1.setString(47, ficha.getTres_torax());
            stmt1.setString(48, ficha.getTres_cintura());
            stmt1.setString(49, ficha.getTres_quadril());
            stmt1.setString(50, ficha.getTres_coxa_D());
            stmt1.setString(51, ficha.getTres_coxa_E());
            stmt1.setString(52, ficha.getTres_pantu_D());
            stmt1.setString(53, ficha.getTres_pantu_E());
            stmt1.setString(54, ficha.getTres_abdomen());
            stmt1.setString(55, ficha.getTres_peso());
            stmt1.setString(56, ficha.getTres_estatura());
            stmt1.setDate(57, ficha.getTres_data());
            stmt1.setString(58, ficha.getSeis_braco_D());
            stmt1.setString(59, ficha.getSeis_braco_E());
            stmt1.setString(60, ficha.getSeis_anteBraco_D());
            stmt1.setString(61, ficha.getSeis_anteBraco_E());
            stmt1.setString(62, ficha.getSeis_torax());
            stmt1.setString(63, ficha.getSeis_cintura());
            stmt1.setString(64, ficha.getSeis_quadril());
            stmt1.setString(65, ficha.getSeis_coxa_D());
            stmt1.setString(66, ficha.getSeis_coxa_E());
            stmt1.setString(67, ficha.getSeis_pantu_D());
            stmt1.setString(68, ficha.getSeis_pantu_E());
            stmt1.setString(69, ficha.getSeis_abdomen());
            stmt1.setString(70, ficha.getSeis_peso());
            stmt1.setString(71, ficha.getSeis_estatura());
            stmt1.setDate(72, ficha.getSeis_data());
            stmt1.setString(73, ficha.getNove_braco_D());
            stmt1.setString(74, ficha.getNove_braco_E());
            stmt1.setString(75, ficha.getNove_anteBraco_D());
            stmt1.setString(76, ficha.getNove_anteBraco_E());
            stmt1.setString(77, ficha.getNove_torax());
            stmt1.setString(78, ficha.getNove_cintura());
            stmt1.setString(79, ficha.getNove_quadril());
            stmt1.setString(80, ficha.getNove_coxa_D());
            stmt1.setString(81, ficha.getNove_coxa_E());
            stmt1.setString(82, ficha.getNove_pantu_D());
            stmt1.setString(83, ficha.getNove_pantu_E());
            stmt1.setString(84, ficha.getNove_abdomen());
            stmt1.setString(85, ficha.getNove_peso());
            stmt1.setString(86, ficha.getNove_estatura());
            stmt1.setDate(87, ficha.getNove_data());
            stmt1.setString(88, ficha.getDoze_braco_D());
            stmt1.setString(89, ficha.getDoze_braco_E());
            stmt1.setString(90, ficha.getDoze_anteBraco_D());
            stmt1.setString(91, ficha.getDoze_anteBraco_E());
            stmt1.setString(92, ficha.getDoze_torax());
            stmt1.setString(93, ficha.getDoze_cintura());
            stmt1.setString(94, ficha.getDoze_quadril());
            stmt1.setString(95, ficha.getDoze_coxa_D());
            stmt1.setString(96, ficha.getDoze_coxa_E());
            stmt1.setString(97, ficha.getDoze_pantu_D());
            stmt1.setString(98, ficha.getDoze_pantu_E());
            stmt1.setString(99, ficha.getDoze_abdomen());
            stmt1.setString(100, ficha.getDoze_peso());
            stmt1.setString(101, ficha.getDoze_estatura());
            stmt1.setDate(102, ficha.getDoze_data());
            stmt1.executeUpdate();
            
            stmt2 = con.prepareStatement(sql2);
            stmt2.setInt(1, ficha.getDiaVencimento());
            stmt2.setString(2, ficha.getNumMatricula());
            stmt2.executeUpdate();
            return 0;
            
        } catch (SQLException ex) {
            System.err.println("Erro no cadastro de uma nova ficha: " + ex);
            return -1;
        }finally{
            ConnectionFactory.closeConnection(con, stmt1);
            ConnectionFactory.closeConnection(con, stmt2);
            con = null;

        }
    }
    
    public int atualizarFicha(String numMatricula, FichaBD fichaAtualizada){
        if (con == null) this.conectar();
        
        String sql1 = "UPDATE ficha SET nome = ?,sexo = ?,nascimento = ?,naturalidade = ?,dias = ?,residente = ?,numero = ?,bairro = ?,cidade = ?,cep = ?,telefone = ?,profissão = ?,estadoCivil = ?,obsSaude = ?,txtObsSaude = ?,atvdFisica = ?,txtObsAtvdFisica = ?,horarios = ?,txtObsHorarios = ?,objetivos = ?,objOutros = ?,fuma = ?,bebe = ?,p_a = ?,avPostural = ?,txtObsGeral = ?, numMatricula = ?, iniBracoDir = ?,iniBracoEsq = ?,iniAnteBracoDir = ?,iniAnteBracoEsq = ?,iniTorax = ?,iniCintura = ?,iniQuadril = ?,iniCoxaDir = ?,iniCoxaEsq = ?,iniPanturrilhaDir = ?,iniPanturrilhaEsq = ?,iniAbdomen = ?,iniPeso = ?,iniEstatura = ?,iniData = ?,tresBracoDir = ?,tresBracoEsq = ?,tresAnteBracoDir = ?,tresAnteBracoEsq = ?,tresTorax = ?,tresCintura = ?,tresQuadril = ?,tresCoxaDir = ?,tresCoxaEsq = ?,tresPanturrilhaDir = ?,tresPanturrilhaEsq = ?,tresAbdomen = ?,tresPeso = ?,tresEstatura = ?,tresData = ?,seisBracoDir = ?,seisBracoEsq = ?,seisAnteBracoDir = ?,seisAnteBracoEsq = ?,seisTorax = ?,seisCintura = ?,seisQuadril = ?,seisCoxaDir = ?,seisCoxaEsq = ?,seisPanturrilhaDir = ?,seisPanturrilhaEsq = ?,seisAbdomen = ?,seisPeso = ?,seisEstatura = ?,seisData = ?,noveBracoDir = ?,noveBracoEsq = ?,noveAnteBracoDir = ?,noveAnteBracoEsq = ?,noveTorax = ?,noveCintura = ?,noveQuadril = ?,noveCoxaDir = ?,noveCoxaEsq = ?,novePanturrilhaDir = ?,novePanturrilhaEsq = ?,noveAbdomen = ?,novePeso = ?,noveEstatura = ?,noveData = ?,dozeBracoDir = ?,dozeBracoEsq = ?,dozeAnteBracoDir = ?,dozeAnteBracoEsq = ?,dozeTorax = ?,dozeCintura = ?,dozeQuadril = ?,dozeCoxaDir = ?,dozeCoxaEsq = ?,dozePanturrilhaDir = ?,dozePanturrilhaEsq = ?,dozeAbdomen = ?,dozePeso = ?,dozeEstatura = ?,dozeData = ?  WHERE numMatricula = ?";
        String sql2 = "UPDATE dia_vencimento SET diaVencimento = ? WHERE numMatricula = ?";        

        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        
        try {
            stmt1 = con.prepareStatement(sql1);
            stmt1.setString(1, fichaAtualizada.getNome());
            stmt1.setString(2, fichaAtualizada.getSexo());
            stmt1.setDate(3, fichaAtualizada.getD_nasc());
            stmt1.setString(4, fichaAtualizada.getNaturalidade());
            stmt1.setString(5, fichaAtualizada.getDias());
            stmt1.setString(6, fichaAtualizada.getResidente());
            stmt1.setString(7, fichaAtualizada.getNumero());
            stmt1.setString(8, fichaAtualizada.getBairro());
            stmt1.setString(9, fichaAtualizada.getCidade());
            stmt1.setString(10, fichaAtualizada.getCEP());
            stmt1.setString(11, fichaAtualizada.getTelefone());
            stmt1.setString(12, fichaAtualizada.getProfissao());
            stmt1.setString(13, fichaAtualizada.getE_civil());
            stmt1.setInt(14, fichaAtualizada.getObs_saude());
            stmt1.setString(15, fichaAtualizada.getString_obs_saude());
            stmt1.setString(16, fichaAtualizada.getAtv_fisica());
            stmt1.setString(17, fichaAtualizada.getObs_atv_fisica());
            stmt1.setString(18, fichaAtualizada.getHorarios());
            stmt1.setString(19, fichaAtualizada.getObs_horarios());
            stmt1.setString(20, fichaAtualizada.getObjetivos());
            stmt1.setString(21, fichaAtualizada.getObj_outros());
            stmt1.setInt(22, fichaAtualizada.getFuma());
            stmt1.setInt(23, fichaAtualizada.getBebe());
            stmt1.setString(24, fichaAtualizada.getP_A());
            stmt1.setString(25, fichaAtualizada.getPostura());
            stmt1.setString(26, fichaAtualizada.getObs_geral());
            stmt1.setString(27, fichaAtualizada.getNumMatricula());  
            
            stmt1.setString(28, fichaAtualizada.getIni_braco_D());
            stmt1.setString(29, fichaAtualizada.getIni_braco_E());
            stmt1.setString(30, fichaAtualizada.getIni_anteBraco_D());
            stmt1.setString(31, fichaAtualizada.getIni_anteBraco_E());
            stmt1.setString(32, fichaAtualizada.getIni_torax());
            stmt1.setString(33, fichaAtualizada.getIni_cintura());
            stmt1.setString(34, fichaAtualizada.getIni_quadril());
            stmt1.setString(35, fichaAtualizada.getIni_coxa_D());
            stmt1.setString(36, fichaAtualizada.getIni_coxa_E());
            stmt1.setString(37, fichaAtualizada.getIni_pantu_D());
            stmt1.setString(38, fichaAtualizada.getIni_pantu_E());
            stmt1.setString(39, fichaAtualizada.getIni_abdomen());
            stmt1.setString(40, fichaAtualizada.getIni_peso());
            stmt1.setString(41, fichaAtualizada.getIni_estatura());
            stmt1.setDate(42, fichaAtualizada.getIni_data());
            stmt1.setString(43, fichaAtualizada.getTres_braco_D());
            stmt1.setString(44, fichaAtualizada.getTres_braco_E());
            stmt1.setString(45, fichaAtualizada.getTres_anteBraco_D());
            stmt1.setString(46, fichaAtualizada.getTres_anteBraco_E());
            stmt1.setString(47, fichaAtualizada.getTres_torax());
            stmt1.setString(48, fichaAtualizada.getTres_cintura());
            stmt1.setString(49, fichaAtualizada.getTres_quadril());
            stmt1.setString(50, fichaAtualizada.getTres_coxa_D());
            stmt1.setString(51, fichaAtualizada.getTres_coxa_E());
            stmt1.setString(52, fichaAtualizada.getTres_pantu_D());
            stmt1.setString(53, fichaAtualizada.getTres_pantu_E());
            stmt1.setString(54, fichaAtualizada.getTres_abdomen());
            stmt1.setString(55, fichaAtualizada.getTres_peso());
            stmt1.setString(56, fichaAtualizada.getTres_estatura());
            stmt1.setDate(57, fichaAtualizada.getTres_data());
            stmt1.setString(58, fichaAtualizada.getSeis_braco_D());
            stmt1.setString(59, fichaAtualizada.getSeis_braco_E());
            stmt1.setString(60, fichaAtualizada.getSeis_anteBraco_D());
            stmt1.setString(61, fichaAtualizada.getSeis_anteBraco_E());
            stmt1.setString(62, fichaAtualizada.getSeis_torax());
            stmt1.setString(63, fichaAtualizada.getSeis_cintura());
            stmt1.setString(64, fichaAtualizada.getSeis_quadril());
            stmt1.setString(65, fichaAtualizada.getSeis_coxa_D());
            stmt1.setString(66, fichaAtualizada.getSeis_coxa_E());
            stmt1.setString(67, fichaAtualizada.getSeis_pantu_D());
            stmt1.setString(68, fichaAtualizada.getSeis_pantu_E());
            stmt1.setString(69, fichaAtualizada.getSeis_abdomen());
            stmt1.setString(70, fichaAtualizada.getSeis_peso());
            stmt1.setString(71, fichaAtualizada.getSeis_estatura());
            stmt1.setDate(72, fichaAtualizada.getSeis_data());
            stmt1.setString(73, fichaAtualizada.getNove_braco_D());
            stmt1.setString(74, fichaAtualizada.getNove_braco_E());
            stmt1.setString(75, fichaAtualizada.getNove_anteBraco_D());
            stmt1.setString(76, fichaAtualizada.getNove_anteBraco_E());
            stmt1.setString(77, fichaAtualizada.getNove_torax());
            stmt1.setString(78, fichaAtualizada.getNove_cintura());
            stmt1.setString(79, fichaAtualizada.getNove_quadril());
            stmt1.setString(80, fichaAtualizada.getNove_coxa_D());
            stmt1.setString(81, fichaAtualizada.getNove_coxa_E());
            stmt1.setString(82, fichaAtualizada.getNove_pantu_D());
            stmt1.setString(83, fichaAtualizada.getNove_pantu_E());
            stmt1.setString(84, fichaAtualizada.getNove_abdomen());
            stmt1.setString(85, fichaAtualizada.getNove_peso());
            stmt1.setString(86, fichaAtualizada.getNove_estatura());
            stmt1.setDate(87, fichaAtualizada.getNove_data());
            stmt1.setString(88, fichaAtualizada.getDoze_braco_D());
            stmt1.setString(89, fichaAtualizada.getDoze_braco_E());
            stmt1.setString(90, fichaAtualizada.getDoze_anteBraco_D());
            stmt1.setString(91, fichaAtualizada.getDoze_anteBraco_E());
            stmt1.setString(92, fichaAtualizada.getDoze_torax());
            stmt1.setString(93, fichaAtualizada.getDoze_cintura());
            stmt1.setString(94, fichaAtualizada.getDoze_quadril());
            stmt1.setString(95, fichaAtualizada.getDoze_coxa_D());
            stmt1.setString(96, fichaAtualizada.getDoze_coxa_E());
            stmt1.setString(97, fichaAtualizada.getDoze_pantu_D());
            stmt1.setString(98, fichaAtualizada.getDoze_pantu_E());
            stmt1.setString(99, fichaAtualizada.getDoze_abdomen());
            stmt1.setString(100, fichaAtualizada.getDoze_peso());
            stmt1.setString(101, fichaAtualizada.getDoze_estatura());
            stmt1.setDate(102, fichaAtualizada.getDoze_data());
            stmt1.setString(103, numMatricula); 
            stmt1.executeUpdate();
            
            
            stmt2 = con.prepareStatement(sql2);
            stmt2.setInt(1, fichaAtualizada.getDiaVencimento());
            stmt2.setString(2, fichaAtualizada.getNumMatricula());
            stmt2.executeUpdate();
            return 0;
            
        } catch (SQLException ex) {
            System.err.println("Erro na atualização de uma ficha: " + ex);
            return -1;
        }finally{
            ConnectionFactory.closeConnection(con, stmt1);
            ConnectionFactory.closeConnection(con, stmt2);
            con = null;
        }
    }
    
    public int apagarFicha(String numMatricula){
        if (con == null) this.conectar();
        
        String sql1 = "DELETE FROM ficha WHERE numMatricula = ?";  
        String sql2 = "DELETE FROM dia_vencimento WHERE numMatricula = ?";  
        
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        
        try{            
            stmt1 = con.prepareStatement(sql1);
            stmt2 = con.prepareStatement(sql2);
            
            stmt1.setString(1, numMatricula);
            stmt2.setString(1, numMatricula);
            stmt1.executeUpdate();
            stmt2.executeUpdate();
            
            return 0;
        } catch (SQLException ex) {
            System.err.println("Erro na apagemento de uma ficha: " + ex);
            return -1;
        }finally{
            ConnectionFactory.closeConnection(con, stmt1);
            ConnectionFactory.closeConnection(con, stmt2);
            con = null;
        }
    }
    
    public FichaBD getFicha(String numMatricula){
        if (con == null) this.conectar();

        String sql = "SELECT * FROM ficha,dia_vencimento WHERE ficha.numMatricula = dia_vencimento.numMatricula AND ficha.numMatricula = ?";  
        
        int diaVencimento = 0,fuma = -1, bebe = -1,obs_saude = -1;
        Date d_nasc = null, ini_data = null, tres_data = null, seis_data = null, nove_data = null, doze_data = null;
        String matricula = "", nome = "", sexo = "", naturalidade = "", dias = "", residente = "", numero = "", bairro = "", cidade = "", CEP = "", telefone = "", profissao = "", e_civil = "", string_obs_saude = "", atv_fisica = "", obs_atv_fisica = "", horarios = "", obs_horarios = "", objetivos = "", obj_outros = "", P_A = "", ini_braco_D = "", ini_braco_E = "", ini_anteBraco_D = "", ini_anteBraco_E = "", ini_torax = "", ini_cintura = "", ini_quadril = "", ini_coxa_D = "", ini_coxa_E = "", ini_pantu_D = "", ini_pantu_E = "", ini_abdomen = "", ini_peso = "", ini_estatura = "", tres_braco_D = "", tres_braco_E = "", tres_anteBraco_D = "", tres_anteBraco_E = "", tres_torax = "", tres_cintura = "", tres_quadril = "", tres_coxa_D = "", tres_coxa_E = "", tres_pantu_D = "", tres_pantu_E = "", tres_abdomen = "", tres_peso = "", tres_estatura = "", seis_braco_D = "", seis_braco_E = "", seis_anteBraco_D = "", seis_anteBraco_E = "", seis_torax = "", seis_cintura = "", seis_quadril = "", seis_coxa_D = "", seis_coxa_E = "", seis_pantu_D = "", seis_pantu_E = "", seis_abdomen = "", seis_peso = "", seis_estatura = "", nove_braco_D = "", nove_braco_E = "", nove_anteBraco_D = "", nove_anteBraco_E = "", nove_torax = "", nove_cintura = "", nove_quadril = "", nove_coxa_D = "", nove_coxa_E = "", nove_pantu_D = "", nove_pantu_E = "", nove_abdomen = "", nove_peso = "", nove_estatura = "", doze_braco_D = "", doze_braco_E = "", doze_anteBraco_D = "", doze_anteBraco_E = "", doze_torax = "", doze_cintura = "", doze_quadril = "", doze_coxa_D = "", doze_coxa_E = "", doze_pantu_D = "", doze_pantu_E = "", doze_abdomen = "", doze_peso = "", doze_estatura = "", postura   = "", obs_geral = "";

        PreparedStatement stmt = null;
        try {          
            stmt = con.prepareStatement(sql);
            stmt.setString(1, numMatricula);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                nome             = rs.getString(1);
                sexo             = rs.getString(2);
                d_nasc           = rs.getDate(3);
                naturalidade     = rs.getString(4);
                dias             = rs.getString(5);
                residente        = rs.getString(6);
                numero           = rs.getString(7);
                bairro           = rs.getString(8);
                cidade           = rs.getString(9);
                CEP              = rs.getString(10);
                telefone         = rs.getString(11);
                profissao        = rs.getString(12);
                e_civil          = rs.getString(13);
                obs_saude        = rs.getInt(14);
                string_obs_saude = rs.getString(15);
                atv_fisica       = rs.getString(16);
                obs_atv_fisica   = rs.getString(17);
                horarios         = rs.getString(18);
                obs_horarios     = rs.getString(19);
                objetivos        = rs.getString(20);
                obj_outros       = rs.getString(21);
                fuma             = rs.getInt(22);
                bebe             = rs.getInt(23);
                P_A              = rs.getString(24);
                postura          = rs.getString(25);
                obs_geral        = rs.getString(26);
                matricula        = rs.getString(27);
                
//________________________avaliação biométrica________________________________________
                //========= inicial =========
                    ini_braco_D = rs.getString(28); ini_braco_E = rs.getString(29);
                    ini_anteBraco_D = rs.getString(30); ini_anteBraco_E = rs.getString(31);
                    ini_torax = rs.getString(32);
                    ini_cintura = rs.getString(33);
                    ini_quadril = rs.getString(34);
                    ini_coxa_D = rs.getString(35); ini_coxa_E = rs.getString(36);
                    ini_pantu_D = rs.getString(37); ini_pantu_E = rs.getString(38);
                    ini_abdomen = rs.getString(39);
                    ini_peso = rs.getString(40);
                    ini_estatura = rs.getString(41);
                    ini_data = rs.getDate(42);
                //===========================
    
                //========= 3 meses =========
                    tres_braco_D = rs.getString(43); tres_braco_E = rs.getString(44);
                    tres_anteBraco_D = rs.getString(45); tres_anteBraco_E = rs.getString(46);
                    tres_torax = rs.getString(47);
                    tres_cintura = rs.getString(48);
                    tres_quadril = rs.getString(49);
                    tres_coxa_D = rs.getString(50); tres_coxa_E = rs.getString(51);
                    tres_pantu_D = rs.getString(52); tres_pantu_E = rs.getString(53);
                    tres_abdomen = rs.getString(54);
                    tres_peso = rs.getString(55);
                    tres_estatura = rs.getString(56);
                    tres_data = rs.getDate(57);
                //===========================
    
                //========= 6 meses =========
                    seis_braco_D = rs.getString(58); seis_braco_E = rs.getString(59);
                    seis_anteBraco_D = rs.getString(60); seis_anteBraco_E = rs.getString(61);
                    seis_torax = rs.getString(62);
                    seis_cintura = rs.getString(63);
                    seis_quadril = rs.getString(64);
                    seis_coxa_D = rs.getString(65); seis_coxa_E = rs.getString(66);
                    seis_pantu_D = rs.getString(67); seis_pantu_E = rs.getString(68);
                    seis_abdomen = rs.getString(69);
                    seis_peso = rs.getString(70);
                    seis_estatura = rs.getString(71);
                    seis_data = rs.getDate(72);
                //===========================
    
                //========= 9 meses =========
                    nove_braco_D = rs.getString(73); nove_braco_E = rs.getString(74);
                    nove_anteBraco_D = rs.getString(75); nove_anteBraco_E = rs.getString(76);
                    nove_torax = rs.getString(77);
                    nove_cintura = rs.getString(78);
                    nove_quadril = rs.getString(79);
                    nove_coxa_D = rs.getString(80); nove_coxa_E = rs.getString(81);
                    nove_pantu_D = rs.getString(82); nove_pantu_E = rs.getString(83);
                    nove_abdomen = rs.getString(84);
                    nove_peso = rs.getString(85);
                    nove_estatura = rs.getString(86);
                    nove_data = rs.getDate(87);
                //===========================
    
                //========= 12 meses =========
                    doze_braco_D = rs.getString(88); doze_braco_E = rs.getString(89);
                    doze_anteBraco_D = rs.getString(90); doze_anteBraco_E = rs.getString(91);
                    doze_torax = rs.getString(92);
                    doze_cintura = rs.getString(93);
                    doze_quadril = rs.getString(94);
                    doze_coxa_D = rs.getString(95); doze_coxa_E = rs.getString(96);
                    doze_pantu_D = rs.getString(97); doze_pantu_E = rs.getString(98);
                    doze_abdomen = rs.getString(99);
                    doze_peso = rs.getString(100);
                    doze_estatura = rs.getString(101);
                    doze_data = rs.getDate(102);
                    
                diaVencimento = rs.getInt(103);
                matricula     = rs.getString(104);
            }
            FichaBD ficha = new FichaBD(numMatricula, diaVencimento, nome, sexo, d_nasc, naturalidade, dias, residente, numero, bairro, cidade, CEP, telefone, profissao, e_civil, obs_saude, string_obs_saude, atv_fisica, obs_atv_fisica, horarios, obs_horarios, objetivos, obj_outros, fuma, bebe, P_A, ini_braco_D, ini_braco_E, ini_anteBraco_D, ini_anteBraco_E, ini_torax, ini_cintura, ini_quadril, ini_coxa_D, ini_coxa_E, ini_pantu_D, ini_pantu_E, ini_abdomen, ini_peso, ini_estatura, ini_data, tres_braco_D, tres_braco_E, tres_anteBraco_D, tres_anteBraco_E, tres_torax, tres_cintura, tres_quadril, tres_coxa_D, tres_coxa_E, tres_pantu_D, tres_pantu_E, tres_abdomen, tres_peso, tres_estatura, tres_data, seis_braco_D, seis_braco_E, seis_anteBraco_D, seis_anteBraco_E, seis_torax, seis_cintura, seis_quadril, seis_coxa_D, seis_coxa_E, seis_pantu_D, seis_pantu_E, seis_abdomen, seis_peso, seis_estatura, seis_data, nove_braco_D, nove_braco_E, nove_anteBraco_D, nove_anteBraco_E, nove_torax, nove_cintura, nove_quadril, nove_coxa_D, nove_coxa_E, nove_pantu_D, nove_pantu_E, nove_abdomen, nove_peso, nove_estatura, nove_data, doze_braco_D, doze_braco_E, doze_anteBraco_D, doze_anteBraco_E, doze_torax, doze_cintura, doze_quadril, doze_coxa_D, doze_coxa_E, doze_pantu_D, doze_pantu_E, doze_abdomen, doze_peso, doze_estatura, doze_data, postura, obs_geral);

            return ficha;
        } catch (SQLException ex) {
            System.err.println("Erro na obtenção de uma ficha: " + ex);
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
            con = null;
        }
    }
    
    public ArrayList pesquisa(String nomePesquisar){
        if (con == null) this.conectar();
        
        String sql = "SELECT ficha.nome,ficha.telefone,ficha.numMatricula,dia_vencimento.diaVencimento FROM ficha,dia_vencimento WHERE ficha.numMatricula = dia_vencimento.numMatricula AND ficha.nome like ? ORDER BY ficha.nome";  
        ArrayList<FichaResumidaBD> listaPesquisa = new ArrayList<>(); 
        
        PreparedStatement stmt = null;
        
        try {          
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nomePesquisar + "%");
            
            ResultSet rs = stmt.executeQuery();
            String nome = null, telefone = null, numMatricula = null;
            int diaVencimento = -1, cor = -1;
            while (rs.next()) {
                nome          = rs.getString(1);
                telefone      = rs.getString(2);
                numMatricula  = rs.getString(3);
                diaVencimento = rs.getInt(4);
                FichaResumidaBD ficha = new FichaResumidaBD(nome, numMatricula, telefone, diaVencimento, cor);

                listaPesquisa.add(ficha);
            }
            if (listaPesquisa.size() == 0) return null;
            
            return listaPesquisa;
        } catch (SQLException ex) {
            System.err.println("Erro na pesquisa de um nome: " + ex);
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
            con = null;
        }
    }
    
    public ArrayList getTudo(){
        if (con == null) this.conectar();
      
        String sql = "SELECT ficha.nome,ficha.telefone,ficha.numMatricula,dia_vencimento.diaVencimento FROM ficha,dia_vencimento WHERE ficha.numMatricula = dia_vencimento.numMatricula ORDER BY ficha.nome";  
        ArrayList<FichaResumidaBD> listaPesquisa = new ArrayList<>(); 
        
        PreparedStatement stmt = null;
        
        try {          
            stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            String nome = null, telefone = null, numMatricula = null;
            int diaVencimento = -1, cor = -1;
            while (rs.next()) {
                nome          = rs.getString(1);
                telefone      = rs.getString(2);
                numMatricula  = rs.getString(3);
                diaVencimento = rs.getInt(4);
                FichaResumidaBD ficha = new FichaResumidaBD(nome, numMatricula, telefone, diaVencimento, cor);

                listaPesquisa.add(ficha);
            }
            if (listaPesquisa.size() == 0) return null;
            
            return listaPesquisa;
        } catch (SQLException ex) {
            System.err.println("Erro na obtenção de todas as fichas: " + ex);
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
            con = null;
        }
    }
    
    
    public ArrayList getListaVencimento(){
        if (con == null) this.conectar();
        
        int[] meses = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        Calendar rightNow = Calendar.getInstance();
        GregorianCalendar cal = new GregorianCalendar();
        if (cal.isLeapYear(rightNow.get(Calendar.YEAR))){
            meses[1] = 29;
        }
        
        String sql = "SELECT ficha.nome,ficha.telefone,ficha.numMatricula,dia_vencimento.diaVencimento FROM ficha,dia_vencimento WHERE ficha.numMatricula = dia_vencimento.numMatricula AND diaVencimento BETWEEN ? AND ? ORDER BY dia_vencimento.diaVencimento,ficha.nome";
        int totalDias = 10;
        int dia1 = rightNow.get(Calendar.DAY_OF_MONTH);
        int dia2 = dia1 + totalDias;
        int mesAtual = rightNow.get(Calendar.MONTH);
        
        if (dia2 > meses[mesAtual]){
            sql = "SELECT ficha.nome,ficha.telefone,ficha.numMatricula,dia_vencimento.diaVencimento FROM ficha,dia_vencimento WHERE ficha.numMatricula = dia_vencimento.numMatricula AND (diaVencimento >= ? OR diaVencimento <= ?) ORDER BY dia_vencimento.diaVencimento < ?,dia_vencimento.diaVencimento,ficha.nome ";
            dia2 = totalDias - (meses[mesAtual] - dia1);
        }
       
        PreparedStatement stmt = null;
        ArrayList<FichaResumidaBD> listaPesquisa = new ArrayList<>(); 
        try {          
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, dia1);
            stmt.setInt(2, dia2);
            if (dia2 < dia1) stmt.setInt(3, dia1);
            
            ResultSet rs = stmt.executeQuery();
            
            String nome = null, telefone = null, numMatricula = null;
            int diaVencimento = -1, cor = -1;
            while (rs.next()) {
                nome          = rs.getString(1);
                telefone      = rs.getString(2);
                numMatricula  = rs.getString(3);
                diaVencimento = rs.getInt(4);


                if (dia1 == diaVencimento || (dia1 == meses[mesAtual] && diaVencimento > meses[mesAtual])) cor = 0;
                if ((dia1 + 1 == diaVencimento && diaVencimento <= meses[mesAtual]) || (dia1 == meses[mesAtual] && diaVencimento == 1)) cor = 1;
                
                FichaResumidaBD fichaNotif = new FichaResumidaBD(nome, numMatricula, telefone, diaVencimento, cor);
                listaPesquisa.add(fichaNotif);
                cor = -1;
            }
            if (numMatricula == null) return null;
            
            return listaPesquisa;
        } catch (SQLException ex) {
            System.err.println("Erro na pesquisa do registro diario de emprestimos: " + ex);
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
            con = null;
        }
    }
}
