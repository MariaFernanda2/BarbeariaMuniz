package com.barbearia.muniz.dto.response;

import com.barbearia.muniz.entity.Servicos;

public record ServicosResponseDTO(Integer id, String name, String descricao, Integer preco) {
    public ServicosResponseDTO(Servicos servicos){
        this(servicos.getId(), servicos.getNome(), servicos.getDescricao(), servicos.getPreco());

    }
}
