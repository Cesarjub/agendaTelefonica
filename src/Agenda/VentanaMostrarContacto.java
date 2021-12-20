package Agenda;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class VentanaMostrarContacto extends javax.swing.JFrame {

    public VentanaMostrarContacto() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);          

        contactosAgenda = new File("src\\Archivos\\" + "AgendaTelefonica.txt");     
        
        ma = new MetodosArchivos();
        
        nombreVec = new ArrayList <String>(); 
        numeroVec = new ArrayList <String>();         
        generoVec = new ArrayList <String>(); 
        estadoCivilVec = new ArrayList <String>();  
        correoVec = new ArrayList <String>(); 
        direccionVec = new ArrayList <String>(); 
        cuentaVec = new ArrayList <String>(); 
        redSocialVec = new ArrayList <String>();         
        
        jComboBox1.setVisible(false);  
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);     
        jButton1.setVisible(false);
        
        //Icono de la Ventana
        try{
            Image img = ImageIO.read(new File("src\\Imagenes\\phonebook.png"));
                this.setIconImage(img);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);        
        }        
    }

    public void setArchivo(String num)
    {
        String cadena;
        int i; 
      
         try
         {  
            fr = new FileReader (contactosAgenda);
            br = new BufferedReader(fr);
             
            i = 0;
            cadena = "";
            while(cadena != null)
            {
               cadena = br.readLine(); 
               numeroVec.add(i, cadena);
            
               cadena = br.readLine();
               nombreVec.add(i, cadena);
            
               cadena = br.readLine();        
               generoVec.add(i, cadena);
               
               cadena = br.readLine();     
               estadoCivilVec.add(i, cadena);  
               
               cadena = br.readLine(); 
               correoVec.add(i, cadena);               
            
               cadena = br.readLine();
               direccionVec.add(i, cadena);
            
               cadena = br.readLine();
               cuentaVec.add(i, cadena);               
            
               cadena = br.readLine();
               redSocialVec.add(i, cadena);               
            
               if(cadena != null )
               { 
                   if(numeroVec.get(i).equals(num))
                   {
                       jLabel7.setText(numeroVec.get(i));
                       jLabel4.setText(nombreVec.get(i));
                       jLabel5.setText(generoVec.get(i));
                       jLabel6.setText(estadoCivilVec.get(i));
                       jLabel8.setText(correoVec.get(i));
                       jLabel11.setText(direccionVec.get(i));
                       jLabel10.setText(cuentaVec.get(i));
                       jLabel9.setText(redSocialVec.get(i));  
                   }
               }
            i++;
         }              
            br.close();                                            
         }     
         catch (FileNotFoundException ex) //Si el archivo no se encuentra mandara un aviso
         {
            JOptionPane.showMessageDialog(null,"No se encontro el archivo: \n"+ex,"!! ERROR !!", 2);        
         }
         catch (Exception e) //Cualquier otra excepcion
         {
            JOptionPane.showMessageDialog(null,"Existe un error: \n"+e,"!! ERROR !!", 2);        
         }                  
    }
      
    public boolean getEliminarContactos(File archivoViejo, String numeroTel) throws FileNotFoundException
    {
        boolean bandera = false;
        
        String nuevo = archivoViejo.getParent() + "Temporal.txt";
        File archivoNuevo = new File(nuevo);
        
        String cadena;
        int i;
        
        String numero = "", nombre = "", genero = "", estadoCivil = "", correo = "", direccion = "", cuenta = "",
                redSocial = "";        
        
        br = new BufferedReader(new FileReader(archivoViejo));
        
        try
        {
            i = 0;
            cadena = "";
            
            while(cadena != null)
            {
                cadena = br.readLine();
                numeroVec.add(cadena);
                
                cadena = br.readLine();
                nombreVec.add(cadena);
                
                cadena = br.readLine();
                generoVec.add(cadena);
                
                cadena = br.readLine();
                estadoCivilVec.add(cadena);
                
                cadena = br.readLine();
                correoVec.add(cadena);
                
                cadena = br.readLine();
                direccionVec.add(cadena);
                
                cadena = br.readLine();
                cuentaVec.add(cadena);
                
                cadena = br.readLine();
                redSocialVec.add(cadena); 
                
                if(cadena != null)
                {
                    if(!numeroVec.get(i).trim().equals(numeroTel))
                    {
                        numero = numeroVec.get(i);
                        nombre = nombreVec.get(i);
                        genero = generoVec.get(i);
                        estadoCivil = estadoCivilVec.get(i);
                        correo = correoVec.get(i);
                        direccion = direccionVec.get(i);
                        cuenta = cuentaVec.get(i);
                        redSocial = redSocialVec.get(i);
                        
                        ma.setLlenarArchivo(archivoNuevo, nombre, genero, estadoCivil, numero, correo, direccion, 
                                cuenta, redSocial);    
                    }
                    else
                    {
                        bandera = true;
                    }
                }
                i++;
            }
            br.close();
            
            ma.getBorrarArchivo(archivoViejo);
            
            archivoNuevo.renameTo(archivoViejo);
        }
         catch (FileNotFoundException ex) //Si el archivo no se encuentra mandara un aviso
         {
            JOptionPane.showMessageDialog(null,"No se encontro el archivo: \n"+ex,"!! ERROR !!", 2);        
         }
         catch (Exception e) //Cualquier otra excepcion
         {
            JOptionPane.showMessageDialog(null,"Existe un error: \n"+e,"!! ERROR !!", 2);        
         } 
        
        return bandera;
    }
    
    public boolean getModificarContactos(File archivoViejo, String numeroTel, String nombreN, String generoN, String estadoCivilN, 
    String correoN, String direccionN, String cuentaN, String redSocialN) throws FileNotFoundException
    {
        boolean bandera = false;
        
        String nuevo = archivoViejo.getParent() + "Temporal.txt";
        File archivoNuevo = new File(nuevo);
        
        String cadena;
        int i;
        
        String numero = "", nombre = "", genero = "", estadoCivil = "", correo = "", direccion = "", cuenta = "",
                redSocial = "";        
        
        br = new BufferedReader(new FileReader(archivoViejo));
        
        try
        {
            i = 0;
            cadena = "";
            
            while(cadena != null)
            {
                cadena = br.readLine();
                numeroVec.add(cadena);
                
                cadena = br.readLine();
                nombreVec.add(cadena);
                
                cadena = br.readLine();
                generoVec.add(cadena);
                
                cadena = br.readLine();
                estadoCivilVec.add(cadena);
                
                cadena = br.readLine();
                correoVec.add(cadena);
                
                cadena = br.readLine();
                direccionVec.add(cadena);
                
                cadena = br.readLine();
                cuentaVec.add(cadena);
                
                cadena = br.readLine();
                redSocialVec.add(cadena); 
                
                if(cadena != null)
                {
                    if(numeroVec.get(i).trim().equals(numeroTel))
                    {
                        numero = numeroVec.get(i);
                        
                        ma.setLlenarArchivo(archivoNuevo, nombreN, generoN, estadoCivilN, numero, correoN, direccionN, 
                                cuentaN, redSocialN); 
                        bandera = true;
                    }
                    else
                    {
                        numero = numeroVec.get(i);
                        nombre = nombreVec.get(i);
                        genero = generoVec.get(i);
                        estadoCivil = estadoCivilVec.get(i);
                        correo = correoVec.get(i);
                        direccion = direccionVec.get(i);
                        cuenta = cuentaVec.get(i);
                        redSocial = redSocialVec.get(i);
                        
                        ma.setLlenarArchivo(archivoNuevo, nombre, genero, estadoCivil, numero, correo, direccion, 
                                cuenta, redSocial);                     
                    }
                }
                i++;
            }
            br.close();
            
            ma.getBorrarArchivo(archivoViejo);
            
            archivoNuevo.renameTo(archivoViejo);
        }
         catch (FileNotFoundException ex) //Si el archivo no se encuentra mandara un aviso
         {
            JOptionPane.showMessageDialog(null,"No se encontro el archivo: \n"+ex,"!! ERROR !!", 2);        
         }
         catch (Exception e) //Cualquier otra excepcion
         {
            JOptionPane.showMessageDialog(null,"Existe un error: \n"+e,"!! ERROR !!", 2);        
         } 
        
        return bandera;
    }    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contacto");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user (2).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 20, 130, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/man (2).png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(420, 30, 40, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/copywriter (1).png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 30, 40, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 160, 210, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 210, 100, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 210, 100, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 160, 180, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(290, 210, 170, 20);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 310, 100, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 280, 100, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(160, 280, 200, 20);

        jSeparator1.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(160, 310, 200, 20);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Direccion");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(160, 310, 200, 14);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Genero");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 240, 100, 14);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Estado civil");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(160, 240, 100, 14);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Correo");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(290, 240, 170, 14);

        jSeparator2.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(160, 240, 100, 10);

        jSeparator3.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(30, 240, 100, 10);

        jSeparator4.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(290, 240, 170, 10);

        jSeparator5.setForeground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(30, 310, 100, 20);

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setText("Guardar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 370, 100, 23);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(290, 200, 170, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(30, 270, 100, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(160, 270, 200, 30);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(60, 160, 150, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(30, 210, 100, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero", "Casado", "Divorciado", "Viudo" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(160, 210, 100, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Facebook", "Twitter", "Instagram" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(36, 320, 90, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 440);

        jMenu3.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png"))); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("View");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group.png"))); // NOI18N
        jMenuItem2.setText("Contactos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        setBounds(0, 0, 500, 478);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VentanaPrincipalAgenda vpa = new VentanaPrincipalAgenda();
        
        vpa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    VentanaPrincipalAgenda vpa = new VentanaPrincipalAgenda();
       
       int op = 0; 
       
       try
       {
       /*    if(lda.getLeerNombre(jTextField6.getText()) & lda.getLeerCorreo(jTextField3.getText()) && (jTextField3.getText().length() > 1) 
                   && (jTextField4.getText().length() > 1) && (jTextField5.getText().length() > 1))
           {*/
                op = JOptionPane.showConfirmDialog(null, "¿Seguro desea modificar a " + jLabel4.getText() + "?", "Modificar", JOptionPane.YES_NO_OPTION);
           
                if(op == JOptionPane.YES_OPTION)
                {
                    if(this.getModificarContactos(contactosAgenda, jLabel7.getText(), jTextField6.getText(), jComboBox1.getSelectedItem().toString(), 
                    jComboBox2.getSelectedItem().toString(), jTextField3.getText(), jTextField5.getText(), 
                    jTextField4.getText(), jComboBox3.getSelectedItem().toString()))                        
                    {
                        JOptionPane.showMessageDialog(null,jLabel4.getText() + " ha sido modificado", "Contacto modificado", 1); 
                        vpa.setVisible(true);
                        this.setVisible(false);
                        vpa.dlm.removeAllElements();
                        vpa.setLista();    
                    }
                    else
                      JOptionPane.showMessageDialog(null,"El contacto no se ha podido modificar","!! ERROR !!", 2);  
                }
                else
                {
                    jLabel5.setVisible(true);
                    jLabel4.setVisible(true);
                    jLabel6.setVisible(true);
                    jLabel8.setVisible(true);
                    jLabel9.setVisible(true);
                    jLabel10.setVisible(true);
                    jLabel11.setVisible(true);
        
                    jButton1.setVisible(false);
                    
                    jTextField6.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField4.setVisible(false);
                    
                    jComboBox1.setVisible(false);
                    jComboBox2.setVisible(false);
                    jComboBox3.setVisible(false);
                }
        /*   }
            else
             JOptionPane.showMessageDialog(null,"Los datos ingresados son incorrectos","!! ERROR !!", 2); */   
       }
       catch (Exception e) //Cualquier otra excepcion
       {
            JOptionPane.showMessageDialog(null,"Existe un error: \n" + e,"!! ERROR !!", 2);        
       } 
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       VentanaPrincipalAgenda vpa = new VentanaPrincipalAgenda();
       
       int op = 0; 
       
        try 
        {
            op = JOptionPane.showConfirmDialog(null, "¿Seguro desea eliminar a " + jLabel4.getText() + "?", "Eliminar", JOptionPane.YES_NO_OPTION);
            
            if(op == JOptionPane.YES_OPTION)
            {
                if(this.getEliminarContactos(contactosAgenda, jLabel7.getText())== true)
                {
                    JOptionPane.showMessageDialog(null,jLabel4.getText() + " ha sido eliminado", "Contacto eliminado", 1); 
                    vpa.setVisible(true);
                    this.setVisible(false);
                    vpa.dlm.removeAllElements();
                    vpa.setLista();
                }
                else
                    JOptionPane.showMessageDialog(null,"No se ha podido eliminar el contacto","!! ERROR !!", 2); 
            }
        } 
        catch (FileNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: " + ex,"!! ERROR !!", 2); 
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jLabel5.setVisible(false);
        jLabel4.setVisible(false);
        jLabel6.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        
        jButton1.setVisible(true);
        
        //Genero
        jComboBox1.setVisible(true);
        jComboBox1.setSelectedItem(jLabel5.getText());
        
        //Nombre
        jTextField6.setVisible(true);
        jTextField6.setText(jLabel4.getText());
        
        //Estado civil
        jComboBox2.setVisible(true);
        jComboBox2.setSelectedItem(jLabel6.getText());
        
        //Correo
        jTextField3.setVisible(true);
        jTextField3.setText(jLabel8.getText());
        
        //Direccion
        jTextField5.setVisible(true);
        jTextField5.setText(jLabel11.getText());
        
        //Red social
        jComboBox3.setVisible(true);
        jComboBox3.setSelectedItem(jLabel9.getText());
        
        //Cuenta
        jTextField4.setVisible(true);
        jTextField4.setText(jLabel10.getText());
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaMostrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMostrarContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
    private BufferedReader br;
    private FileReader fr;    
    private File contactosAgenda;  
    private GetSetAgenda gsa;
    private LeerDatosAgenda lda;
    private MetodosArchivos ma;    
    private ArrayList <String> nombreVec; 
    private ArrayList <String> numeroVec;  
    private ArrayList <String> generoVec; 
    private ArrayList <String> estadoCivilVec;
    private ArrayList <String> correoVec; 
    private ArrayList <String> direccionVec; 
    private ArrayList <String> cuentaVec; 
    private ArrayList <String> redSocialVec;     
}
