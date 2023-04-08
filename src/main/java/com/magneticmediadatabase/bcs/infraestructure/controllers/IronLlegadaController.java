package com.magneticmediadatabase.bcs.infraestructure.controllers;

import com.magneticmediadatabase.bcs.application.service.IronLlegadaService;
import com.magneticmediadatabase.bcs.domain.model.IronLlegada;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ironLlegada")
public class IronLlegadaController {
    private final IronLlegadaService ironLlegadaService;

    public IronLlegadaController(IronLlegadaService ironLlegadaService) {
        this.ironLlegadaService = ironLlegadaService;
    }

    @PostMapping
    public ResponseEntity<IronLlegada> createIronLlegada(@RequestBody IronLlegada ironLlegada){
        IronLlegada createdIronLlegada = ironLlegadaService.createIronLlegada(ironLlegada);
        return new ResponseEntity<>(createdIronLlegada, HttpStatus.CREATED);
    }

    @GetMapping("/{ironLlegadaId}")//obtener objeto por id path variable, dinamico
    public ResponseEntity<IronLlegada> getIronLlegadaById(@PathVariable Long ironLlegadaId){
        return ironLlegadaService.getIronLlegada(ironLlegadaId)
                .map(ironLlegada -> new ResponseEntity<>(ironLlegada, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping//obtener todos los objetos
    public ResponseEntity<List<IronLlegada>> getAllIronLlegada(){
        List<IronLlegada> ironLlegadas = ironLlegadaService.getAllIronLlegada();
        return new ResponseEntity(ironLlegadas, HttpStatus.OK);//en caso de no encontar objetos envia null
    }

    @PutMapping("/{ironLlegadaId}")// se envia el id y en el requestBody el objeto que se quiere actualizar
    public ResponseEntity<IronLlegada> updateIronLlegada(@PathVariable Long ironLlegadaId, @RequestBody IronLlegada updateIronLlegada){
        return ironLlegadaService.updateIronLlegada(ironLlegadaId, updateIronLlegada)
                .map(ironLlegada -> new ResponseEntity<>(ironLlegada, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{ironLlegadaId}")
    public ResponseEntity<Void> deleteIronLlegadaById(@PathVariable Long ironLlegadaId){//no es necesario devolver un objeto ya que solo se debe saber si elimina o no
        if (ironLlegadaService.deleteIronLlegada(ironLlegadaId)){//si es true
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
