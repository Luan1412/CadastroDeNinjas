package io.github.luan1412.CadastroDeNinjas.Missoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.luan1412.CadastroDeNinjas.Missoes.Model.MissoesModel;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
