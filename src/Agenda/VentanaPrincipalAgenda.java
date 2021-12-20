package Agenda;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaPrincipalAgenda extends javax.swing.JFrame {   
    
    public VentanaPrincipalAgenda() 
    {
        initComponents();
        
        contactosAgenda = new File("src\\Archivos\\" + "AgendaTelefonica.txt"); 
               
        nombreVec = new ArrayList <String>(); 
        numeroVec = new ArrayList <String>(); 
        
        dlm = new DefaultListModel();
        
        ma = new MetodosArchivos();
        
        this.setLocationRelativeTo(null); 
        
        jList1.setModel(dlm);
        
        this.setLista(); 
        
        //Icono de la Ventana
        try{
            Image img = ImageIO.read(new File("src\\Imagenes\\phonebook.png"));
                this.setIconImage(img);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);        
        }           
    }

    public void setLista()
    {
        String cadena;
        int i; 
      
        String numero = "", nombre = "", genero = "", estadoCivil = "", correo = "", 
                direccion = "", cuenta = "", redSocial = "";           
        
         try
         {  
            fr = new FileReader (contactosAgenda);
            br = new BufferedReader(fr);
             
            i = 0;
            cadena = "";
            while(cadena != null)
            {
               cadena = br.readLine(); 
               numero = cadena;
            
               cadena = br.readLine();
               nombre = cadena;
            
               cadena = br.readLine();
               genero = cadena;         
            
               cadena = br.readLine();
               estadoCivil = cadena;       
               
               cadena = br.readLine(); 
               correo = cadena;
            
               cadena = br.readLine();
               direccion = cadena;
            
               cadena = br.readLine();
               cuenta = cadena;         
            
               cadena = br.readLine();
               redSocial = cadena;                
            
               if(cadena != null )
               { 
                  nombreVec.add(i, nombre);
                  numeroVec.add(i, numero);

                  dlm.addElement(nombreVec.get(i));
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda telefonica");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(60, 20, 190, 30);

        jList1.setBackground(new java.awt.Color(240, 240, 241));
        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contactos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 102))); // NOI18N
        jList1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jList1.setForeground(new java.awt.Color(51, 51, 51));
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jList1.setName(""); // NOI18N
        jList1.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 80, 230, 290);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loupe.png"))); // NOI18N
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 20, 30, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 350, 420);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        jMenuItem1.setText("Actualizar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("New");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jMenuItem3.setText("Nuevo contacto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 352, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VentanaRegistroAgenda vra = new VentanaRegistroAgenda();
        
        this.setVisible(false);
        vra.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
        dlm.removeAllElements();
        this.setLista();  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        //Object numero = jList1.getSelectedValue();
        int num = jList1.getSelectedIndex();
        
        VentanaMostrarContacto vmc = new VentanaMostrarContacto();
        
        this.setVisible(false);
        vmc.setVisible(true);
        vmc.setArchivo(numeroVec.get(num));
    }//GEN-LAST:event_jList1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String texto = jTextField1.getText();

        if(texto.trim().length() > 0)
        {
            DefaultListModel tmp = new DefaultListModel();
            
            for (int i = 0; i < dlm.getSize(); i++)
            {
                if(dlm.getElementAt(i).toString().toLowerCase().contains(texto.toLowerCase()))
                {
                   tmp.addElement(dlm.getElementAt(i));
                }
            }
            jList1.setModel(tmp);
        }
        else
        {
            jList1.setModel(dlm);
        }
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        //int num = jList1.getSelectedIndex();
        
        VentanaMostrarContacto vmc = new VentanaMostrarContacto();
        
        this.setVisible(false);
        vmc.setVisible(true);
        vmc.setArchivo(jTextField1.getText()); 
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipalAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    DefaultListModel dlm; 
    private BufferedReader br;
    private FileReader fr; 
    private MetodosArchivos ma;
    private File contactosAgenda;   
    private ArrayList <String> nombreVec; 
    private ArrayList <String> numeroVec; 
}
