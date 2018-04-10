
package Interface;

import domain.students;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class returnFrame extends javax.swing.JFrame {
   MaterialLoan materialoan = new MaterialLoan();
    public returnFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_body = new javax.swing.JPanel();
        jl_name = new javax.swing.JLabel();
        jl_penalty = new javax.swing.JLabel();
        jtf_name = new javax.swing.JTextField();
        jl_penaltyShow = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jl_carnet = new javax.swing.JLabel();
        jtf_carnet = new javax.swing.JTextField();
        jDateReturn = new com.toedter.calendar.JDateChooser();
        jl_carnet1 = new javax.swing.JLabel();
        jp_header = new javax.swing.JPanel();
        jb_back = new javax.swing.JButton();
        jl_logo = new javax.swing.JLabel();
        jl_slogan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_body.setBackground(new java.awt.Color(255, 255, 255));

        jl_name.setBackground(new java.awt.Color(78, 168, 214));
        jl_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_name.setForeground(new java.awt.Color(78, 168, 214));
        jl_name.setText("Nombre:");

        jl_penalty.setBackground(new java.awt.Color(78, 168, 214));
        jl_penalty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_penalty.setForeground(new java.awt.Color(78, 168, 214));
        jl_penalty.setText("Multa:");

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

        jl_penaltyShow.setText("multa");

        jButton1.setText("Devolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jl_carnet.setBackground(new java.awt.Color(78, 168, 214));
        jl_carnet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_carnet.setForeground(new java.awt.Color(78, 168, 214));
        jl_carnet.setText("Carnet:");

        jtf_carnet.setText("Inserte su carnet");
        jtf_carnet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_carnetMouseClicked(evt);
            }
        });

        jl_carnet1.setBackground(new java.awt.Color(78, 168, 214));
        jl_carnet1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_carnet1.setForeground(new java.awt.Color(78, 168, 214));
        jl_carnet1.setText("Devolucion:");

        javax.swing.GroupLayout jp_bodyLayout = new javax.swing.GroupLayout(jp_body);
        jp_body.setLayout(jp_bodyLayout);
        jp_bodyLayout.setHorizontalGroup(
            jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_bodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(356, 356, 356))
            .addGroup(jp_bodyLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_bodyLayout.createSequentialGroup()
                        .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_penalty, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl_penaltyShow, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jtf_name, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jtf_carnet))
                        .addGap(52, 52, 52)
                        .addComponent(jl_carnet1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jDateReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jp_bodyLayout.setVerticalGroup(
            jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_bodyLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_carnet1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jp_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_penalty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_penaltyShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jp_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1050, 520));

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

        getContentPane().add(jp_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_nameMouseClicked
        jtf_name.setText("");
    }//GEN-LAST:event_jtf_nameMouseClicked

    private void jtf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nameActionPerformed

    }//GEN-LAST:event_jtf_nameActionPerformed

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        //Mostrar la ventana de home y esconder la actual
        StudentMenu studentMenu;
        try {
            studentMenu = new StudentMenu();
            studentMenu.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(returnFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jb_backActionPerformed

    private void jtf_carnetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_carnetMouseClicked
        jtf_carnet.setText("");
    }//GEN-LAST:event_jtf_carnetMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jl_penaltyShow.setText(penalty()+"");
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(returnFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnFrame().setVisible(true);
            }
        });
    }
    /*Metodo retorna la cantidad de dias que contiene el prestamo
    *@ return entero cantidad de dias 
    *@param int dayExit, int dayArrival, int monthExit,int monthArrival; dia de salida, dia de llegada,
    *mes de salida, mes de llegada
    */
    public int getNumberDay(int dayExit, int dayArrival, int monthExit,int monthArrival){     
         int dayMissing, numberDays = 0;
         
         switch (monthExit){
             
             case 1: 
                dayMissing = 31-dayExit;
               numberDays= monthArrival==monthExit ?dayArrival-dayExit:dayMissing+dayArrival;
                break;
             case 2:
                 dayMissing = 28-dayExit;
                 numberDays= monthArrival==monthExit ?dayArrival-dayExit:dayMissing+dayArrival;
                 break;
             case 3:
                 dayMissing = 31-monthExit;
                 numberDays= monthArrival==monthExit ?dayArrival-monthExit:dayMissing+dayArrival;
                 break;
             case 4:
                 dayMissing = 30-dayExit;
                 numberDays= monthArrival==monthExit ?dayArrival-dayExit:dayMissing+dayArrival;
                 break;
             case 5:
                 dayMissing = 31-monthExit;
                 numberDays= monthArrival==monthExit ?dayArrival-monthExit:dayMissing+dayArrival;
                 break;
             case 6:
                 dayMissing = 30-dayExit;
                 numberDays= monthArrival==monthExit ?dayArrival-dayExit:dayMissing+dayArrival;
                 break;
             case 7:
                 dayMissing = 31-dayExit;
                 numberDays= monthArrival==monthExit ?dayArrival-dayExit:dayMissing+dayArrival;
                 break;
             case 8:
                 dayMissing = 31-dayExit;
                 numberDays= monthArrival==monthExit ?dayArrival-dayExit:dayMissing+dayArrival;
                 break;
             case 9:
                 dayMissing = 30-dayExit;
                 numberDays= monthArrival==monthExit ?dayArrival-dayExit:dayMissing+dayArrival;
                 break;
             case 10:
                 dayMissing = 31-dayExit;
                 numberDays= monthArrival==monthExit ?dayArrival-dayExit:dayMissing+dayArrival;
                 break;
             case 11:
                 dayMissing = 30-dayExit;
                 numberDays= monthArrival==monthExit ?dayArrival-dayExit:dayMissing+dayArrival;
                 break;
             case 12:
                 dayMissing = 31-dayExit;
                 numberDays= monthArrival==monthExit ?dayArrival-dayExit:dayMissing+dayArrival;
                 break;
         }
         return numberDays;
    }//Fin del metodo
    /*Determina la cantidad de la multa
    @return int penalty: cantidad de monto a pagar
    */
    public int  penalty (){
        int penalty;
        penalty = getNumberDay(materialoan.controlDataExit(),jDateReturn.getCalendar().get(Calendar.DAY_OF_MONTH),
                               materialoan.controlMonthExit(),jDateReturn.getCalendar().get(Calendar.MONTH))* 500;
        
    return penalty;
    }//Fin del metodo


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateReturn;
    private javax.swing.JButton jb_back;
    private javax.swing.JLabel jl_carnet;
    private javax.swing.JLabel jl_carnet1;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_name;
    private javax.swing.JLabel jl_penalty;
    private javax.swing.JLabel jl_penaltyShow;
    private javax.swing.JLabel jl_slogan;
    private javax.swing.JPanel jp_body;
    private javax.swing.JPanel jp_header;
    private javax.swing.JTextField jtf_carnet;
    private javax.swing.JTextField jtf_name;
    // End of variables declaration//GEN-END:variables
}
