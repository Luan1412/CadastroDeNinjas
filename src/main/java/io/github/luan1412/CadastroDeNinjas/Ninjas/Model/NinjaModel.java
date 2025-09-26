package io.github.luan1412.CadastroDeNinjas.Ninjas.Model;

import io.github.luan1412.CadastroDeNinjas.Missoes.Model.MissoesModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//essa anotação transforma uma classe em tabela no banco de dados
@Entity
//table(name="") nomeia a entidade
@Table(name = "tb_ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne 1 ninja pode ter só 1 missão
    @ManyToOne()
    @JoinColumn(name = "missao_id") //FK Foreign Key ou Chave estrangeira
    private MissoesModel missao;
     
    
}
