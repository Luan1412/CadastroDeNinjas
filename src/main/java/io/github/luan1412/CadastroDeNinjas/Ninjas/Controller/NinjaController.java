package io.github.luan1412.CadastroDeNinjas.Ninjas.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.luan1412.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import io.github.luan1412.CadastroDeNinjas.Ninjas.Service.NinjaService;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @PostMapping
    public NinjaModel createNinja(@RequestBody NinjaModel ninja){
        return this.ninjaService.createNinja(ninja);
    }

    @GetMapping
    public List<NinjaModel>readNinjas(){
        return this.ninjaService.readNinja();
    }
    
     @GetMapping("/{id}")
     public ResponseEntity<NinjaModel> readNinjas(@PathVariable Long id){
        Optional <NinjaModel> ninjaOptional = this.ninjaService.readNinjaById(id);

        if ( ninjaOptional.isPresent()) {
            return ResponseEntity.ok(ninjaOptional.get());    
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
