package com.example.sensor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.sensor.dao.SensorRepository;
import com.example.sensor.model.Data;
import com.example.sensor.model.Result;

@Service
public class SensorService {

    private final SensorRepository repository;

    @Autowired
    public SensorService(SensorRepository repository) {
        this.repository = repository;
    }

    public Result performOperation(Data data){
        int userAnswer = getUserDataAndCalculate(data);
        int resultFromDb = calculateDataFromBackEnd();
        Result myResult  = new Result();
        myResult.setResultFromUserInput(userAnswer);
        myResult.setUserInput(data);
        myResult.setLastTenDataAverage(resultFromDb);
        myResult.setFinalSolution(compareUserResultAndDbResultAndGetFinalAnswer(userAnswer, resultFromDb));
        myResult.setDateOfCalculation(LocalDateTime.now());
        return myResult;
    }

    public int getUserDataAndCalculate(Data data){
        int answer=0;
        answer = data.getLight() + data.getLight() - data.getSound();
        repository.save(data);
        return answer;
    }

    public int calculateDataFromBackEnd(){
        int answer = 0;
        List<Data> getLastTen = repository.findFirst10ByOrderByIdDesc();
        for(Data i:getLastTen){
           int d =  i.getTemp() + i.getLight() + i.getSound();
           answer+=d;
        }

        int ave= answer/10 ;
        return  ave;
    }

    public int compareUserResultAndDbResultAndGetFinalAnswer(int userResult, int dbResult){
        //do whatever comparison you want to do and implement your logic for getting final answer
        //e.g get final answer should be the sum of db result and user result

        return userResult + dbResult;
    }

    public List<Data> getDbData(){
        return repository.findAll();
    }

}