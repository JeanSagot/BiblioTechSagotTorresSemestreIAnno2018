
package Interface;

import File.FileSerializable;
import com.mxrck.autocompleter.TextAutoCompleter;
import domain.Books;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookLoan extends javax.swing.JFrame {
     BookInsert bookInsert = new BookInsert();
    FileSerializable file = bookInsert.file;
    private  TextAutoCompleter autocomplete;
    String matrix1 [][];
    
    public BookLoan() {
        initComponents();
         showMatrix();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtf_findBook = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_books = new javax.swing.JTable();
        jb_find = new javax.swing.JButton();
        jp_header = new javax.swing.JPanel();
        jb_back = new javax.swing.JButton();
        jl_logo = new javax.swing.JLabel();
        jl_slogan = new javax.swing.JLabel();
        js_Line = new javax.swing.JSeparator();
        jl_bookExit = new javax.swing.JLabel();
        jl_isbn = new javax.swing.JLabel();
        jl_bookName1 = new javax.swing.JLabel();
        jl_bookExit1 = new javax.swing.JLabel();
        jl_bookName2 = new javax.swing.JLabel();
        js_Line1 = new javax.swing.JSeparator();
        jl_bookname = new javax.swing.JLabel();
        jb_accept = new javax.swing.JButton();
        jseparator = new javax.swing.JSeparator();
        jtf_returnDate = new com.toedter.calendar.JDateChooser();
        jtf_outDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1053, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_findBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtf_findBook.setForeground(new java.awt.Color(204, 204, 204));
        jtf_findBook.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_findBook.setText("Algun libro en especifico?");
        jtf_findBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_findBookMouseClicked(evt);
            }
        });
        jtf_findBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_findBookActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_findBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 370, 40));

        jt_books.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jt_books);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 460, 160));

        jb_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_40px.png"))); // NOI18N
        jb_find.setBorderPainted(false);
        jb_find.setContentAreaFilled(false);
        jb_find.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jb_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 40));

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
        jPanel1.add(js_Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 230, 10));

        jl_bookExit.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookExit.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookExit.setText("Fecha de devolucion:");
        jPanel1.add(jl_bookExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 170, 30));

        jl_isbn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_isbn.setText("jLabel2");
        jPanel1.add(jl_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 230, 20));

        jl_bookName1.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookName1.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookName1.setText("ISBN:");
        jPanel1.add(jl_bookName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 90, 30));

        jl_bookExit1.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookExit1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookExit1.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookExit1.setText("Fecha de prestamo:");
        jPanel1.add(jl_bookExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 170, 30));

        jl_bookName2.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookName2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookName2.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookName2.setText("Nombre:");
        jPanel1.add(jl_bookName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 90, 30));

        js_Line1.setBackground(new java.awt.Color(60, 63, 65));
        js_Line1.setForeground(new java.awt.Color(45, 45, 45));
        js_Line1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.add(js_Line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 230, 10));

        jl_bookname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_bookname.setText("jLabel1");
        jPanel1.add(jl_bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 230, 20));

        jb_accept.setText("Aceptar");
        jPanel1.add(jb_accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 100, 40));

        jseparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 10, 470));
        jPanel1.add(jtf_returnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 180, 30));
        jPanel1.add(jtf_outDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_findBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_findBookActionPerformed
        jtf_findBook.setText("");
    }//GEN-LAST:event_jtf_findBookActionPerformed

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        //Mostrar la ventana de home y esconder la actual
        HomeFrame home = new HomeFrame();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_backActionPerformed

    private void jtf_findBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_findBookMouseClicked
        jtf_findBook.setText("");
        for (int i=0; i<matrix1.length; i++){
          autocomplete.addItem(matrix1[i][0]);}
    }//GEN-LAST:event_jtf_findBookMouseClicked

    public void showMatrix(){
        autocomplete = new TextAutoCompleter(jtf_findBook);
        try {
            ArrayList<Books> arrayListBooks = file.readSerialize();
            String matrix [][] = new String[arrayListBooks.size()][4];
            matrix1 = new String[arrayListBooks.size()][0];
            
            for(int i=0; i<arrayListBooks.size(); i++){
                matrix [i][0] = arrayListBooks.get(i).getName();
                matrix [i][1] = arrayListBooks.get(i).getSubject();
                matrix [i][2] = arrayListBooks.get(i).getCondition();
                matrix [i][3] = arrayListBooks.get(i).getType();
            }
            this.matrix1=matrix;
            jt_books.setModel(new javax.swing.table.DefaultTableModel(
            matrix,
            new String [] {
                "Nombre ", "Tema", "Estado", "Tipo"
            }));  
        } catch (IOException ex) {
            Logger.getLogger(BookLoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookLoan.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(BookLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookLoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_accept;
    private javax.swing.JButton jb_back;
    private javax.swing.JButton jb_find;
    private javax.swing.JLabel jl_bookExit;
    private javax.swing.JLabel jl_bookExit1;
    private javax.swing.JLabel jl_bookName1;
    private javax.swing.JLabel jl_bookName2;
    private javax.swing.JLabel jl_bookname;
    private javax.swing.JLabel jl_isbn;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_slogan;
    private javax.swing.JPanel jp_header;
    private javax.swing.JSeparator js_Line;
    private javax.swing.JSeparator js_Line1;
    private javax.swing.JSeparator jseparator;
    private javax.swing.JTable jt_books;
    private javax.swing.JTextField jtf_findBook;
    private com.toedter.calendar.JDateChooser jtf_outDate;
    private com.toedter.calendar.JDateChooser jtf_returnDate;
    // End of variables declaration//GEN-END:variables
}
