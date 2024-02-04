package usingLinkedList;

import java.util.LinkedList;

public class LinkedStack {
    private final LinkedList<Integer> items = new LinkedList<Integer>();

    public void push(int element){
        items.addFirst(element);
    }

    public int pop(){
        if(items.isEmpty()){
            System.out.println("There are no elements in the stack");
        }
        return items.removeFirst();
    }

    public int peek(){
        if(items.isEmpty()){
            System.out.println("There are no elements in the stack");
        }
        return items.getFirst();
    }

    public void printStack(){
        System.out.println("Stack: " + items);
    }

    public static void main(String[] args){
        LinkedStack myStack = new LinkedStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        int peekedItem = myStack.peek();
        System.out.println("Item on the top of the stack before pop is: "+ peekedItem);

        int poopedItem = myStack.pop();
        System.out.println("Item that is popped is: "+ poopedItem);


        int peekedItemTwo =  myStack.peek();
        System.out.println("Item on the top of the stack before pop is: "+ peekedItemTwo);


        myStack.printStack();

    }

}

/*
    OUTPUT

    Item on the top of the stack before pop is: 3
    Item that is popped is: 3
    Item on the top of the stack before pop is: 2
    Stack: [2, 1]
 */
