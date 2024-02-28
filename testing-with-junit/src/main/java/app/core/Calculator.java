package app.core;

public class Calculator {

    private double result;

    public void add(double value){
        result += value;
    }

    public void clear(){
        result = 0;
    }

    public double getResult(){
        return result;
    }
}
