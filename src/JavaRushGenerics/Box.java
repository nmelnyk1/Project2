package JavaRushGenerics;

import java.util.ArrayList;
import java.util.List;

    public  class Box<T> {
        List<T> slots = new ArrayList<>();
        public List<T> getSlots() {
            return slots;
        }
    }

