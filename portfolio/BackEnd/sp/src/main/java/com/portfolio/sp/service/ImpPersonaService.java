
package com.portfolio.sp.service;

import com.portfolio.sp.entidad.Persona;
import com.portfolio.sp.interfaz.IPersonaService;
import com.portfolio.sp.repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
@Autowired IPersonaRepositorio ipersonaRepositorio;

@Override
    public List<Persona> getpersona() {
        List<Persona> persona = ipersonaRepositorio.findAll();
        return persona;
    }

    @Override
    public void savepersona(Persona persona) {
     ipersonaRepositorio.save(persona);
    }

    @Override
    public void deletepersona(Long id) {
        ipersonaRepositorio.deleteById(id);
    }

    @Override
    public Persona findpersona(Long Id) {
     Persona persona = ipersonaRepositorio.findById(Id).orElse(null);
     return persona;
    }

    @Override
    public void savePersona(Persona persona) {
   
    }

    @Override
    public Persona findPersona(long l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
