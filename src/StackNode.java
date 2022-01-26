/**
 * StackNode.java
 * Makes a stack using the Node class
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: Date the program is handed in 11/11/21
 **/

public class StackNode<E, T> {
    private int length;
    private node root;

    public StackNode(){
        root=new node();
        length=0;
    }

    //private methods to make the public ones work.

    private node topNode(node n2){//recursive method to return the current top of the stack
        if(n2.getPrev()==null){
            return n2;
        }
        return topNode(n2.getPrev());
    }




    public void push(E element){//method to make a node with inputted value and add it on to the top of the chain
        node n2=new node(element,null,null);
        if(length==0){//if the first value, sets the value of the root node to the input value
            root.setDataType(element);
        }
        if(length==1){//if second value to be added, directly interacts with the root.
            n2.setNext(root);
            root.setPrev(n2);
        }
        if(length>1){//if more than second value to be added, uses recursive method.
            n2.setNext(topNode(root));
            topNode(root).setPrev(n2);

        }
        length++;
    }


    public T peek(){
        if (length==0){
            return null;
        }
        return (T) topNode(root).getValue();//return the value of the top node in the stack casted to a T type
    }



    public int size(){//returns the length counter that is in the class instance data.
        return length;
    } 

    public boolean isEmpty(){
        if(length==0&&root.getValue()==null){//checks if it only has the root node and if the root node is null or if it has a value.
            return true;
        }
        return false;
    }
     public T pop(){
        if (length==0){
            return null;
        }
        if (length==1){
            T tmp= (T)root.getValue();
            root.setDataType(null);
            length--;
            return tmp;
        }
        node temp = topNode(root);
        node temp2 = topNode(root).getNext();//gets a temp node at the second to top position (will be top when the method finishes)
        temp2.setPrev(null);
        length--;
        return (T) temp.getValue();//return the value of the top node in the stack casted to a T type

    }


    public static void main(String[] args) {
//        StackNode n = new StackNode();
//        n.push("a");
//        n.push(2);
//        n.push("thth");
//        n.push(4);
//        n.pop();
//        System.out.println(n.pop());
    }
}
