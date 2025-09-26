package io.github.luan1412.CadastroDeNinjas.Missoes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.luan1412.CadastroDeNinjas.Missoes.Model.MissoesModel;
import io.github.luan1412.CadastroDeNinjas.Missoes.Repository.MissoesRepository;

@Service
public class MissoesService {

    @Autowired
    private MissoesRepository missoesRepository;
    
    public MissoesModel createMissoes(MissoesModel missao){
        return this.missoesRepository.save(missao);
    }
}
