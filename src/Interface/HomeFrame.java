
package Interface;

import AppPackage.AnimationClass;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HomeFrame extends javax.swing.JFrame {
    //Constructor
    public HomeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_header = new javax.swing.JPanel();
        jb_Minimize = new javax.swing.JButton();
        jb_Close = new javax.swing.JButton();
        jl_logo = new javax.swing.JLabel();
        jl_slogan = new javax.swing.JLabel();
        jp_home = new javax.swing.JPanel();
        jl_studentIcon = new javax.swing.JLabel();
        sep_Home = new javax.swing.JSeparator();
        jl_adminIcon = new javax.swing.JLabel();
        jl_students = new javax.swing.JLabel();
        jl_admins = new javax.swing.JLabel();
        jl_menu = new javax.swing.JLabel();
        jl_menuSupport = new javax.swing.JLabel();
        jl_menuAbout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_header.setBackground(new java.awt.Color(78, 168, 214));
        jp_header.setPreferredSize(new java.awt.Dimension(1050, 60));
        jp_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_40px_off.png"))); // NOI18N
        jb_Minimize.setBorderPainted(false);
        jb_Minimize.setContentAreaFilled(false);
        jb_Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_Minimize.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_40px_1_On.png"))); // NOI18N
        jb_Minimize.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_40px_1_On.png"))); // NOI18N
        jb_Minimize.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_40px_1_On.png"))); // NOI18N
        jb_Minimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_40px_1_On.png"))); // NOI18N
        jb_Minimize.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_40px_1_On.png"))); // NOI18N
        jb_Minimize.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_40px_1_On.png"))); // NOI18N
        jb_Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_MinimizeActionPerformed(evt);
            }
        });
        jp_header.add(jb_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 40, 50));

        jb_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_40px_Off.png"))); // NOI18N
        jb_Close.setBorderPainted(false);
        jb_Close.setContentAreaFilled(false);
        jb_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_Close.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_40px_1_On.png"))); // NOI18N
        jb_Close.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_40px_1_On.png"))); // NOI18N
        jb_Close.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_40px_1_On.png"))); // NOI18N
        jb_Close.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_40px_1_On.png"))); // NOI18N
        jb_Close.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_40px_1_On.png"))); // NOI18N
        jb_Close.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_40px_1_On.png"))); // NOI18N
        jb_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CloseActionPerformed(evt);
            }
        });
        jp_header.add(jb_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1013, 0, 40, 50));

        jl_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jp_header.add(jl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 60));

        jl_slogan.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jl_slogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_slogan.setText("For learning. For life.");
        jp_header.add(jl_slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 190, 60));

        getContentPane().add(jp_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jp_home.setBackground(new java.awt.Color(255, 255, 255));
        jp_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_studentIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_studentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/study.png"))); // NOI18N
        jl_studentIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_studentIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_studentIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_studentIconMouseExited(evt);
            }
        });
        jp_home.add(jl_studentIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 260, 270));

        sep_Home.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jp_home.add(sep_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 10, 320));

        jl_adminIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_adminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin.png"))); // NOI18N
        jl_adminIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_adminIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jl_adminIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jl_adminIconMouseExited(evt);
            }
        });
        jp_home.add(jl_adminIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 260, 270));

        jl_students.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jl_students.setForeground(new java.awt.Color(78, 168, 214));
        jl_students.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_students.setText("Estudiantes");
        jp_home.add(jl_students, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 220, 30));

        jl_admins.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jl_admins.setForeground(new java.awt.Color(78, 168, 214));
        jl_admins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_admins.setText("Administrativos");
        jp_home.add(jl_admins, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 220, 30));

        jl_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Menu_32px.png"))); // NOI18N
        jl_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jl_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_menuMouseClicked(evt);
            }
        });
        jp_home.add(jl_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, -1));

        jl_menuSupport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_menuSupport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Online_Support_32px_1.png"))); // NOI18N
        jl_menuSupport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_menuSupportMouseClicked(evt);
            }
        });
        jp_home.add(jl_menuSupport, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, 40, 40));

        jl_menuAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_menuAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Info_32px_1.png"))); // NOI18N
        jl_menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_menuAboutMouseClicked(evt);
            }
        });
        jp_home.add(jl_menuAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 90, 40, 40));

        getContentPane().add(jp_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //close the app
    private void jb_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_CloseActionPerformed

    //minimize the app
    private void jb_MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_MinimizeActionPerformed
        this.setState(HomeFrame.ICONIFIED);
    }//GEN-LAST:event_jb_MinimizeActionPerformed

    private void jl_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_menuMouseClicked
        AnimationClass menu = new  AnimationClass();
        //para el icono de support
        menu.jLabelXRight(-40, 10, 10, 5, jl_menuSupport);
        menu.jLabelXLeft(10, -40, 10, 5, jl_menuSupport);
        //para el icono de about
        menu.jLabelXRight(-40, 10, 10, 5, jl_menuAbout);
        menu.jLabelXLeft(10, -40, 10, 5, jl_menuAbout);
    }//GEN-LAST:event_jl_menuMouseClicked

    private void jl_studentIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_studentIconMouseClicked
        //accesa al menu de estudiantes
        StudentMenu studLogin = null;
        try {
            studLogin = new StudentMenu();
        } catch (IOException ex) {
            Logger.getLogger(HomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        studLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jl_studentIconMouseClicked

    private void jl_adminIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_adminIconMouseEntered
        //subraya el boton
        jl_adminIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));  
    }//GEN-LAST:event_jl_adminIconMouseEntered

    private void jl_adminIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_adminIconMouseExited
        //subraya el boton
        jl_adminIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jl_adminIconMouseExited

    private void jl_studentIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_studentIconMouseEntered
      //subraya el boton
        jl_studentIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));  
    }//GEN-LAST:event_jl_studentIconMouseEntered

    private void jl_studentIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_studentIconMouseExited
        //subraya el boton
        jl_studentIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jl_studentIconMouseExited

    private void jl_adminIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_adminIconMouseClicked
        //esconde el menu actual y muestra la opcion del usuario
        Admin_menu admin = new Admin_menu();
        this.setVisible(false);
        admin.setVisible(true);
    }//GEN-LAST:event_jl_adminIconMouseClicked

    private void jl_menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_menuAboutMouseClicked
        JOptionPane.showMessageDialog(null, "Product Version: Bibliotech: V1.2 \n" +
                                            "Updates: First update, almost working \n" +
                                            "Runtime: Java(TM) SE Runtime Environment 1.8.0_111-b14");
    }//GEN-LAST:event_jl_menuAboutMouseClicked

    private void jl_menuSupportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_menuSupportMouseClicked
        JOptionPane.showMessageDialog(null, "Programadores: \n Jean Paul Sagot Vargas -B56438"
                                      + "\n Jesus Felipe Torres -");
    }//GEN-LAST:event_jl_menuSupportMouseClicked

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Close;
    private javax.swing.JButton jb_Minimize;
    private javax.swing.JLabel jl_adminIcon;
    private javax.swing.JLabel jl_admins;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_menu;
    private javax.swing.JLabel jl_menuAbout;
    private javax.swing.JLabel jl_menuSupport;
    private javax.swing.JLabel jl_slogan;
    private javax.swing.JLabel jl_studentIcon;
    private javax.swing.JLabel jl_students;
    private javax.swing.JPanel jp_header;
    private javax.swing.JPanel jp_home;
    private javax.swing.JSeparator sep_Home;
    // End of variables declaration//GEN-END:variables
}
