package com.portfolio.sp.interfaz;

import com.portfolio.sp.entidad.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getpersona();
    
    public void savepersona(Persona persona);
    
    public void deletepersona(Long id);
    
    public Persona findpersona(Long Id);

    public void savePersona(Persona persona);

    public Persona findPersona(long l);
        
   
}
