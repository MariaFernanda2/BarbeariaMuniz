package com.barbearia.muniz.controllers;

import com.barbearia.muniz.dto.request.ServicosRequestDTO;
import com.barbearia.muniz.dto.response.ServicosResponseDTO;
import com.barbearia.muniz.entity.Servicos;
import com.barbearia.muniz.repositories.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicosController {

    @Autowired
    private ServicosRepository repository;

    @GetMapping
    public List<ServicosResponseDTO> buscarServicos(){
       List<ServicosResponseDTO> servicos = repository.findAll().stream().map(ServicosResponseDTO:: new).toList();
       return servicos;
    }

    @PostMapping
    public void criarNovoServico(@RequestBody ServicosRequestDTO data) {
        Servicos servicosData = new Servicos(data);
        repository.save(servicosData);
        return;
    }
}
