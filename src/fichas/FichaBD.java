/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichas;

import java.sql.Date;

/**
 *
 * @author lucas
 */
public class FichaBD {
    public String numMatricula     = "";
    public int diaVencimento       = -1;
    public String nome             = "";
    public String sexo             = "";
    public Date d_nasc             = null;
    public String naturalidade     = "";
    public String dias             = "";
    public String residente        = "";
    public String numero           = "";
    public String bairro           = "";
    public String cidade           = "";
    public String CEP              = "";
    public String telefone         = "";
    public String profissao        = "";
    public String e_civil          = "";
    public int obs_saude           = -1;
    public String string_obs_saude = "";
    public String atv_fisica       = "";
    public String obs_atv_fisica   = "";
    public String horarios         = "";
    public String obs_horarios     = "";
    public String objetivos        = "";
    public String obj_outros       = "";
    public int fuma                = -1;
    public int bebe                = -1;
    public String P_A              = "";
    
//________________________avaliação biométrica________________________________________
    //========= inicial =========
        public String ini_braco_D = "", ini_braco_E = "";
        public String ini_anteBraco_D = "", ini_anteBraco_E = "";
        public String ini_torax = "";
        public String ini_cintura = "";
        public String ini_quadril = "";
        public String ini_coxa_D = "", ini_coxa_E = "";
        public String ini_pantu_D = "", ini_pantu_E = "";
        public String ini_abdomen = "";
        public String ini_peso = "";
        public String ini_estatura = "";
        public Date ini_data = null;
    //===========================
                
    //========= 3 meses =========
        public String tres_braco_D = "", tres_braco_E = "";
        public String tres_anteBraco_D = "", tres_anteBraco_E = "";
        public String tres_torax = "";
        public String tres_cintura = "";
        public String tres_quadril = "";
        public String tres_coxa_D = "", tres_coxa_E = "";
        public String tres_pantu_D = "", tres_pantu_E = "";
        public String tres_abdomen = "";
        public String tres_peso = "";
        public String tres_estatura = "";
        public Date tres_data = null;
    //===========================
                
    //========= 6 meses =========
        public String seis_braco_D = "", seis_braco_E = "";
        public String seis_anteBraco_D = "", seis_anteBraco_E = "";
        public String seis_torax = "";
        public String seis_cintura = "";
        public String seis_quadril = "";
        public String seis_coxa_D = "", seis_coxa_E = "";
        public String seis_pantu_D = "", seis_pantu_E = "";
        public String seis_abdomen = "";
        public String seis_peso = "";
        public String seis_estatura = "";
        public Date seis_data = null;
    //===========================
        
    //========= 9 meses =========
        public String nove_braco_D = "", nove_braco_E = "";
        public String nove_anteBraco_D = "", nove_anteBraco_E = "";
        public String nove_torax = "";
        public String nove_cintura = "";
        public String nove_quadril = "";
        public String nove_coxa_D = "", nove_coxa_E = "";
        public String nove_pantu_D = "", nove_pantu_E = "";
        public String nove_abdomen = "";
        public String nove_peso = "";
        public String nove_estatura = "";
        public Date nove_data = null;
    //===========================
        
    //========= 12 meses =========
        public String doze_braco_D = "", doze_braco_E = "";
        public String doze_anteBraco_D = "", doze_anteBraco_E = "";
        public String doze_torax = "";
        public String doze_cintura = "";
        public String doze_quadril = "";
        public String doze_coxa_D = "", doze_coxa_E = "";
        public String doze_pantu_D = "", doze_pantu_E = "";
        public String doze_abdomen = "";
        public String doze_peso = "";
        public String doze_estatura = "";
        public Date doze_data = null;
    //===========================
        
    public String postura  = "";
    public String obs_geral = "";
//______________________________________________________________________________

    
    public FichaBD(String numMatricula,int diaVencimento,String nome,String sexo,Date d_nasc,String naturalidade,String dias,String residente,String numero,String bairro,String cidade,String CEP,String telefone,String profissao,String e_civil,int obs_saude,String string_obs_saude,String atv_fisica,String obs_atv_fisica,String horarios,String obs_horarios,String objetivos,String obj_outros,int fuma,int bebe,String P_A,
            String ini_braco_D,String ini_braco_E,String ini_anteBraco_D,String ini_anteBraco_E,String ini_torax,String ini_cintura,String ini_quadril,String ini_coxa_D,String ini_coxa_E,String ini_pantu_D,String ini_pantu_E,String ini_abdomen,String ini_peso,String ini_estatura,Date ini_data,
            String tres_braco_D,String tres_braco_E,String tres_anteBraco_D,String tres_anteBraco_E,String tres_torax,String tres_cintura,String tres_quadril,String tres_coxa_D,String tres_coxa_E,String tres_pantu_D,String tres_pantu_E,String tres_abdomen,String tres_peso,String tres_estatura,Date tres_data,
            String seis_braco_D,String seis_braco_E,String seis_anteBraco_D,String seis_anteBraco_E,String seis_torax,String seis_cintura,String seis_quadril,String seis_coxa_D,String seis_coxa_E,String seis_pantu_D,String seis_pantu_E,String seis_abdomen,String seis_peso,String seis_estatura,Date seis_data,
            String nove_braco_D,String nove_braco_E,String nove_anteBraco_D,String nove_anteBraco_E,String nove_torax,String nove_cintura,String nove_quadril,String nove_coxa_D,String nove_coxa_E,String nove_pantu_D,String nove_pantu_E,String nove_abdomen,String nove_peso,String nove_estatura,Date nove_data,
            String doze_braco_D,String doze_braco_E,String doze_anteBraco_D,String doze_anteBraco_E,String doze_torax,String doze_cintura,String doze_quadril,String doze_coxa_D,String doze_coxa_E,String doze_pantu_D,String doze_pantu_E,String doze_abdomen,String doze_peso,String doze_estatura,Date doze_data,String postura, String obs_geral) {
        this.numMatricula = numMatricula;
        this.diaVencimento = diaVencimento;
        this.nome = nome;
        this.sexo = sexo;
        this.d_nasc = d_nasc;
        this.naturalidade = naturalidade;
        this.dias = dias;
        this.residente = residente;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CEP = CEP;
        this.telefone = telefone;
        this.profissao = profissao;
        this.e_civil = e_civil;
        this.obs_saude = obs_saude;
        this.string_obs_saude = string_obs_saude;
        this.atv_fisica = atv_fisica;
        this.obs_atv_fisica = obs_atv_fisica;
        this.horarios = horarios;
        this.obs_horarios = obs_horarios;
        this.objetivos = objetivos;
        this.obj_outros = obj_outros;
        this.fuma = fuma;
        this.bebe = bebe;
        this.P_A = P_A; 
        
        this.ini_braco_D = ini_braco_D; 
        this.ini_braco_E = ini_braco_E;
        this.ini_anteBraco_D = ini_anteBraco_D; 
        this.ini_anteBraco_E = ini_anteBraco_E;
        this.ini_torax = ini_torax;
        this.ini_cintura = ini_cintura;
        this.ini_quadril = ini_quadril;
        this.ini_coxa_D = ini_coxa_D;
        this.ini_coxa_E = ini_coxa_E;
        this.ini_pantu_D = ini_pantu_D;
        this.ini_pantu_E = ini_pantu_E;
        this.ini_abdomen = ini_abdomen;
        this.ini_peso = ini_peso;
        this.ini_estatura = ini_estatura;
        this.ini_data = ini_data;
        
        this.tres_braco_D = tres_braco_D; 
        this.tres_braco_E = tres_braco_E;
        this.tres_anteBraco_D = tres_anteBraco_D; 
        this.tres_anteBraco_E = tres_anteBraco_E;
        this.tres_torax = tres_torax;
        this.tres_cintura = tres_cintura;
        this.tres_quadril = tres_quadril;
        this.tres_coxa_D = tres_coxa_D;
        this.tres_coxa_E = tres_coxa_E;
        this.tres_pantu_D = tres_pantu_D;
        this.tres_pantu_E = tres_pantu_E;
        this.tres_abdomen = tres_abdomen;
        this.tres_peso = tres_peso;
        this.tres_estatura = tres_estatura;
        this.tres_data = tres_data;
        
        this.seis_braco_D = seis_braco_D; 
        this.seis_braco_E = seis_braco_E;
        this.seis_anteBraco_D = seis_anteBraco_D; 
        this.seis_anteBraco_E = seis_anteBraco_E;
        this.seis_torax = seis_torax;
        this.seis_cintura = seis_cintura;
        this.seis_quadril = seis_quadril;
        this.seis_coxa_D = seis_coxa_D;
        this.seis_coxa_E = seis_coxa_E;
        this.seis_pantu_D = seis_pantu_D;
        this.seis_pantu_E = seis_pantu_E;
        this.seis_abdomen = seis_abdomen;
        this.seis_peso = seis_peso;
        this.seis_estatura = seis_estatura;
        this.seis_data = seis_data;
        
        this.nove_braco_D = nove_braco_D; 
        this.nove_braco_E = nove_braco_E;
        this.nove_anteBraco_D = nove_anteBraco_D; 
        this.nove_anteBraco_E = nove_anteBraco_E;
        this.nove_torax = nove_torax;
        this.nove_cintura = nove_cintura;
        this.nove_quadril = nove_quadril;
        this.nove_coxa_D = nove_coxa_D;
        this.nove_coxa_E = nove_coxa_E;
        this.nove_pantu_D = nove_pantu_D;
        this.nove_pantu_E = nove_pantu_E;
        this.nove_abdomen = nove_abdomen;
        this.nove_peso = nove_peso;
        this.nove_estatura = nove_estatura;
        this.nove_data = nove_data;
        
        this.doze_braco_D = doze_braco_D; 
        this.doze_braco_E = doze_braco_E;
        this.doze_anteBraco_D = doze_anteBraco_D; 
        this.doze_anteBraco_E = doze_anteBraco_E;
        this.doze_torax = doze_torax;
        this.doze_cintura = doze_cintura;
        this.doze_quadril = doze_quadril;
        this.doze_coxa_D = doze_coxa_D;
        this.doze_coxa_E = doze_coxa_E;
        this.doze_pantu_D = doze_pantu_D;
        this.doze_pantu_E = doze_pantu_E;
        this.doze_abdomen = doze_abdomen;
        this.doze_peso = doze_peso;
        this.doze_estatura = doze_estatura;
        this.doze_data = doze_data;
        
        this.postura   = postura;
        this.obs_geral = obs_geral;
    }    

    public String getNumMatricula() {
        return numMatricula;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getD_nasc() {
        return d_nasc;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public String getDias() {
        return dias;
    }

    public String getResidente() {
        return residente;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getE_civil() {
        return e_civil;
    }

    public int getObs_saude() {
        return obs_saude;
    }

    public String getString_obs_saude() {
        return string_obs_saude;
    }

    public String getAtv_fisica() {
        return atv_fisica;
    }

    public String getObs_atv_fisica() {
        return obs_atv_fisica;
    }

    public String getHorarios() {
        return horarios;
    }

    public String getObs_horarios() {
        return obs_horarios;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public String getObj_outros() {
        return obj_outros;
    }

    public int getFuma() {
        return fuma;
    }

    public int getBebe() {
        return bebe;
    }

    public String getP_A() {
        return P_A;
    }

    public String getIni_braco_D() {
        return ini_braco_D;
    }

    public String getIni_braco_E() {
        return ini_braco_E;
    }

    public String getIni_anteBraco_D() {
        return ini_anteBraco_D;
    }

    public String getIni_anteBraco_E() {
        return ini_anteBraco_E;
    }

    public String getIni_torax() {
        return ini_torax;
    }

    public String getIni_cintura() {
        return ini_cintura;
    }

    public String getIni_quadril() {
        return ini_quadril;
    }

    public String getIni_coxa_D() {
        return ini_coxa_D;
    }

    public String getIni_coxa_E() {
        return ini_coxa_E;
    }

    public String getIni_pantu_D() {
        return ini_pantu_D;
    }

    public String getIni_pantu_E() {
        return ini_pantu_E;
    }

    public String getIni_abdomen() {
        return ini_abdomen;
    }

    public String getIni_peso() {
        return ini_peso;
    }

    public String getIni_estatura() {
        return ini_estatura;
    }

    public Date getIni_data() {
        return ini_data;
    }

    public String getTres_braco_D() {
        return tres_braco_D;
    }

    public String getTres_braco_E() {
        return tres_braco_E;
    }

    public String getTres_anteBraco_D() {
        return tres_anteBraco_D;
    }

    public String getTres_anteBraco_E() {
        return tres_anteBraco_E;
    }

    public String getTres_torax() {
        return tres_torax;
    }

    public String getTres_cintura() {
        return tres_cintura;
    }

    public String getTres_quadril() {
        return tres_quadril;
    }

    public String getTres_coxa_D() {
        return tres_coxa_D;
    }

    public String getTres_coxa_E() {
        return tres_coxa_E;
    }

    public String getTres_pantu_D() {
        return tres_pantu_D;
    }

    public String getTres_pantu_E() {
        return tres_pantu_E;
    }

    public String getTres_abdomen() {
        return tres_abdomen;
    }

    public String getTres_peso() {
        return tres_peso;
    }

    public String getTres_estatura() {
        return tres_estatura;
    }

    public Date getTres_data() {
        return tres_data;
    }

    public String getSeis_braco_D() {
        return seis_braco_D;
    }

    public String getSeis_braco_E() {
        return seis_braco_E;
    }

    public String getSeis_anteBraco_D() {
        return seis_anteBraco_D;
    }

    public String getSeis_anteBraco_E() {
        return seis_anteBraco_E;
    }

    public String getSeis_torax() {
        return seis_torax;
    }

    public String getSeis_cintura() {
        return seis_cintura;
    }

    public String getSeis_quadril() {
        return seis_quadril;
    }

    public String getSeis_coxa_D() {
        return seis_coxa_D;
    }

    public String getSeis_coxa_E() {
        return seis_coxa_E;
    }

    public String getSeis_pantu_D() {
        return seis_pantu_D;
    }

    public String getSeis_pantu_E() {
        return seis_pantu_E;
    }

    public String getSeis_abdomen() {
        return seis_abdomen;
    }

    public String getSeis_peso() {
        return seis_peso;
    }

    public String getSeis_estatura() {
        return seis_estatura;
    }

    public Date getSeis_data() {
        return seis_data;
    }

    public String getNove_braco_D() {
        return nove_braco_D;
    }

    public String getNove_braco_E() {
        return nove_braco_E;
    }

    public String getNove_anteBraco_D() {
        return nove_anteBraco_D;
    }

    public String getNove_anteBraco_E() {
        return nove_anteBraco_E;
    }

    public String getNove_torax() {
        return nove_torax;
    }

    public String getNove_cintura() {
        return nove_cintura;
    }

    public String getNove_quadril() {
        return nove_quadril;
    }

    public String getNove_coxa_D() {
        return nove_coxa_D;
    }

    public String getNove_coxa_E() {
        return nove_coxa_E;
    }

    public String getNove_pantu_D() {
        return nove_pantu_D;
    }

    public String getNove_pantu_E() {
        return nove_pantu_E;
    }

    public String getNove_abdomen() {
        return nove_abdomen;
    }

    public String getNove_peso() {
        return nove_peso;
    }

    public String getNove_estatura() {
        return nove_estatura;
    }

    public Date getNove_data() {
        return nove_data;
    }

    public String getDoze_braco_D() {
        return doze_braco_D;
    }

    public String getDoze_braco_E() {
        return doze_braco_E;
    }

    public String getDoze_anteBraco_D() {
        return doze_anteBraco_D;
    }

    public String getDoze_anteBraco_E() {
        return doze_anteBraco_E;
    }

    public String getDoze_torax() {
        return doze_torax;
    }

    public String getDoze_cintura() {
        return doze_cintura;
    }

    public String getDoze_quadril() {
        return doze_quadril;
    }

    public String getDoze_coxa_D() {
        return doze_coxa_D;
    }

    public String getDoze_coxa_E() {
        return doze_coxa_E;
    }

    public String getDoze_pantu_D() {
        return doze_pantu_D;
    }

    public String getDoze_pantu_E() {
        return doze_pantu_E;
    }

    public String getDoze_abdomen() {
        return doze_abdomen;
    }

    public String getDoze_peso() {
        return doze_peso;
    }

    public String getDoze_estatura() {
        return doze_estatura;
    }

    public Date getDoze_data() {
        return doze_data;
    }

    public String getPostura() {
        return postura;
    }

    public String getObs_geral() {
        return obs_geral;
    }

}