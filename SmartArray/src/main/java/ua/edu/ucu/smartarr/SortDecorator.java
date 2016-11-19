package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyPredicate;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{
    int size;
    MyComparator comparator;

    public SortDecorator(SmartArray smartArr, MyComparator comp) {
        super(smartArr);
        this.size = smartArray.size();
        this.comparator = comp;
        this.sortArr();

    }
    public void sortArr(){

        for (int i = 1; i < size(); ++i) {
            Object key = smartArray.toArray()[i];
            int k = i - 1;
            while ( k >= 0 && comparator.compare(key, smartArray.toArray()[k]) < 0 ){
                smartArray.toArray()[k+1] = smartArray.toArray()[k];
                --k;
            }
            smartArray.toArray()[k+1] = key;
        }
    }
    @Override
    public Object[] toArray(){
        return this.smartArray.toArray();
    }
    @Override
    public String operationDescription(){
        return this.smartArray.operationDescription() + ", SortDecorator";
    }
    @Override
    public int size(){
        return size;
    }



}
