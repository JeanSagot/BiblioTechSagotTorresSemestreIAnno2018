
package Interface;

import File.FileSerializable;
import com.mxrck.autocompleter.TextAutoCompleter;
import domain.Books;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import File.bookLoansFile;

public class BookLoan extends javax.swing.JFrame {
    FileSerializable file;
    Books books;
    BookInsert bookInsert = new BookInsert();
    private  TextAutoCompleter autocomplete;
    String matrix1 [][];
    //Constructor 
    public BookLoan() {
         initComponents();
         this.setLocationRelativeTo(null);
         showMatrix();
         Autocomplete();
         jt_books.setDefaultEditor(Object.class, null);
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
        jl_bookReturn = new javax.swing.JLabel();
        jl_isbnShow = new javax.swing.JLabel();
        jl_ISBN = new javax.swing.JLabel();
        jl_bookName = new javax.swing.JLabel();
        js_Line1 = new javax.swing.JSeparator();
        jl_booknameShow = new javax.swing.JLabel();
        jb_accept = new javax.swing.JButton();
        jseparator = new javax.swing.JSeparator();
        jDatePrestamoBooks = new com.toedter.calendar.JDateChooser();
        jDateDevolucionBooks = new com.toedter.calendar.JDateChooser();
        jl_bookExit2 = new javax.swing.JLabel();

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
        jPanel1.add(jtf_findBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 370, 40));

        jt_books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Programacion II", "Informatica", "Buena", "E-book", "1234", "2018", "true"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "", "Title 3", "Title 4", "Título 5", "", "Título 7"
            }
        ));
        jt_books.setRowHeight(18);
        jt_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_booksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_books);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 460, 220));

        jb_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_40px.png"))); // NOI18N
        jb_find.setBorderPainted(false);
        jb_find.setContentAreaFilled(false);
        jb_find.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_findActionPerformed(evt);
            }
        });
        jPanel1.add(jb_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 50, 40));

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

        jl_bookReturn.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookReturn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookReturn.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookReturn.setText("Fecha de devolucion:");
        jPanel1.add(jl_bookReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 170, 30));

        jl_isbnShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jl_isbnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 230, 20));

        jl_ISBN.setBackground(new java.awt.Color(78, 168, 214));
        jl_ISBN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_ISBN.setForeground(new java.awt.Color(78, 168, 214));
        jl_ISBN.setText("ISBN:");
        jPanel1.add(jl_ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 90, 30));

        jl_bookName.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookName.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookName.setText("Nombre:");
        jPanel1.add(jl_bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 90, 30));

        js_Line1.setBackground(new java.awt.Color(60, 63, 65));
        js_Line1.setForeground(new java.awt.Color(45, 45, 45));
        js_Line1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.add(js_Line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 230, 10));

        jl_booknameShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jl_booknameShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 230, 20));

        jb_accept.setText("Aceptar");
        jb_accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_acceptMouseClicked(evt);
            }
        });
        jb_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_acceptActionPerformed(evt);
            }
        });
        jPanel1.add(jb_accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 100, 40));

        jseparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 10, 470));
        jPanel1.add(jDatePrestamoBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, -1, -1));
        jPanel1.add(jDateDevolucionBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, -1, -1));

        jl_bookExit2.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookExit2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_bookExit2.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookExit2.setText("Fecha de prestamo:");
        jPanel1.add(jl_bookExit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_findBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_findBookActionPerformed
        jtf_findBook.setText("");
        selectBook();
    }//GEN-LAST:event_jtf_findBookActionPerformed

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        //Mostrar la ventana de home y esconder la actual
        HomeFrame home = new HomeFrame();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_backActionPerformed

    private void jtf_findBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_findBookMouseClicked
        jtf_findBook.setText("");
        showMatrix();
    }//GEN-LAST:event_jtf_findBookMouseClicked

    private void jb_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_findActionPerformed
        selectBook();
    }//GEN-LAST:event_jb_findActionPerformed

    private void jb_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_acceptActionPerformed
        try {
            borrowedBooks(); 
        } catch (IOException ex) {
            Logger.getLogger(BookLoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        showMatrix();
    }//GEN-LAST:event_jb_acceptActionPerformed

    private void jt_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_booksMouseClicked
       
    }//GEN-LAST:event_jt_booksMouseClicked

    private void jb_acceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_acceptMouseClicked
         /* bookLoansFile bookLF = new bookLoansFile();
          String carnet = jtf_carnetLoan.getText();
          String dateExit = jDatePrestamoBooks.getDate()+"";
          String dateReturn = jDateDevolucionBooks.getDate()+"";
          String bookName = jl_booknameShow.getText();
          int isbn = Integer.parseInt(jl_isbnShow.getText());
          String subject = "subject";
          String condition="condition";
          String type = "type";
          int year = 0;
          boolean available = true;
          
          books = new Books(bookName, subject, condition, type, year, isbn, true);*/
    }//GEN-LAST:event_jb_acceptMouseClicked

    //Muestra la la matriz con los libros ingresados en un table
   public void showMatrix(){
        FileSerializable file = new FileSerializable("bookInfo.dat");
        try {
            ArrayList<Object> arrayListObjects = file.readSerializeBooks();
            String matrix [][] = new String[arrayListObjects.size()][7];
            matrix1 = new String[arrayListObjects.size()][0];
            ArrayList<Books> arrayListBooksr = new ArrayList<Books>();
            for(int i=0; i<arrayListObjects.size(); i++){
                arrayListBooksr.add((Books)arrayListObjects.get(i));
                matrix [i][0] = arrayListBooksr.get(i).getName();
                matrix [i][1] = arrayListBooksr.get(i).getSubject();
                matrix [i][2] = arrayListBooksr.get(i).getCondition();
                matrix [i][3] = arrayListBooksr.get(i).getType();
                matrix [i][4] = arrayListBooksr.get(i).getISBN()+"";
                matrix [i][5] = arrayListBooksr.get(i).getYear()+"";
                matrix [i][6] = arrayListBooksr.get(i).isBorrowedBooks()+"";
            }
            this.matrix1=matrix;
            jt_books.setModel(new javax.swing.table.DefaultTableModel(
            matrix,
            new String [] {
                "Nombre ", "Tema", "Estado", "Tipo","ISBN","Año","Prestado"
            }));  
        } catch (IOException ex) {
            Logger.getLogger(BookLoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   //Selecciona un libro en especifico buscado lo muetraen la matriz y los label
   public void selectBook(){ 
      String matrixTemp [][] = new String[matrix1.length][7]; 
   for (int i=0; i<matrix1.length; i++){
       if (autocomplete.getItemSelected().equals(matrix1[i][0])){
            jl_booknameShow.setText(matrix1[i][0]);
            jl_isbnShow.setText(matrix1[i][4]);
            matrixTemp[0][0]=matrix1[i][0];
            matrixTemp[0][1]=matrix1[i][1];
            matrixTemp[0][2]=matrix1[i][2];
            matrixTemp[0][3]=matrix1[i][3];
            matrixTemp[0][4]=matrix1[i][4];
            matrixTemp[0][5]=matrix1[i][5];
            matrixTemp[0][6]=matrix1[i][6];
       }}
        jt_books.setModel(new javax.swing.table.DefaultTableModel(
            matrixTemp,
            new String [] {
                "Nombre ", "Tema", "Estado", "Tipo","ISBN","Año","Prestado"
            }));
   }
   
   //Prestamo de libros
   public void borrowedBooks() throws IOException, ClassNotFoundException{
            FileSerializable file = new FileSerializable("bookLoans.dat");
            ArrayList<Object> arrayListObjects = file.readSerializeBooks();
            ArrayList<Books> arrayListBooksr = new ArrayList<Books>();
            
            for(int i=0; i<arrayListObjects.size(); i++){
            arrayListBooksr.add((Books)arrayListObjects.get(i));
            if((autocomplete.getItemSelected()!=null && autocomplete.getItemSelected().equals(arrayListBooksr.get(i).getName()!=null)&& arrayListBooksr.get(i).isBorrowedBooks()== false)){
                JOptionPane.showMessageDialog(null, "El libro "+autocomplete.getItemSelected()+" ya ha sido prestado");
            }
            if (autocomplete.getItemSelected()!=null && autocomplete.getItemSelected().equals(arrayListBooksr.get(i).getName()!=null) && arrayListBooksr.get(i).isBorrowedBooks()== true){
                JOptionPane.showMessageDialog(null, "Su prestamo fue hecho exitosamente.");
                arrayListBooksr.get(i).setBorrowedBooks(true);
            }
            file.fileDelete("bookInfo.dat");
            file.serialize(arrayListBooksr.get(i));
            }
   }
   //Muestra las opciones a escoger en la barra buscadora 
   public void Autocomplete(){
        autocomplete = new TextAutoCompleter(jtf_findBook);
        for (int i=0; i<matrix1.length; i++){
          autocomplete.addItem(matrix1[i][0]);
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
    private com.toedter.calendar.JDateChooser jDateDevolucionBooks;
    private com.toedter.calendar.JDateChooser jDatePrestamoBooks;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_accept;
    private javax.swing.JButton jb_back;
    private javax.swing.JButton jb_find;
    private javax.swing.JLabel jl_ISBN;
    private javax.swing.JLabel jl_bookExit2;
    private javax.swing.JLabel jl_bookName;
    private javax.swing.JLabel jl_bookReturn;
    private javax.swing.JLabel jl_booknameShow;
    private javax.swing.JLabel jl_isbnShow;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_slogan;
    private javax.swing.JPanel jp_header;
    private javax.swing.JSeparator js_Line;
    private javax.swing.JSeparator js_Line1;
    private javax.swing.JSeparator jseparator;
    private javax.swing.JTable jt_books;
    private javax.swing.JTextField jtf_findBook;
    // End of variables declaration//GEN-END:variables
}
