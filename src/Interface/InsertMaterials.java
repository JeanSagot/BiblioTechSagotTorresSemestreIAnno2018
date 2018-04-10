/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import File.FileSerializable;
import domain.materials;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InsertMaterials extends javax.swing.JFrame {   
    FileSerializable file;
    FileOutputStream fos;
    ObjectOutputStream output;
    materials materials;
    //Contructor 
    public InsertMaterials() {
        initComponents();
        this.setLocationRelativeTo(null);
        itemsComboBoxMaterials();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_header = new javax.swing.JPanel();
        jb_back = new javax.swing.JButton();
        jl_logo = new javax.swing.JLabel();
        jl_slogan = new javax.swing.JLabel();
        jp_body = new javax.swing.JPanel();
        jl_materialName = new javax.swing.JLabel();
        jl_materialCondition = new javax.swing.JLabel();
        jl_materialType = new javax.swing.JLabel();
        jl_materialBrand = new javax.swing.JLabel();
        jl_materialProps = new javax.swing.JLabel();
        jtf_brand = new javax.swing.JTextField();
        jtf_name = new javax.swing.JTextField();
        jcb_type = new javax.swing.JComboBox<>();
        jcb_condition = new javax.swing.JComboBox<>();
        jb_cancel = new javax.swing.JButton();
        jb_insertMaterial = new javax.swing.JButton();
        jcb_hasProps = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_header.setBackground(new java.awt.Color(78, 168, 214));
        jp_header.setForeground(new java.awt.Color(78, 168, 214));
        jp_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_40px_1_Off.png"))); // NOI18N
        jb_back.setBorderPainted(false);
        jb_back.setContentAreaFilled(false);
        jb_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_back.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_40px_2_on.png"))); // NOI18N
        jb_back.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_40px_2_on.png"))); // NOI18N
        jb_back.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_40px_2_on.png"))); // NOI18N
        jb_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_backActionPerformed(evt);
            }
        });
        jp_header.add(jb_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 50));

        jl_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jp_header.add(jl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        jl_slogan.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jl_slogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_slogan.setText("For learning. For life.");
        jp_header.add(jl_slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 60));

        getContentPane().add(jp_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 60));

        jp_body.setBackground(new java.awt.Color(255, 255, 255));

        jl_materialName.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_materialName.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialName.setText("Nombre:");

        jl_materialCondition.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialCondition.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_materialCondition.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialCondition.setText("Condicion:");

        jl_materialType.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_materialType.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialType.setText("Tipo:");

        jl_materialBrand.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialBrand.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_materialBrand.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialBrand.setText("Marca:");

        jl_materialProps.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialProps.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_materialProps.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialProps.setText("Accesorios:");

        jtf_brand.setText("Inserte la marca del articulo");
        jtf_brand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_brandMouseClicked(evt);
            }
        });
        jtf_brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_brandActionPerformed(evt);
            }
        });

        jtf_name.setText("Inserte el nombre");
        jtf_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_nameMouseClicked(evt);
            }
        });
        jtf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nameActionPerformed(evt);
            }
        });

        jcb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcb_condition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jb_cancel.setText("Cancelar");
        jb_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelActionPerformed(evt);
            }
        });

        jb_insertMaterial.setText("Insertar");
        jb_insertMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_insertMaterialActionPerformed(evt);
            }
        });

        jcb_hasProps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jp_bodyLayout = new javax.swing.GroupLayout(jp_body);
        jp_body.setLayout(jp_bodyLayout);
        jp_bodyLayout.setHorizontalGroup(
            jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_bodyLayout.createSequentialGroup()
                .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_bodyLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_materialType, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_materialCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_materialName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_materialBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_materialProps, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_name, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jtf_brand)
                            .addComponent(jcb_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcb_condition, 0, 228, Short.MAX_VALUE)
                            .addComponent(jcb_hasProps, javax.swing.GroupLayout.Alignment.TRAILING, 0, 228, Short.MAX_VALUE)))
                    .addGroup(jp_bodyLayout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jb_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_insertMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(439, Short.MAX_VALUE))
        );
        jp_bodyLayout.setVerticalGroup(
            jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_bodyLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_materialName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_bodyLayout.createSequentialGroup()
                        .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_materialCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_condition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_bodyLayout.createSequentialGroup()
                        .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_materialType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)))
                .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_materialBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_materialProps, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_hasProps, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_insertMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(jp_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1050, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        //Mostrar la ventana de home y esconder la actual
        Admin_menu admin = new Admin_menu();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_backActionPerformed

    private void jtf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nameActionPerformed
       
    }//GEN-LAST:event_jtf_nameActionPerformed

    private void jtf_brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_brandActionPerformed
       
    }//GEN-LAST:event_jtf_brandActionPerformed

    private void jtf_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_nameMouseClicked
        jtf_name.setText("");
    }//GEN-LAST:event_jtf_nameMouseClicked

    private void jtf_brandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_brandMouseClicked
        jtf_brand.setText("");
    }//GEN-LAST:event_jtf_brandMouseClicked

    private void jb_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelActionPerformed
       clean();
    }//GEN-LAST:event_jb_cancelActionPerformed

    //se inserta el material audivisual en un archivo de maner serializable
    private void jb_insertMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_insertMaterialActionPerformed
       if(EmptySpace() == true){
           JOptionPane.showMessageDialog(null, "Ingrese toda la informacion necesaria.");
           }else{
            file = new FileSerializable("MaterialInfo.dat");
            materials = new materials(jtf_name.getText(),jcb_type.getSelectedItem()+"",jcb_condition.getSelectedItem()+"",
                                      jtf_brand.getText(),jcb_hasProps.getSelectedItem()+"",false);
            JOptionPane.showMessageDialog(null, "Se ha insertado el Audiovisual "+jtf_name.getText()+" con éxito");
            clean();            
        try {
            file.serialize(materials);
        } catch (IOException ex) {
            Logger.getLogger(BookInsert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_jb_insertMaterialActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertMaterials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_back;
    private javax.swing.JButton jb_cancel;
    private javax.swing.JButton jb_insertMaterial;
    private javax.swing.JComboBox<String> jcb_condition;
    private javax.swing.JComboBox<String> jcb_hasProps;
    private javax.swing.JComboBox<String> jcb_type;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_materialBrand;
    private javax.swing.JLabel jl_materialCondition;
    private javax.swing.JLabel jl_materialName;
    private javax.swing.JLabel jl_materialProps;
    private javax.swing.JLabel jl_materialType;
    private javax.swing.JLabel jl_slogan;
    private javax.swing.JPanel jp_body;
    private javax.swing.JPanel jp_header;
    private javax.swing.JTextField jtf_brand;
    private javax.swing.JTextField jtf_name;
    // End of variables declaration//GEN-END:variables
    
    //Metodo que compone los items de seleccion 
    public void itemsComboBoxMaterials(){    
        jcb_condition.removeAllItems();
        jcb_condition.addItem("Seleccionar");
        jcb_condition.addItem("Buena");
        jcb_condition.addItem("Regular");
        jcb_condition.addItem("Mala");
        
        jcb_type.removeAllItems();
        jcb_type.addItem("Seleccionar");
        jcb_type.addItem("Laptop");
        jcb_type.addItem("Proyector");
        jcb_type.addItem("Parlantes");
        jcb_type.addItem("CD");
        jcb_type.addItem("DVD");
        
        jcb_hasProps.removeAllItems();
        jcb_hasProps.addItem("Seleccionar");
        jcb_hasProps.addItem("Si tiene");
        jcb_hasProps.addItem("No tiene");
        
    }
    //Metodo limpia los espacios de texto una vez se hayan ingresado 
    public void clean(){
        jtf_brand.setText("Inserte la marca del articulo");
        jtf_name.setText("Inserte el nombre del articulo");
        jcb_condition.setSelectedItem("Seleccionar");
        jcb_type.setSelectedItem("Seleccionar");
        jcb_hasProps.setSelectedItem("Seleccionar");
    }
     //Metodo que verifica que todos los espacios de informacion esten llenos
     private boolean EmptySpace(){
         if((jtf_name.getText().isEmpty() || jtf_name.getText().equals("Inserte el nombre")) ||
                 (jtf_brand.getText().isEmpty() || jtf_brand.getText().equals("Inserte la marca del articulo")) ||
                 (jcb_condition.getSelectedItem().equals("Seleccionar")) || (jcb_type.getSelectedItem().equals("Seleccionar")) || 
                 (jcb_hasProps.getSelectedItem().equals("Seleccionar")))
             return true;
         else
             return false;
     }//fin del metodo
}
