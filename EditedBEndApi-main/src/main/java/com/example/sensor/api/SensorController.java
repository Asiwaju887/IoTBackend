package com.example.sensor.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.sensor.model.Data;
import com.example.sensor.model.Result;
import com.example.sensor.service.SensorService;

@RestController
@RequestMapping("/api")
public class SensorController {

    private SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    @CrossOrigin
    @PostMapping("/perform-operation")
    public Result previewFixedDeposit(@RequestBody Data data)  {
        return service.performOperation(data);
    }

    @CrossOrigin
    @GetMapping("/get-data")
    public List<Data> displayDbData(Data data)  {
        return service.getDbData();
    }

    @CrossOrigin
    @GetMapping("/get-last-data")
    public Data displayLastDbData(Data data)  {
        return service.getDbData().get(data.getId());
    }

}
