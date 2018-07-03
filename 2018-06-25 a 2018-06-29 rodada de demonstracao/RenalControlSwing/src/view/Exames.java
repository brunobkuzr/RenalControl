/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static view.Medicacao.axcdusuari;
import static view.Resultados.axcdusuari;

/**
 *
 * @author Bruno
 */
public class Exames extends javax.swing.JInternalFrame {

    public static int axcdusuari;

    /**
     * Creates new form Exames
     */
    public Exames(int sdcdusuari) throws ClassNotFoundException {
        axcdusuari = sdcdusuari;
        initComponents();
        carregaLista();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Resultado", "Valor", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 102));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("CONSULTA DE EXAMES");

        jLabel1.setText("Exame");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(651, Short.MAX_VALUE))
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("") == false) {
            try {
                carregaTabela();
               
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Medicacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void carregaLista() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_renalcontrol?useTimezone=true&serverTimezone=UTC", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs_exames;
            String sddscomsql = " select * from exames where cdusuari = " + axcdusuari;
            rs_exames = stmt.executeQuery(sddscomsql);
            int cdexame = 0;
            jComboBox1.addItem("");
            while (rs_exames.next() == true) {
                if (rs_exames.getInt("cdexame") != cdexame) {
                    jComboBox1.addItem(rs_exames.getString("nmexame"));
                }
                cdexame = rs_exames.getInt("cdexame");

            }
            rs_exames.close();
        } catch (SQLException Erro) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Erro Cmdo SQL" + Erro.getMessage());
        }
    }

    private void carregaTabela() throws ClassNotFoundException {

        DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"Resultado", "Valor", "Situação", "Valores de referência"});
        {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_renalcontrol?useTimezone=true&serverTimezone=UTC", "root", "root");
                Statement stmt = con.createStatement();
                Statement stmt2 = con.createStatement();
                int sdcdperiod = 0;
                ResultSet rs_remedio;
                ResultSet rs_exame;
                String sddscomsql = " select * from exames where nmexame = '" + jComboBox1.getSelectedItem().toString().trim() + "'";
                sddscomsql += " and cdusuari=" + axcdusuari;
                rs_exame = stmt.executeQuery(sddscomsql);
                while (rs_exame.next() == true) {
                    String[] dados = new String[4];
                    ResultSet rs_metrica;
                    sddscomsql = " select * from metricas where cdmetrica = " + rs_exame.getInt("cdmetrica");
                    sddscomsql += " and cdusuari=" + axcdusuari;
                    rs_metrica = stmt2.executeQuery(sddscomsql);
                    if (rs_metrica.next() == true) {
                        dados[0] = rs_metrica.getString("nmmetrica");
                        dados[1] = String.valueOf(rs_exame.getDouble("vlresult"));
                        double axvlresult = rs_exame.getDouble("vlresult");
                        double axvlinicial = rs_metrica.getDouble("vlinicial");
                        double axvlfinalx = rs_metrica.getDouble("vlfinal");
                        if (axvlresult > axvlinicial && axvlresult < axvlfinalx) {
                            dados[2] = "Bom";
                        } else {
                            if ((int) axvlresult > (int) axvlfinalx || (int) axvlresult < (int) axvlfinalx) {
                                dados[2] = "Verificar";
                            } else {
                                if (axvlresult > axvlfinalx || axvlresult < axvlinicial) {
                                    dados[2] = "Fora do padrão";
                                }
                            }
                        }
                        dados[3] = "Entre " + rs_metrica.getDouble("vlinicial") + " e " + rs_metrica.getDouble("vlfinal");
                        modelo.addRow(dados);
                    }
                    rs_metrica.close();
                    
                }

                rs_exame.close();
                jTable1.setModel(modelo);
            } catch (SQLException Erro) {
                javax.swing.JOptionPane.showMessageDialog(null,
                        "Erro Cmdo SQL" + Erro.getMessage());
            }
        }
    }
}