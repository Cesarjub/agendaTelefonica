package Agenda;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaRegistroAgenda extends javax.swing.JFrame {

    public VentanaRegistroAgenda() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);    
        
        contactosAgenda = new File("src\\Archivos\\" + "AgendaTelefonica.txt");            
        
        gsa = new GetSetAgenda();
        lda = new LeerDatosAgenda();
        ma = new MetodosArchivos();
        
        jTextField3.setVisible(false);

        //Icono de la Ventana
        try{
            Image img = ImageIO.read(new File("src\\Imagenes\\phonebook.png"));
                this.setIconImage(img);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);        
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevos contactos");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add-group (1).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 10, 70, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("nue");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 30, 40, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(85, 181, 160));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("contacto");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 30, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 30, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(96, 184, 165));
        jLabel5.setText("vo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 30, 30, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Numero telefonico:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 190, 120, 15);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(40, 210, 170, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(40, 130, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nombre completo:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 110, 120, 15);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "Facebook", "Instagram", "Twitter" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(40, 280, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Red social:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 260, 80, 15);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(40, 280, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Genero:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 110, 60, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Estado civil:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(440, 110, 80, 15);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "Soltero", "Casado", "Divorciado", "Viudo" }));
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(440, 130, 110, 20);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(250, 210, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Correo:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(250, 190, 70, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Direccion:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(250, 260, 70, 15);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(250, 280, 280, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 370, 90, 30);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Femenino");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(250, 130, 80, 23);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Masculino");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(340, 130, 80, 23);

        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 160, 180, 10);

        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(40, 240, 180, 10);

        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(440, 160, 160, 10);

        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel16);
        jLabel16.setBounds(40, 310, 170, 10);

        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel17);
        jLabel17.setBounds(250, 240, 190, 10);

        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel18);
        jLabel18.setBounds(250, 310, 280, 10);

        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel19);
        jLabel19.setBounds(250, 160, 150, 10);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 460);

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eraser.png"))); // NOI18N
        jMenuItem2.setText("Limpiar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png"))); // NOI18N
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group.png"))); // NOI18N
        jMenuItem1.setText("Contactos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 629, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    
    gsa.setNombre(jTextField2.getText());
    gsa.setNumero(jTextField1.getText());
    gsa.setCorreo(jTextField4.getText());
    gsa.setDireccion(jTextField5.getText());
    gsa.setCuenta(jTextField3.getText());
    
    //Nombre
    if(lda.getLeerNombre(gsa.getNombre()))
        jLabel13.setText(null);
    else
        jLabel13.setText("**El nombre es incorrecto"); 
    
    //Genero
    if(jRadioButton2.isSelected())
    {
        gsa.setGenero("Masculino");
        jLabel19.setText(null);
    }
    else if(jRadioButton1.isSelected())
    {
        gsa.setGenero("Femenino");
        jLabel19.setText(null);
    }
    else
        jLabel19.setText("*Seleccione una opcion");
    
    //Estado civil
    if(jComboBox3.getSelectedItem().equals("Selecciona"))
        jLabel15.setText("*Seleccione un campo valido");
    else
    {
        gsa.setEstadoCivil(jComboBox3.getSelectedItem().toString());
        jLabel15.setText(null);
    }
    
    //Numero de telefono
    if(lda.getLeerNumero(gsa.getNumero()))
        jLabel14.setText(null);
    else
        jLabel14.setText("**El numero es incorrecto");
    
    //Correo
    if(lda.getLeerCorreo(gsa.getCorreo()))
        jLabel17.setText(null);
    else
        jLabel17.setText("***El correo es incorrecto");
    
    //Direccion
    if(gsa.getDireccion().length() < 1)
        jLabel18.setText("***La direccion es incorrecta");
    else
        jLabel18.setText(null);
    
    //Red social
    if(jComboBox1.getSelectedItem().equals("Selecciona"))
    {
        jLabel16.setText("*Seleccione un campo valido");
        jTextField3.setVisible(false);
    }
    else
    {
        if(gsa.getCuenta().length() < 2)
            jLabel16.setText("**El usuario es incorrecto");
        else
            jLabel16.setText(null);
    }
    
    if((lda.getLeerNombre(gsa.getNombre())) & (lda.getLeerNumero(gsa.getNumero())) & (lda.getLeerCorreo(gsa.getCorreo()))
             && (!jComboBox3.getSelectedItem().equals("Selecciona")) && (jRadioButton1.isSelected() || jRadioButton2.isSelected()) 
                && (gsa.getDireccion().length() > 1) && (gsa.getCuenta().length() > 1) )
    {
        if(ma.setLlenarArchivo(contactosAgenda, gsa.getNombre(), gsa.getGenero(), gsa.getEstadoCivil(), 
                gsa.getNumero(), gsa.getCorreo(), gsa.getDireccion(), gsa.getCuenta(), gsa.getRedSocial()))
        {
            JOptionPane.showMessageDialog(null,"El contacto ha sido guardado", "Contacto Agregado", 1);            
            
            jTextField1.setText(null);
            jTextField2.setText(null);
            jTextField3.setText(null);
            jTextField4.setText(null);
            jTextField5.setText(null);
            jComboBox1.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
            buttonGroup1.clearSelection();
        
            jLabel13.setText(null);
            jLabel14.setText(null);
            jLabel15.setText(null);
            jLabel16.setText(null);
            jLabel17.setText(null);
            jLabel18.setText(null);
            jLabel19.setText(null);
            jComboBox1.setVisible(true);  
        }
        else
            JOptionPane.showMessageDialog(null,"No se ha podido agregar el contacto","!! ERROR !!", 2); 
    }
    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    if(jComboBox1.getSelectedItem().equals("Selecciona"))
    {
    jLabel16.setText("*Seleccione un campo valido");
    jTextField3.setVisible(false);
    }
    else if(jComboBox1.getSelectedItem().equals("Facebook"))
    {
        jLabel16.setText(null);
        jComboBox1.setVisible(false);
        jTextField3.setVisible(true);
        gsa.setRedSocial("Facebook");
    }     
    else if(jComboBox1.getSelectedItem().equals("Twitter"))
    {
        jLabel16.setText(null);
        jComboBox1.setVisible(false);
        jTextField3.setVisible(true);
        jTextField3.setText("@");  
        gsa.setRedSocial("Twitter");
    }
    else if(jComboBox1.getSelectedItem().equals("Instagram"))
    {
        jLabel16.setText(null);
        jComboBox1.setVisible(false);
        jTextField3.setVisible(true);
        jTextField3.setText("@");  
        gsa.setRedSocial("Instagram");
    }
    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jComboBox1.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        
        jLabel13.setText(null);
        jLabel14.setText(null);
        jLabel15.setText(null);
        jLabel16.setText(null);
        jLabel17.setText(null);
        jLabel18.setText(null);
        jLabel19.setText(null);
        jComboBox1.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaPrincipalAgenda vpa = new VentanaPrincipalAgenda();
        
        this.setVisible(false);
        vpa.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistroAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
    private GetSetAgenda gsa;
    private LeerDatosAgenda lda;
    private MetodosArchivos ma;
    private File contactosAgenda;  
}
