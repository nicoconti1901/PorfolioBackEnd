
package com.nicoconti.Porfolio.Security.Repository;

import com.nicoconti.Porfolio.Security.Entity.Rol;
import com.nicoconti.Porfolio.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
