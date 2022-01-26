
public class stackQueue<E,T> {
    private int length=0;
    private StackNode stack1;
    private StackNode stack2;
    private T tmp;

    public stackQueue(){
        stack1=new StackNode();
        stack2=new StackNode();
    }

    public void enqueue(E element){
        stack1.push(element);
        length++;

    }



    public T deQueue(){

        if(length==0){
            tmp=null;
        }
        if(length==1){
            length--;
            tmp=(T)stack1.pop();
        }
        if(length>1){

            for(int a=1;a<length;a++){
                stack2.push(stack1.pop());

            }

            tmp=(T)stack1.pop();

            for(int i=1;i<length;i++){
                stack1.push(stack2.pop());
            }



            if(length>0){
                length--;
            }


        }

        return tmp;

    }

    public boolean isEmpty(){
        if (stack1.isEmpty()&&stack2.isEmpty()&&length==0){
            return true;
        }
        return false;
    }


    public int size(){
        return length;
    }

    public T peek(){
        if(length==0){
            tmp=null;
        }
        if(length==1){
            tmp=(T)stack1.peek();
        }
        if(length>1){

            for(int a=1;a<length;a++){
                stack2.push(stack1.pop());

            }

            tmp=(T)stack1.peek();

            for(int i=1;i<length;i++){
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
        s.enqueue(6);
        s.enqueue("seven");

        












    }
    
}
