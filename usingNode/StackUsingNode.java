package usingNode;

public class StackUsingNode <T> {
    private Node<T> top;

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public boolean isEmpty(){
        return top == null;
    }
    public T pop(){
        if(isEmpty()){
           System.out.println("There are no values in the stack");
        }
        Node<T> temp = top;
        top = top.next;
        return temp.data;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("There are no values in the stack");
        }
        return top.data;
    }

    public void displayStack(){
        Node<T> current = top;
        System.out.println(" -- Stack --");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
