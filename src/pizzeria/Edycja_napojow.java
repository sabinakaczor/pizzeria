/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static pizzeria.Edycja_napojow.zam;

/**
 *
 * @author Wika
 */
public class Edycja_napojow extends javax.swing.JFrame {

    Connection con;
    Statement stmt1, stmt2, stmt3, stmt4, stmt5, stmt6, stmt7, stmt8;
    ResultSet res1, res2, res3, res4, res5, res6, res7, res8;
    DefaultTableModel model;
    static Zamowienia zam;
    float cen = 0;
    float obj = 0;

    /**
     * Creates new form Edycja_napojow
     */
    public Edycja_napojow(Zamowienia zam) {
        initComponents();
        this.zam = zam;
        model = (DefaultTableModel) tabelka.getModel();
        paneledytujdodaj.setVisible(false);
        panel_tabelka.setVisible(false);
        POLE_NOWY_DOST.setVisible(false);
        POLE_NOWY_RODZAJ.setVisible(false);
    }

    Edycja_napojow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        powrot = new javax.swing.JButton();
        przegladaj = new javax.swing.JToggleButton();
        panel_tabelka = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelka = new javax.swing.JTable();
        usun = new javax.swing.JButton();
        edytuj = new javax.swing.JButton();
        dodaj = new javax.swing.JButton();
        paneledytujdodaj = new javax.swing.JPanel();
        wyczysc = new javax.swing.JButton();
        zapisz = new javax.swing.JButton();
        anuluj = new javax.swing.JButton();
        nr = new javax.swing.JLabel();
        nazwa = new javax.swing.JLabel();
        pelnoletni = new javax.swing.JLabel();
        objetosc = new javax.swing.JLabel();
        cena = new javax.swing.JLabel();
        POLENR = new javax.swing.JTextField();
        POLENAZWA = new javax.swing.JTextField();
        POLE_NOWY_RODZAJ = new javax.swing.JTextField();
        POLEOBJETOSC = new javax.swing.JTextField();
        POLECENA = new javax.swing.JTextField();
        komunikat = new javax.swing.JLabel();
        POLEPELNOLET = new javax.swing.JComboBox();
        rodzaj = new javax.swing.JLabel();
        opis = new javax.swing.JLabel();
        dost = new javax.swing.JLabel();
        POLEOPIS = new javax.swing.JTextField();
        POLEDOST = new javax.swing.JComboBox();
        POLERODZAJ = new javax.swing.JComboBox();
        NOWA_OPCJA_DOST = new javax.swing.JToggleButton();
        NOWA_OPCJA_RODZAJ = new javax.swing.JToggleButton();
        POLE_NOWY_DOST = new javax.swing.JTextField();
        kom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1339, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        powrot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        powrot.setText("Powrót");
        powrot.setPreferredSize(new java.awt.Dimension(67, 25));
        powrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powrotActionPerformed(evt);
            }
        });
        getContentPane().add(powrot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 200, 70));

        przegladaj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        przegladaj.setText("Przeglądaj napoje");
        przegladaj.setPreferredSize(new java.awt.Dimension(119, 25));
        przegladaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przegladajActionPerformed(evt);
            }
        });
        getContentPane().add(przegladaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 260, 70));

        panel_tabelka.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NR", "Nazwa", "Rodzaj", "Oblętość", "Cena", "Dla pełnoletnich", "Opis", "Dostępność"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelka);
        if (tabelka.getColumnModel().getColumnCount() > 0) {
            tabelka.getColumnModel().getColumn(0).setMinWidth(30);
            tabelka.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelka.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        panel_tabelka.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 1140, 210));

        usun.setText("Usuń");
        usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunActionPerformed(evt);
            }
        });
        panel_tabelka.add(usun, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 140, 40));

        edytuj.setText("Edytuj");
        edytuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edytujActionPerformed(evt);
            }
        });
        panel_tabelka.add(edytuj, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 140, 40));

        dodaj.setText("Dodaj");
        dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajActionPerformed(evt);
            }
        });
        panel_tabelka.add(dodaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 130, 40));

        paneledytujdodaj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wyczysc.setText("Wyczyść");
        wyczysc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyczyscActionPerformed(evt);
            }
        });
        paneledytujdodaj.add(wyczysc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 120, 40));

        zapisz.setText("Zapisz");
        zapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zapiszActionPerformed(evt);
            }
        });
        paneledytujdodaj.add(zapisz, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, 120, 40));

        anuluj.setText("Anuluj");
        anuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anulujActionPerformed(evt);
            }
        });
        paneledytujdodaj.add(anuluj, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 120, 40));

        nr.setText("Nr");
        paneledytujdodaj.add(nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 50, 20));

        nazwa.setText("Nazwa*");
        paneledytujdodaj.add(nazwa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        pelnoletni.setText("Dla pełnoletnich*");
        paneledytujdodaj.add(pelnoletni, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        objetosc.setText("Objętość, l.");
        paneledytujdodaj.add(objetosc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        cena.setText("Cena, zł.*");
        paneledytujdodaj.add(cena, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        POLENR.setEnabled(false);
        paneledytujdodaj.add(POLENR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, -1));
        paneledytujdodaj.add(POLENAZWA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, -1));
        paneledytujdodaj.add(POLE_NOWY_RODZAJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 90, -1));
        paneledytujdodaj.add(POLEOBJETOSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 100, -1));
        paneledytujdodaj.add(POLECENA, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 90, -1));

        komunikat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paneledytujdodaj.add(komunikat, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 430, 60));

        paneledytujdodaj.add(POLEPELNOLET, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 90, -1));

        rodzaj.setText("Rodzaj*");
        paneledytujdodaj.add(rodzaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        opis.setText("Opis");
        paneledytujdodaj.add(opis, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        dost.setText("Dostępność*");
        paneledytujdodaj.add(dost, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));
        paneledytujdodaj.add(POLEOPIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 190, -1));

        paneledytujdodaj.add(POLEDOST, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 120, -1));

        paneledytujdodaj.add(POLERODZAJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 90, -1));

        NOWA_OPCJA_DOST.setText("Nowa opcja");
        NOWA_OPCJA_DOST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOWA_OPCJA_DOSTActionPerformed(evt);
            }
        });
        paneledytujdodaj.add(NOWA_OPCJA_DOST, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 120, -1));

        NOWA_OPCJA_RODZAJ.setText("Nowa opcja");
        NOWA_OPCJA_RODZAJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOWA_OPCJA_RODZAJActionPerformed(evt);
            }
        });
        paneledytujdodaj.add(NOWA_OPCJA_RODZAJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));
        paneledytujdodaj.add(POLE_NOWY_DOST, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 120, 30));

        kom.setText("*-pola obowiązkowe do wypełnienia");
        paneledytujdodaj.add(kom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 280, 30));

        panel_tabelka.add(paneledytujdodaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1180, 250));

        getContentPane().add(panel_tabelka, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 116, 1310, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void powrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powrotActionPerformed
        zam.setVisible(true);
        dispose();
    }//GEN-LAST:event_powrotActionPerformed

    private void usunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunActionPerformed
        int j = tabelka.getRowCount();
        String ostt = tabelka.getValueAt(j - 1, 0).toString();
        int ost = Integer.parseInt(ostt);
        if (tabelka.getSelectedRowCount() > 0) {
            int wiersz = tabelka.getSelectedRow();
            String s = tabelka.getValueAt(wiersz, 0).toString();

            String usunwiersz = "delete from menu_napoje where id_napoju=" + s;
            try {
                con = DriverManager.getConnection(
                        "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
                );
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
            }
            try {
                stmt5 = con.createStatement();
                stmt5.executeUpdate(usunwiersz);
                int id1 = Integer.parseInt(s);
                id1++;
                for (int i = id1; i <= ost; i++) {
                    String naprawid = "UPDATE menu_napoje SET id_napoju =" + (i - 1) + " WHERE id_napoju =" + i;
                    stmt5.executeUpdate(naprawid);
                }

            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nie wybrano wiersza!");
        }
        czysctabelke();
        przegladaj(model);
    }//GEN-LAST:event_usunActionPerformed

    private void edytujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edytujActionPerformed

        if (tabelka.getSelectedRowCount() > 0) {
            paneledytujdodaj.setVisible(true);
            int wybrwiersz = tabelka.getSelectedRow();
            int numer = Integer.parseInt(tabelka.getValueAt(wybrwiersz, 0).toString());
            POLENR.setText(numer + "");
            uzupelnijlisty();
            wyczyscdane();
        } else {
            JOptionPane.showMessageDialog(null, "Nie wybrano wiersza!");
        }
    }//GEN-LAST:event_edytujActionPerformed

    private void dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajActionPerformed

        paneledytujdodaj.setVisible(true);
        int numer = tabelka.getRowCount() + 1;
        POLENR.setText(numer + "");
        uzupelnijlisty();
        wyczyscdane();
    }//GEN-LAST:event_dodajActionPerformed

    private void wyczyscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyczyscActionPerformed
        wyczyscdane();
    }//GEN-LAST:event_wyczyscActionPerformed

    private void zapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zapiszActionPerformed
        int numer = tabelka.getRowCount() + 1;
        String nazwa = POLENAZWA.getText();
        String dostepnosc;
        if (NOWA_OPCJA_DOST.isSelected()) {
            dostepnosc = POLE_NOWY_DOST.getText();
        } else {
            dostepnosc = POLEDOST.getSelectedItem().toString();
        }
        String rodzaj;
        if (NOWA_OPCJA_RODZAJ.isSelected()) {
            rodzaj = POLE_NOWY_RODZAJ.getText();
        } else {
            rodzaj = POLERODZAJ.getSelectedItem().toString();
        }
        String peln = POLEPELNOLET.getSelectedItem().toString();
        String opis = POLEOPIS.getText();
        String objetosc="";
        if (POLEOBJETOSC.getText().equals("")) {
            objetosc="-";
        } else 
        {
            try {
                objetosc = Float.parseFloat(POLEOBJETOSC.getText())+" l";
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Niepoprawny format oblętości!");
            }
        }
        if (POLECENA.getText() != null && POLECENA.getText().length() > 0) {
            try {
                cen = Float.parseFloat(POLECENA.getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Niepoprawny format ceny!");
            }
        }
        if (nazwa.equals("") || dostepnosc.equals("") || rodzaj.equals("") || cen == 0 || objetosc.equals("") || peln.equals("")) {
            komunikat.setText("Brak  danych!");
            komunikat.setForeground(Color.red);

        } else {
            try {
                con = DriverManager.getConnection(
                        "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
                );
                stmt3 = con.createStatement();
                String insert = "";
                if (tabelka.getSelectedRow() < 0) {
                    insert = "INSERT INTO menu_napoje VALUES(" + numer + ",'" + peln + "','" + objetosc + "'," + cen + ",'" + nazwa + "','" + rodzaj + "','" + opis + "','" + dostepnosc + "')";
                    stmt3.executeUpdate(insert);
                    numer++;
                    POLENR.setText(numer + "");
                } else {
                    int wiersz = tabelka.getSelectedRow();
                    String s = tabelka.getValueAt(wiersz, 0).toString();
                     insert = "UPDATE menu_napoje SET dla_pelnoletnich='" + peln + "', objetosc='" + objetosc + "', cena=" + cen + ", nazwa_napoju='" + nazwa + "', rodzaj='" + rodzaj + "', opis='"+opis+"', dostepnosc='"+dostepnosc+"' WHERE id_napoju=" + s;
                    stmt3.executeUpdate(insert);
                }

                wyczyscdane();
                komunikat.setText("Nowy napój został dodany do bazy systemu");
                komunikat.setForeground(Color.DARK_GRAY);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Błąd zapisu!");
            }

            czysctabelke();
            przegladaj(model);
        }
    }//GEN-LAST:event_zapiszActionPerformed

    private void anulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anulujActionPerformed
        paneledytujdodaj.setVisible(false);
        wyczyscdane();
    }//GEN-LAST:event_anulujActionPerformed

    private void przegladajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przegladajActionPerformed
        if (przegladaj.isSelected() == true) {
            paneledytujdodaj.setVisible(false);
            panel_tabelka.setVisible(true);
            czysctabelke();
            przegladaj(model);
        } else {
            panel_tabelka.setVisible(false);
        }
    }//GEN-LAST:event_przegladajActionPerformed

    private void NOWA_OPCJA_RODZAJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOWA_OPCJA_RODZAJActionPerformed
        if (NOWA_OPCJA_RODZAJ.isSelected() == true) {
            POLE_NOWY_RODZAJ.setVisible(true);
            POLERODZAJ.setEnabled(false);
            POLERODZAJ.setSelectedIndex(0);
        } else {
            POLE_NOWY_RODZAJ.setVisible(false);
            POLERODZAJ.setEnabled(true);
            POLE_NOWY_RODZAJ.setText("");
        }
    }//GEN-LAST:event_NOWA_OPCJA_RODZAJActionPerformed

    private void NOWA_OPCJA_DOSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOWA_OPCJA_DOSTActionPerformed
        if (NOWA_OPCJA_DOST.isSelected() == true) {
            POLE_NOWY_DOST.setVisible(true);
            POLEDOST.setEnabled(false);
            POLEDOST.setSelectedIndex(0);
        } else {
            POLE_NOWY_DOST.setVisible(false);
            POLEDOST.setEnabled(true);
            POLE_NOWY_DOST.setText("");
        }
    }//GEN-LAST:event_NOWA_OPCJA_DOSTActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edycja_napojow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edycja_napojow(zam).setVisible(true);
            }
        });
    }

    void uzupelnijlisty() {
        POLERODZAJ.removeAllItems();
        POLEDOST.removeAllItems();
        POLEPELNOLET.removeAllItems();
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt4 = con.createStatement();
            res4 = stmt4.executeQuery(
                    "select distinct(rodzaj) from menu_napoje"
            );
            stmt6 = con.createStatement();
            res6 = stmt6.executeQuery(
                    "select distinct(dla_pelnoletnich) from MENU_napoje"
            );
            stmt7 = con.createStatement();
            res7 = stmt7.executeQuery(
                    "select distinct(dostepnosc) from MENU_napoje"
            );

        } catch (Exception e) {
        }
        try {
            if (POLERODZAJ.getItemCount() == 0) {
                POLERODZAJ.addItem("");
                while (res4.next()) {
                    POLERODZAJ.addItem(res4.getString("rodzaj"));
                }
            }
            if (POLEPELNOLET.getItemCount() == 0) {
                POLEPELNOLET.addItem("");
                while (res6.next()) {
                    POLEPELNOLET.addItem(res6.getString("dla_pelnoletnich"));
                }
            }
            if (POLEDOST.getItemCount() == 0) {
                POLEDOST.addItem("");
                while (res7.next()) {
                    POLEDOST.addItem(res7.getString("dostepnosc"));
                }
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
        }
    }

    void przegladaj(DefaultTableModel model) {

        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt1 = con.createStatement();
            res1 = stmt1.executeQuery(
                    "select * from menu_napoje order by id_napoju"
            );
            stmt2 = con.createStatement();
            res2 = stmt2.executeQuery(
                    "select count(*) from menu_napoje "
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
        }
        try {
            while (res1.next()) {
                int nr = res1.getInt("id_napoju");
                String pelnol = res1.getString("dla_pelnoletnich");
                String objetosc = res1.getString("objetosc");
                String cena = res1.getString("cena") + " zł";
                String nazwa = res1.getString("nazwa_napoju");
                String rodzaj = res1.getString("rodzaj");
                String opis = res1.getString("opis");
                String dost = res1.getString("dostepnosc");
                Object[] row = {nr, nazwa, rodzaj, objetosc, cena, pelnol, opis, dost};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
        }
        tabelka.setModel(model);
    }

    void czysctabelke() {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    void wyczyscdane() {
        POLENAZWA.setText("");
        POLE_NOWY_RODZAJ.setText("");
        POLE_NOWY_RODZAJ.setVisible(false);
        NOWA_OPCJA_DOST.setSelected(false);
        NOWA_OPCJA_RODZAJ.setSelected(false);
        POLERODZAJ.setEnabled(true);
        POLERODZAJ.setSelectedIndex(0);
        POLEOBJETOSC.setText("");
        POLECENA.setText("");
        POLEPELNOLET.setSelectedIndex(0);
        POLEOPIS.setText("");
        komunikat.setText("");
        POLE_NOWY_DOST.setText("");
        POLE_NOWY_DOST.setVisible(false);
        POLEDOST.setEnabled(true);
        POLEDOST.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton NOWA_OPCJA_DOST;
    private javax.swing.JToggleButton NOWA_OPCJA_RODZAJ;
    private javax.swing.JTextField POLECENA;
    private javax.swing.JComboBox POLEDOST;
    private javax.swing.JTextField POLENAZWA;
    private javax.swing.JTextField POLENR;
    private javax.swing.JTextField POLEOBJETOSC;
    private javax.swing.JTextField POLEOPIS;
    private javax.swing.JComboBox POLEPELNOLET;
    private javax.swing.JComboBox POLERODZAJ;
    private javax.swing.JTextField POLE_NOWY_DOST;
    private javax.swing.JTextField POLE_NOWY_RODZAJ;
    private javax.swing.JButton anuluj;
    private javax.swing.JLabel cena;
    private javax.swing.JButton dodaj;
    private javax.swing.JLabel dost;
    private javax.swing.JButton edytuj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kom;
    private javax.swing.JLabel komunikat;
    private javax.swing.JLabel nazwa;
    private javax.swing.JLabel nr;
    private javax.swing.JLabel objetosc;
    private javax.swing.JLabel opis;
    private javax.swing.JPanel panel_tabelka;
    private javax.swing.JPanel paneledytujdodaj;
    private javax.swing.JLabel pelnoletni;
    private javax.swing.JButton powrot;
    private javax.swing.JToggleButton przegladaj;
    private javax.swing.JLabel rodzaj;
    private javax.swing.JTable tabelka;
    private javax.swing.JButton usun;
    private javax.swing.JButton wyczysc;
    private javax.swing.JButton zapisz;
    // End of variables declaration//GEN-END:variables
}
