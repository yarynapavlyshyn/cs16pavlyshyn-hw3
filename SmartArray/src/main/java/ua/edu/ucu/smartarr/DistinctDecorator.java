package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    int size;

    public DistinctDecorator(SmartArray smartArray){
        super(smartArray);
        this.size = smartArray.size();
        distinct();
    }
    public void distinct() {
        Object[] newArr = new Object[size()];
        Object[] Arr = smartArray.toArray();
        int k = 0;
        for (int i = 0; i < smartArray.size(); ++i) {
            boolean notExist = true;
            for (int j = 0; j < k; ++j) {
                if (Arr[i].equals(newArr[j])){
                    notExist = false;
                    break;
                }
            }
            if (notExist){
                newArr[k] = Arr[i];
                ++k;
            }
        }
        smartArray = new BaseArray(newArr);
        size = smartArray.size();

    }
    @Override
    public Object[] toArray(){

        return this.smartArray.toArray();
    }
    @Override
    public String operationDescription(){
        return this.smartArray.operationDescription() + ", DistinctDecorator";
    }
    @Override
    public int size(){
        return this.size;
    }

}
