public class StackItem<T> {
        private T data;
        private StackItem<T> nextpart;

    public StackItem(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StackItem<T> getNextpart() {
        return nextpart;
    }

    public void setNextpart(StackItem<T> nextpart) {
        this.nextpart = nextpart;
    }

    @Override
    public String toString() {
        return "StackItem{" +
                "data=" + data +
                '}';
    }
}
