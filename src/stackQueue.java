
public class stackQueue<E,T> {
    private int length=0;//tracks length
    private StackNode stack1;//main stack
    private StackNode stack2;//stack that the values are moved to in order to dequeue
    private T tmp;

    public stackQueue(){ //defsault construcor
        stack1=new StackNode();
        stack2=new StackNode();
    }

    public void enqueue(E element){ //adds element on to the top of the stack1
        stack1.push(element);
        length++;

    }



    public T deQueue(){

        if(length==0){//returns null if it is empty
            tmp=null;
        }
        if(length==1){//if it is only one value, retuens that value and empties the stack
            length--;
            tmp=(T)stack1.pop();
        }
        if(length>1){

            for(int a=1;a<length;a++){//shifts everything to stack 2
                stack2.push(stack1.pop());

            }

            tmp=(T)stack1.pop();//takes the botton value of stsck 1 and removes it

            for(int i=1;i<length;i++){//moves all the vaules back to stack 1 and resets it
                stack1.push(stack2.pop());
            }



            if(length>0){//decrements the length if applicable
                length--;
            }


        }

        return tmp;

    }

    public boolean isEmpty(){//returns true if empty and false if it has a value in it
        if (stack1.isEmpty()&&stack2.isEmpty()&&length==0){
            return true;
        }
        return false;
    }


    public int size(){//returns the lenght int
        return length;
    }

    public T peek(){
        if(length==0){//if empty, returns null
            tmp=null;
        }
        if(length==1){//if the length is one, it returns that value without removing it
            tmp=(T)stack1.peek();
        }
        if(length>1){

            for(int a=1;a<length;a++){//moves everything to secoind stack
                stack2.push(stack1.pop());

            }

            tmp=(T)stack1.peek();//copys the last value in stack one

            for(int i=1;i<length;i++){//moves back to the first stack
                stack1.push(stack2.pop());
            }


        }

        return tmp;
    }

    public static void main(String[] args) {


        stackQueue s = new stackQueue();


        s.enqueue("one");
        s.enqueue(2);
        s.enqueue(3);

        s.enqueue("four");
        s.enqueue(5);
        s.enqueue(null);
        s.enqueue("seven");

        System.out.println("is empty? " + s.isEmpty());
        System.out.println("Size: "+ s.size());
        System.out.println(s.deQueue());
        System.out.println(s.deQueue());
        System.out.println("testing peek twice");
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println("Continuing to dequeue the enqueued values");
        System.out.println(s.deQueue());
        System.out.println(s.deQueue());
        System.out.println(s.deQueue());
        System.out.println(s.deQueue());
        System.out.println(s.deQueue());
        System.out.println("is empty? " + s.isEmpty());
        System.out.println("Size: "+ s.size());

















    }
    
}
