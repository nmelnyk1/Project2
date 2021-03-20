package GenericsTypeErasure;

import Generics3.SoccerPlayer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //SomeTypesomeType = new SomeType()//  raw type
        SomeType<?> someType = new SomeType<Object>();
        List<String > list = Arrays.asList("value");
        someType.test(list);// ClassCastException


    }
}
