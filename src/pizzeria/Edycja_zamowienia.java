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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wika
 */
public class Edycja_zamowienia extends javax.swing.JFrame {

    Connection con;
    Statement stmt, stmt1, stmt2, stmt3, stmt4, stmt5, stmt6, stmt7;
    ResultSet res1, res2, res3, res4, res5, res6, res7;
    DefaultTableModel model;
    DefaultListModel<String> model1 = new DefaultListModel<>();
    static Zamowienia zam;
    boolean realizuj;

    /**
     * Creates new form Edycja_zamowienia
     */
    public Edycja_zamowienia(Zamowienia zam) {
        this.zam = zam;
        initComponents();
        panel_tabelka.setVisible(false);
        model = (DefaultTableModel) tabelka.getModel();
        tabelka.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tabelka = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelka = new javax.swing.JTable();
        zrealizuj = new javax.swing.JButton();
        usun = new javax.swing.JButton();
        anreal = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        napis = new javax.swing.JLabel();
        ost = new javax.swing.JToggleButton();
        zreal = new javax.swing.JToggleButton();
        niezreal = new javax.swing.JToggleButton();
        nadpis = new javax.swing.JLabel();
        pracownicy = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        wszzam = new javax.swing.JToggleButton();
        przegladaj = new javax.swing.JToggleButton();
        powrot = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1370, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_tabelka.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NR", "Klient", "Pracownik", "Data zamówienia", "Forma opłaty", "Forma zamówienia", "Wartość", "Stan realizacji"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelka.setMaximumSize(new java.awt.Dimension(0, 0));
        tabelka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelka);
        if (tabelka.getColumnModel().getColumnCount() > 0) {
            tabelka.getColumnModel().getColumn(0).setMinWidth(50);
            tabelka.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelka.getColumnModel().getColumn(0).setMaxWidth(50);
            tabelka.getColumnModel().getColumn(1).setMinWidth(150);
            tabelka.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelka.getColumnModel().getColumn(1).setMaxWidth(150);
            tabelka.getColumnModel().getColumn(2).setMinWidth(150);
            tabelka.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabelka.getColumnModel().getColumn(2).setMaxWidth(150);
            tabelka.getColumnModel().getColumn(3).setMinWidth(130);
            tabelka.getColumnModel().getColumn(3).setPreferredWidth(130);
            tabelka.getColumnModel().getColumn(3).setMaxWidth(130);
            tabelka.getColumnModel().getColumn(4).setMinWidth(100);
            tabelka.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabelka.getColumnModel().getColumn(4).setMaxWidth(100);
            tabelka.getColumnModel().getColumn(5).setMinWidth(130);
            tabelka.getColumnModel().getColumn(5).setPreferredWidth(130);
            tabelka.getColumnModel().getColumn(5).setMaxWidth(130);
            tabelka.getColumnModel().getColumn(6).setMinWidth(100);
            tabelka.getColumnModel().getColumn(6).setPreferredWidth(100);
            tabelka.getColumnModel().getColumn(6).setMaxWidth(100);
            tabelka.getColumnModel().getColumn(7).setMinWidth(100);
            tabelka.getColumnModel().getColumn(7).setPreferredWidth(100);
            tabelka.getColumnModel().getColumn(7).setMaxWidth(100);
        }

        panel_tabelka.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 910, 220));

        zrealizuj.setText("Zrealizuj");
        zrealizuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrealizujActionPerformed(evt);
            }
        });
        panel_tabelka.add(zrealizuj, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 180, 40));

        usun.setText("Usuń");
        usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunActionPerformed(evt);
            }
        });
        panel_tabelka.add(usun, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 160, 40));

        anreal.setText("Anuluj realizację");
        anreal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anrealActionPerformed(evt);
            }
        });
        panel_tabelka.add(anreal, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 170, 40));

        jScrollPane3.setViewportView(lista);

        panel_tabelka.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 330, 280));

        napis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        napis.setText("Zamówiono");
        panel_tabelka.add(napis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 150, 20));

        ost.setText("Pokaż ostatnie");
        ost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ostActionPerformed(evt);
            }
        });
        panel_tabelka.add(ost, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 220, 50));

        zreal.setText("Pokaż zrealizowane");
        zreal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrealActionPerformed(evt);
            }
        });
        panel_tabelka.add(zreal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 220, 50));

        niezreal.setText("Pokaż niezrealizowane");
        niezreal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niezrealActionPerformed(evt);
            }
        });
        panel_tabelka.add(niezreal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 220, 50));

        nadpis.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        nadpis.setText("*- żeby posortować dane kliknij na nagłówek tablicy;");
        panel_tabelka.add(nadpis, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 430, -1));

        pracownicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pracownicyActionPerformed(evt);
            }
        });
        panel_tabelka.add(pracownicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 200, 30));

        jLabel1.setText("Wyszukaj zamówienia pracownika:");
        panel_tabelka.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 200, 30));

        wszzam.setText("Pokaż wszystkie");
        wszzam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wszzamActionPerformed(evt);
            }
        });
        panel_tabelka.add(wszzam, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 160, 50));

        getContentPane().add(panel_tabelka, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1380, 620));

        przegladaj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        przegladaj.setText("Przeglądaj wszystkie zamówienia przyjęte do realizacji");
        przegladaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przegladajActionPerformed(evt);
            }
        });
        getContentPane().add(przegladaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 440, 60));

        powrot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        powrot.setText("Powrót");
        powrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powrotActionPerformed(evt);
            }
        });
        getContentPane().add(powrot, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 190, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zrealizujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrealizujActionPerformed

        if (tabelka.getSelectedRowCount() > 0) {
            int i = tabelka.getSelectedRow();
            String nr = tabelka.getValueAt(i, 0).toString();
            try {
                con = DriverManager.getConnection(
                        "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
                );
                stmt5 = con.createStatement();
                stmt5.executeUpdate("UPDATE zamowienie SET zrealizowane='T' where id_zam=" + nr);
                czysctabelke();
                wyswietldane(model);
            } catch (SQLException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nie wybrano wiersza!");
        }
    }//GEN-LAST:event_zrealizujActionPerformed

    private void usunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunActionPerformed

        if (tabelka.getSelectedRowCount() > 0) {
            int wiersz = tabelka.getSelectedRow();
            String s = tabelka.getValueAt(wiersz, 0).toString();
            int id = Integer.parseInt(s);
            usunzamowieniezbazy(id);
            model1.removeAllElements();
            lista.setModel(model1);
            czysctabelke();
            wyswietldane(model);
        } else {
            JOptionPane.showMessageDialog(null, "Nie wybrano wiersza!");
        }
    }//GEN-LAST:event_usunActionPerformed

    private void anrealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anrealActionPerformed
        if (tabelka.getSelectedRowCount() > 0) {
            int i = tabelka.getSelectedRow();
            String nr = tabelka.getValueAt(i, 0).toString();
            try {
                con = DriverManager.getConnection(
                        "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
                );
                stmt5 = con.createStatement();
                stmt5.executeUpdate("UPDATE zamowienie SET zrealizowane='N' where id_zam=" + nr);
                czysctabelke();
                wyswietldane(model);
            } catch (SQLException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nie wybrano wiersza!");
        }
    }//GEN-LAST:event_anrealActionPerformed

    private void przegladajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przegladajActionPerformed
        if (przegladaj.isSelected() == true) {
            panel_tabelka.setVisible(true);
            czysctabelke();
            wyswietldane(model);
            pracownicy.removeAllItems();
            uzupelnijlisty();
        } else {
            panel_tabelka.setVisible(false);
        }
    }//GEN-LAST:event_przegladajActionPerformed

    private void powrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powrotActionPerformed
        zam.setVisible(true);
        dispose();
    }//GEN-LAST:event_powrotActionPerformed

    private void tabelkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkaMouseClicked

        if (tabelka.getSelectedRowCount() > 0) {
            model1.removeAllElements();
            lista.setModel(model1);
            int i = tabelka.getSelectedRow();
            String nr = tabelka.getValueAt(i, 0).toString();
            int numer = Integer.parseInt(nr);
            dodajpizzedozamowienia(numer);
            dodajnapojdozamowienia(numer);
            int j = tabelka.getColumnModel().getSelectionModel().getLeadSelectionIndex();
        }
    }//GEN-LAST:event_tabelkaMouseClicked

    private void ostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ostActionPerformed
        model1.removeAllElements();
        lista.setModel(model1);
        if (ost.isSelected()) {
            wszzam.setSelected(false);
            model1.removeAllElements();
            lista.setModel(model1);
            pracownicy.setSelectedIndex(0);
            zreal.setSelected(false);
            niezreal.setSelected(false);
            czysctabelke();
            wyswietldane(model);
        } else {
            czysctabelke();
            wyswietldane(model);
        }
    }//GEN-LAST:event_ostActionPerformed

    private void zrealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrealActionPerformed
        model1.removeAllElements();
        lista.setModel(model1);
        if (zreal.isSelected()) {
            niezreal.setSelected(false);
            wszzam.setSelected(false);
            ost.setSelected(false);
            model1.removeAllElements();
            lista.setModel(model1);
            pracownicy.setSelectedIndex(0);
            czysctabelke();
            wyswietldane(model);
        } else {
            czysctabelke();
            wyswietldane(model);
        }
    }//GEN-LAST:event_zrealActionPerformed

    private void niezrealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niezrealActionPerformed
        model1.removeAllElements();
        lista.setModel(model1);
        if (niezreal.isSelected()) {
            pracownicy.setSelectedIndex(0);
            zreal.setSelected(false);
            wszzam.setSelected(false);
            ost.setSelected(false);
            model1.removeAllElements();
            lista.setModel(model1);
            czysctabelke();
            wyswietldane(model);
        } else {
            czysctabelke();
            wyswietldane(model);
        }
    }//GEN-LAST:event_niezrealActionPerformed

    private void pracownicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pracownicyActionPerformed
        model1.removeAllElements();
        lista.setModel(model1);
        int i = pracownicy.getSelectedIndex();
        if (i > 0) {
            niezreal.setSelected(false);
            zreal.setSelected(false);
            wszzam.setSelected(false);
            ost.setSelected(false);
            czysctabelke();
            wyswietldane(model);
        } else {
            czysctabelke();
            wyswietldane(model);
        }

    }//GEN-LAST:event_pracownicyActionPerformed

    private void wszzamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wszzamActionPerformed
        model1.removeAllElements();
        lista.setModel(model1);
        zreal.setSelected(false);
        niezreal.setSelected(false);
        ost.setSelected(false);
        uzupelnijlisty();
        czysctabelke();
        wyswietldane(model);
    }//GEN-LAST:event_wszzamActionPerformed

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
            java.util.logging.Logger.getLogger(Edycja_zamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edycja_zamowienia(zam).setVisible(true);
            }
        });
    }

    void uzupelnijlisty() {
        pracownicy.removeAllItems();
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt4 = con.createStatement();
            res4 = stmt4.executeQuery(
                    "select * from pracownicy"
            );
        } catch (Exception e) {
        }
        try {
            if (pracownicy.getItemCount() == 0) {
                pracownicy.addItem("");
                while (res4.next()) {
                    pracownicy.addItem(res4.getString("login"));
                }
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
        }
    }

    void dodajnapojdozamowienia(int numer) {
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt3 = con.createStatement();
            res3 = stmt3.executeQuery(
                    "select * from ZAMOWIENIE Z join SZCZ_O_NAPOJU AS N on Z.ID_ZAM=N.ID_ZAM"
                    + " join MENU_NAPOJE AS M on N.ID_NAPOJU=M.ID_NAPOJU"
                    + " where Z.id_zam=" + numer
            );
            while (res3.next()) {
                int ilenapojow = res3.getInt("ile_sztuk_nap");
                String napoj = ilenapojow + "";
                napoj += "x " + res3.getString("nazwa_napoju");
                model1.addElement(napoj);
            }
            lista.setModel(model1);
        } catch (SQLException ex) {

        }
    }

    void dodajpizzedozamowienia(int numer) {
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt2 = con.createStatement();
            res2 = stmt2.executeQuery(
                    "select * from ZAMOWIENIE Z join SZCZ_O_PIZZY AS SP on Z.ID_ZAM=SP.ID_ZAM"
                    + " join MENU_PIZZA AS MP on SP.ID_PIZZY=MP.ID_PIZZY where Z.id_zam=" + numer
            );
            while (res2.next()) {
                int idszcz = res2.getInt("id_szcz_o_pizzy");
                int ilepizzy = res2.getInt("ile_sztuk_p");
                String pizza = ilepizzy + "";
                pizza += "x " + res2.getString("nazwa");
                pizza += " " + res2.getString("rozmiar");
                String ciasto = res2.getString("ciasto");
                if (ciasto.contains("grube")) {
                    pizza += " na grubym cieście";
                } else if (ciasto.contains("cienkie")) {
                    pizza += " na cienkim cieście";
                }
                pizza += "  " + dodajskladniki(idszcz, numer);
                model1.addElement(pizza);
            }
            lista.setModel(model1);
        } catch (SQLException ex) {
        }
    }

    String dodajskladniki(int idszcz, int numer) {
        String skladnik = "";
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt4 = con.createStatement();
            res4 = stmt4.executeQuery(
                    "select * from ZAMOWIENIE AS Z join SZCZ_O_PIZZY AS SP on Z.ID_ZAM=SP.ID_ZAM"
                    + " join SZCZ_O_SKL AS SS on SP.ID_SZCZ_O_PIZZY=SS.ID_SZCZ_O_PIZZY"
                    + " JOIN SKLADNIKI AS S ON SS.ID_SKLADNIKA=S.ID_SKLADNIKA"
                    + " where Z.id_zam=" + numer
                    + " and sp.id_szcz_o_pizzy=" + idszcz
            );
            while (res4.next()) {
                skladnik += "+ " + res4.getString("nazwa") + ", ";
            }
        } catch (SQLException ex) {
        }
        return skladnik;
    }

    void wyswietldane(DefaultTableModel model) {
        String insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC order by id_ZAM";

        if (ost.isSelected() && zreal.isSelected() == false && pracownicy.getSelectedIndex() == 0 && niezreal.isSelected() == false && wszzam.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC where id_zam=(select max(id_zam) from zamowienie) order by id_ZAM";
        } else if (pracownicy.getSelectedIndex() > 0 && zreal.isSelected() == false && niezreal.isSelected() == false && ost.isSelected() == false && wszzam.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC where  login like '" + pracownicy.getSelectedItem().toString() + "' order by id_ZAM";
        } else if (zreal.isSelected() && pracownicy.getSelectedIndex() == 0 && niezreal.isSelected() == false && wszzam.isSelected() == false && ost.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC where zrealizowane='T' order by id_ZAM";
        } else if (niezreal.isSelected() && pracownicy.getSelectedIndex() == 0 && zreal.isSelected() == false && wszzam.isSelected() == false && ost.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC where zrealizowane='N' order by id_ZAM";
        } else if (ost.isSelected() && zreal.isSelected() && pracownicy.getSelectedIndex() == 0 && wszzam.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC where id_zam=(select max(id_zam) from ZAMOWIENIE Z JOIN KLIENCI K ON Z.ID_KLIENTA=k.ID_KLIENTA JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC where zrealizowane='T') order by id_ZAM";
        } else if (ost.isSelected() && niezreal.isSelected() && pracownicy.getSelectedIndex() == 0 && wszzam.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC where id_zam=(select max(id_zam) from ZAMOWIENIE Z JOIN KLIENCI K ON Z.ID_KLIENTA=k.ID_KLIENTA JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC where zrealizowane='N') order by id_ZAM";
        } else if (ost.isSelected() && pracownicy.getSelectedIndex() > 0 && zreal.isSelected() == false && wszzam.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC WHERE id_zam=(select max(id_zam) from ZAMOWIENIE Z JOIN KLIENCI K ON Z.ID_KLIENTA=k.ID_KLIENTA JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC  where login like '" + pracownicy.getSelectedItem().toString() + "') order by id_ZAM";
        } else if (zreal.isSelected() && pracownicy.getSelectedIndex() > 0 && wszzam.isSelected() == false && ost.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC WHERE login  like '" + pracownicy.getSelectedItem().toString() + "' and zrealizowane='T' order by id_ZAM";
        } else if (niezreal.isSelected() && pracownicy.getSelectedIndex() > 0 && zreal.isSelected() == false && wszzam.isSelected() == false && ost.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC WHERE login  like '" + pracownicy.getSelectedItem().toString() + "' and zrealizowane='N' order by id_ZAM";
        } else if (ost.isSelected() && niezreal.isSelected() && pracownicy.getSelectedIndex() > 0 && zreal.isSelected() == false && wszzam.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC WHERE  id_zam= (select max(id_zam) from ZAMOWIENIE Z JOIN KLIENCI K ON Z.ID_KLIENTA=k.ID_KLIENTA JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC WHERE login  like '" + pracownicy.getSelectedItem().toString() + "' and zrealizowane='N' ) and login  like '" + pracownicy.getSelectedItem().toString() + "' and zrealizowane='N' order by id_ZAM";
        } else if (ost.isSelected() && zreal.isSelected() && pracownicy.getSelectedIndex() > 0 && niezreal.isSelected() == false && wszzam.isSelected() == false) {
            insert = "select * from ZAMOWIENIE Z JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC WHERE id_zam= (select max(id_zam) from ZAMOWIENIE Z JOIN KLIENCI K ON Z.ID_KLIENTA=k.ID_KLIENTA JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC WHERE login  like '" + pracownicy.getSelectedItem().toString() + "' and zrealizowane='T' ) and login  like '" + pracownicy.getSelectedItem().toString() + "' and zrealizowane='T'  order by id_ZAM";
        }
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt1 = con.createStatement();
            res1 = stmt1.executeQuery(insert);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
        }
        try {
            while (res1.next()) {
                String klient = "";
                int nr = res1.getInt("id_ZAM");
                String pracownik = res1.getString("login");
                String data = res1.getString("data_zam");
                String oplata = res1.getString("platnosc");
                if (oplata.equals("G")) {
                    oplata = "gotówka";
                } else {
                    oplata = "karta";
                }

                String realizacja = res1.getString("zrealizowane");
                if (realizacja.equals("N")) {
                    realizuj = false;
                } else {
                    realizuj = true;

                }
                String formazam = res1.getString("forma");
                if (formazam.equals("D")) {
                    formazam = "w dostawie";
                } else {
                    formazam = "w lokalu";
                }

                String wartosc = res1.getString("wartosc") + " zł";

                try {
                    con = DriverManager.getConnection(
                            "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
                    );
                    stmt2 = con.createStatement();
                    res2 = stmt2.executeQuery("select IMIE_NAZWISKO from ZAMOWIENIE Z join klienci K on K.id_klienta=Z.id_klienta JOIN PRACOWNICY P ON z.ID_PRAC=P.ID_PRAC where id_zam=" + nr + " order by id_ZAM");
                    while (res2.next()) {
                        klient = res2.getString("IMIE_NAZWISKO");

                    }
                    if (klient.length() > 1) {
                        Object[] row = {nr, klient, pracownik, data, oplata, formazam, wartosc, realizuj};
                        model.addRow(row);
                    } else {
                        Object[] row = {nr, "-", pracownik, data, oplata, formazam, wartosc, realizuj};
                        model.addRow(row);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
                }
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

    void usunzamowieniezbazy(int id) {
        int ileszcznap = 0;
        int ileskl = 0;
        int maxidszczpizzy = 0;
        int ileszczpizzy = 0;
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt = con.createStatement();
            stmt1 = con.createStatement();
            res1 = stmt1.executeQuery("select count(id_szcz_o_nap) from szcz_o_napoju where id_zam=" + id);
            while (res1.next()) {
                ileszcznap = res1.getInt("1");
                stmt2 = con.createStatement();
                res2 = stmt2.executeQuery("select count(id_szcz_o_skl) from szcz_o_skl where id_szcz_o_pizzy in (select id_szcz_o_pizzy from szcz_o_pizzy where id_zam=" + id + ")");
                while (res2.next()) {
                    ileskl = res2.getInt("1");
                    stmt3 = con.createStatement();
                    res3 = stmt3.executeQuery("select max(id_szcz_o_pizzy) from szcz_o_pizzy where id_zam=" + id);
                    while (res3.next()) {
                        maxidszczpizzy = res3.getInt("1");
                        stmt4 = con.createStatement();
                        res4 = stmt4.executeQuery("select count(id_szcz_o_pizzy) from szcz_o_pizzy where id_zam=" + id);
                        while (res4.next()) {
                            ileszczpizzy = res4.getInt("1");
                            String naprawidskl1 = "update szcz_o_skl set id_szcz_o_skl=id_szcz_o_skl-" + ileskl + " where id_szcz_o_pizzy>" + maxidszczpizzy;
                            String naprawidskl2 = "update szcz_o_skl set id_szcz_o_pizzy=id_szcz_o_pizzy-" + ileszczpizzy + " where id_szcz_o_pizzy>" + maxidszczpizzy;
                            String naprawidpizzy1 = "update szcz_o_pizzy set id_szcz_o_pizzy=id_szcz_o_pizzy-" + ileszczpizzy + " where id_zam>" + id;
                            String naprawidpizzy2 = "update szcz_o_pizzy set id_zam=id_zam-1 where id_zam>" + id;
                            String naprawidnap1 = "update szcz_o_napoju set id_szcz_o_nap=id_szcz_o_nap-" + ileszcznap + " where id_zam>" + id;
                            String naprawidnap2 = "update szcz_o_napoju set id_zam=id_zam-1 where id_zam>" + id;
                            String naprawidzam = "update zamowienie set id_zam=id_zam-1 where id_zam>" + id;
                            stmt.executeUpdate(
                                    "delete from szcz_o_skl where id_szcz_o_pizzy in (select id_szcz_o_pizzy from szcz_o_pizzy where id_zam=" + id + ")"
                            );
                            stmt.executeUpdate(
                                    "delete from szcz_o_pizzy where id_zam=" + id
                            );
                            stmt.executeUpdate(
                                    "delete from szcz_o_napoju where id_zam=" + id
                            );
                            stmt.executeUpdate(
                                    "delete from zamowienie where id_zam=" + id
                            );
                            stmt6 = con.createStatement();
                            res5 = stmt6.executeQuery("select count(*) from zamowienie");
                            while (res5.next()) {
                                int ile = res5.getInt("1");                                
                                if (ile > 0) {
                                    stmt.executeUpdate("insert into ZAMOWIENIE (ID_ZAM, DATA_ZAM, PLATNOSC, ZREALIZOWANE, FORMA, WARTOSC, ID_PRAC) \n"
                                            + "	VALUES ((select max(id_zam)+1 from ZAMOWIENIE), '', '', 'N', '',0, " + sprawdzid() + ")");
                                }
                            }

                            stmt.executeUpdate(naprawidzam);
                            stmt.executeUpdate(naprawidnap1);
                            stmt.executeUpdate(naprawidnap2);
                            stmt5 = con.createStatement();
                            res6 = stmt5.executeQuery("select count(*) from szcz_o_pizzy");
                            while (res6.next()) {
                                int ilewpizzy = res6.getInt("1");
                                if (ilewpizzy > 0) {
                                    stmt.executeUpdate("insert into szcz_o_pizzy values ((select max(id_szcz_o_pizzy)+1 from szcz_o_pizzy),(select max(id_zam) from zamowienie),1,0)");
                                }
                            }
                            stmt.executeUpdate(naprawidpizzy1);
                            stmt.executeUpdate(naprawidpizzy2);
                            stmt.executeUpdate(naprawidskl1);
                            stmt.executeUpdate(naprawidskl2);
                            stmt7 = con.createStatement();
                            res7 = stmt7.executeQuery("select count(*) from zamowienie");
                            while (res7.next()) {
                                int ilezam = res7.getInt("1");
                                if (ilezam > 0) {
                                    stmt.executeUpdate("delete from szcz_o_pizzy where id_szcz_o_pizzy=(select max(id_szcz_o_pizzy) from szcz_o_pizzy)");
                                    stmt.executeUpdate("delete from zamowienie where id_zam=(select max(id_zam) from zamowienie)");
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                break;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
        }
    }

    int sprawdzid() {
        int id = 0;
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt6 = con.createStatement();
            res1 = stmt6.executeQuery("select * from LOGOWANIE L join PRACOWNICY P on L.id_prac=P.id_prac where id_log=(select max(id_log) from LOGOWANIE)");
            while (res1.next()) {
                id = res1.getInt("id_prac");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
        }
        return id;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anreal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList lista;
    private javax.swing.JLabel nadpis;
    private javax.swing.JLabel napis;
    private javax.swing.JToggleButton niezreal;
    private javax.swing.JToggleButton ost;
    private javax.swing.JPanel panel_tabelka;
    private javax.swing.JToggleButton powrot;
    private javax.swing.JComboBox pracownicy;
    private javax.swing.JToggleButton przegladaj;
    private javax.swing.JTable tabelka;
    private javax.swing.JButton usun;
    private javax.swing.JToggleButton wszzam;
    private javax.swing.JToggleButton zreal;
    private javax.swing.JButton zrealizuj;
    // End of variables declaration//GEN-END:variables
}
