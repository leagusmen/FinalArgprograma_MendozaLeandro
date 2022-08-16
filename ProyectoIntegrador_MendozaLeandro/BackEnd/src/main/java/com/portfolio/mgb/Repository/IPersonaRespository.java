package com.portfolio.mgb.Repository;

import com.portfolio.mgb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRespository extends JpaRepository<Persona, Long>{
    
}
