/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import armazenamento.FichaDao;
import interfaces_graficas.Home;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import connection.ConnectionFactory;
import fichas.FichaBD;
import fichas.FichaResumidaBD;
import interfaces_graficas.Vencimento;
import java.awt.Dimension;
import java.awt.Toolkit;
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
public class Main {
    
    public static void main(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

            
            Home home = new Home();
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - home.getWidth()) / 2);
            int y = 0;
            home.setLocation(x, y);
            home.setVisible(true);
        } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    public static void testeData(){
        Date data = Date.valueOf("1999-05-08");
        System.out.println(data.toString());
    }
    
    public static void testeMudaDado(){
        FichaDao armz = new FichaDao();
        String numMatricula = "00000014";
        FichaBD ficha = armz.getFicha(numMatricula);
        
        System.out.println(ficha.getNome());
        
        ficha.nome = "usuario teste mudando nome";
        
        armz.atualizarFicha(numMatricula, ficha);
        
        ficha = armz.getFicha(numMatricula);
        
        System.out.println(ficha.getNome() + "   " + ficha.getDiaVencimento());
        
        armz.apagarFicha(numMatricula);
        
        ArrayList<FichaBD> listaPesquisa = armz.pesquisa("an");
        for (FichaBD fichaBD : listaPesquisa) {
            System.out.println(fichaBD.getNome());
        }
    }
    
    public static void main(String[] args) {
        main();
    }
}
