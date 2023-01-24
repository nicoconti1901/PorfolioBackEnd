
package com.nicoconti.Porfolio.Security.Service;

import com.nicoconti.Porfolio.Security.Repository.IRolRepository;
import com.nicoconti.Porfolio.Security.Entity.Rol;
import com.nicoconti.Porfolio.Security.Enums.RolNombre;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
