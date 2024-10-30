package com.mywork.swagger.service;

import com.mywork.swagger.model.Plant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlantService {

    private final List<Plant> plants = new ArrayList<>(){
        {
            add(new Plant(1L, "Rose", "this is a rose plant"));
            add(new Plant(2L, "Lotus", "this is a lotus plant"));
            add(new Plant(3L, "Lilly", "this is a lilly plant"));
        }

    };

    public List<Plant> getAll() {
        return plants;
    }
}
