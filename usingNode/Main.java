package usingNode;

public class Main {
    public static void main(String[] args){
        StackUsingNode<Integer> myStack = new StackUsingNode<Integer>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        int poppedData = myStack.pop();
        int returnedData = myStack.peek();

        System.out.println("The popped element is: ");
        System.out.println(poppedData);

        System.out.println("The element on the top of the stack in accordance with FILO is: ");
        System.out.println(returnedData);

        System.out.println("The stack in accordance with FILO is: ");
        myStack.displayStack();
    }
}
/*

    The popped element is:
    5
    The element on the top of the stack in accordance with FILO is:
    4
    The stack in accordance with FILO is:
    -- Stack --
    4
    3
    2

 */