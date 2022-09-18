package ToDo;

import Conexiones.Dba;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import loginFrames.Administrador;
import loginFrames.Cuenta;
import loginFrames.DefaultLoginFrame;
import loginFrames.MenuPrincipal;

/**
 *
 * @author Usuario
 */
public class myToDo extends javax.swing.JFrame {

    /**
     * Creates new form myToDo
     *
     * @param indexCuenta
     */
    public myToDo(int indexCuenta) {
        initComponents();

        this.indexCuenta = indexCuenta;
        traerCuenta();
        traerTareas();
        TraerListaTareas();
        tableListas();

        dateChooser.getJCalendar().setMinSelectableDate(new Date());
        dateChooserAsignar.getJCalendar().setMinSelectableDate(new Date());
        table_listaTareas.getTableHeader().setFont(new java.awt.Font("Litera-Serial", 0, 14));
        table_listaTareas.getTableHeader().setBackground(new Color(255, 152, 204));
        table_listaTareas.getTableHeader().setForeground(Color.WHITE);
        table_myDay.getTableHeader().setFont(new java.awt.Font("Litera-Serial", Font.BOLD, 15));
        table_myDay.getTableHeader().setBackground(new Color(255, 152, 204));
        table_myDay.getTableHeader().setForeground(Color.WHITE);
        table_completados.getTableHeader().setFont(new java.awt.Font("Litera-Serial", Font.BOLD, 15));
        table_completados.getTableHeader().setBackground(new Color(255, 152, 204));
        table_completados.getTableHeader().setForeground(Color.WHITE);
        table_importante.getTableHeader().setFont(new java.awt.Font("Litera-Serial", Font.BOLD, 15));
        table_importante.getTableHeader().setBackground(new Color(255, 152, 204));
        table_importante.getTableHeader().setForeground(Color.WHITE);
        jScrollPane2.setPreferredSize(new Dimension(Integer.MAX_VALUE, (table_myDay.getRowCount() + 1) * table_myDay.getRowHeight()));
        table_myDay.getColumnModel().getColumn(0).setPreferredWidth(23);
        table_myDay.getColumnModel().getColumn(1).setPreferredWidth(140);
        table_myDay.getColumnModel().getColumn(2).setPreferredWidth(23);
        table_myDay.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        table_importante.getColumnModel().getColumn(0).setPreferredWidth(160);
        table_importante.getColumnModel().getColumn(1).setPreferredWidth(30);
        table_importante.getColumnModel().getColumn(2).setPreferredWidth(23);
        table_importante.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        table_completados.getColumnModel().getColumn(0).setPreferredWidth(160);
        table_completados.getColumnModel().getColumn(1).setPreferredWidth(40);
        table_completados.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        table_listaTareas.getTableHeader().setBackground(new Color(153, 0, 153));
        table_listaTareas.setTableHeader(null);
        table_listas.getColumnModel().getColumn(0).setPreferredWidth(23);
        table_listas.getColumnModel().getColumn(1).setPreferredWidth(140);
        table_listas.getColumnModel().getColumn(2).setPreferredWidth(23);
        table_listas.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        table_listas.getTableHeader().setFont(new java.awt.Font("Litera-Serial", Font.BOLD, 15));
        table_listas.getTableHeader().setBackground(new Color(255, 152, 204));
        table_listas.getTableHeader().setForeground(Color.WHITE);
        table_asignados.getTableHeader().setFont(new java.awt.Font("Litera-Serial", 0, 14));
        table_asignados.getTableHeader().setBackground(new Color(255, 152, 204));
        table_asignados.getTableHeader().setForeground(Color.WHITE);
        panel_asignados.setVisible(false);
        panel_listasTarea.setVisible(false);
        panel_completados.setVisible(false);
        panel_importante.setVisible(false);
        panel_listaName.setVisible(false);
        table_listaTareas.setSurrendersFocusOnKeystroke(true);
        panel_tituloNotas.setVisible(true);
        label_myDayMouseClicked(new java.awt.event.MouseEvent(this, 1, 1, 1, 1, 1, 1, false));
        int ver = 0;
        for (ListaTarea listaTarea : listaTareas) {
            if ("myDay".equals(listaTarea.getNombreLista()) && listaTarea.getIdCuenta() == cuentas.get(this.indexCuenta).getId()) {
                ver = 1;
            }
        }

        if (ver == 0) {

            AgregarDayAsignados(cuentas.get(this.indexCuenta).getId(), "myDay", 1);
            AgregarDayAsignados(cuentas.get(this.indexCuenta).getId(), "Asignados", 2);
            TraerListaTareas();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPopupMenu();
        ElimTarea = new javax.swing.JMenuItem();
        ElimLista = new javax.swing.JMenuItem();
        AgregarLista = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        asignarTareas = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        header_iniciar = new javax.swing.JPanel();
        panel_exit_iniciar = new javax.swing.JPanel();
        label_exit_inciar = new javax.swing.JLabel();
        dateChooserAsignar = new com.toedter.calendar.JDateChooser();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        bg_myToDo = new javax.swing.JPanel();
        header_menu = new javax.swing.JPanel();
        panel_minimize_myToDo = new javax.swing.JPanel();
        label_minimize_myDrive = new javax.swing.JLabel();
        panel_exit_myToDo = new javax.swing.JPanel();
        label_exit_myDrive = new javax.swing.JLabel();
        panel_eventos = new javax.swing.JPanel();
        panel_myDay = new javax.swing.JPanel();
        label_myDay = new javax.swing.JLabel();
        panel_important = new javax.swing.JPanel();
        label_importante = new javax.swing.JLabel();
        panel_tareasAsignadas = new javax.swing.JPanel();
        label_tareasAsignadas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_tareasRealizadas = new javax.swing.JPanel();
        label_tareasRealizadas = new javax.swing.JLabel();
        panel_listasTareas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        myDay_Title = new javax.swing.JLabel();
        panel_crearLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_listaTareas = new javax.swing.JTable();
        panel_asignarTarea = new javax.swing.JPanel();
        label_listasTareas1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel_tareasDay = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_myDay = new javax.swing.JTable();
        panel_importante = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_importante = new javax.swing.JTable();
        panel_completados = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_completados = new javax.swing.JTable();
        panel_listasTarea = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_listas = new javax.swing.JTable();
        panel_asignados = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_asignados = new javax.swing.JTable();
        panel_addNotas = new javax.swing.JPanel();
        notas = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        AgregarTarea = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_tituloNotas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_listaName = new javax.swing.JPanel();
        label_listaName = new javax.swing.JLabel();
        panel_titulo = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();

        ElimTarea.setText("Eliminar Tarea");
        ElimTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimTareaActionPerformed(evt);
            }
        });
        menu.add(ElimTarea);

        ElimLista.setText("Eliminar Lista");
        ElimLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimListaActionPerformed(evt);
            }
        });
        menu.add(ElimLista);

        AgregarLista.setText("Agregar Tarea a Lista");
        AgregarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarListaActionPerformed(evt);
            }
        });
        menu.add(AgregarLista);

        jPanel3.setBackground(new java.awt.Color(252, 255, 219));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(153, 102, 255));
        jComboBox1.setFont(new java.awt.Font("Litera-Serial", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));

        jPanel4.setBackground(new java.awt.Color(153, 0, 153));

        jLabel6.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Elija la Lista de Tareas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        jPanel5.setBackground(new java.awt.Color(153, 0, 153));

        jLabel7.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Agregar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 40));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        asignarTareas.setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(252, 255, 219));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 0, 153));

        jLabel9.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Asignar Tareas");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, 40));

        jPanel7.setBackground(new java.awt.Color(153, 0, 153));

        jLabel10.setFont(new java.awt.Font("Litera-Serial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Asignar");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 140, 40));

        jPanel10.setBackground(new java.awt.Color(172, 112, 168));

        jTextField3.setBackground(new java.awt.Color(172, 112, 168));
        jTextField3.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Ingrese Nombre de Tarea");
        jTextField3.setBorder(null);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField3MousePressed(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 220, 30));

        jPanel11.setBackground(new java.awt.Color(172, 112, 168));

        jLabel11.setBackground(new java.awt.Color(172, 112, 168));
        jLabel11.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Agregar Fecha");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 220, 30));

        header_iniciar.setBackground(new java.awt.Color(122, 68, 149));
        header_iniciar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header_iniciarMouseDragged(evt);
            }
        });
        header_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header_iniciarMousePressed(evt);
            }
        });

        panel_exit_iniciar.setBackground(new java.awt.Color(122, 68, 149));

        label_exit_inciar.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_exit_inciar.setForeground(new java.awt.Color(255, 255, 255));
        label_exit_inciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_exit_inciar.setText("🗙");
        label_exit_inciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_exit_inciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_exit_inciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_exit_inciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_exit_iniciarLayout = new javax.swing.GroupLayout(panel_exit_iniciar);
        panel_exit_iniciar.setLayout(panel_exit_iniciarLayout);
        panel_exit_iniciarLayout.setHorizontalGroup(
            panel_exit_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit_iniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_exit_inciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_exit_iniciarLayout.setVerticalGroup(
            panel_exit_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_exit_inciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout header_iniciarLayout = new javax.swing.GroupLayout(header_iniciar);
        header_iniciar.setLayout(header_iniciarLayout);
        header_iniciarLayout.setHorizontalGroup(
            header_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_iniciarLayout.createSequentialGroup()
                .addGap(0, 370, Short.MAX_VALUE)
                .addComponent(panel_exit_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header_iniciarLayout.setVerticalGroup(
            header_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_iniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_exit_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(header_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        dateChooserAsignar.setBackground(new java.awt.Color(204, 102, 255));
        dateChooserAsignar.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(dateChooserAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, -1));

        jPanel12.setBackground(new java.awt.Color(172, 112, 168));

        jLabel12.setBackground(new java.awt.Color(172, 112, 168));
        jLabel12.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Enviar a:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(153, 102, 255));
        jComboBox2.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 220, 30));

        javax.swing.GroupLayout asignarTareasLayout = new javax.swing.GroupLayout(asignarTareas.getContentPane());
        asignarTareas.getContentPane().setLayout(asignarTareasLayout);
        asignarTareasLayout.setHorizontalGroup(
            asignarTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignarTareasLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        asignarTareasLayout.setVerticalGroup(
            asignarTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignarTareasLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg_myToDo.setBackground(new java.awt.Color(252, 255, 219));
        bg_myToDo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header_menu.setBackground(new java.awt.Color(122, 68, 149));
        header_menu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header_menuMouseDragged(evt);
            }
        });
        header_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header_menuMousePressed(evt);
            }
        });

        panel_minimize_myToDo.setBackground(new java.awt.Color(122, 68, 149));

        label_minimize_myDrive.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_minimize_myDrive.setForeground(new java.awt.Color(255, 255, 255));
        label_minimize_myDrive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_minimize_myDrive.setText("🗕");
        label_minimize_myDrive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_minimize_myDriveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_minimize_myDriveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_minimize_myDriveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_minimize_myToDoLayout = new javax.swing.GroupLayout(panel_minimize_myToDo);
        panel_minimize_myToDo.setLayout(panel_minimize_myToDoLayout);
        panel_minimize_myToDoLayout.setHorizontalGroup(
            panel_minimize_myToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_minimize_myToDoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_minimize_myDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_minimize_myToDoLayout.setVerticalGroup(
            panel_minimize_myToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_minimize_myToDoLayout.createSequentialGroup()
                .addComponent(label_minimize_myDrive)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_exit_myToDo.setBackground(new java.awt.Color(122, 68, 149));

        label_exit_myDrive.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        label_exit_myDrive.setForeground(new java.awt.Color(255, 255, 255));
        label_exit_myDrive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_exit_myDrive.setText("🗙");
        label_exit_myDrive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_exit_myDriveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_exit_myDriveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_exit_myDriveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_exit_myToDoLayout = new javax.swing.GroupLayout(panel_exit_myToDo);
        panel_exit_myToDo.setLayout(panel_exit_myToDoLayout);
        panel_exit_myToDoLayout.setHorizontalGroup(
            panel_exit_myToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit_myToDoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_exit_myDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_exit_myToDoLayout.setVerticalGroup(
            panel_exit_myToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit_myToDoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_exit_myDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout header_menuLayout = new javax.swing.GroupLayout(header_menu);
        header_menu.setLayout(header_menuLayout);
        header_menuLayout.setHorizontalGroup(
            header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_menuLayout.createSequentialGroup()
                .addContainerGap(934, Short.MAX_VALUE)
                .addComponent(panel_minimize_myToDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_exit_myToDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header_menuLayout.setVerticalGroup(
            header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_menuLayout.createSequentialGroup()
                .addGroup(header_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_minimize_myToDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(header_menuLayout.createSequentialGroup()
                        .addComponent(panel_exit_myToDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        bg_myToDo.add(header_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        panel_eventos.setBackground(new java.awt.Color(172, 112, 168));

        panel_myDay.setBackground(new java.awt.Color(153, 0, 153));
        panel_myDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_myDayMouseClicked(evt);
            }
        });

        label_myDay.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        label_myDay.setForeground(new java.awt.Color(255, 255, 255));
        label_myDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_myDay.setText("My Day");
        label_myDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_myDayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_myDayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_myDayMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_myDayLayout = new javax.swing.GroupLayout(panel_myDay);
        panel_myDay.setLayout(panel_myDayLayout);
        panel_myDayLayout.setHorizontalGroup(
            panel_myDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_myDayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_myDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_myDayLayout.setVerticalGroup(
            panel_myDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_myDay, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_important.setBackground(new java.awt.Color(153, 0, 153));

        label_importante.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        label_importante.setForeground(new java.awt.Color(255, 255, 255));
        label_importante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_importante.setText("Importante");
        label_importante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_importanteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_importanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_importanteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_importantLayout = new javax.swing.GroupLayout(panel_important);
        panel_important.setLayout(panel_importantLayout);
        panel_importantLayout.setHorizontalGroup(
            panel_importantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_importantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_importante, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_importantLayout.setVerticalGroup(
            panel_importantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_importante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_tareasAsignadas.setBackground(new java.awt.Color(153, 0, 153));

        label_tareasAsignadas.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        label_tareasAsignadas.setForeground(new java.awt.Color(255, 255, 255));
        label_tareasAsignadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tareasAsignadas.setText("Tareas Asignadas");
        label_tareasAsignadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_tareasAsignadasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_tareasAsignadasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_tareasAsignadasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_tareasAsignadasLayout = new javax.swing.GroupLayout(panel_tareasAsignadas);
        panel_tareasAsignadas.setLayout(panel_tareasAsignadasLayout);
        panel_tareasAsignadasLayout.setHorizontalGroup(
            panel_tareasAsignadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tareasAsignadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_tareasAsignadas, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tareasAsignadasLayout.setVerticalGroup(
            panel_tareasAsignadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_tareasAsignadas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jSeparator1.setBackground(new java.awt.Color(102, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 0, 102));

        panel_tareasRealizadas.setBackground(new java.awt.Color(153, 0, 153));

        label_tareasRealizadas.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        label_tareasRealizadas.setForeground(new java.awt.Color(255, 255, 255));
        label_tareasRealizadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tareasRealizadas.setText("Tareas Realizadas");
        label_tareasRealizadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_tareasRealizadasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_tareasRealizadasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_tareasRealizadasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_tareasRealizadasLayout = new javax.swing.GroupLayout(panel_tareasRealizadas);
        panel_tareasRealizadas.setLayout(panel_tareasRealizadasLayout);
        panel_tareasRealizadasLayout.setHorizontalGroup(
            panel_tareasRealizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tareasRealizadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_tareasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tareasRealizadasLayout.setVerticalGroup(
            panel_tareasRealizadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_tareasRealizadas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_listasTareas.setBackground(new java.awt.Color(153, 0, 153));
        panel_listasTareas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("+");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        panel_listasTareas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 33));

        jTextField2.setBackground(new java.awt.Color(153, 0, 153));
        jTextField2.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Agregar Lista");
        jTextField2.setBorder(null);
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2MousePressed(evt);
            }
        });
        panel_listasTareas.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, 30));

        myDay_Title.setFont(new java.awt.Font("Litera-Serial", 0, 36)); // NOI18N
        myDay_Title.setForeground(new java.awt.Color(255, 255, 255));
        myDay_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myDay_Title.setText("myDay");

        panel_crearLista.setBackground(new java.awt.Color(153, 0, 153));

        table_listaTareas.setBackground(new java.awt.Color(204, 51, 255));
        table_listaTareas.setFont(new java.awt.Font("Litera-Serial", 0, 12)); // NOI18N
        table_listaTareas.setForeground(new java.awt.Color(255, 255, 255));
        table_listaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_listaTareas.setFocusable(false);
        table_listaTareas.setGridColor(new java.awt.Color(204, 153, 255));
        table_listaTareas.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_listaTareas.setRowHeight(25);
        table_listaTareas.setSelectionBackground(new java.awt.Color(255, 153, 255));
        table_listaTareas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table_listaTareas.setShowHorizontalLines(false);
        table_listaTareas.setShowVerticalLines(false);
        table_listaTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_listaTareasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_listaTareas);
        if (table_listaTareas.getColumnModel().getColumnCount() > 0) {
            table_listaTareas.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout panel_crearListaLayout = new javax.swing.GroupLayout(panel_crearLista);
        panel_crearLista.setLayout(panel_crearListaLayout);
        panel_crearListaLayout.setHorizontalGroup(
            panel_crearListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_crearListaLayout.setVerticalGroup(
            panel_crearListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_asignarTarea.setBackground(new java.awt.Color(153, 0, 153));
        panel_asignarTarea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_listasTareas1.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        label_listasTareas1.setForeground(new java.awt.Color(255, 255, 255));
        label_listasTareas1.setText("Asignar Tarea");
        label_listasTareas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_listasTareas1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_listasTareas1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_listasTareas1MouseExited(evt);
            }
        });
        panel_asignarTarea.add(label_listasTareas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("+");
        panel_asignarTarea.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        javax.swing.GroupLayout panel_eventosLayout = new javax.swing.GroupLayout(panel_eventos);
        panel_eventos.setLayout(panel_eventosLayout);
        panel_eventosLayout.setHorizontalGroup(
            panel_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_myDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_important, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_tareasAsignadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_tareasRealizadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_listasTareas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_eventosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(myDay_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_crearLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_asignarTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_eventosLayout.setVerticalGroup(
            panel_eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eventosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(myDay_Title)
                .addGap(18, 18, 18)
                .addComponent(panel_myDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_important, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_tareasAsignadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_tareasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_asignarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_listasTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_crearLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg_myToDo.add(panel_eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 540));

        panel_tareasDay.setBackground(new java.awt.Color(172, 112, 168));

        jScrollPane2.setBorder(null);

        table_myDay.setBackground(new java.awt.Color(255, 153, 255));
        table_myDay.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        table_myDay.setForeground(new java.awt.Color(255, 255, 255));
        table_myDay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Importante", "Tarea", "Fecha Limite", "Completado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_myDay.setGridColor(new java.awt.Color(102, 0, 102));
        table_myDay.setOpaque(false);
        table_myDay.setRowHeight(25);
        table_myDay.setSelectionBackground(new java.awt.Color(204, 51, 255));
        table_myDay.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table_myDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_myDayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                table_myDayMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(table_myDay);

        javax.swing.GroupLayout panel_tareasDayLayout = new javax.swing.GroupLayout(panel_tareasDay);
        panel_tareasDay.setLayout(panel_tareasDayLayout);
        panel_tareasDayLayout.setHorizontalGroup(
            panel_tareasDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tareasDayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_tareasDayLayout.setVerticalGroup(
            panel_tareasDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tareasDayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg_myToDo.add(panel_tareasDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 570, 420));

        panel_importante.setBackground(new java.awt.Color(172, 112, 168));

        jScrollPane3.setBorder(null);

        table_importante.setBackground(new java.awt.Color(255, 153, 255));
        table_importante.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        table_importante.setForeground(new java.awt.Color(255, 255, 255));
        table_importante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarea", "Fecha Limite", "Completado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_importante.setGridColor(new java.awt.Color(102, 0, 102));
        table_importante.setOpaque(false);
        table_importante.setRowHeight(25);
        table_importante.setSelectionBackground(new java.awt.Color(204, 51, 255));
        table_importante.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table_importante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_importanteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_importante);

        javax.swing.GroupLayout panel_importanteLayout = new javax.swing.GroupLayout(panel_importante);
        panel_importante.setLayout(panel_importanteLayout);
        panel_importanteLayout.setHorizontalGroup(
            panel_importanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_importanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_importanteLayout.setVerticalGroup(
            panel_importanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_importanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg_myToDo.add(panel_importante, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 570, 420));

        panel_completados.setBackground(new java.awt.Color(204, 102, 255));

        jScrollPane4.setBorder(null);

        table_completados.setBackground(new java.awt.Color(255, 153, 255));
        table_completados.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        table_completados.setForeground(new java.awt.Color(255, 255, 255));
        table_completados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarea", "Fecha Limite"
            }
        ));
        table_completados.setGridColor(new java.awt.Color(102, 0, 102));
        table_completados.setRowHeight(25);
        table_completados.setSelectionBackground(new java.awt.Color(204, 51, 255));
        table_completados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_completadosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_completados);
        if (table_completados.getColumnModel().getColumnCount() > 0) {
            table_completados.getColumnModel().getColumn(0).setResizable(false);
            table_completados.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout panel_completadosLayout = new javax.swing.GroupLayout(panel_completados);
        panel_completados.setLayout(panel_completadosLayout);
        panel_completadosLayout.setHorizontalGroup(
            panel_completadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_completadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_completadosLayout.setVerticalGroup(
            panel_completadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_completadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg_myToDo.add(panel_completados, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 570, 420));

        panel_listasTarea.setBackground(new java.awt.Color(204, 102, 255));

        jScrollPane5.setBorder(null);

        table_listas.setBackground(new java.awt.Color(255, 153, 255));
        table_listas.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        table_listas.setForeground(new java.awt.Color(255, 255, 255));
        table_listas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Importante", "Tarea", "Fecha Limite", "Completado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_listas.setGridColor(new java.awt.Color(102, 0, 102));
        table_listas.setRowHeight(25);
        table_listas.setSelectionBackground(new java.awt.Color(204, 51, 255));
        table_listas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_listasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_listas);
        if (table_listas.getColumnModel().getColumnCount() > 0) {
            table_listas.getColumnModel().getColumn(1).setResizable(false);
            table_listas.getColumnModel().getColumn(2).setResizable(false);
            table_listas.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panel_listasTareaLayout = new javax.swing.GroupLayout(panel_listasTarea);
        panel_listasTarea.setLayout(panel_listasTareaLayout);
        panel_listasTareaLayout.setHorizontalGroup(
            panel_listasTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_listasTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_listasTareaLayout.setVerticalGroup(
            panel_listasTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_listasTareaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg_myToDo.add(panel_listasTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 570, 420));

        panel_asignados.setBackground(new java.awt.Color(204, 102, 255));

        jScrollPane6.setBorder(null);

        table_asignados.setBackground(new java.awt.Color(255, 153, 255));
        table_asignados.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        table_asignados.setForeground(new java.awt.Color(255, 255, 255));
        table_asignados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Importante", "Tarea", "Fecha Limite", "Completado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_asignados.setGridColor(new java.awt.Color(102, 0, 102));
        table_asignados.setRowHeight(25);
        table_asignados.setSelectionBackground(new java.awt.Color(204, 51, 255));
        table_asignados.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table_asignados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_asignadosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(table_asignados);
        if (table_asignados.getColumnModel().getColumnCount() > 0) {
            table_asignados.getColumnModel().getColumn(0).setResizable(false);
            table_asignados.getColumnModel().getColumn(1).setResizable(false);
            table_asignados.getColumnModel().getColumn(2).setResizable(false);
            table_asignados.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panel_asignadosLayout = new javax.swing.GroupLayout(panel_asignados);
        panel_asignados.setLayout(panel_asignadosLayout);
        panel_asignadosLayout.setHorizontalGroup(
            panel_asignadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_asignadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_asignadosLayout.setVerticalGroup(
            panel_asignadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_asignadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg_myToDo.add(panel_asignados, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 570, 420));

        panel_addNotas.setBackground(new java.awt.Color(172, 112, 168));
        panel_addNotas.setForeground(new java.awt.Color(204, 102, 255));

        notas.setBackground(new java.awt.Color(153, 153, 255));
        notas.setColumns(20);
        notas.setFont(new java.awt.Font("Litera-Serial", 0, 14)); // NOI18N
        notas.setForeground(new java.awt.Color(255, 255, 255));
        notas.setLineWrap(true);
        notas.setRows(5);
        notas.setWrapStyleWord(true);
        notas.setBorder(null);
        notas.setCaretColor(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(153, 0, 153));

        jLabel3.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agregar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_addNotasLayout = new javax.swing.GroupLayout(panel_addNotas);
        panel_addNotas.setLayout(panel_addNotasLayout);
        panel_addNotasLayout.setHorizontalGroup(
            panel_addNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_addNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_addNotasLayout.createSequentialGroup()
                        .addComponent(notas, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_addNotasLayout.setVerticalGroup(
            panel_addNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg_myToDo.add(panel_addNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 190, 230));

        dateChooser.setBackground(new java.awt.Color(204, 102, 255));
        dateChooser.setForeground(new java.awt.Color(255, 255, 255));
        bg_myToDo.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 190, -1));

        AgregarTarea.setBackground(new java.awt.Color(172, 112, 168));

        jTextField1.setBackground(new java.awt.Color(172, 112, 168));
        jTextField1.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Agregar Tarea");
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("+");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout AgregarTareaLayout = new javax.swing.GroupLayout(AgregarTarea);
        AgregarTarea.setLayout(AgregarTareaLayout);
        AgregarTareaLayout.setHorizontalGroup(
            AgregarTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarTareaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        AgregarTareaLayout.setVerticalGroup(
            AgregarTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        bg_myToDo.add(AgregarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 570, 30));

        jPanel8.setBackground(new java.awt.Color(172, 112, 168));

        jLabel2.setFont(new java.awt.Font("Litera-Serial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fecha de Vencimiento");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg_myToDo.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 190, 30));

        panel_tituloNotas.setBackground(new java.awt.Color(172, 112, 168));
        panel_tituloNotas.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Litera-Serial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Notas");

        javax.swing.GroupLayout panel_tituloNotasLayout = new javax.swing.GroupLayout(panel_tituloNotas);
        panel_tituloNotas.setLayout(panel_tituloNotasLayout);
        panel_tituloNotasLayout.setHorizontalGroup(
            panel_tituloNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tituloNotasLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(69, 69, 69))
        );
        panel_tituloNotasLayout.setVerticalGroup(
            panel_tituloNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg_myToDo.add(panel_tituloNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 190, 30));

        panel_listaName.setBackground(new java.awt.Color(153, 0, 153));

        label_listaName.setFont(new java.awt.Font("Litera-Serial", 0, 24)); // NOI18N
        label_listaName.setForeground(new java.awt.Color(255, 255, 255));
        label_listaName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_listaNameLayout = new javax.swing.GroupLayout(panel_listaName);
        panel_listaName.setLayout(panel_listaNameLayout);
        panel_listaNameLayout.setHorizontalGroup(
            panel_listaNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_listaNameLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(label_listaName, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_listaNameLayout.setVerticalGroup(
            panel_listaNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_listaName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg_myToDo.add(panel_listaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 450, 40));

        panel_titulo.setBackground(new java.awt.Color(153, 0, 153));

        label_titulo.setFont(new java.awt.Font("Litera-Serial", 0, 24)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(255, 255, 255));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_tituloLayout = new javax.swing.GroupLayout(panel_titulo);
        panel_titulo.setLayout(panel_tituloLayout);
        panel_tituloLayout.setHorizontalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panel_tituloLayout.setVerticalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg_myToDo.add(panel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 490, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_myToDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_myToDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_minimize_myDriveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_myDriveMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_label_minimize_myDriveMouseClicked

    private void label_minimize_myDriveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_myDriveMouseEntered
        panel_minimize_myToDo.setBackground(new Color(122, 96, 149));
    }//GEN-LAST:event_label_minimize_myDriveMouseEntered

    private void label_minimize_myDriveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_minimize_myDriveMouseExited
        panel_minimize_myToDo.setBackground(header_menu.getBackground());
    }//GEN-LAST:event_label_minimize_myDriveMouseExited

    private void label_exit_myDriveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_myDriveMouseClicked
        int yesno = JOptionPane.showConfirmDialog(this, "Salir y guardar cambios?", "Salir", 0);
        if (yesno == 0) {
            if ("Kevin".equals(cuentas.get(indexCuenta).getUser())) {
                setVisible(false);
                new Administrador(indexCuenta).setVisible(true);
            } else {
                setVisible(false);
                new MenuPrincipal(indexCuenta).setVisible(true);
            }
        }
    }//GEN-LAST:event_label_exit_myDriveMouseClicked

    private void label_exit_myDriveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_myDriveMouseEntered
        panel_exit_myToDo.setBackground(Color.red);
    }//GEN-LAST:event_label_exit_myDriveMouseEntered

    private void label_exit_myDriveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_myDriveMouseExited
        panel_exit_myToDo.setBackground(header_menu.getBackground());
    }//GEN-LAST:event_label_exit_myDriveMouseExited

    private void header_menuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_menuMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header_menuMouseDragged

    private void header_menuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_menuMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header_menuMousePressed

    private void label_myDayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_myDayMouseEntered
        panel_myDay.setBackground(new Color(195, 0, 195));
    }//GEN-LAST:event_label_myDayMouseEntered

    private void label_myDayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_myDayMouseExited
        panel_myDay.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_label_myDayMouseExited

    private void label_importanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_importanteMouseEntered
        panel_important.setBackground(new Color(195, 0, 195));
    }//GEN-LAST:event_label_importanteMouseEntered

    private void label_importanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_importanteMouseExited
        panel_important.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_label_importanteMouseExited

    private void label_tareasAsignadasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_tareasAsignadasMouseEntered
        panel_tareasAsignadas.setBackground(new Color(195, 0, 195));
    }//GEN-LAST:event_label_tareasAsignadasMouseEntered

    private void label_tareasAsignadasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_tareasAsignadasMouseExited
        panel_tareasAsignadas.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_label_tareasAsignadasMouseExited

    private void label_tareasRealizadasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_tareasRealizadasMouseEntered
        panel_tareasRealizadas.setBackground(new Color(195, 0, 195));
    }//GEN-LAST:event_label_tareasRealizadasMouseEntered

    private void label_tareasRealizadasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_tareasRealizadasMouseExited
        panel_tareasRealizadas.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_label_tareasRealizadasMouseExited

    private void label_listasTareas1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_listasTareas1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_label_listasTareas1MouseEntered

    private void label_listasTareas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_listasTareas1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_label_listasTareas1MouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseEntered
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jTextField1MouseEntered

    private void jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseExited
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jTextField1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel1MouseExited

    private void label_myDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_myDayMouseClicked
        notas.setText("");
        idLista = 1;
        panel_listaName.setVisible(false);
        panel_myDay.setBackground(new Color(195, 0, 195));
        panel_tareasAsignadas.setBackground(new Color(153, 0, 153));
        panel_asignarTarea.setBackground(new Color(153, 0, 153));
        panel_crearLista.setBackground(new Color(153, 0, 153));
        panel_important.setBackground(new Color(153, 0, 153));
        panel_listasTareas.setBackground(new Color(153, 0, 153));
        panel_tareasRealizadas.setBackground(new Color(153, 0, 153));
        panel_titulo.setVisible(true);
        label_titulo.setText("myDay");
        AgregarTarea.setVisible(true);
        jPanel9.setEnabled(true);
        int id = cuentas.get(indexCuenta).getId();
        DefaultTableModel myDayModel
                = new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Importante", "Tarea", "Fecha Limite", "Completado"
                        }
                ) {
            Class[] types = new Class[]{
                java.lang.Boolean.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        table_myDay.setModel(myDayModel);
        table_myDay.getTableHeader().setFont(new java.awt.Font("Litera-Serial", Font.BOLD, 15));
        table_myDay.getTableHeader().setBackground(new Color(255, 152, 204));
        table_myDay.getTableHeader().setForeground(Color.WHITE);
        table_myDay.getColumnModel().getColumn(0).setPreferredWidth(23);
        table_myDay.getColumnModel().getColumn(1).setPreferredWidth(180);
        table_myDay.getColumnModel().getColumn(2).setPreferredWidth(23);
        table_myDay.getColumnModel().getColumn(3).setPreferredWidth(23);
        table_myDay.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        panel_tareasDay.setVisible(true);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        for (Tarea tarea : tareas) {
            if (tarea.getIdCuenta() == id && !tarea.isRealizado() && tarea.getIdLista() == 1) {
                miDia.add(tarea);
                Object[] row = new Object[4];
                row[0] = tarea.isImportante();
                row[1] = tarea.getNombreTarea();
                row[2] = sd.format(tarea.getFechaRealizar());
                row[3] = tarea.isRealizado();
                myDayModel.addRow(row);
            }
        }
        table_myDay.setModel(myDayModel);
    }//GEN-LAST:event_label_myDayMouseClicked

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        if (jTextField1.getText().equals("Agregar Tarea")) {
            jTextField1.setText("");
            jTextField1.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_jTextField1MousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (!"Agregar Tarea".equals(jTextField1.getText()) || "".equals(jTextField1.getText())) {
            try {
                if (panel_listaName.isVisible()) {
                    String name = label_listaName.getText();
                    int id = 0;
                    for (ListaTarea listaTarea : listaTareas) {
                        if (listaTarea.getNombreLista().equals(name)) {
                            id = listaTarea.getIdLista();
                        }
                    }
                    int ver = 0;
                    for (Tarea tarea : tareas) {
                        if (tarea.getIdTarea() == id) {
                            if (tarea.getNombreTarea().equals(name)) {
                                ver = 1;
                            }
                        }
                    }
                    if (ver == 0) {
                        Tarea t = new Tarea();
                        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
                        t.setFechaRealizar(dateChooser.getDate());
                        t.setIdCuenta(cuentas.get(indexCuenta).getId());
                        t.setIdLista(id);
                        t.setImportante(false);
                        t.setNombreTarea(jTextField1.getText());
                        t.setRealizado(false);

                        tareas.add(t);
                        AgregarTareas(id);
                        traerTareas();
                        tableListaTareas(id);
                        jTextField1.setText("Agregar Tarea");
                        dateChooser.setDate(null);
                    } else {
                        JOptionPane.showMessageDialog(this, "La tarea ya existe, intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    int ver = 0;
                    for (Tarea tarea : miDia) {
                        if (tarea.getNombreTarea().equals(jTextField1.getText())) {
                            ver = 1;
                        }
                    }
                    if (ver == 0) {
                        int id = 0;
                        for (ListaTarea listaTarea : listaTareas) {
                            if ("myDay".equals(listaTarea.getNombreLista()) && listaTarea.getIdCuenta() == cuentas.get(indexCuenta).getId()) {
                                id = listaTarea.getIdLista();
                            }
                        }
                        Tarea t = new Tarea();
                        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
                        t.setFechaRealizar(dateChooser.getDate());
                        t.setIdCuenta(cuentas.get(indexCuenta).getId());
                        t.setIdLista(id);
                        t.setImportante(false);
                        t.setNombreTarea(jTextField1.getText());
                        t.setRealizado(false);

                        tareas.add(t);
                        AgregarTareas(1);
                        traerTareas();
                        jTextField1.setText("Agregar Tarea");
                        dateChooser.setDate(null);
                    } else {
                        JOptionPane.showMessageDialog(this, "La tarea ya existe, intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                        dateChooser.setDate(null);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al guardar tarea", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre a la tarea", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jLabel1MouseClicked

    private void label_importanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_importanteMouseClicked
        jPanel9.setEnabled(true);
        AgregarTarea.setVisible(false);
        panel_listaName.setVisible(false);
        panel_myDay.setBackground(new Color(153, 0, 153));
        panel_tareasAsignadas.setBackground(new Color(153, 0, 153));
        panel_asignarTarea.setBackground(new Color(153, 0, 153));
        panel_crearLista.setBackground(new Color(153, 0, 153));
        panel_listasTareas.setBackground(new Color(153, 0, 153));
        panel_tareasRealizadas.setBackground(new Color(153, 0, 153));
        panel_titulo.setVisible(true);
        label_titulo.setText("Importantes");
        notas.setText("");
        int id = cuentas.get(indexCuenta).getId();
        DefaultTableModel important = (DefaultTableModel) table_importante.getModel();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        important.setNumRows(0);
        for (Tarea tarea : tareas) {
            if (tarea.getIdCuenta() == id && !tarea.isRealizado() && tarea.isImportante()) {
                importantes.add(tarea);
                Object[] row = new Object[3];
                row[0] = tarea.getNombreTarea();
                row[1] = sd.format(tarea.getFechaRealizar());
                row[2] = tarea.isRealizado();
                important.addRow(row);
            }
        }
        traerTareas();
        table_importante.setModel(important);
        panel_importante.setVisible(true);
        panel_tareasDay.setVisible(false);
        panel_important.setBackground(new Color(194, 0, 195));
    }//GEN-LAST:event_label_importanteMouseClicked

    private void label_tareasAsignadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_tareasAsignadasMouseClicked
        jPanel9.setEnabled(true);
        label_titulo.setText("Asignados");
        panel_listaName.setVisible(false);
        idLista = 2;
        panel_tareasAsignadas.setBackground(new Color(195, 0, 195));
        panel_myDay.setBackground(new Color(153, 0, 153));
        panel_asignarTarea.setBackground(new Color(153, 0, 153));
        panel_crearLista.setBackground(new Color(153, 0, 153));
        panel_important.setBackground(new Color(153, 0, 153));
        panel_listasTareas.setBackground(new Color(153, 0, 153));
        panel_tareasRealizadas.setBackground(new Color(153, 0, 153));
        notas.setText("");
        panel_completados.setVisible(false);
        panel_importante.setVisible(false);
        panel_tareasDay.setVisible(false);
        panel_asignados.setVisible(true);
        
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        DefaultTableModel asignModel = (DefaultTableModel) table_asignados.getModel();
        asignModel.setNumRows(0);
        for (Tarea tarea : tareas) {
            if (tarea.getIdCuenta() == cuentas.get(indexCuenta).getId() && !tarea.isRealizado() && tarea.getIdLista() == 2) {
                miDia.add(tarea);
                Object[] row = new Object[4];
                row[0] = tarea.isImportante();
                row[1] = tarea.getNombreTarea();
                row[2] = sd.format(tarea.getFechaRealizar());
                row[3] = tarea.isRealizado();
                asignModel.addRow(row);
            }
        }
        table_asignados.setModel(asignModel);

    }//GEN-LAST:event_label_tareasAsignadasMouseClicked

    private void label_tareasRealizadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_tareasRealizadasMouseClicked
        AgregarTarea.setVisible(false);
        panel_listaName.setVisible(false);
        panel_tareasRealizadas.setBackground(new Color(195, 0, 195));
        panel_myDay.setBackground(new Color(153, 0, 153));
        panel_tareasAsignadas.setBackground(new Color(153, 0, 153));
        panel_asignarTarea.setBackground(new Color(153, 0, 153));
        panel_crearLista.setBackground(new Color(153, 0, 153));
        panel_important.setBackground(new Color(153, 0, 153));
        panel_listasTareas.setBackground(new Color(153, 0, 153));
        panel_titulo.setVisible(true);
        label_titulo.setText("Completadas");
        notas.setText("");
        int id = cuentas.get(indexCuenta).getId();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        panel_completados.setVisible(true);
        panel_importante.setVisible(false);
        panel_tareasDay.setVisible(false);
        DefaultTableModel completado = (DefaultTableModel) table_completados.getModel();
        completado.setNumRows(0);
        for (Tarea tarea : tareas) {
            if (tarea.getIdCuenta() == id && tarea.isRealizado()) {
                completados.add(tarea);
                Object[] row = new Object[3];
                row[0] = tarea.getNombreTarea();
                row[1] = sd.format(tarea.getFechaRealizar());
                completado.addRow(row);
            }
        }
        table_completados.setModel(completado);
        jPanel9.setEnabled(false);
    }//GEN-LAST:event_label_tareasRealizadasMouseClicked

    private void label_listasTareas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_listasTareas1MouseClicked
        notas.setText("");
        panel_listaName.setVisible(false);
        panel_asignarTarea.setBackground(new Color(195, 0, 195));
        panel_myDay.setBackground(new Color(153, 0, 153));
        panel_tareasAsignadas.setBackground(new Color(153, 0, 153));
        panel_crearLista.setBackground(new Color(153, 0, 153));
        panel_important.setBackground(new Color(153, 0, 153));
        panel_listasTareas.setBackground(new Color(153, 0, 153));
        panel_tareasRealizadas.setBackground(new Color(153, 0, 153));
        DefaultComboBoxModel modelAsignar = (DefaultComboBoxModel) jComboBox2.getModel();
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getId() != cuentas.get(indexCuenta).getId()) {
                modelAsignar.addElement(cuenta);
            }
        }
        jComboBox2.setModel(modelAsignar);
        asignarTareas.pack();
        asignarTareas.setLocationRelativeTo(this);
        asignarTareas.setModal(true);
        asignarTareas.setVisible(true);
    }//GEN-LAST:event_label_listasTareas1MouseClicked

    private void table_myDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_myDayMouseClicked
        if (evt.isMetaDown()) {
            if (table_myDay.getSelectedRow() > -1) {
                menu.show(evt.getComponent(), evt.getX(), evt.getY());
                AgregarLista.setEnabled(true);
                ElimTarea.setEnabled(true);
                ElimLista.setEnabled(false);
            }
        } else {
            int i = table_myDay.getSelectedRow();
            String nombre = table_myDay.getValueAt(i, 1).toString();
            DefaultTableModel m = (DefaultTableModel) table_myDay.getModel();
            if ((Boolean) table_myDay.getValueAt(table_myDay.getSelectedRow(), 0) == true) {
                for (Tarea tarea : tareas) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setImportante(true);
                        ponerTareaImportante(tarea.getIdTarea());
                        traerTareas();
                    }
                }
                for (Tarea tarea : miDia) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setImportante(true);
                    }
                }
            } else if ((Boolean) table_myDay.getValueAt(table_myDay.getSelectedRow(), 0) == false) {
                for (Tarea tarea : tareas) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setImportante(false);
                        ponerTareaNoImportante(tarea.getIdTarea());
                        traerTareas();
                    }
                }
                for (Tarea tarea : miDia) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setImportante(false);
                    }
                }
            }

            if ((Boolean) table_myDay.getValueAt(table_myDay.getSelectedRow(), 3) == true && ((Boolean) table_myDay.getValueAt(table_myDay.getSelectedRow(), 0) == false || (Boolean) table_myDay.getValueAt(table_myDay.getSelectedRow(), 0) == true)) {
                m.removeRow(table_myDay.getSelectedRow());
                for (Tarea tarea : tareas) {
                    if (tarea.getNombreTarea().equals(nombre) && tarea.getIdCuenta() == cuentas.get(indexCuenta).getId()) {
                        tarea.setRealizado(true);
                        ponerTareaCompletado(tarea.getIdTarea());
                        traerTareas();
                    }
                }
                for (Tarea tarea : miDia) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setRealizado(true);
                    }
                }
                table_myDay.setModel(m);
            }
        }
        showNotasMyDay();
    }//GEN-LAST:event_table_myDayMouseClicked

    private void table_importanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_importanteMouseClicked
        if (evt.isMetaDown()) {
            if (table_importante.getSelectedRow() > -1) {
                menu.show(evt.getComponent(), evt.getX(), evt.getY());
                AgregarLista.setEnabled(true);
                ElimTarea.setEnabled(true);
                ElimLista.setEnabled(false);
            }
        } else {
            int i = table_importante.getSelectedRow();
            String nombre = table_importante.getValueAt(i, 0).toString();
            DefaultTableModel m = (DefaultTableModel) table_importante.getModel();
            if ((Boolean) table_importante.getValueAt(table_importante.getSelectedRow(), 2) == true) {
                m.removeRow(table_importante.getSelectedRow());
                for (Tarea tarea : tareas) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setRealizado(true);
                        ponerTareaCompletado(tarea.getIdTarea());
                    }
                }
                for (Tarea tarea : importantes) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setRealizado(true);
                        tarea.setImportante(false);
                    }
                }
            }
        }
        showNotasImportante();
    }//GEN-LAST:event_table_importanteMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        if (!"Agregar Lista".equals(jTextField2.getText())) {
            ListaTarea l = new ListaTarea();

            int index = 0;
            int cent = 0;
            int ver = 0;
            for (ListaTarea listaTarea : listaTareas) {
                if (listaTarea.getNombreLista().equals(jTextField2.getText())) {
                    ver = 1;
                }
            }
            if (ver == 0) {
                while (cent == 0) {
                    cent = 1;
                    index++;
                    for (ListaTarea lista : listaTareas) {
                        if (index == lista.getIdLista()) {
                            cent = 0;
                        }
                    }
                }
                l.setIdCuenta(cuentas.get(indexCuenta).getId());
                l.setIdLista(index);
                l.setNombreLista(jTextField2.getText());

                listaTareas.add(l);

                AgregarListaTareas(index);
                tableListas();
            } else {
                JOptionPane.showMessageDialog(this, "El nombre de la lista ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre a la lista", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jTextField2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MousePressed
        if (jTextField2.getText().equals("Agregar Lista")) {
            jTextField2.setText("");
            jTextField2.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_jTextField2MousePressed

    private void table_listaTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_listaTareasMouseClicked
        if (evt.isMetaDown()) {
            if (table_listaTareas.getSelectedRow() > -1) {
                menu.show(evt.getComponent(), evt.getX(), evt.getY());
                AgregarLista.setEnabled(false);
                ElimTarea.setEnabled(false);
                ElimLista.setEnabled(true);
            }
        } else {
            panel_titulo.setVisible(false);
            AgregarTarea.setVisible(true);
            String name = table_listaTareas.getValueAt(table_listaTareas.getSelectedRow(), 0).toString();

            panel_listaName.setVisible(true);
            label_listaName.setText(name);
            panel_listasTarea.setVisible(true);
            panel_completados.setVisible(false);
            panel_importante.setVisible(false);
            panel_tareasDay.setVisible(false);

            int id = 0;
            for (ListaTarea listaTarea : listaTareas) {
                if (listaTarea.getNombreLista().equals(name) && listaTarea.getIdCuenta() == cuentas.get(indexCuenta).getId()) {
                    id = listaTarea.getIdLista();
                }
            }
            SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
            DefaultTableModel m = (DefaultTableModel) table_listas.getModel();
            m.setNumRows(0);
            for (Tarea tarea : tareas) {
                if (tarea.getIdLista() == id && tarea.getIdCuenta() == cuentas.get(indexCuenta).getId() && !tarea.isRealizado()) {
                    Object[] row = new Object[4];
                    row[0] = tarea.isImportante();
                    row[1] = tarea.getNombreTarea();
                    row[2] = sd.format(tarea.getFechaRealizar());
                    row[3] = tarea.isRealizado();
                    m.addRow(row);
                }
            }
            table_listas.setModel(m);
        }
        notas.setText("");
    }//GEN-LAST:event_table_listaTareasMouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        notas.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void ElimTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimTareaActionPerformed
        int i = -10;
        DefaultTableModel m = null;
        String name = "";
        JTable t = null;
        if (!table_myDay.getSelectionModel().isSelectionEmpty()) {
            i = table_myDay.getSelectedRow();
            m = (DefaultTableModel) table_myDay.getModel();
            name = table_myDay.getValueAt(i, 1).toString();
            t = table_myDay;
        } else if (!table_importante.getSelectionModel().isSelectionEmpty()) {
            i = table_importante.getSelectedRow();
            m = (DefaultTableModel) table_importante.getModel();
            name = table_importante.getValueAt(i, 0).toString();
            t = table_importante;
        } else if (!table_completados.getSelectionModel().isSelectionEmpty()) {
            i = table_completados.getSelectedRow();
            m = (DefaultTableModel) table_completados.getModel();
            name = table_completados.getValueAt(i, 0).toString();
            t = table_completados;
        } else if (!table_listas.getSelectionModel().isSelectionEmpty()) {
            i = table_listas.getSelectedRow();
            m = (DefaultTableModel) table_listas.getModel();
            name = table_listas.getValueAt(i, 1).toString();
            t = table_listas;
        } else {
            JOptionPane.showMessageDialog(this, "No hay lista seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (i != -10 && m != null && !"".equals(name) && t != null) {
            int idTarea = 0;
            for (Tarea tarea : tareas) {
                if (tarea.getNombreTarea().equals(name) && tarea.getIdCuenta() == cuentas.get(indexCuenta).getId()) {
                    idTarea = tarea.getIdTarea();
                    System.out.println(tarea);
                }
            }
            ElimTarea(idTarea);
            m.removeRow(i);

            table_listas.setVisible(true);
            panel_listaName.setVisible(true);
            traerTareas();
        } else {
            JOptionPane.showMessageDialog(this, "No hay tarea seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ElimTareaActionPerformed

    private void ElimListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimListaActionPerformed
        if (!table_listaTareas.getSelectionModel().isSelectionEmpty()) {
            int i = table_listaTareas.getSelectedRow();
            DefaultTableModel m = (DefaultTableModel) table_listaTareas.getModel();
            String name = table_listaTareas.getValueAt(i, 0).toString();
            int indexLista = 0;
            for (ListaTarea listaTarea : listaTareas) {
                if (listaTarea.getNombreLista().equals(name) && listaTarea.getIdCuenta() == cuentas.get(indexCuenta).getId()) {
                    indexLista = listaTarea.getIdLista();
                }
            }
            ElimLista(indexLista);
            m.removeRow(i);
            table_listaTareas.setModel(m);

            table_listas.setVisible(false);
            panel_listaName.setVisible(false);
            label_myDayMouseClicked(new java.awt.event.MouseEvent(this, 1, 1, 1, 1, 1, 1, false));
        } else {
            JOptionPane.showMessageDialog(this, "No hay lista seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ElimListaActionPerformed

    private void table_listasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_listasMouseClicked
        if (evt.isMetaDown()) {
            if (table_listas.getSelectedRow() > -1) {
                menu.show(evt.getComponent(), evt.getX(), evt.getY());
                AgregarLista.setEnabled(true);
                ElimTarea.setEnabled(true);
                ElimLista.setEnabled(false);
            }
        } else {
            int i = table_listas.getSelectedRow();
            String nombre = table_listas.getValueAt(i, 1).toString();
            DefaultTableModel m = (DefaultTableModel) table_listas.getModel();
            if ((Boolean) table_listas.getValueAt(table_listas.getSelectedRow(), 0) == true) {
                //m.removeRow(table_myDay.getSelectedRow());
                for (Tarea tarea : tareas) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setImportante(true);
                        ponerTareaImportante(tarea.getIdTarea());
                        traerTareas();
                    }
                }
                for (Tarea tarea : miDia) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setImportante(true);
                    }
                }

            } else if ((Boolean) table_listas.getValueAt(table_listas.getSelectedRow(), 0) == false) {
                for (Tarea tarea : tareas) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setImportante(false);
                        ponerTareaNoImportante(tarea.getIdTarea());
                        traerTareas();
                    }
                }
                for (Tarea tarea : miDia) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setImportante(false);
                    }
                }
            }

            if ((Boolean) table_listas.getValueAt(table_listas.getSelectedRow(), 3) == true && ((Boolean) table_listas.getValueAt(table_listas.getSelectedRow(), 0) == false || (Boolean) table_listas.getValueAt(table_listas.getSelectedRow(), 0) == true)) {
                m.removeRow(table_listas.getSelectedRow());
                for (Tarea tarea : tareas) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setRealizado(true);
                        ponerTareaCompletado(tarea.getIdTarea());
                        traerTareas();
                    }
                }
                for (Tarea tarea : miDia) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setRealizado(true);
                    }
                }
            }
        }
        showNotasListas();
        jPanel9.setEnabled(true);

    }//GEN-LAST:event_table_listasMouseClicked

    private void table_completadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_completadosMouseClicked
        if (evt.isMetaDown()) {
            if (table_completados.getSelectedRow() > -1) {
                menu.show(evt.getComponent(), evt.getX(), evt.getY());
                AgregarLista.setEnabled(false);
                ElimTarea.setEnabled(true);
                ElimLista.setEnabled(false);
            }
        }
        showNotasCompletados();
    }//GEN-LAST:event_table_completadosMouseClicked

    private void AgregarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarListaActionPerformed
        String nombreTarea = "";
        DefaultTableModel t = null;
        this.t = null;
        int ver = 0;
        int row = 0;
        if (!table_myDay.getSelectionModel().isSelectionEmpty()) {
            nombreTarea = table_myDay.getValueAt(table_myDay.getSelectedRow(), 1).toString();
            t = (DefaultTableModel) table_myDay.getModel();
            row = table_myDay.getSelectedRow();
        } else if (!table_importante.getSelectionModel().isSelectionEmpty()) {
            nombreTarea = table_importante.getValueAt(table_importante.getSelectedRow(), 0).toString();
            t = (DefaultTableModel) table_importante.getModel();
            row = table_importante.getSelectedRow();
        } else if (!table_listas.getSelectionModel().isSelectionEmpty()) {
            nombreTarea = table_listas.getValueAt(table_listas.getSelectedRow(), 1).toString();
            t = (DefaultTableModel) table_listas.getModel();
            row = table_listas.getSelectedRow();
        } else {
            ver = 1;
        }
        if (ver == 0 && t != null) {
            this.t = t;
            this.row = row;
            int idTarea = 0;
            for (Tarea tarea : tareas) {
                if (tarea.getNombreTarea().equals(nombreTarea) && tarea.getIdCuenta() == cuentas.get(indexCuenta).getId()) {
                    idTarea = tarea.getIdTarea();
                }
            }
            if (idTarea != 0) {
                this.idTarea = idTarea;
                TraerListaTareas();
                DefaultComboBoxModel m = (DefaultComboBoxModel) jComboBox1.getModel();
                m.removeAllElements();
                for (ListaTarea listaTarea : listaTareas) {
                    if (listaTarea.getIdCuenta() == cuentas.get(indexCuenta).getId()) {
                        m.addElement(listaTarea.getNombreLista());
                        System.out.println(listaTarea.getNombreLista());
                    }
                }
                jComboBox1.setModel(m);
                jDialog1.pack();
                jDialog1.setLocationRelativeTo(this);
                jDialog1.setModal(true);
                jDialog1.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Error al Encontrar Tarea", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay tarea Seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregarListaActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (jComboBox1.getSelectedIndex() > -1) {
            String lista = jComboBox1.getSelectedItem().toString();
            int idLista = 0;
            for (ListaTarea listaTarea : listaTareas) {
                if (listaTarea.getNombreLista().equals(lista) && listaTarea.getIdCuenta() == cuentas.get(indexCuenta).getId()) {
                    idLista = listaTarea.getIdLista();
                }
            }

            if (idLista != 0) {
                CambiarLista(idTarea, idLista);
                TraerListaTareas();
                traerTareas();
                JOptionPane.showMessageDialog(this, "Tarea Agregada Exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                t.removeRow(row);
                jComboBox1.setSelectedIndex(0);
                jDialog1.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Lista no Existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ingresó una lista", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void panel_myDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_myDayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_myDayMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (table_myDay.getSelectedRowCount() == 1) {
            String nombre = table_myDay.getValueAt(table_myDay.getSelectedRow(), 1).toString();
            for (Tarea tarea : tareas) {
                if (nombre.equals(tarea.getNombreTarea())) {
                    tarea.setNota(notas.getText());
                    updateNotasTareas(tarea.getIdTarea());
                }
            }
        } else if (table_importante.getSelectedRowCount() == 1) {
            String nombre = table_importante.getValueAt(table_importante.getSelectedRow(), 1).toString();
            for (Tarea tarea : tareas) {
                if (nombre.equals(tarea.getNombreTarea())) {
                    tarea.setNota(notas.getText());
                    updateNotasTareas(tarea.getIdTarea());
                }
            }
        } else if (table_listas.getSelectedRowCount() == 1) {
            String nombre = table_listas.getValueAt(table_listas.getSelectedRow(), 1).toString();
            for (Tarea tarea : tareas) {
                if (nombre.equals(tarea.getNombreTarea())) {
                    tarea.setNota(notas.getText());
                    updateNotasTareas(tarea.getIdTarea());
                }
            }
        }else if(table_asignados.getSelectedRowCount()==1){
            String nombre = table_asignados.getValueAt(table_asignados.getSelectedRow(), 1).toString();
            for (Tarea tarea : tareas) {
                if (nombre.equals(tarea.getNombreTarea())) {
                    tarea.setNota(notas.getText());
                    updateNotasTareas(tarea.getIdTarea());
                }
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void table_myDayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_myDayMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_table_myDayMouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jPanel9.setBackground(new Color(195, 0, 195));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jPanel9.setBackground(new Color(153, 0, 153));
    }//GEN-LAST:event_jLabel3MouseExited

    private void label_exit_inciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_inciarMouseClicked
        asignarTareas.setVisible(false);
    }//GEN-LAST:event_label_exit_inciarMouseClicked

    private void label_exit_inciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_inciarMouseEntered
        panel_exit_iniciar.setBackground(Color.red);
    }//GEN-LAST:event_label_exit_inciarMouseEntered

    private void label_exit_inciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_exit_inciarMouseExited
        panel_exit_iniciar.setBackground(header_iniciar.getBackground());
    }//GEN-LAST:event_label_exit_inciarMouseExited

    private void header_iniciarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_iniciarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        asignarTareas.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header_iniciarMouseDragged

    private void header_iniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_iniciarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header_iniciarMousePressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MousePressed
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MousePressed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if ("".equals(jTextField3.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (dateChooserAsignar.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Ingrese una fecha", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {

                Dba db = new Dba("./DataBase.accdb");
                db.conectar();
                try {
                    int index = 0;
                    int cent = 0;
                    while (cent == 0) {
                        cent = 1;
                        index++;
                        for (Tarea tarea : tareas) {
                            if (index == tarea.getIdTarea()) {
                                cent = 0;
                            }
                        }
                    }

                    int id = ((Cuenta) jComboBox2.getSelectedItem()).getId();
                    SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
                    Date d = dateChooserAsignar.getDate();

                    db.query.execute("INSERT INTO tareas"
                            + " (idTarea,idCuenta,idLista,nombre_Tarea,fechaRealizar_tarea,realizado_tarea,importante_tarea,nota)"
                            + " VALUES (" + index + ",  "
                            + id + ", "
                            + 2 + ", '" + jTextField3.getText() + "', DateValue('"
                            + sd.format(d) + "'), "
                            + 0 + ", "
                            + 0 + ", '')");
                    JOptionPane.showMessageDialog(this, "Tarea Asignada", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    traerTareas();
                    asignarTareas.setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void table_asignadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_asignadosMouseClicked
        if (evt.isMetaDown()) {
            if (table_myDay.getSelectedRow() > -1) {
                menu.show(evt.getComponent(), evt.getX(), evt.getY());
                AgregarLista.setEnabled(true);
                ElimTarea.setEnabled(true);
                ElimLista.setEnabled(false);
            }
        } else {
            int i = table_asignados.getSelectedRow();
            String nombre = table_asignados.getValueAt(i, 1).toString();
            DefaultTableModel m = (DefaultTableModel) table_asignados.getModel();
            if ((Boolean) table_asignados.getValueAt(table_asignados.getSelectedRow(), 0) == true) {
                for (Tarea tarea : tareas) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setImportante(true);
                        ponerTareaImportante(tarea.getIdTarea());
                        traerTareas();
                    }
                }
            } else if ((Boolean) table_asignados.getValueAt(table_asignados.getSelectedRow(), 0) == false) {
                for (Tarea tarea : tareas) {
                    if (tarea.getNombreTarea().equals(nombre)) {
                        tarea.setImportante(false);
                        ponerTareaNoImportante(tarea.getIdTarea());
                        traerTareas();
                    }
                }
            }

            if ((Boolean) table_asignados.getValueAt(table_asignados.getSelectedRow(), 3) == true && ((Boolean) table_asignados.getValueAt(table_asignados.getSelectedRow(), 0) == false || (Boolean) table_asignados.getValueAt(table_asignados.getSelectedRow(), 0) == true)) {
                m.removeRow(table_asignados.getSelectedRow());
                for (Tarea tarea : tareas) {
                    if (tarea.getNombreTarea().equals(nombre) && tarea.getIdCuenta() == cuentas.get(indexCuenta).getId()) {
                        tarea.setRealizado(true);
                        ponerTareaCompletado(tarea.getIdTarea());
                        traerTareas();
                    }
                }
                table_asignados.setModel(m);
            }
        }
        showNotasAsignados();
    }//GEN-LAST:event_table_asignadosMouseClicked

    public void traerCuenta() {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        cuentas = new ArrayList();
        try {
            db.query.execute("select * from Cuentas");
            ResultSet rs = db.query.getResultSet();
            cuentas = new ArrayList();
            while (rs.next()) {
                Cuenta u = new Cuenta();
                u.setUser(rs.getString("usuario"));
                u.setContra(rs.getString("contra"));
                u.setId(rs.getInt("id"));
                cuentas.add(u);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al traer datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        db.desconectar();
    }

    public void traerTareas() {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        tareas = new ArrayList();
        try {
            db.query.execute("select * from Tareas");
            ResultSet rs = db.query.getResultSet();
            tareas = new ArrayList();
            while (rs.next()) {
                Tarea t = new Tarea();
                t.setIdTarea(rs.getInt("idTarea"));
                t.setIdCuenta(rs.getInt("idCuenta"));
                t.setIdLista(rs.getInt("idLista"));
                t.setNombreTarea(rs.getString("nombre_Tarea"));
                t.setFechaRealizar(rs.getDate("fechaRealizar_tarea"));
                t.setRealizado(rs.getInt("realizado_tarea") == 1);
                t.setImportante(rs.getInt("importante_tarea") == 1);
                t.setNota(rs.getString("nota"));
                tareas.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al traer datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        db.desconectar();

    }

    public void AgregarTareas(int idLista) {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        try {
            int index = 0;
            int cent = 0;
            while (cent == 0) {
                cent = 1;
                index++;
                for (Tarea tarea : tareas) {
                    if (index == tarea.getIdTarea()) {
                        cent = 0;
                    }
                }
            }
            SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
            Date d = dateChooser.getDate();
            db.query.execute("INSERT INTO tareas"
                    + " (idTarea,idCuenta,idLista,nombre_Tarea,fechaRealizar_tarea,realizado_tarea,importante_tarea,nota)"
                    + " VALUES (" + index + ",  "
                    + cuentas.get(indexCuenta).getId() + ", "
                    + idLista + ", '" + jTextField1.getText() + "', DateValue('"
                    + sd.format(d) + "'), "
                    + 0 + ", "
                    + 0 + ", '')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al traer datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        db.desconectar();

        int id = cuentas.get(indexCuenta).getId();
        DefaultTableModel myDayModel = (DefaultTableModel) table_myDay.getModel();
        myDayModel.setNumRows(0);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        for (Tarea tarea : tareas) {
            if (tarea.getIdCuenta() == id && !tarea.isRealizado() && tarea.getIdLista() == 1) {
                Object[] row = new Object[4];
                row[0] = tarea.isImportante();
                row[1] = tarea.getNombreTarea();
                row[2] = sd.format(tarea.getFechaRealizar());
                row[3] = tarea.isRealizado();
                myDayModel.addRow(row);
            }

        }
        table_myDay.setModel(myDayModel);
    }

    public void ponerTareaImportante(int id) {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        try {
            db.query.execute("update Tareas set importante_tarea= " + 1 + " where idTarea= " + id);
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al traer datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        db.desconectar();

    }

    public void ponerTareaNoImportante(int id) {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        try {
            db.query.execute("update Tareas set importante_tarea= " + 0 + " where idTarea= " + id);
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al traer datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        db.desconectar();
    }

    public void ponerTareaCompletado(int id) {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        try {
            db.query.execute("update Tareas set realizado_tarea= " + 1 + " where idTarea= " + id);
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al traer datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        db.desconectar();

    }

    public void AgregarListaTareas(int index) {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        try {
            int id = cuentas.get(indexCuenta).getId();
            db.query.execute("INSERT INTO listaTareas"
                    + "(idLista,idCuenta,nombreLista)"
                    + " VALUES (" + index + ", " + id + ", '" + jTextField2.getText() + "')");
            db.commit();
        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al traer datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        db.desconectar();
    }

    public void AgregarDayAsignados(int cuenta, String nombre, int idLista) {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        try {
            int id = cuentas.get(indexCuenta).getId();
            db.query.execute("INSERT INTO listaTareas"
                    + "(idLista,idCuenta,nombreLista)"
                    + " VALUES (" + idLista + ", " + cuenta + ", '" + nombre + "')");
            db.commit();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al traer datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        db.desconectar();
    }

    public void TraerListaTareas() {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        listaTareas = new ArrayList();
        try {
            db.query.execute("select * from listaTareas");
            ResultSet rs = db.query.getResultSet();
            listaTareas = new ArrayList();
            while (rs.next()) {
                ListaTarea l = new ListaTarea();
                l.setIdLista(rs.getInt("idLista"));
                l.setIdCuenta(rs.getInt("idCuenta"));
                l.setNombreLista(rs.getString("nombreLista"));
                listaTareas.add(l);
            }
        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al traer datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        db.desconectar();
    }

    public void tableListas() {
        DefaultTableModel m = (DefaultTableModel) table_listaTareas.getModel();
        m.setNumRows(0);
        System.out.println(cuentas.get(indexCuenta).getId() + "tableListas");
        for (ListaTarea listaTarea : listaTareas) {
            if (listaTarea.getIdLista() > 2 && listaTarea.getIdCuenta() == cuentas.get(indexCuenta).getId()) {
                System.out.println(listaTarea);
                String[] row = new String[1];
                row[0] = listaTarea.getNombreLista();
                m.addRow(row);
            }
        }
        table_listaTareas.setModel(m);
    }

    public void tableListaTareas(int idLista) {
        int id = cuentas.get(indexCuenta).getId();
        DefaultTableModel m = (DefaultTableModel) table_listas.getModel();
        m.setNumRows(0);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
        for (Tarea tarea : tareas) {
            if (tarea.getIdCuenta() == id && tarea.getIdLista() == idLista) {
                Object[] row = new Object[4];
                row[0] = tarea.isImportante();
                row[1] = tarea.getNombreTarea();
                row[2] = sd.format(tarea.getFechaRealizar());
                row[3] = tarea.isRealizado();
                m.addRow(row);
            }

        }
        table_myDay.setModel(m);
    }

    public void ElimLista(int idLista) {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        try {
            db.query.execute("delete from listaTareas where idLista=" + idLista);
            db.commit();

            for (Tarea tarea : tareas) {
                if (tarea.getIdLista() == idLista) {
                    db.query.execute("delete from tareas where idTarea=" + tarea.getIdTarea());
                    db.commit();
                }
            }
            JOptionPane.showMessageDialog(this, "Lista y Tareas Eliminadas Exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar Lista o Tareas", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        db.desconectar();

    }

    public void ElimTarea(int idTarea) {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        try {
            db.query.execute("delete from tareas where idTarea=" + idTarea);
            db.commit();
            JOptionPane.showMessageDialog(this, "Tarea Eliminadas Exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar tarea", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        db.desconectar();

    }

    public void CambiarLista(int idTarea, int idLista) {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        try {
            db.query.execute("update tareas set idLista= " + idLista + " where idTarea= " + idTarea);
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }

    public void showNotasMyDay() {
        if (table_myDay.getSelectedRows().length == 1) {
            String nombre = table_myDay.getValueAt(table_myDay.getSelectedRows()[0], 1).toString();
            for (Tarea tarea : tareas) {
                if (nombre.equals(tarea.getNombreTarea())) {
                    notas.setText(tarea.getNota());
                }
            }
        }
    }

    public void showNotasImportante() {
        if (table_importante.getSelectedRows().length == 1) {
            String nombre = table_importante.getValueAt(table_importante.getSelectedRows()[0], 0).toString();
            for (Tarea tarea : tareas) {
                if (nombre.equals(tarea.getNombreTarea())) {
                    notas.setText(tarea.getNota());
                }
            }
        }
    }

    public void showNotasCompletados() {
        if (table_completados.getSelectedRows().length == 1) {
            String nombre = table_completados.getValueAt(table_completados.getSelectedRows()[0], 0).toString();
            for (Tarea tarea : tareas) {
                if (nombre.equals(tarea.getNombreTarea())) {
                    notas.setText(tarea.getNota());
                }
            }
        }
    }

    public void showNotasListas() {
        if (table_listas.getSelectedRows().length == 1) {
            String nombre = table_listas.getValueAt(table_listas.getSelectedRows()[0], 1).toString();
            for (Tarea tarea : tareas) {
                if (nombre.equals(tarea.getNombreTarea())) {
                    notas.setText(tarea.getNota());
                }
            }
        }
    }
    
    public void showNotasAsignados(){
        if (table_asignados.getSelectedRows().length == 1) {
            String nombre = table_asignados.getValueAt(table_asignados.getSelectedRows()[0], 1).toString();
            for (Tarea tarea : tareas) {
                if (nombre.equals(tarea.getNombreTarea())) {
                    notas.setText(tarea.getNota());
                }
            }
        }
    }

    public void updateNotasTareas(int tareaId) {
        Dba db = new Dba("./DataBase.accdb");
        db.conectar();
        try {
            db.query.execute("update Tareas set nota= '" + notas.getText() + "' where idTarea= " + tareaId);
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al poner datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        db.desconectar();
    }

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
            java.util.logging.Logger.getLogger(myToDo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myToDo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myToDo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myToDo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myToDo(indexCuenta).setVisible(true);
            }
        });
    }

    private int xMouse;
    private int yMouse;
    private static int indexCuenta;
    private ArrayList<Cuenta> cuentas = new ArrayList();
    private ArrayList<Tarea> tareas = new ArrayList();
    private ArrayList<Tarea> miDia = new ArrayList();
    private ArrayList<Tarea> importantes = new ArrayList();
    private ArrayList<Tarea> completados = new ArrayList();
    private ArrayList<ListaTarea> listaTareas = new ArrayList();
    private int idTarea;
    private int idLista;
    private DefaultTableModel t;
    private int row;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarLista;
    private javax.swing.JPanel AgregarTarea;
    private javax.swing.JMenuItem ElimLista;
    private javax.swing.JMenuItem ElimTarea;
    private javax.swing.JDialog asignarTareas;
    private javax.swing.JPanel bg_myToDo;
    private com.toedter.calendar.JDateChooser dateChooser;
    private com.toedter.calendar.JDateChooser dateChooserAsignar;
    private javax.swing.JPanel header_iniciar;
    private javax.swing.JPanel header_menu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel label_exit_inciar;
    private javax.swing.JLabel label_exit_myDrive;
    private javax.swing.JLabel label_importante;
    private javax.swing.JLabel label_listaName;
    private javax.swing.JLabel label_listasTareas1;
    private javax.swing.JLabel label_minimize_myDrive;
    private javax.swing.JLabel label_myDay;
    private javax.swing.JLabel label_tareasAsignadas;
    private javax.swing.JLabel label_tareasRealizadas;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JLabel myDay_Title;
    private javax.swing.JTextArea notas;
    private javax.swing.JPanel panel_addNotas;
    private javax.swing.JPanel panel_asignados;
    private javax.swing.JPanel panel_asignarTarea;
    private javax.swing.JPanel panel_completados;
    private javax.swing.JPanel panel_crearLista;
    private javax.swing.JPanel panel_eventos;
    private javax.swing.JPanel panel_exit_iniciar;
    private javax.swing.JPanel panel_exit_myToDo;
    private javax.swing.JPanel panel_important;
    private javax.swing.JPanel panel_importante;
    private javax.swing.JPanel panel_listaName;
    private javax.swing.JPanel panel_listasTarea;
    private javax.swing.JPanel panel_listasTareas;
    private javax.swing.JPanel panel_minimize_myToDo;
    private javax.swing.JPanel panel_myDay;
    private javax.swing.JPanel panel_tareasAsignadas;
    private javax.swing.JPanel panel_tareasDay;
    private javax.swing.JPanel panel_tareasRealizadas;
    private javax.swing.JPanel panel_titulo;
    private javax.swing.JPanel panel_tituloNotas;
    private javax.swing.JTable table_asignados;
    private javax.swing.JTable table_completados;
    private javax.swing.JTable table_importante;
    private javax.swing.JTable table_listaTareas;
    private javax.swing.JTable table_listas;
    private javax.swing.JTable table_myDay;
    // End of variables declaration//GEN-END:variables
}
