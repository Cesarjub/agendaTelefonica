package Agenda;

public class GetSetAgenda 
{
    private String nombre, genero, estadoCivil, numero, correo, redSocial, direccion, cuenta;
    
    public GetSetAgenda()
    {
        nombre = "";
        genero = "";
        cuenta = "";
        numero = "";
        correo = "";
        redSocial = "";
        direccion = "";
        estadoCivil = "";
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public String getNombre() 
    {
        return nombre;
    }

    public void setGenero(String genero) 
    {
        this.genero = genero;
    }
    public String getGenero() 
    {
        return genero;
    }

    public void setEstadoCivil(String estadoCivil) 
    {
        this.estadoCivil = estadoCivil;
    }
    public String getEstadoCivil() 
    {
        return estadoCivil;
    }

    public void setCorreo(String correo) 
    {
        this.correo = correo;
    }
    public String getCorreo() 
    {
        return correo;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
    public String getDireccion() 
    {
        return direccion;
    }
    
    public void setNumero(String numero) 
    {
        this.numero = numero;
    }
    public String getNumero() 
    {
        return numero;
    }    

    public void setCuenta(String cuenta) 
    {
        this.cuenta = cuenta;
    }
    public String getCuenta() 
    {
        return cuenta;
    }
    
    public void setRedSocial(String redSocial) 
    {
        this.redSocial = redSocial;
    }
    public String getRedSocial() 
    {
        return redSocial;
    } 
    
}
