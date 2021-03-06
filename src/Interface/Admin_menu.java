
package Interface;

public class Admin_menu extends javax.swing.JFrame {    
    public Admin_menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_home = new javax.swing.JPanel();
        jl_materialIcon = new javax.swing.JLabel();
        jl_bookInfo = new javax.swing.JLabel();
        jl_bookIcon = new javax.swing.JLabel();
        jl_materialInfo = new javax.swing.JLabel();
        sep_home = new javax.swing.JSeparator();
        jp_header = new javax.swing.JPanel();
        jb_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jp_home.setBackground(new java.awt.Color(255, 255, 255));
        jp_home.setForeground(new java.awt.Color(204, 204, 204));
        jp_home.setPreferredSize(new java.awt.Dimension(1050, 580));
        jp_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_materialIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_materialIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/multiple-device-support.png"))); // NOI18N
        jl_materialIcon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jl_materialIcon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jl_materialIconMouseMoved(evt);
            }
        });
        jl_materialIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_materialIconMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_materialIconMouseExited(evt);
            }
        });
        jp_home.add(jl_materialIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 270, 260));

        jl_bookInfo.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_bookInfo.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_bookInfo.setText("Insertar libros");
        jp_home.add(jl_bookInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 270, 30));

        jl_bookIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_bookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/books-stack-of-three.png"))); // NOI18N
        jl_bookIcon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jl_bookIcon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jl_bookIconMouseMoved(evt);
            }
        });
        jl_bookIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_bookIconMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_bookIconMouseExited(evt);
            }
        });
        jp_home.add(jl_bookIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 270, 260));

        jl_materialInfo.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_materialInfo.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_materialInfo.setText("Insertar material audiovisual");
        jp_home.add(jl_materialInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 270, 30));

        sep_home.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jp_home.add(sep_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 10, 310));

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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jp_header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("For learning. For life.");
        jp_header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jp_home, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jl_materialIconMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_materialIconMouseMoved
        jl_materialIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jl_materialIconMouseMoved

    private void jl_materialIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_materialIconMouseExited
        jl_materialIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jl_materialIconMouseExited

    private void jl_bookIconMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_bookIconMouseMoved
        //se agrega el borde cuando entra el mouse
        jl_bookIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jl_bookIconMouseMoved

    private void jl_bookIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_bookIconMouseExited
        jl_bookIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jl_bookIconMouseExited

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        //Mostrar la ventana de home y esconder la actual
        HomeFrame home = new HomeFrame();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_backActionPerformed

    private void jl_bookIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_bookIconMouseClicked
        //mostrar la ventana de insertar libros
        BookInsert bookInsert = new BookInsert();
        this.setVisible(false);
        bookInsert.setVisible(true);
    }//GEN-LAST:event_jl_bookIconMouseClicked

    private void jl_materialIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_materialIconMouseClicked
        this.setVisible(false);
        InsertMaterials inMaterial = new InsertMaterials();
        inMaterial.setVisible(true);
    }//GEN-LAST:event_jl_materialIconMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb_back;
    private javax.swing.JLabel jl_bookIcon;
    private javax.swing.JLabel jl_bookInfo;
    private javax.swing.JLabel jl_materialIcon;
    private javax.swing.JLabel jl_materialInfo;
    private javax.swing.JPanel jp_header;
    private javax.swing.JPanel jp_home;
    private javax.swing.JSeparator sep_home;
    // End of variables declaration//GEN-END:variables
}
