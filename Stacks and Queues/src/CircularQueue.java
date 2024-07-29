public class CircularQueue{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    protected int front =0;
    protected int end =0;
    private int size =0;

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end] = item;
        end++;
        end = end % data.length;
        size++;
        return true;
    }
    public boolean isFull(){
        if(size == data.length){
            return true;
        }
        return false;
    }
    public int peek(){
        return data[front];
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        int removed = data[front];
        front++;
        front = front % data.length;
        size--;
        return removed;
    }
    public boolean isEmpty(){
        if(size ==0){
            return true;
        }
        return false;
    }
    public void display(){
        int i=end;
        do{
            System.out.print(data[i]+ " ->" );
            i++;
            i = i % data.length;
        }while(i != end);
        System.out.println("END");
    }
}
