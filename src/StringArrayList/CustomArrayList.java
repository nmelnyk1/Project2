package StringArrayList;

import java.util.Objects;

public class CustomArrayList {

    private String[] arr;
    private int size;
    private Object elements[]; //<- for storing all elements added to list
    private final int INITIAL_CAPACITY = 10;

    public CustomArrayList() {
        arr = new String[INITIAL_CAPACITY];
    }


    public CustomArrayList(int capacity) {
        arr = new String[capacity];
        size = 0;

    }


    public void add(String val) {
        arr[size] = val;
        size++;
        String[] newArr = new String[size * 2];
        newArr.clone();

    }

    public int size() {
        return this.size;
    }

    public String get(int index) {
        Objects.checkIndex(index, size);
        return arr[index];
    }



    public boolean isEmpty() {
        return arr.length == 0;
    }

    public boolean contains(String valTocheck) {
        for (int i = 0; i < arr.length; i++) {

        }

        return true;
    }


    public CustomArrayList remove(int index){
        if ( index >= size || index< 0){
            throw new IndexOutOfBoundsException("Index " + index + ", Size" + size);
        }
        Object items = elements[index];
        int newElements = elements.length - (index+1);
        System.arraycopy(elements, index + 1, elements, index, newElements);
        size--;
        return (CustomArrayList) items;
    }
}