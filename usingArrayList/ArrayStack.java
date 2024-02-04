package usingArrayList;

import java.util.ArrayList;

public class ArrayStack {
    private ArrayList<Integer> items = new ArrayList<>();

    // Push an item onto the stack
        public void push(int item) {
            items.add(item);
        }

        public int pop(){
            if(items.isEmpty()){
                System.out.println("There are no items in the stack");
            }
           return items.removeLast();
        }

        public int peek(){
            if(items.isEmpty()){
                System.out.println("There are no integers in the stack");
            }
            return items.getLast();
        }

        public void printStack(){
            System.out.print("[ ");
            for(int i = items.size() -1 ; i>= 0 ; i--){

                System.out.print(items.get(i) + " ");
            }
            System.out.print("]");
            System.out.println();
        }


        public static void main(String[] args){
            ArrayStack myStack = new ArrayStack();
            myStack.push(17);
            myStack.push(72);
            myStack.push(93);
            myStack.push(21);
            myStack.push(33);
            myStack.push(48);

            int poppedElement = myStack.pop();
            System.out.println(poppedElement+" popped from the stack");

            int peekedElement = myStack.peek();
            System.out.println(peekedElement+ " is on the top of the stack");

            System.out.println("Stack in the order of First-In-Last-Out");
            myStack.printStack();
        }
}

/*
    OUTPUT
    48 popped from the stack
    33 is on the top of the stack
    Stack in the order of First-In-Last-Out
    [ 33 21 93 72 17 ]
 */
