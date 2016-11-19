package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{
    int size;
    MyPredicate predicate;

    public FilterDecorator(SmartArray smartArr, MyPredicate predicate) {
        super(smartArr);
        this.size = smartArray.size();
        this.predicate = predicate;
        this.filter();

    }
    public void filter(){
        Object[] newSmArr = new Object[size];
        int k = 0;
        for (int i = 0; i < this.size(); ++i) {
            if (this.predicate.test(toArray()[i])){
                newSmArr[k] = toArray()[i];
                ++k;
            }
        }
        this.smartArray = new BaseArray(newSmArr);

        this.size = smartArray.size();
    }
    @Override
    public Object[] toArray(){
        return this.smartArray.toArray();
    }
    @Override
    public String operationDescription(){
        return this.smartArray.operationDescription() + ", FilterDecorator";
    }
    @Override
    public int size(){
        return size;
    }
   
}
