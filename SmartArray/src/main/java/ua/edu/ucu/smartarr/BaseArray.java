package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray{
    Object[] smartArray;
    String description = "BaseArray";

    public BaseArray(Object[] obgs) {
        smartArray = Arrays.copyOf(obgs, obgs.length);
    }
    public Object[] toArray() {
        return smartArray;
    }
    public String operationDescription() {
        return description;
    }
    public int size() {
        int s = 0;
        for (Object el : smartArray)
            if (el != null)
                ++s;
        return s;
    }

    public static void main(String[] args) {
        SmartArray b = new BaseArray(new Object[]{1,3,4}) ;
        System.out.print(b.toArray());
    }
}
