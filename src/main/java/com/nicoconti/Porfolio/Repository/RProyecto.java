
package com.nicoconti.Porfolio.Repository;

import com.nicoconti.Porfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RProyecto extends JpaRepository<Proyecto, Integer> {
    Optional<Proyecto> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
