package io.github.luan1412.CadastroDeNinjas.Missoes.Service;

import java.util.List;
import java.util.Optional;

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

    public List<MissoesModel>readMissoes(){
        return this.missoesRepository.findAll();
    }

    public Optional<MissoesModel>readMissaoById(Long id){
        return this.missoesRepository.findById(id);
    }

    public MissoesModel updateMissao(Long id, MissoesModel missao){
        return this.missoesRepository.save(missao);
    }

    public void deleteMissao(Long id){
        this.missoesRepository.deleteById(id);
    }

}
