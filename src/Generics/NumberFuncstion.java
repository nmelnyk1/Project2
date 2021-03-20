package Generics;

public class NumberFuncstion <T extends Number> {
    T num;
    T ob;

    NumberFuncstion(T ob) {
        this.ob = ob;
    }

    double square() {
        return ob.intValue() * ob.doubleValue();

    }

    /*boolean absEqual(NumberFuncstion<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;

    }*/
}

