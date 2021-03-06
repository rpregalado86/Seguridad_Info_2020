/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruben
 */
public class Usuario extends javax.swing.JFrame {
    public  Connection conBase;
    public  Conexion cx;
    public Statement stmt = null;
    public DefaultTableModel modelo= new DefaultTableModel();
    public DefaultTableModel modelo2= new DefaultTableModel();
    public int codUser=0;
    public int codRol=0;
    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        this.setTitle("UTPL - Usuario");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(false);
        this.setResizable(false);
        modelo.addColumn("Id");
        modelo.addColumn("Descripcion");
        modelo2.addColumn("Id");
        modelo2.addColumn("Descripcion");
        cx=new Conexion();
        conBase = cx.Conexion();
         if (conBase!=null){
            System.out.println("Contectado desde Usuario");
         }
    }
    
   
    
    public final void cargarUser(int cod){
        codUser=cod;
        int primerRol=0;
        String nomUser="";
        tbRol.setModel(modelo);
        String sql= "SELECT nombre FROM usuarios WHERE idUsuarios = '"+codUser+"'";
            try {
                stmt = conBase.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    nomUser=rs.getString(1);
                }

                jlNom.setText(nomUser);
            } catch (SQLException ex) {
                Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
            }
        String sql2= "SELECT t3.idRoles, t3.descripcion FROM  usuariosroles t2, roles t3 "
                + "WHERE t2.Usuarios_idUsuarios = '"+codUser+"'"
                + "&& t2.Roles_idRoles = t3.idRoles";
        String []datos = new String [2];
            try {
                stmt = conBase.createStatement();
                ResultSet rs = stmt.executeQuery(sql2);
                while(rs.next()){
                    datos[0]=""+rs.getInt(1);
                    datos[1]=rs.getString(2);
                    primerRol=rs.getInt(1);
                    modelo.addRow(datos);
                }
                tbRol.setModel(modelo);
                tbRol.getSelectionModel().setSelectionInterval(0,0);
                String dato=String.valueOf(tbRol.getValueAt(tbRol.getSelectedRow(),0));
                int numEntero = Integer.parseInt(dato);
                System.out.println("Vallor id rol: "+numEntero);
                cargarFuncion(numEntero);
            } catch (SQLException ex) {
                Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRol = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFun = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlNom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MODULO USUARIO");

        tbRol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRol);

        tbFun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbFun);

        jLabel2.setText("Bienvenido (a) estimado (a): ");

        jLabel3.setText("Detalles  de Rol(es) Asignado(s):");

        jLabel4.setText("Detalle de Funcion(es) de Rol Seleccionado:");

        jLabel5.setText("Alumno: Ruben Regalado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlNom, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlNom, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRolMouseClicked
        // TODO add your handling code here:
        if (tbRol.getSelectedRow() != -1) {
            String codigo = (String) modelo.getValueAt(tbRol.getSelectedRow(), 0);
            codRol = Integer.parseInt(codigo);
            System.out.println("Rol selec "+codRol);
            cargarFuncion(codRol);
        } else {
            System.out.println("Seleccione un renglon primero");
        }
    }//GEN-LAST:event_tbRolMouseClicked
    public void cargarFuncion(int codR){
        limTbFunc();
        String sql2= "SELECT t1.idFunciones, t1.descripcion FROM  funciones t1, rolesfunciones t2 "
                + "WHERE t2.Roles_idRoles = '"+codR+"'"
                + "&& t1.idFunciones = t2.Funciones_idFunciones";
        String []datos = new String [2];
            try {
                stmt = conBase.createStatement();
                ResultSet rs = stmt.executeQuery(sql2);
                while(rs.next()){
                    datos[0]=""+rs.getInt(1);
                    datos[1]=rs.getString(2);
                    modelo2.addRow(datos);
                }
                tbFun.setModel(modelo2);
            } catch (SQLException ex) {
                Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void limTbFunc(){
        DefaultTableModel tb = (DefaultTableModel) tbFun.getModel();
        int a = tbFun.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            tb.removeRow(tb.getRowCount()-1);
        }
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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlNom;
    private javax.swing.JTable tbFun;
    private javax.swing.JTable tbRol;
    // End of variables declaration//GEN-END:variables
}
