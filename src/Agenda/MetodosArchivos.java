package Agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MetodosArchivos 
{
    private File contactosAgenda;
    private BufferedWriter bw;
    private BufferedReader br;
    private FileReader fr;
    private ArrayList <String> nombreVec; 
    private ArrayList <String> numeroVec;  
    private ArrayList <String> generoVec; 
    private ArrayList <String> estadoCivilVec;
    private ArrayList <String> correoVec; 
    private ArrayList <String> direccionVec; 
    private ArrayList <String> cuentaVec; 
    private ArrayList <String> redSocialVec; 
    
    public MetodosArchivos()
    {
        contactosAgenda = new File("src\\Archivos\\" + "AgendaTelefonica.txt");    
    }

    public boolean setLlenarArchivo(File archivo, String nombre, String genero, String estCivl, String numero, String correo,
            String direccion, String cuenta, String redSocial)
    {
        try
        {
            if(archivo.createNewFile())
            {}
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"Existe un error al crear el archivo: "+e,"!! ERROR !!", 2);
        }
        
        try
        {
            bw = new BufferedWriter(new FileWriter(archivo, true));
            bw.write(numero + "\r\n");            
            bw.write(nombre + "\r\n");
            bw.write(genero + "\r\n");
            bw.write(estCivl + "\r\n");
            bw.write(correo + "\r\n");
            bw.write(direccion + "\r\n");
            bw.write(cuenta + "\r\n");
            bw.write(redSocial + "\r\n");            
            bw.close();
            return true;
            //JOptionPane.showMessageDialog(null,"El cliente ha sido guardado", "Cliente guardado", 1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", 2);
            return false;
        }
    }    
 
    public boolean getBorrarArchivo(File archivo)
    {
        boolean bandera = false;
      
        try
        {
            if(archivo.exists() )
            {
                archivo.delete();
                bandera = true;
            }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Existe un error: \n"+e,"!! ERROR !!", 2);   
        } 
        return bandera;     
    }   
    
    public boolean getBuscarArchivo(String num)
    {
        boolean bandera = false;
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
                       bandera = true;
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
         return bandera;
    }
}
