/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SK
 */
public class Powitanie extends javax.swing.JFrame {

    Connection con;
    Statement stmt9, stmt10;
    ResultSet res9, res10;
    
    public Powitanie() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dalej = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Witamy!");

        dalej.setText("Dalej");
        dalej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dalejActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Wybierz Dalej, aby kontynuować...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(dalej, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(dalej, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dalejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dalejActionPerformed
       sprawdznazwe();
      // System.out.println(""+ policzkosztskladnikow2());
    }//GEN-LAST:event_dalejActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Powitanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Powitanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Powitanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Powitanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Powitanie().setVisible(true);
            }
        });
    }
    void sprawdznazwe() {
     int ile=-1;
       try {
           Connection con = DriverManager.getConnection(
                   "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
           );
            Statement stmt = con.createStatement();
                ResultSet res = stmt.executeQuery("select count(*) from NAZWA_PIZZERII");
                 while(res.next()) {
               ile = res.getInt("1");
           }
       } catch (SQLException ex) {
           Logger.getLogger(WybierzNazwe.class.getName()).log(Level.SEVERE, null, ex);
       }
       if(ile==0) {
           WybierzNazwe wn = new WybierzNazwe();
           wn.setVisible(true);
           dispose();
       } else {      
                    Project_pizzeria pp = new Project_pizzeria();
                    pp.setVisible(true);
                    dispose();}
    }
   /* double policzkosztskladnikow2() {
        double kosztskl = 0;
        String polmalej = "SELECT sum(cena_skl_mala) from skladniki as s\n"
                + "join szcz_o_skl as ss on s.ID_SKLADNIKA=ss.ID_SKLADNIKA join szcz_o_pizzy as sp on ss.ID_SZCZ_O_PIZZY=sp.ID_SZCZ_O_PIZZY \n"
                + "join zamowienie as z on z.ID_ZAM=sp.ID_ZAM where z.ID_ZAM=(select max(id_zam) from zamowienie)";
        String polsredniej = "SELECT sum(cena_skl_srednia) from skladniki as s\n"
                + "join szcz_o_skl as ss on s.ID_SKLADNIKA=ss.ID_SKLADNIKA join szcz_o_pizzy as sp on ss.ID_SZCZ_O_PIZZY=sp.ID_SZCZ_O_PIZZY \n"
                + "join zamowienie as z on z.ID_ZAM=sp.ID_ZAM where z.ID_ZAM=(select max(id_zam) from zamowienie)";
        String polduzej = "SELECT sum(cena_skl_duza) from skladniki as s\n"
                + "join szcz_o_skl as ss on s.ID_SKLADNIKA=ss.ID_SKLADNIKA join szcz_o_pizzy as sp on ss.ID_SZCZ_O_PIZZY=sp.ID_SZCZ_O_PIZZY \n"
                + "join zamowienie as z on z.ID_ZAM=sp.ID_ZAM where z.ID_ZAM=(select max(id_zam) from zamowienie)";
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt9 = con.createStatement();
            res9 = stmt9.executeQuery(
                    "select rozmiar from MENU_PIZZA as mp join szcz_o_pizzy as sp on mp.ID_PIZZY=sp.ID_PIZZY\n"
                    + " join zamowienie as z on z.ID_ZAM=sp.ID_ZAM where z.id_zam=(select max(id_zam) from zamowienie)"
            );
            while (res9.next()) {
                String rozm = res9.getString("rozmiar");
                if (rozm.contains("mała")) {
                    stmt10 = con.createStatement();
                    res10 = stmt10.executeQuery(polmalej);
                } else if (rozm.contains("średnia")) {
                    stmt10 = con.createStatement();
                    res10 = stmt10.executeQuery(polsredniej);
                } else if (rozm.contains("duża")) {
                    stmt10 = con.createStatement();
                    res10 = stmt10.executeQuery(polduzej);
                }
                while(res10.next()) {
                kosztskl = res10.getInt("1");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NoweZamLok.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kosztskl;
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dalej;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}