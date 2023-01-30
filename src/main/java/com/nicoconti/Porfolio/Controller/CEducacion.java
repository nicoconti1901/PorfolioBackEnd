
package com.nicoconti.Porfolio.Controller;

import com.nicoconti.Porfolio.Dto.dtoEducacion;
import com.nicoconti.Porfolio.Security.Controller.Mensaje;
import com.nicoconti.Porfolio.model.Educacion;
import com.nicoconti.Porfolio.service.SEducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "https://porfoliobackendnicoconti.web.app")

public class CEducacion {
    
    @Autowired
    SEducacion sEducacion;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create (@RequestBody dtoEducacion dtoedu){
        if(StringUtils.isBlank(dtoedu.getTituloEdu())){
            return new ResponseEntity(new Mensaje("El titulo es obligatorio"),HttpStatus.BAD_REQUEST);
        }
        if(sEducacion.existsByTituloEdu(dtoedu.getTituloEdu())){
            return  new ResponseEntity(new Mensaje("Ese titulo ya existe"),HttpStatus.BAD_REQUEST);
        }
        
        Educacion educacion = new Educacion(
                dtoedu.getTituloEdu(), dtoedu.getNivelEdu(), dtoedu.getDuracionEdu(),dtoedu.getLugarEdu(), dtoedu.getEstadoEdu(), dtoedu.getFechafinEdu());
        
        sEducacion.save(educacion);
        
        return new ResponseEntity(new Mensaje("Educacion agregada"),HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoedu){
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        if(sEducacion.existsByTituloEdu(dtoedu.getTituloEdu()) && sEducacion.getByTituloEdu(dtoedu.getTituloEdu()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ese titulo ya existe"), HttpStatus.BAD_REQUEST);
    
    if (StringUtils.isBlank(dtoedu.getTituloEdu()))
            return new ResponseEntity(new Mensaje("El titulo es obligatorio"), HttpStatus.BAD_REQUEST);
    
    Educacion educacion = sEducacion.getOne(id).get();
    educacion.setTituloEdu(dtoedu.getTituloEdu());
    educacion.setNivelEdu(dtoedu.getNivelEdu());
    educacion.setDuracionEdu(dtoedu.getDuracionEdu());
    educacion.setLugarEdu(dtoedu.getLugarEdu());
    educacion.setEstadoEdu(dtoedu.getEstadoEdu());
    educacion.setFechafinEdu(dtoedu.getFechafinEdu());
    
    sEducacion.save(educacion);
    return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete (@PathVariable("id") int id){
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        sEducacion.delete(id);
        
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
}
}