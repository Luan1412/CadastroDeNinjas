package io.github.luan1412.CadastroDeNinjas.Missoes.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.luan1412.CadastroDeNinjas.Missoes.Model.MissoesModel;
import io.github.luan1412.CadastroDeNinjas.Missoes.Service.MissoesService;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @Autowired
    private MissoesService missoesService;

    @PostMapping
    public MissoesModel createMissoes(@RequestBody MissoesModel missao){
        return this.missoesService.createMissoes(missao);
    }

    @GetMapping
    public List<MissoesModel> readMissoes(){
        return this.missoesService.readMissoes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MissoesModel> readMissoesById(@PathVariable Long id){
        Optional<MissoesModel> missaoOptional = this.missoesService.readMissaoById(id);

        if (missaoOptional.isPresent()) {
            return ResponseEntity.ok(missaoOptional.get());  
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public MissoesModel updateMissao(@PathVariable Long id, @RequestBody MissoesModel missao){
        
        missao.setId(id);
        return this.missoesService.updateMissao(id, missao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMissao(@PathVariable Long id){
        this.missoesService.deleteMissao(id);
        return ResponseEntity.ok().build();
    }

}
