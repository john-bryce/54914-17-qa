package app.core;

public class Calculator {

    private double result;

    public void add(double value){
        result += value;
    }

    public double getResult(){
        return result;
    }
}
