package io.github.luan1412.CadastroDeNinjas.Ninjas.Service;

import io.github.luan1412.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import io.github.luan1412.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository NinjaRepository;

    public NinjaModel createNinja(NinjaModel ninja){
        return this.NinjaRepository.save(ninja);

    }

}
