
package Interface;

import File.FileSerializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import domain.Books;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BookInsert extends javax.swing.JFrame {
    FileSerializable file;
    Books books;
    FileOutputStream fos;
    ObjectOutputStream output;
    
    //Metodo constructor de insertar libros
    public BookInsert() {
        initComponents();
        this.setLocationRelativeTo(null); //centra el frame
        itemsComboBoxBoooks();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_body = new javax.swing.JPanel();
        jp_header = new javax.swing.JPanel();
        jb_back = new javax.swing.JButton();
        jl_logo = new javax.swing.JLabel();
        jl_slogan = new javax.swing.JLabel();
        jl_bookCondition = new javax.swing.JLabel();
        jl_isbn = new javax.swing.JLabel();
        jl_bookName = new javax.swing.JLabel();
        jb_cancel = new javax.swing.JButton();
        jl_bookType = new javax.swing.JLabel();
        jl_bookUbject = new javax.swing.JLabel();
        jb_insert = new javax.swing.JButton();
        jtf_nameInsert = new javax.swing.JTextField();
        jtf_isbnInsert = new javax.swing.JTextField();
        jcb_bookType = new javax.swing.JComboBox<>();
        jcb_subject = new javax.swing.JComboBox<>();
        jl_bookYear1 = new javax.swing.JLabel();
        jtf_yearInsert = new javax.swing.JTextField();
        jcb_condition = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jp_body.setBackground(new java.awt.Color(255, 255, 255));
        jp_body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jp_body.add(jp_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 60));

        jl_bookCondition.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookCondition.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookCondition.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookCondition.setText("Condicion:");
        jp_body.add(jl_bookCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 90, 30));

        jl_isbn.setBackground(new java.awt.Color(78, 168, 214));
        jl_isbn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_isbn.setForeground(new java.awt.Color(78, 168, 214));
        jl_isbn.setText("ISBN:");
        jp_body.add(jl_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 90, 20));

        jl_bookName.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookName.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookName.setText("Nombre:");
        jp_body.add(jl_bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 90, 20));

        jb_cancel.setText("Cancelar");
        jb_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelActionPerformed(evt);
            }
        });
        jp_body.add(jb_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 100, 40));

        jl_bookType.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookType.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookType.setText("Tipo:");
        jp_body.add(jl_bookType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 90, 30));

        jl_bookUbject.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookUbject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookUbject.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookUbject.setText("Materia:");
        jp_body.add(jl_bookUbject, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 90, 30));

        jb_insert.setText("Insertar");
        jb_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_insertActionPerformed(evt);
            }
        });
        jp_body.add(jb_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 100, 40));

        jtf_nameInsert.setText("Inserte nombre del libro");
        jtf_nameInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_nameInsertMouseClicked(evt);
            }
        });
        jp_body.add(jtf_nameInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 230, -1));

        jtf_isbnInsert.setText("Inserte el ISBN");
        jtf_isbnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_isbnInsertMouseClicked(evt);
            }
        });
        jtf_isbnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_isbnInsertActionPerformed(evt);
            }
        });
        jp_body.add(jtf_isbnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 230, -1));

        jcb_bookType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jp_body.add(jcb_bookType, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 230, -1));

        jcb_subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jp_body.add(jcb_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 230, -1));

        jl_bookYear1.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookYear1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookYear1.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookYear1.setText("Año:");
        jp_body.add(jl_bookYear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 90, 30));

        jtf_yearInsert.setText("Inserte el año de publicacion del libro");
        jtf_yearInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_yearInsertMouseClicked(evt);
            }
        });
        jtf_yearInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_yearInsertActionPerformed(evt);
            }
        });
        jp_body.add(jtf_yearInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 230, -1));

        jcb_condition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jp_body.add(jcb_condition, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp_body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp_body, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        //Mostrar la ventana de home y esconder la actual
        Admin_menu admin = new Admin_menu();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_backActionPerformed

    private void jtf_nameInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_nameInsertMouseClicked
        jtf_nameInsert.setText("");
    }//GEN-LAST:event_jtf_nameInsertMouseClicked

    private void jtf_isbnInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_isbnInsertMouseClicked
        jtf_isbnInsert.setText("");
    }//GEN-LAST:event_jtf_isbnInsertMouseClicked

    private void jb_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_insertActionPerformed
         if(EmptySpace() == true){
           JOptionPane.showMessageDialog(null, "Ingrese toda la informacion necesaria.");
           }else{
            file = new FileSerializable("bookInfo.dat");
            books = new Books(jtf_nameInsert.getText(), jcb_subject.getSelectedItem()+"",
                          jcb_condition.getSelectedItem()+"",jcb_bookType.getSelectedItem()+"", 
                          Integer.parseInt(jtf_isbnInsert.getText()),
                          Integer.parseInt(jtf_yearInsert.getText()),false);
            JOptionPane.showMessageDialog(null, "Se ha insertado el libro "+jtf_nameInsert.getText()+" con éxito");
            cleanUp();         
        try {
            file.serialize(books);
        } catch (IOException ex) {
            Logger.getLogger(BookInsert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    }//GEN-LAST:event_jb_insertActionPerformed

    private void jtf_yearInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_yearInsertMouseClicked
       jtf_yearInsert.setText("");
    }//GEN-LAST:event_jtf_yearInsertMouseClicked

    private void jtf_yearInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_yearInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_yearInsertActionPerformed

    private void jb_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelActionPerformed
        cleanUp();
    }//GEN-LAST:event_jb_cancelActionPerformed

    private void jtf_isbnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_isbnInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_isbnInsertActionPerformed

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
            java.util.logging.Logger.getLogger(BookInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookInsert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_back;
    private javax.swing.JButton jb_cancel;
    private javax.swing.JButton jb_insert;
    private javax.swing.JComboBox<String> jcb_bookType;
    private javax.swing.JComboBox<String> jcb_condition;
    private javax.swing.JComboBox<String> jcb_subject;
    private javax.swing.JLabel jl_bookCondition;
    private javax.swing.JLabel jl_bookName;
    private javax.swing.JLabel jl_bookType;
    private javax.swing.JLabel jl_bookUbject;
    private javax.swing.JLabel jl_bookYear1;
    private javax.swing.JLabel jl_isbn;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_slogan;
    private javax.swing.JPanel jp_body;
    private javax.swing.JPanel jp_header;
    private javax.swing.JTextField jtf_isbnInsert;
    private javax.swing.JTextField jtf_nameInsert;
    private javax.swing.JTextField jtf_yearInsert;
    // End of variables declaration//GEN-END:variables

    //Metodo que compone los items de seleccion 
    public void itemsComboBoxBoooks(){
        //formato de carreras jcombo
        jcb_subject.removeAllItems();
        jcb_subject.addItem("Seleccionar");
        jcb_subject.addItem("Agronomia");
        jcb_subject.addItem("Educacion");
        jcb_subject.addItem("Informatica");
        
        //formato de seleccion de año
        jcb_condition.removeAllItems();
        jcb_condition.addItem("Seleccionar");
        jcb_condition.addItem("Buena");
        jcb_condition.addItem("Regular");
        jcb_condition.addItem("Mala");
        
        //formato de tipo de libro
        jcb_bookType.removeAllItems();
        jcb_bookType.addItem("Seleccionar");
        jcb_bookType.addItem("E-book");
        jcb_bookType.addItem("Fisico");
        
    }
    //Metodo que limpia los espacios de la interfaz
    public void cleanUp(){
        jtf_nameInsert.setText("Inserte el nombre del libro");
        jtf_isbnInsert.setText("Inserte el ISBN");
        jtf_yearInsert.setText("Inserte el año de publicacion del libro");
        jcb_bookType.setSelectedItem("Seleccionar");
        jcb_condition.setSelectedItem("Seleccionar");
        jcb_subject.setSelectedItem("Seleccionar");
    }//Findel metodo
    
    //Metodo que verifica que todos los espacios de informacion esten llenos
     private boolean EmptySpace(){
         if((jtf_nameInsert.getText().isEmpty() || jtf_nameInsert.getText().equals("Inserte nombre del libro"))||
                 (jtf_isbnInsert.getText().isEmpty() || jtf_isbnInsert.getText().equals("Inserte el ISBN"))||
                 (jtf_yearInsert.getText().isEmpty()|| jtf_yearInsert.getText().equals("Inserte el año de publicacion del libro")) ||
                 (jcb_condition.getSelectedItem().equals("Seleccionar")) || (jcb_bookType.getSelectedItem().equals("Seleccionar")) || 
                 (jcb_subject.getSelectedItem().equals("Seleccionar")))
             return true;
         else
             return false;
     }//fin del metodo
}//Fin de Clase
