/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import static view.Periodos.axcdusuari;
import static view.Remedios.axcdusuari;

/**
 *
 * @author Bruno
 */
public class Medicacao extends javax.swing.JInternalFrame {

    public static int axcdusuari;
    public static int axvlprogre = 0;
    public static int axvlcontad = 0;
    DefaultTableModel vazio = new DefaultTableModel();
    public static ArrayList tbremedios = new ArrayList();
    public static ArrayList tbquantida = new ArrayList();

    /**
     * Creates new form Medicacao
     */
    public Medicacao(int sdcdusuari) throws ClassNotFoundException {
        axcdusuari = sdcdusuari;
        initComponents();
        carregaLista();
        jTable1.setModel(vazio);
        botMedica.setVisible(false);
        tbremedios.clear();
        tbquantida.clear();
        botExc.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        botMedica = new javax.swing.JButton();
        botExc = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("MEDICAÇÃO");

        jLabel1.setText("Período");

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jProgressBar1.setBackground(new java.awt.Color(0, 204, 204));

        botMedica.setBackground(new java.awt.Color(51, 204, 0));
        botMedica.setText("CONCLUIR MEDICAÇÃO");
        botMedica.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        botMedica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botMedica.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        botMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMedicaActionPerformed(evt);
            }
        });

        botExc.setText("Excluir");
        botExc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 113, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(73, 73, 73))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botMedica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botExc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botExc)
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botMedica)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("") == false) {
            try {
                carregaTabela();
                botExc.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Medicacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int cont = 0;
        axvlcontad = 0;
        boolean completo = false;
        for (int z = 0; z < jTable1.getRowCount(); z++) {
            if (jTable1.getValueAt(z, 3) != null) {
                if(jTable1.getValueAt(z, 3).toString().equals("true")){
                    cont++;
                   
                }
            }

        }
        if (cont == jTable1.getRowCount()) {
            completo = true;
        }

        axvlcontad = cont * 10;

        jProgressBar1.setValue(axvlcontad);
        if (completo == true) {
            botMedica.setVisible(true);
        } else {
            botMedica.setVisible(false);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void botMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMedicaActionPerformed
        try {
            diminuiEstoque();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Medicacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Medicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botMedicaActionPerformed

    private void botExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcActionPerformed
        try {
            excluirPeriodo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Medicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botExcActionPerformed

    public void carregaLista() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_renalcontrol?useTimezone=true&serverTimezone=UTC", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs_periodo;
            String sddscomsql = " select * from periodos where periodos.cdusuari = " + axcdusuari;
            rs_periodo = stmt.executeQuery(sddscomsql);
            jComboBox1.addItem(""); //primeira vazia
            while (rs_periodo.next() == true) {

                jComboBox1.addItem(rs_periodo.getString("nmperiod"));
            }
            rs_periodo.close();
        } catch (SQLException Erro) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Erro Cmdo SQL" + Erro.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botExc;
    private javax.swing.JButton botMedica;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void carregaTabela() throws ClassNotFoundException {

        DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"ID", "Remédio", "Qtde a tomar", "Concluído?"}) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                Class classType = String.class;
                switch (columnIndex) {
                    case 3:
                        classType = Boolean.class;
                        break;
                }
                return classType;
            }
        };
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_renalcontrol?useTimezone=true&serverTimezone=UTC", "root", "root");
            Statement stmt = con.createStatement();
            int sdcdperiod = 0;
            ResultSet rs_remedio;
            ResultSet rs_periodo;
            String sddscomsql = " select cdperiod from periodos where nmperiod = '" + jComboBox1.getSelectedItem().toString().trim() + "'";
            sddscomsql += " and cdusuari=" + axcdusuari;
            rs_periodo = stmt.executeQuery(sddscomsql);
            if (rs_periodo.next() == true) {
                sdcdperiod = rs_periodo.getInt("cdperiod");
            }
            rs_periodo.close();
            sddscomsql = " select * from remedios_periodos where cdusuari=" + axcdusuari;
            sddscomsql += " and cdperiod=" + sdcdperiod;
            rs_remedio = stmt.executeQuery(sddscomsql);

            while (rs_remedio.next() == true) {
                String[] dados = new String[4];
                dados[0] = String.valueOf(rs_remedio.getDouble("cdremperi"));
                dados[1] = rs_remedio.getString("nmremedi");
                dados[2] = String.valueOf(rs_remedio.getDouble("qtremedi"));
                modelo.addRow(dados);
                jTable1.setModel(modelo);

                jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            }
            rs_remedio.close();
            jProgressBar1.setMaximum(jTable1.getRowCount() * 10);
        } catch (SQLException Erro) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Erro Cmdo SQL" + Erro.getMessage());
        }
    }

    public void diminuiEstoque() throws ClassNotFoundException, SQLException {
        alimentaArray();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_renalcontrol?useTimezone=true&serverTimezone=UTC", "root", "root");
        Statement stmt = con.createStatement();
        int sdcdperiod = 0;
        ResultSet rs_remedio;
        ResultSet rs_periodo;
        for (int j = 0; j < tbremedios.size(); j++) {
            String sddscomsql = " update remedios set remedios.qtremedio = remedios.qtremedio -";
            sddscomsql += " " + String.valueOf(tbquantida.get(j).toString()) + " where cdusuari = " + axcdusuari;
            sddscomsql += " and nmremedio='" + tbremedios.get(j).toString() + "'";
            stmt.executeUpdate(sddscomsql);

        }

    }

    public void excluirPeriodo() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_renalcontrol?useTimezone=true&serverTimezone=UTC", "root", "root");
            Statement stmt = con.createStatement();
            String sddscomsql = " delete from periodos where periodos.cdusuari = " + axcdusuari;
            sddscomsql += " and nmperiod = '"+jComboBox1.getSelectedItem().toString()+"'";
            System.out.println(sddscomsql);
            stmt.executeUpdate(sddscomsql);
            jComboBox1.removeAll();
            jComboBox1.setVisible(false);
            jComboBox1.setVisible(true);
            jComboBox1.setSelectedIndex(0);
            carregaLista();
        } catch (SQLException Erro) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Erro Cmdo SQL" + Erro.getMessage());
        }
        
    }
    public void alimentaArray() {
        for (int x = 0; x < jTable1.getRowCount(); x++) {
            tbremedios.add(jTable1.getValueAt(x, 1));
            tbquantida.add(jTable1.getValueAt(x, 2));

        }

    }
}