
package com.nicoconti.Porfolio.Security.Service;

import com.nicoconti.Porfolio.Security.Repository.IUsuarioRepository;
import com.nicoconti.Porfolio.Security.Entity.Usuario;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    IUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
