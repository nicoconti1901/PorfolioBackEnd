
package com.nicoconti.Porfolio.Repository;


import com.nicoconti.Porfolio.model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface REducacion extends JpaRepository<Educacion, Integer>{
     public Optional<Educacion> findByTituloEdu(String tituleEdu);
    public boolean existsByTituloEdu(String tituloEdu);
}
