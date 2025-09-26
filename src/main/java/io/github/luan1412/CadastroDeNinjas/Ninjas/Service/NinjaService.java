package io.github.luan1412.CadastroDeNinjas.Ninjas.Service;

import io.github.luan1412.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import io.github.luan1412.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class NinjaService {

    @Autowired
    private NinjaRepository NinjaRepository;

    public NinjaModel createNinja(NinjaModel ninja){
        return this.NinjaRepository.save(ninja);
    }

 
    public List<NinjaModel> readNinja(){
        return this.NinjaRepository.findAll();
    }

    public Optional<NinjaModel> readNinjaById(Long id){
       
       return this.NinjaRepository.findById(id);
    }


}
