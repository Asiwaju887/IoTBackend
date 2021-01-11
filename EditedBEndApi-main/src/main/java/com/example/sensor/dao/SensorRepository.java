package com.example.sensor.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;
import com.example.sensor.model.Data;


public interface SensorRepository extends MongoRepository<Data, Integer> {
    @Query
    List<Data> findFirst10ByOrderByIdDesc();
}
