package com.mywork.swagger.controller;

import com.mywork.swagger.model.Plant;
import com.mywork.swagger.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/plants")
public class PlantController implements PlantAPI{

    @Autowired
    private PlantService plantService;

    @Override
    public ResponseEntity<List<Plant>> getAll() {
        return ResponseEntity.ok(plantService.getAll());
    }
}
