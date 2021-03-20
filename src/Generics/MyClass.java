package Generics;

public class MyClass {
    public static void main(String[] args){
        GenericClass <Integer,String> object1 = new GenericClass<>(52,"HH");


        object1.showType();

        System.out.println(object1);

        NumberFuncstion<Integer> object3 = new NumberFuncstion<>(8);
        System.out.println(object3.square());

        NumberFuncstion<Integer> obj1 = new NumberFuncstion<>(6);
        NumberFuncstion<Double> obj2 = new NumberFuncstion<>(6.0);

       // obj1.absEqual(obj2); //using wildcard

    }
}
