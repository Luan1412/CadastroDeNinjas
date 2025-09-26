package io.github.luan1412.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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

}
