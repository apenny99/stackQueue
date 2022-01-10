
public class stackQueue<E,T> {
    private int length=0;
    private StackNode main;
    private StackNode temp;

    public stackQueue(){

    }

    public void enqueue(E element){
        main.push(element);
        length++;
        

    }

    private T toBottom(StackNode s){
        if(s.isEmpty()){
            return (T) temp.pop();
        }
        temp.push(s.pop());
        return toBottom(s);

    }
    
    private void reset(){
        while(temp.isEmpty()==false){
            main.push(temp.pop());
        }
    }
    public T deQueue(){
        T temp=toBottom(main);
        reset();
        length--;
        return temp;
    }
}
