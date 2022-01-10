
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
}
