package com.barbearia.muniz.entity;

import com.barbearia.muniz.dto.request.ServicosRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name="servicos")
@Entity(name="servicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of= "id")

public class Servicos {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Integer preco;

    public Servicos(ServicosRequestDTO data){
       this.nome = data.name();
       this.descricao = data.descricao();
       this.preco = data.preco();
    }

}