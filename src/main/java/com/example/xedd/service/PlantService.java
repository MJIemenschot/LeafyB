package com.example.xedd.service;


import com.example.xedd.model.Plant;
import org.springframework.core.io.Resource;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PlantService {

    public abstract long createPlant(Plant plant);
    public abstract void updatePlant(long id, Plant plant);
    public abstract void partialUpdatePlant(long id, Map<String, String> fields);
    public abstract void deletePlant(long id);
    ///List<Plant> getAllPlants();
    public abstract Collection<Plant> getPlant(String title, String description);
    public abstract Optional<Plant> getPlantById(long id);

    public boolean itemExistsById(long id);

    Resource downloadFile(Long id);

//    List<Object> getAllSeeds();
//
//    List<Object> getAllEnts();
//
//    List<Object> getAllPlants();
//
//    List<Object> getAllFavs();

}
