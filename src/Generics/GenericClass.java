package Generics;

import java.util.HashMap;

public class GenericClass<T, V extends Object>{
    T object;
    V obj;
    // instead of int we use T
    //Constructor

     HashMap<T, V> map = new HashMap<>();

    public GenericClass(T object, V obj) {
        this.object = object;
        this.obj = obj;
    }

    //Method

    public void showType(){
        System.out.println(object.getClass().getName());
        System.out.println(obj.getClass().getName());
    }
}
