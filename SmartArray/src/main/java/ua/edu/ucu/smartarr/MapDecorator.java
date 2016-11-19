package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{
    MyFunction function;
    int size;

    public MapDecorator(SmartArray smartArray, MyFunction func){
        super(smartArray);
        this.function = func;
        this.size = smartArray.size();
        this.applyFunction();
    }

    public void applyFunction() {
        for (int i = 0; i < this.smartArray.size(); ++i) {
            smartArray.toArray()[i] = function.apply(smartArray.toArray()[i]);
        }
    }
    @Override
    public Object[] toArray(){
        return Arrays.copyOf(this.smartArray.toArray(), size());
    }
    @Override
    public String operationDescription(){
        return this.smartArray.operationDescription() + ", DistinctDecorator";
    }
    @Override
    public int size(){
        return this.smartArray.size();
    }

}
