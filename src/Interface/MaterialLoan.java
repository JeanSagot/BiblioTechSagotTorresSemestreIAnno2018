
package Interface;

import File.FileSerializable;
import com.mxrck.autocompleter.TextAutoCompleter;
import domain.materials;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MaterialLoan extends javax.swing.JFrame {
    
    InsertMaterials materialInsert = new InsertMaterials();
    private  TextAutoCompleter autocomplete;
    String matrix1 [][];
    //Constructor
    public MaterialLoan() {
        initComponents();
        this.setLocationRelativeTo(null);
        showMatrix();
        Autocomplete();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtf_findMaterial = new javax.swing.JTextField();
        jsp_materials = new javax.swing.JScrollPane();
        jt_Materials = new javax.swing.JTable();
        jb_find = new javax.swing.JButton();
        jp_header = new javax.swing.JPanel();
        jb_back = new javax.swing.JButton();
        jl_logo = new javax.swing.JLabel();
        jl_slogan = new javax.swing.JLabel();
        js_Line = new javax.swing.JSeparator();
        jl_materialExit = new javax.swing.JLabel();
        jl_propsShow = new javax.swing.JLabel();
        jl_accesories = new javax.swing.JLabel();
        jl_propOut = new javax.swing.JLabel();
        jl_materialName = new javax.swing.JLabel();
        js_Line1 = new javax.swing.JSeparator();
        jl_nameShow = new javax.swing.JLabel();
        jb_accept = new javax.swing.JButton();
        jseparator = new javax.swing.JSeparator();
        jl_materialType = new javax.swing.JLabel();
        jl_materialCondition = new javax.swing.JLabel();
        js_Line2 = new javax.swing.JSeparator();
        js_Line3 = new javax.swing.JSeparator();
        jl_typeShow = new javax.swing.JLabel();
        jl_conditionShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_findMaterial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtf_findMaterial.setForeground(new java.awt.Color(204, 204, 204));
        jtf_findMaterial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_findMaterial.setText("Algun material en especifico?");
        jtf_findMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_findMaterialMouseClicked(evt);
            }
        });
        jtf_findMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_findMaterialActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_findMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, 40));

        jt_Materials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Condicion", "Marca", "Accesorios"
            }
        ));
        jsp_materials.setViewportView(jt_Materials);

        jPanel1.add(jsp_materials, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 460, 160));

        jb_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_40px.png"))); // NOI18N
        jb_find.setBorderPainted(false);
        jb_find.setContentAreaFilled(false);
        jb_find.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_findActionPerformed(evt);
            }
        });
        jPanel1.add(jb_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 50, 40));

        jp_header.setBackground(new java.awt.Color(78, 168, 214));
        jp_header.setForeground(new java.awt.Color(78, 168, 214));
        jp_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_40px_1_Off.png"))); // NOI18N
        jb_back.setBorderPainted(false);
        jb_back.setContentAreaFilled(false);
        jb_back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel1.add(jp_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 60));

        js_Line.setBackground(new java.awt.Color(60, 63, 65));
        js_Line.setForeground(new java.awt.Color(45, 45, 45));
        js_Line.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.add(js_Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 230, 10));

        jl_materialExit.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_materialExit.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialExit.setText("Fecha de devolucion:");
        jPanel1.add(jl_materialExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 170, 30));

        jl_propsShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_propsShow.setText("accesorios");
        jPanel1.add(jl_propsShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 230, 20));

        jl_accesories.setBackground(new java.awt.Color(78, 168, 214));
        jl_accesories.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_accesories.setForeground(new java.awt.Color(78, 168, 214));
        jl_accesories.setText("Accesorios:");
        jPanel1.add(jl_accesories, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 90, 30));

        jl_propOut.setBackground(new java.awt.Color(78, 168, 214));
        jl_propOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_propOut.setForeground(new java.awt.Color(78, 168, 214));
        jl_propOut.setText("Fecha de prestamo:");
        jPanel1.add(jl_propOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 170, 30));

        jl_materialName.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_materialName.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialName.setText("Nombre:");
        jPanel1.add(jl_materialName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 90, 30));

        js_Line1.setBackground(new java.awt.Color(60, 63, 65));
        js_Line1.setForeground(new java.awt.Color(45, 45, 45));
        js_Line1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.add(js_Line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 230, 10));

        jl_nameShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_nameShow.setText("nombre");
        jPanel1.add(jl_nameShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 230, 20));

        jb_accept.setText("Aceptar");
        jPanel1.add(jb_accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 100, 40));

        jseparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 10, 470));

        jl_materialType.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_materialType.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialType.setText("Tipo:");
        jPanel1.add(jl_materialType, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 90, 30));

        jl_materialCondition.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialCondition.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_materialCondition.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialCondition.setText("Condicion:");
        jPanel1.add(jl_materialCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 90, 30));

        js_Line2.setBackground(new java.awt.Color(60, 63, 65));
        js_Line2.setForeground(new java.awt.Color(45, 45, 45));
        js_Line2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.add(js_Line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 230, 10));

        js_Line3.setBackground(new java.awt.Color(60, 63, 65));
        js_Line3.setForeground(new java.awt.Color(45, 45, 45));
        js_Line3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.add(js_Line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 230, 10));

        jl_typeShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_typeShow.setText("tipo");
        jPanel1.add(jl_typeShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 230, 20));

        jl_conditionShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_conditionShow.setText("condicion");
        jPanel1.add(jl_conditionShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 230, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_findMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_findMaterialMouseClicked
        jtf_findMaterial.setText("");
        showMatrix();
    }//GEN-LAST:event_jtf_findMaterialMouseClicked

    private void jtf_findMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_findMaterialActionPerformed
        jtf_findMaterial.setText("");
        selectMaterial();
    }//GEN-LAST:event_jtf_findMaterialActionPerformed

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        //Mostrar la ventana de home y esconder la actual
        HomeFrame home = new HomeFrame();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_backActionPerformed

    private void jb_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_findActionPerformed
    selectMaterial();
    }//GEN-LAST:event_jb_findActionPerformed
      //Muestra la la matriz con los libros ingresados en un table
      public void showMatrix(){
         FileSerializable file = new FileSerializable("MaterialInfo.dat");
        try {
            ArrayList<Object> arrayListObjects = file.readSerializeBooks();
            String matrix [][] = new String[arrayListObjects.size()][5];
            matrix1 = new String[arrayListObjects.size()][0];
            ArrayList<materials> arrayListMaterial = new ArrayList<materials>();
            //matriz integra informacion a tabla
            for(int i=0; i<arrayListObjects.size(); i++){
                arrayListMaterial.add((materials)arrayListObjects.get(i));
                matrix [i][0] = arrayListMaterial.get(i).getName();
                matrix [i][1] = arrayListMaterial.get(i).getType();
                matrix [i][2] = arrayListMaterial.get(i).getCondition();
                matrix [i][3] = arrayListMaterial.get(i).getBrand();
                matrix [i][4] = arrayListMaterial.get(i).getAccesories();
            }
            this.matrix1=matrix;
            jt_Materials.setModel(new javax.swing.table.DefaultTableModel(
            matrix,
            new String [] {
                "Nombre", "Tipo", "Condicion", "Marca", "Accesorios"
            }));  
        } catch (IOException ex) {
            Logger.getLogger(BookLoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      //Selecciona un Material en especifico buscado lo muetraen la matriz y los label
      public void selectMaterial(){ 
       String matrixTemp [][] = new String[matrix1.length][5];
       for (int i=0; i<matrix1.length; i++){
       if (autocomplete.getItemSelected().equals(matrix1[i][0])){
            jl_nameShow.setText(matrix1[i][0]);
            jl_typeShow.setText(matrix1[i][1]);
            jl_conditionShow.setText(matrix1[i][2]);
            jl_propsShow.setText(matrix1[i][4]);
            
            matrixTemp[0][0]=matrix1[i][0];
            matrixTemp[0][1]=matrix1[i][1];
            matrixTemp[0][2]=matrix1[i][2];
            matrixTemp[0][3]=matrix1[i][3];
            matrixTemp[0][4]=matrix1[i][4];
               
       }}//Fin del for y if 
        jt_Materials.setModel(new javax.swing.table.DefaultTableModel(
            matrixTemp,
            new String [] {
                "Nombre", "Tipo", "Condicion", "Marca", "Accesorios"
            }));
   }//Fin de metodo
     //Muestra las opciones a escoger en la barra buscadora
     public void Autocomplete(){
        autocomplete = new TextAutoCompleter(jtf_findMaterial);
        for (int i=0; i<matrix1.length; i++){
          autocomplete.addItem(matrix1[i][0]);
        }
    }//Fin del metodo
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
            java.util.logging.Logger.getLogger(MaterialLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaterialLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaterialLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaterialLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaterialLoan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_accept;
    private javax.swing.JButton jb_back;
    private javax.swing.JButton jb_find;
    private javax.swing.JLabel jl_accesories;
    private javax.swing.JLabel jl_conditionShow;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_materialCondition;
    private javax.swing.JLabel jl_materialExit;
    private javax.swing.JLabel jl_materialName;
    private javax.swing.JLabel jl_materialType;
    private javax.swing.JLabel jl_nameShow;
    private javax.swing.JLabel jl_propOut;
    private javax.swing.JLabel jl_propsShow;
    private javax.swing.JLabel jl_slogan;
    private javax.swing.JLabel jl_typeShow;
    private javax.swing.JPanel jp_header;
    private javax.swing.JSeparator js_Line;
    private javax.swing.JSeparator js_Line1;
    private javax.swing.JSeparator js_Line2;
    private javax.swing.JSeparator js_Line3;
    private javax.swing.JSeparator jseparator;
    private javax.swing.JScrollPane jsp_materials;
    private javax.swing.JTable jt_Materials;
    private javax.swing.JTextField jtf_findMaterial;
    // End of variables declaration//GEN-END:variables
}
