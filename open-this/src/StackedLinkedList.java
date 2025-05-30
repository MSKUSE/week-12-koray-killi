public class StackedLinkedList<T> implements Stack<T>{

    StackItem<T> top;


    @Override
    public void push(T item) {
        StackItem<T> newBox = new StackItem<>(item);
        StackItem<T> previousTop = this.top;
        this.top = newBox;
        top.setNextpart(previousTop);

        // Create a box
        // empty the top
        // put the top


    }

    @Override
    public T pop() throws MyEmptyStackException{
        if(this.top == null) {
            throw new MyEmptyStackException("Stack is empty");
        }
        T tempData = top.getData();
        top = top.getNextpart();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is " + this.top.getData());
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }


    public void displayStack() {

        if (this.top == null) {
            System.out.println("This stack is empty.");

        } else {
            StackItem<T> tempNode = top;
            while (tempNode != null) {
                System.out.println(tempNode.getData());
                tempNode = tempNode.getNextpart();
            }
        }
    }

    @Override
    public String toString() {
        return "StackedLinkedList{" +
                "top=" + top +
                '}';
    }
}
