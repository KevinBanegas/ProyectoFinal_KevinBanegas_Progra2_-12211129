package Clases;

import Conexiones.Dba;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Prueba extends javax.swing.JFrame {

    /**
     * Creates new form Prueba
     */
    public Prueba() {
        initComponents();
        vaciarTabla();
        jCalendar1.setVisible(false);
    }

    public void vaciarTabla() {

        DefaultTableModel Modelo = (DefaultTableModel) jTable1.getModel();
        String titulos[] = {"Usuario", "NOMBRE_Tarea", "FechaTarea", "Realizado", "Importante", "listaPertenece"};
        Modelo = new DefaultTableModel(null, titulos);
        jTable1.setModel(Modelo);
    }

    public void vaciarTabla2() {
        DefaultTableModel Modelo = (DefaultTableModel) jTable1.getModel();
        String titulos[] = {"Usuario", "Contraseña", "Correo"};
        Modelo = new DefaultTableModel(null, titulos);
        jTable1.setModel(Modelo);
    }

    public void listar() {
        vaciarTabla();
        DefaultTableModel miModelo = (DefaultTableModel) jTable1.getModel();
        Dba db = new Dba("./DataBaseProyectoFinal.accdb");
        db.conectar();
        try {
            db.query.execute("select * from ToDo");
            ResultSet rs = db.query.getResultSet();
            Object dts[] = new String[6];
            while (rs.next()) {
                dts[0] = rs.getString("usuario");
                dts[1] = rs.getString("nombre_Tarea");
                dts[2] = rs.getString("fechaRealizar_tarea");
                dts[3] = rs.getString("realizado_tarea");
                dts[4] = rs.getString("importante_tarea");
                dts[5] = rs.getString("listaPertenece");
                miModelo.addRow(dts);
                jTable1.setModel(miModelo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }

    public void listar2() {
        vaciarTabla2();
        DefaultTableModel miModelo = (DefaultTableModel) jTable1.getModel();
        Dba db = new Dba("./DataBaseProyectoFinal.accdb");
        db.conectar();
        try {
            db.query.execute("select * from Cuentas");
            ResultSet rs = db.query.getResultSet();
            Object dts[] = new String[3];
            while (rs.next()) {
                dts[0] = rs.getString("usuario");
                dts[1] = rs.getString("contra");
                dts[2] = rs.getString("correo");
                miModelo.addRow(dts);
                jTable1.setModel(miModelo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }

    public void AgregarDatosToDo() throws SQLException {
        Dba db = new Dba("./DataBaseProyectoFinal.accdb");
        db.conectar();
        try {
            int l;
            String nombre;
            String realizado, importante;
            String lista;
            jCalendar1.setVisible(true);
            Date d = jCalendar1.getDate();
            jCalendar1.setVisible(false);
            SimpleDateFormat s = new SimpleDateFormat("dd/M/yyyy");
            String date = s.format(d);
            l = JOptionPane.showConfirmDialog(this, "Pertenece a una lista?");
            nombre = JOptionPane.showInputDialog("Nombre");
            int i = JOptionPane.showConfirmDialog(this, "Es importante?");
            if (i == 1) {
                importante = "NO";
            } else {
                importante = "YES";
            }
            if (l == 0) {
                lista = JOptionPane.showInputDialog("Lista:");
            } else {
                lista = "0";
            }
            int x = 1;
            db.query.execute("INSERT INTO ToDo "
                    + " (id_cuenta ,nombre_Tarea, fechaRealizar_tarea, realizado_tarea, importante_tarea, listaPertenece)"
                    + " VALUES ('" + x + "', '" + nombre + "',  '" + date + "', '" + importante + "', '" + importante + "', '" + lista + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
public void AgregarDatosCuentas(){
        Dba db = new Dba("./DataBaseProyectoFinal.accdb");
        db.conectar();
        try {
            String u = JOptionPane.showInputDialog(this, "Ingrese el usuario: ");
            String c = JOptionPane.showInputDialog(this, "Ingrese la contraseña: ");
            String cor = JOptionPane.showInputDialog(this, "Ingrese el correo: ");
            db.query.execute("INSERT INTO Cuentas"
                    + " (usuario,contra,correo)"
                    + " VALUES ('" + u + "',  '" + c + "', '" + cor + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Probar Conexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Terminar Conexion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ToDo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Add ToDo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_cuenta", "nombre_Tarea", "nota_tarea", "fechaRealizar_tarea", "id_listasTareas", "realizado_tarea", "importante_tarea", "id_lista"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Cuentas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Add Cuenta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(29, 29, 29)
                        .addComponent(jButton4)
                        .addGap(26, 26, 26)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(0, 172, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        listar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        listar2();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            AgregarDatosToDo();
        } catch (SQLException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        AgregarDatosCuentas();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
