package com.magneticmediadatabase.bcs.infraestructure.controllers;

import com.magneticmediadatabase.bcs.application.service.IronSalidaService;
import com.magneticmediadatabase.bcs.domain.model.IronLlegada;
import com.magneticmediadatabase.bcs.domain.model.IronSalida;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ironsalida")
public class IronSalidaController {
    private final IronSalidaService ironSalidaService;

    public IronSalidaController(IronSalidaService ironSalidaService) {
        this.ironSalidaService = ironSalidaService;
    }

    @PostMapping
    public ResponseEntity<IronSalida> createIronSalida(@RequestBody IronSalida ironSalida){
        IronSalida createIronSalida = ironSalidaService.createIronSalida(ironSalida);
        return new ResponseEntity<>(createIronSalida, HttpStatus.CREATED);
    }

    @GetMapping("/{ironSalidaId}")
    public ResponseEntity<IronSalida> getIronSalidaById(@PathVariable Long ironSalidaId){
        return ironSalidaService.getIronSalida(ironSalidaId)
                .map(ironSalida -> new ResponseEntity<>(ironSalida, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<IronSalida>> getAllIronSalida(){
        List<IronSalida> ironSalidas = ironSalidaService.getAllIronSalida();
        return new ResponseEntity(ironSalidas, HttpStatus.OK);
    }

    @PutMapping("/{ironSalidaId}")
    public ResponseEntity<IronSalida> updateIronSalida(@PathVariable Long ironSalidaId, @RequestBody IronSalida updateIronSalida){
        return ironSalidaService.UpdateIronSalida(ironSalidaId, updateIronSalida)
                .map(ironSalida -> new ResponseEntity<>(ironSalida, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{ironSalidaId}")
    public ResponseEntity<Void> deleteIronSalidaById(@PathVariable Long ironSalidaId){
        if(ironSalidaService.deleteIronSalida(ironSalidaId)){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

