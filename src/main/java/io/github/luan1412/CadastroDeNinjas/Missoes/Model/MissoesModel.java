package io.github.luan1412.CadastroDeNinjas.Missoes.Model;

import java.util.List;

import io.github.luan1412.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String dificuldade;

    //@OneToMany1 missão pode ter mais de um ninja.
   // @OneToMany(mappedBy = "missoes")
    //private List<NinjaModel> ninja;
}
