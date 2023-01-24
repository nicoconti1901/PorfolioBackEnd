
package com.nicoconti.Porfolio.service;

import com.nicoconti.Porfolio.Repository.RHys;
import com.nicoconti.Porfolio.model.Hys;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class SHys {
    @Autowired
    RHys rHys;
    
    public List<Hys> list(){
        return rHys.findAll();
    }
    
    public Optional<Hys> getOne(int id){
        return rHys.findById(id);
    }
    
    public Optional<Hys> getByNombre(String nombre){
        return rHys.findByNombre(nombre);
    }
    
    public void save(Hys skill){
        rHys.save(skill);
    }
    
    public void delete(int id){
        rHys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHys.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rHys.existsByNombre(nombre);
    }
    
}
