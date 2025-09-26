package io.github.luan1412.CadastroDeNinjas.Ninjas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.luan1412.CadastroDeNinjas.Ninjas.Model.NinjaModel;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long>{

}
