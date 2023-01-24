
package com.nicoconti.Porfolio.service;

import com.nicoconti.Porfolio.Repository.REducacion;
import com.nicoconti.Porfolio.model.Educacion;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    
     public Optional<Educacion> getByTituloEdu(String tituloEdu ){
        return rEducacion.findByTituloEdu(tituloEdu);
    }
     
     public void save(Educacion edu){
        rEducacion.save(edu);
    }
     public void delete(int id){
        rEducacion.deleteById(id);
    }
     
     public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByTituloEdu(String tituloEdu){
        return rEducacion.existsByTituloEdu(tituloEdu);
    }
}
