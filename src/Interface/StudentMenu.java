
package Interface;

import AppPackage.AnimationClass;
import File.studentsRegistry;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import domain.students;

public class StudentMenu extends javax.swing.JFrame {
    sSlide slide;
    studentsRegistry studRegistry; 
    File fileStudent;
    students studs;
    returnFrame returnFrame ;
    //Constructor
    public StudentMenu() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);//Para que el programa aparezca en el centro
        slide = new sSlide();
        //para que el focus empiece en el boton
        jb_logIn.requestFocus();
        //formato de carreras jcombo
        jcb_career1.removeAllItems();
        jcb_career1.addItem("Seleccionar");
        jcb_career1.addItem("Agronomia");
        jcb_career1.addItem("Educacion");
        jcb_career1.addItem("Informatica");
        //formato de seleccion de año
        
        jcb_year.removeAllItems();
        jcb_year.addItem("Seleccionar");
        for (int i=2010; i<2030; i++){
        jcb_year.addItem(i+"");
        }
        
        jb_addStudent1.setEnabled(false);
        JP_Register.setVisible(false);
        
        jl_bookIcon.setEnabled(false);
        jl_materialIcon.setEnabled(false);
        
        fileStudent = new File("./Registro de estudiantes.dat");
        studRegistry = new studentsRegistry(fileStudent);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Register = new javax.swing.JPanel();
        jl_userIcon1 = new javax.swing.JLabel();
        jl_Year = new javax.swing.JLabel();
        jl_Carnet3 = new javax.swing.JLabel();
        js_carnetLine1 = new javax.swing.JSeparator();
        jl_Users1 = new javax.swing.JLabel();
        jb_addStudent1 = new javax.swing.JButton();
        jcb_year = new javax.swing.JComboBox<>();
        jlb_plusSign = new javax.swing.JLabel();
        jb_goBack = new javax.swing.JButton();
        jl_Carrera2 = new javax.swing.JLabel();
        jcb_career1 = new javax.swing.JComboBox<>();
        jl_showCarnet = new javax.swing.JLabel();
        jb_ViewCarnet = new javax.swing.JButton();
        JP_login = new javax.swing.JPanel();
        jl_userIcon = new javax.swing.JLabel();
        jtf_Carnet = new javax.swing.JTextField();
        js_carnetLine = new javax.swing.JSeparator();
        jl_Users = new javax.swing.JLabel();
        jl_menu = new javax.swing.JLabel();
        jb_logIn = new javax.swing.JButton();
        jl_menuHome = new javax.swing.JLabel();
        jl_menuAbout = new javax.swing.JLabel();
        jl_Carnet2 = new javax.swing.JLabel();
        jb_goRegister = new javax.swing.JButton();
        jp_body = new javax.swing.JPanel();
        jl_materialIcon = new javax.swing.JLabel();
        jl_bookInfo = new javax.swing.JLabel();
        jl_bookIcon = new javax.swing.JLabel();
        jl_materialInfo = new javax.swing.JLabel();
        sep_home = new javax.swing.JSeparator();
        jb_goReturn = new javax.swing.JButton();
        jp_header = new javax.swing.JPanel();
        jb_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_Register.setBackground(new java.awt.Color(255, 255, 255));
        JP_Register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JP_Register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_userIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_userIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Student_Male_100px.png"))); // NOI18N
        JP_Register.add(jl_userIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, 130));

        jl_Year.setBackground(new java.awt.Color(78, 168, 214));
        jl_Year.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Year.setForeground(new java.awt.Color(78, 168, 214));
        jl_Year.setText("Año:");
        JP_Register.add(jl_Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 90, 30));

        jl_Carnet3.setBackground(new java.awt.Color(78, 168, 214));
        jl_Carnet3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Carnet3.setForeground(new java.awt.Color(78, 168, 214));
        jl_Carnet3.setText("Carnet:");
        JP_Register.add(jl_Carnet3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 90, 30));

        js_carnetLine1.setBackground(new java.awt.Color(60, 63, 65));
        js_carnetLine1.setForeground(new java.awt.Color(45, 45, 45));
        js_carnetLine1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        JP_Register.add(js_carnetLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 160, 10));

        jl_Users1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Add_User_Male_32px.png"))); // NOI18N
        JP_Register.add(jl_Users1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jb_addStudent1.setBackground(new java.awt.Color(204, 204, 204));
        jb_addStudent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Add_User_Male_32px.png"))); // NOI18N
        jb_addStudent1.setText("Register");
        jb_addStudent1.setBorderPainted(false);
        jb_addStudent1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_addStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addStudent1ActionPerformed(evt);
            }
        });
        JP_Register.add(jb_addStudent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 120, 50));

        jcb_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JP_Register.add(jcb_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 130, 30));

        jlb_plusSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Plus_30px.png"))); // NOI18N
        JP_Register.add(jlb_plusSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 168, -1, 40));

        jb_goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_40px_1_Off.png"))); // NOI18N
        jb_goBack.setBorderPainted(false);
        jb_goBack.setContentAreaFilled(false);
        jb_goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_goBackActionPerformed(evt);
            }
        });
        JP_Register.add(jb_goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 120, 40));

        jl_Carrera2.setBackground(new java.awt.Color(78, 168, 214));
        jl_Carrera2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Carrera2.setForeground(new java.awt.Color(78, 168, 214));
        jl_Carrera2.setText("Carrera:");
        JP_Register.add(jl_Carrera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 30));

        jcb_career1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_career1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_career1ActionPerformed(evt);
            }
        });
        JP_Register.add(jcb_career1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 130, 30));
        JP_Register.add(jl_showCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 160, 20));

        jb_ViewCarnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Eye_32px.png"))); // NOI18N
        jb_ViewCarnet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ViewCarnetMouseClicked(evt);
            }
        });
        JP_Register.add(jb_ViewCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 373, 40, 30));

        getContentPane().add(JP_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 580));

        JP_login.setBackground(new java.awt.Color(255, 255, 255));
        JP_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        JP_login.setForeground(new java.awt.Color(255, 255, 255));
        JP_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Student_Male_100px.png"))); // NOI18N
        JP_login.add(jl_userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, 130));

        jtf_Carnet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtf_Carnet.setText("Ingrese carnet");
        jtf_Carnet.setBorder(null);
        jtf_Carnet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtf_CarnetMouseClicked(evt);
            }
        });
        JP_login.add(jtf_Carnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 210, 20));

        js_carnetLine.setBackground(new java.awt.Color(60, 63, 65));
        js_carnetLine.setForeground(new java.awt.Color(45, 45, 45));
        js_carnetLine.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        JP_login.add(js_carnetLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 190, 10));

        jl_Users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_Account_32px.png"))); // NOI18N
        JP_login.add(jl_Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jl_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Menu_32px.png"))); // NOI18N
        jl_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jl_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_menuMouseClicked(evt);
            }
        });
        JP_login.add(jl_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jb_logIn.setBackground(new java.awt.Color(204, 204, 204));
        jb_logIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Enter_32px.png"))); // NOI18N
        jb_logIn.setText("Enter");
        jb_logIn.setBorderPainted(false);
        jb_logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_logInActionPerformed(evt);
            }
        });
        JP_login.add(jb_logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 100, 50));

        jl_menuHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_menuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Home_32px.png"))); // NOI18N
        jl_menuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_menuHomeMouseClicked(evt);
            }
        });
        JP_login.add(jl_menuHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 40, 40, 40));

        jl_menuAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_menuAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Info_32px_1.png"))); // NOI18N
        jl_menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_menuAboutMouseClicked(evt);
            }
        });
        JP_login.add(jl_menuAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 75, 40, 40));

        jl_Carnet2.setBackground(new java.awt.Color(78, 168, 214));
        jl_Carnet2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Carnet2.setForeground(new java.awt.Color(78, 168, 214));
        jl_Carnet2.setText("Carnet:");
        JP_login.add(jl_Carnet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 30));

        jb_goRegister.setText("Registrate!");
        jb_goRegister.setBorderPainted(false);
        jb_goRegister.setContentAreaFilled(false);
        jb_goRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_goRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_goRegisterActionPerformed(evt);
            }
        });
        JP_login.add(jb_goRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 100, -1));

        getContentPane().add(JP_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 580));

        jp_body.setBackground(new java.awt.Color(255, 255, 255));
        jp_body.setForeground(new java.awt.Color(204, 204, 204));
        jp_body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jp_body.add(jl_materialIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 270, 260));

        jl_bookInfo.setBackground(new java.awt.Color(78, 168, 214));
        jl_bookInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_bookInfo.setForeground(new java.awt.Color(78, 168, 214));
        jl_bookInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_bookInfo.setText("Prestamos de libros");
        jp_body.add(jl_bookInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 270, 30));

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
        jp_body.add(jl_bookIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 270, 260));

        jl_materialInfo.setBackground(new java.awt.Color(78, 168, 214));
        jl_materialInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_materialInfo.setForeground(new java.awt.Color(78, 168, 214));
        jl_materialInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_materialInfo.setText("Prestamo de material audiovisual");
        jp_body.add(jl_materialInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 270, 30));

        sep_home.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jp_body.add(sep_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 10, 310));

        jb_goReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Feed_In_64px.png"))); // NOI18N
        jb_goReturn.setText("Devolver libros o materiales");
        jb_goReturn.setBorderPainted(false);
        jb_goReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_goReturnMouseClicked(evt);
            }
        });
        jb_goReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_goReturnActionPerformed(evt);
            }
        });
        jp_body.add(jb_goReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 250, 60));

        getContentPane().add(jp_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 780, 520));

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
        jp_header.add(jb_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jp_header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("For learning. For life.");
        jp_header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 60));

        getContentPane().add(jp_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 780, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //para que el menu pueda interactuar con los demas labels animadamente
    private void jl_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_menuMouseClicked
        AnimationClass menu = new  AnimationClass();
        //para el icono de Home
        menu.jLabelXRight(-40, 10, 10, 5, jl_menuHome);
        //para que se devuelva a su estado original
        menu.jLabelXLeft(10, -40, 10, 5, jl_menuHome);
        
        //para el icono de about
        menu.jLabelXRight(-40, 10, 10, 5, jl_menuAbout);
        menu.jLabelXLeft(10, -40, 10, 5, jl_menuAbout);
    }//GEN-LAST:event_jl_menuMouseClicked

    private void jl_bookIconMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_bookIconMouseMoved
        //se agrega el borde cuando entra el mouse
        jl_bookIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));  
    }//GEN-LAST:event_jl_bookIconMouseMoved

    //se quita el borde cuando el mouse sale
    private void jl_bookIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_bookIconMouseExited
       jl_bookIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jl_bookIconMouseExited

    private void jl_materialIconMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_materialIconMouseMoved
        jl_materialIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jl_materialIconMouseMoved

    private void jl_materialIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_materialIconMouseExited
        jl_materialIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jl_materialIconMouseExited

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
       //Mostrar la ventana de home y esconder la actual
       HomeFrame home = new HomeFrame();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_backActionPerformed

    private void jl_menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_menuHomeMouseClicked
        HomeFrame home = new HomeFrame();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jl_menuHomeMouseClicked

    private void jtf_CarnetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_CarnetMouseClicked
        jtf_Carnet.setText("");
    }//GEN-LAST:event_jtf_CarnetMouseClicked

    private void jb_logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_logInActionPerformed

     JP_Register.setVisible(false);
        //this.setVisible(false); 
     
        String carnet = makeCarnet(jcb_career1.getSelectedItem()+"",
                                      jcb_year.getSelectedItem()+""); 
        try {
            if(studRegistry.findCarnet(carnet) == true || jtf_Carnet.getText().equalsIgnoreCase("root")){
                JOptionPane.showMessageDialog(null, "Bienvenido!");
                jl_bookIcon.setEnabled(true);
                jl_materialIcon.setEnabled(true);
                jtf_Carnet.setEnabled(false);
                jb_goRegister.setEnabled(false);
                jb_logIn.setEnabled(false);
                   }else
                JOptionPane.showMessageDialog(null, "No se ha encontrado dentro del sistema! \n Proceda a registrarse.");
                
                
            
        } catch (IOException ex) {
           Logger.getLogger(StudentMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_logInActionPerformed

    private void jb_goRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_goRegisterActionPerformed
        slide.jPanelXDerecha(-280, 0, 10, 5, JP_Register);
        JP_login.setVisible(false);
        JP_Register.setVisible(true);
    }//GEN-LAST:event_jb_goRegisterActionPerformed

    private void jb_goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_goBackActionPerformed
        //slide.jPanelXIzquierda(0, -280, 10, 5, JP_Register);
        JP_login.setVisible(true);
        JP_Register.setVisible(false);
        jb_back.requestFocus();
    }//GEN-LAST:event_jb_goBackActionPerformed

    private void jcb_career1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_career1ActionPerformed
       
    }//GEN-LAST:event_jcb_career1ActionPerformed

    private void jb_addStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addStudent1ActionPerformed
             
        
        String carnet = makeCarnet(jcb_career1.getSelectedItem()+"",
                                      jcb_year.getSelectedItem()+""); 
        try {
            
            if(studRegistry.findCarnet(carnet) == false){
            studs = new students(jcb_career1.getSelectedItem()+"", Integer.parseInt(jcb_year.getSelectedItem()+""), carnet);
            studRegistry.addEndRecord(studs);
            JOptionPane.showMessageDialog(null, "El estudiante se ingreso correctamente");
            JP_Register.setVisible(false);
            JP_login.setVisible(true);
            jb_addStudent1.setEnabled(false);
            jb_addStudent1.requestFocus();
            
            }
            else{
                JOptionPane.showMessageDialog(null, "El estudiante ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(StudentMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jb_addStudent1ActionPerformed

    private void jb_ViewCarnetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ViewCarnetMouseClicked
        String carnet = makeCarnet(jcb_career1.getSelectedItem()+"",
                                      jcb_year.getSelectedItem()+"");
        jl_showCarnet.setText(carnet);
        jb_addStudent1.setEnabled(true);
    }//GEN-LAST:event_jb_ViewCarnetMouseClicked

    private void jl_menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_menuAboutMouseClicked
        JOptionPane.showMessageDialog(null, "Si quieres ingresar a nuestro sistema: \n"
                + "1. Asegurate de estar bien registrado, el cual si aun no lo estas puedes hacerlo "
                + " el boton de registrarse abajo.\n 2. Luego logearte con tu carnet.");
    }//GEN-LAST:event_jl_menuAboutMouseClicked

    private void jb_goReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_goReturnActionPerformed
        returnFrame = new returnFrame();
        returnFrame.setVisible(true);
    }//GEN-LAST:event_jb_goReturnActionPerformed

    private void jl_bookIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_bookIconMouseClicked
        this.setVisible(false);
        BookLoan bookL = new BookLoan();
        bookL.setVisible(true);
    }//GEN-LAST:event_jl_bookIconMouseClicked

    private void jl_materialIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_materialIconMouseClicked
        this.setVisible(false);
        MaterialLoan materialL = new MaterialLoan();
        materialL.setVisible(true);
    }//GEN-LAST:event_jl_materialIconMouseClicked

    private void jb_goReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_goReturnMouseClicked
       returnFrame returnF = new returnFrame();
       this.setVisible(false);
       returnF.setVisible(true);
    }//GEN-LAST:event_jb_goReturnMouseClicked

    
    //Se hace el carnet segun lo que escogio el estudiante
    public String makeCarnet(String career, String year){
        char firstCareer, lastYear;
        String carnet;
        int carnetConsec = studRegistry.fileSize();
        String formatCarnet = carnetFormat("00", carnetConsec);
        firstCareer = career.charAt(0);
        lastYear = year.charAt(year.length()-1);
        
        carnet =Character.toString(firstCareer)+Character.toString(lastYear)+formatCarnet;
        
        return carnet;
    }
    
    //metodo para dar formato al carnet
    static public String carnetFormat(String pattern, double value ) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(value);
      return output;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StudentMenu().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(StudentMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_Register;
    private javax.swing.JPanel JP_login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb_ViewCarnet;
    private javax.swing.JButton jb_addStudent1;
    private javax.swing.JButton jb_back;
    private javax.swing.JButton jb_goBack;
    private javax.swing.JButton jb_goRegister;
    private javax.swing.JButton jb_goReturn;
    private javax.swing.JButton jb_logIn;
    private javax.swing.JComboBox<String> jcb_career1;
    private javax.swing.JComboBox<String> jcb_year;
    private javax.swing.JLabel jl_Carnet2;
    private javax.swing.JLabel jl_Carnet3;
    private javax.swing.JLabel jl_Carrera2;
    private javax.swing.JLabel jl_Users;
    private javax.swing.JLabel jl_Users1;
    private javax.swing.JLabel jl_Year;
    private javax.swing.JLabel jl_bookIcon;
    private javax.swing.JLabel jl_bookInfo;
    private javax.swing.JLabel jl_materialIcon;
    private javax.swing.JLabel jl_materialInfo;
    private javax.swing.JLabel jl_menu;
    private javax.swing.JLabel jl_menuAbout;
    private javax.swing.JLabel jl_menuHome;
    private javax.swing.JLabel jl_showCarnet;
    private javax.swing.JLabel jl_userIcon;
    private javax.swing.JLabel jl_userIcon1;
    private javax.swing.JLabel jlb_plusSign;
    private javax.swing.JPanel jp_body;
    private javax.swing.JPanel jp_header;
    private javax.swing.JSeparator js_carnetLine;
    private javax.swing.JSeparator js_carnetLine1;
    private javax.swing.JTextField jtf_Carnet;
    private javax.swing.JSeparator sep_home;
    // End of variables declaration//GEN-END:variables
}
