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
import javax.swing.JOptionPane;

/**
 *
 * @author Wika
 */
public class Project_pizzeria extends javax.swing.JFrame {

    Connection con;
    Statement stmt, stmt2;
    ResultSet result, result2;
    static WybierzNazwe wyb;

    public Project_pizzeria(WybierzNazwe wyb) {
        this.wyb = wyb;
        
        try{
            con = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt = con.createStatement();
            result = stmt.executeQuery(
                  "select * from PRACOWNICY"
            );   
            stmt2 = con.createStatement();
            result2 = stmt2.executeQuery(
                  "select * from PRACOWNICY"
            );         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
            
        }
        initComponents();
        
       //genNazwa(nazwapizzerii);
        
        
        
        try {
             login.addItem("");
            while(result.next()){
                login.addItem(result.getString("login"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Project_pizzeria.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException npe){
            
        }
        if(login.getItemCount()<1){
            przyciskzalogujsie.setEnabled(false);
        }
        
    }
     String nazwa_pizzerii="";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        napislogowanie = new javax.swing.JLabel();
        login = new javax.swing.JComboBox();
        password = new javax.swing.JPasswordField();
        przyciskzalogujsie = new javax.swing.JButton();
        napiswybuz = new javax.swing.JLabel();
        naphaslo = new javax.swing.JLabel();
        napisnazwapizzerii = new javax.swing.JLabel();
        komunikat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        napislogowanie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        napislogowanie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        napislogowanie.setText("Logowanie pracownika");

        login.setToolTipText("");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        przyciskzalogujsie.setText("Zaloguj się do systemu");
        przyciskzalogujsie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskzalogujsieActionPerformed(evt);
            }
        });

        napiswybuz.setText("Wybierz użytkownika");

        naphaslo.setText("Wprowadź hasło");

        napisnazwapizzerii.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        napisnazwapizzerii.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        komunikat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(napiswybuz, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(naphaslo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(napislogowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(napisnazwapizzerii, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(przyciskzalogujsie, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(komunikat, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(napisnazwapizzerii, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(napislogowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(napiswybuz, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naphaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGap(28, 28, 28)
                .addComponent(przyciskzalogujsie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(komunikat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );

        getAccessibleContext().setAccessibleName("Program do obsługi pizzerii");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void przyciskzalogujsieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskzalogujsieActionPerformed

            
            String nazwa=login.getSelectedItem().toString();
            String haslo = password.getText();
        try {
            ResultSet pobHaslo = stmt.executeQuery(
                    "select * from PRACOWNICY where login like '" + nazwa + "'"
            ); 
            ResultSet pobStanowisko = stmt2.executeQuery(
                    "select * from PRACOWNICY where login like '" + nazwa + "'"
            ); 
            String stan="";
            while(pobStanowisko.next()) {
             stan =  pobStanowisko.getString("stanowisko");
            }
            while(pobHaslo.next()) {
                String popr = pobHaslo.getString("haslo");
                if(haslo.equals(popr)) {
                    Zamowienia zam =new Zamowienia(this);
                    zam.genUser(nazwa,stan);
                    zam.setVisible(true);
                    dispose(); 
                } else {
                    komunikat.setText("Podane hasło jest niepoprawne.");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Project_pizzeria.class.getName()).log(Level.SEVERE, null, ex);
            
        }
                   
            
       
        
    }//GEN-LAST:event_przyciskzalogujsieActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       
        
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String args[]) throws SQLException{
          
           
              
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project_pizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new Project_pizzeria(wyb).setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel komunikat;
    private javax.swing.JComboBox login;
    private javax.swing.JLabel naphaslo;
    private javax.swing.JLabel napislogowanie;
    private javax.swing.JLabel napisnazwapizzerii;
    private javax.swing.JLabel napiswybuz;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton przyciskzalogujsie;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void genNazwa(String nazwa) {
        napisnazwapizzerii.setText("Pizzeria \""+ nazwa + "\""); 
        nazwa_pizzerii = nazwa;
    }
    void genNazwa2() {
        napisnazwapizzerii.setText("Pizzeria \""+ nazwa_pizzerii + "\""); 
    }
    //void 
}
