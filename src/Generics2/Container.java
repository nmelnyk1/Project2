package Generics2;

public class Container<T extends Product> {

    T item;


    public Container(T item) {
        this.item = item;

    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


    public void printItems(){
        System.out.println("Printing the content of conatiner:");
        System.out.println(item);

    }
}
