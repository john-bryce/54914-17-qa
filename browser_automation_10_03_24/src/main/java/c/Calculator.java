package c;

// this is how we define a class
public class Calculator {

    // class attributes
    private double result;

    // class methos / functions - are the operations the object can do
    public void add(double value){
        result += value;
    }

    public double getResult(){
        return  result;
    }
}
