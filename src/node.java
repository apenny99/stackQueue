/**
 * myNode
 * A class to make nodes that connect to one another and store data
 * Author: August Penny
 * Collaborator(s): The names of anyone you collaborated with here
 * Collaboration: Describe the collaboration that took place
 * Date: Date the program is handed in: 9/29/21
 **/

public class node<T> {

    private T val; //data stored
    private node Next; //child node
    private node Prev; //parent node


    public node(){//default constructor
        val=null;
        Next = null;
    }
    public node(T t, node n, node p){//constructor with refrence node and value
        this.val=t;
        this.Next=n;
        this.Prev=p;
    }
    public T getValue(){//retuens value
        return val;
    }
    public node getNext(){//returns child node
        return Next;
    }
    public node getPrev(){//returns previous node
        return Prev;
    }

    public void setNext(node n) {//sets connected node
        Next = n;
    }
    public void setPrev(node n){
        Prev=n;
    }
    public void setDataType(T t){//sets value
        this.val=t;
    }
    public String toString(){ //returns the nodes data in the tostring with prefix "Node :"
        return "Node: " + val.toString();
    }
    public boolean equals(node n){
        if (n.getValue().equals(this.getValue())){
            return true;
        }
        return false;
    }


}
