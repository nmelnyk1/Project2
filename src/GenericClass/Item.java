package GenericClass;

public class Item <T extends Comparable<T>> implements Comparable <Item<T>> {

    private T data;

    public Item(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public int compareTo(Item<T> obj) {
        return data.compareTo(obj.data);
    }
}
