package io.github.luan1412.CadastroDeNinjas.Missoes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

}
