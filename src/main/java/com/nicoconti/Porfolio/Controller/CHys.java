
package com.nicoconti.Porfolio.Controller;

import com.nicoconti.Porfolio.Dto.dtoHys;
import com.nicoconti.Porfolio.model.Hys;
import com.nicoconti.Porfolio.service.SHys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.apache.commons.lang3.StringUtils;
import com.nicoconti.Porfolio.Security.Controller.Mensaje;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin(origins = "https://porfoliobackendnicoconti.web.app")
@RequestMapping("/skill")
public class CHys {
    @Autowired
    SHys sHys;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Hys>> list(){
        List<Hys> list = sHys.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create (@RequestBody dtoHys dtohys){
        if(StringUtils.isBlank(dtohys.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST);
    
        if(sHys.existsByNombre(dtohys.getNombre()))
            return  new ResponseEntity(new Mensaje("Ese Hys ya existe"),HttpStatus.BAD_REQUEST);
    
        Hys hys = new Hys(dtohys.getNombre(), dtohys.getPorcentaje(), dtohys.getImagen());
        sHys.save(hys);
        
        return new ResponseEntity(new Mensaje("Hys agregado"),HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Hys> getById(@PathVariable("id") int id){
        if(!sHys.existsById(id))
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        
        Hys hys = sHys.getOne(id).get();
        return new ResponseEntity(hys, HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHys dtohys){
        if(!sHys.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        if(sHys.existsByNombre(dtohys.getNombre()) && sHys.getByNombre(dtohys.getNombre()).get().getId() != id) 
            return new ResponseEntity(new Mensaje("Ese Hys ya existe"), HttpStatus.BAD_REQUEST);
    
        if (StringUtils.isBlank(dtohys.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Hys hys = sHys.getOne(id).get();
        hys.setNombre(dtohys.getNombre());
        hys.setPorcentaje(dtohys.getPorcentaje());
        hys.setImagen(dtohys.getImagen());
        
              
        sHys.save(hys);
        return new ResponseEntity(new Mensaje("Hys actualizado"), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete (@PathVariable("id") int id){
        if(!sHys.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        sHys.delete(id);
        
        return new ResponseEntity(new Mensaje("Hys eliminado"), HttpStatus.OK);
    }
    
}
