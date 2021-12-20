package Agenda;

public class LeerDatosAgenda 
{
    public LeerDatosAgenda()
    {}
    
    public boolean getLeerNombre(String nom)
    {
        try
        {
            return nom.matches("^([a-z]+[ ]?[a-z]+[ ]?[a-z]+)$"); 
        } 
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", JOptionPane.ERROR_MESSAGE);
            return false;
        }    
    }
    
    public boolean getLeerNumero(String telefono)
    {
        try
        {
            return telefono.matches("^([0-9]{10})$"); 
        } 
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", JOptionPane.ERROR_MESSAGE);
            return false;
        }    
    }
    
    public boolean getLeerCorreo(String correo)
    {
        try
        {
            return correo.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@"+"[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$"); 
        } 
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,"Existe un error: "+e,"!! ERROR !!", JOptionPane.ERROR_MESSAGE);
            return false;
        }    
    }
                    
}
