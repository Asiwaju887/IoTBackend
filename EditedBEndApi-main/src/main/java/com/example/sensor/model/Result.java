package com.example.sensor.model;

import java.time.LocalDateTime;


public class Result {
    int lastTenDataAverage;
    int resultFromUserInput;
    int finalSolution;
    Data userInput;
    LocalDateTime dateOfCalculation;

    public int getLastTenDataAverage() {
        return lastTenDataAverage;
    }

    public void setLastTenDataAverage(int lastTenDataAverage) {
        this.lastTenDataAverage = lastTenDataAverage;
    }

    public int getResultFromUserInput() {
        return resultFromUserInput;
    }

    public void setResultFromUserInput(int resultFromUserInput) {
        this.resultFromUserInput = resultFromUserInput;
    }

    public int getFinalSolution() {
        return finalSolution;
    }

    public void setFinalSolution(int finalSolution) {
        this.finalSolution = finalSolution;
    }

    public Data getUserInput() {
        return userInput;
    }

    public void setUserInput(Data userInput) {
        this.userInput = userInput;
    }

    public LocalDateTime getDateOfCalculation() {
        return dateOfCalculation;
    }

    public void setDateOfCalculation(LocalDateTime dateOfCalculation) {
        this.dateOfCalculation = dateOfCalculation;
    }


}
