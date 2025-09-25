package io.github.luan1412.CadastroDeNinjas.Ninjas;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import io.github.luan1412.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//essa anotação transforma uma classe em tabela no banco de dados
@Entity
//table(name="") nomeia a entidade
@Table(name = "tb_cadastro")
public class NinjaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne 1 ninja pode ter só 1 missão
    @ManyToOne()
    @JoinColumn(name = "missoes_id") //FK Foreign Key ou Chave estrangeira
    private MissoesModel missoes;
     
    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    

}
