/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichas;

import java.awt.Color;

/**
 *
 * @author lucas
 */
public class FichaResumidaBD {
    private String nome;
    private String numMatricula;
    private String telefone;
    private int diaVencimento;
    private int cor;
    
    public FichaResumidaBD(String nome,String numMatricula, String telefone, int diaVencimento, int cor){
        this.nome          = nome;
        this.numMatricula  = numMatricula;
        this.telefone      = telefone;
        this.diaVencimento = diaVencimento;
        this.cor           = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public Color getCor() {
        if (this.cor == 0) return Color.RED;
        if (this.cor == 1) return Color.YELLOW;
        return new Color(240,240,240);
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
    
    
}
