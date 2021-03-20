package TypeErasing;

import java.util.ArrayList;
import java.util.List;

public class Demo {


        public static void addToList(List list) {
            list.add("0067");
            list.add("bb");
            list.add('D');
        }
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            addToList(list);

            System.out.println(list.get(0));
            System.out.println(list.get(1));
            System.out.println(list.get(2));
        }
    }

