
package com.portfolio.sp.repositorio;

import com.portfolio.sp.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepositorio extends JpaRepository<Persona, Long>{
    
    
}
