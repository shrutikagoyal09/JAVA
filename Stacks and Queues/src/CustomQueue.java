public class CustomQueue{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }
    int end = 0;

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full!!");
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }
    public boolean isFull(){
        if(end == data.length){
            return true;
        }
        return false;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty!!");
        }
        int removed = data[0];
        for(int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public boolean isEmpty(){
        if(end==0){
            return true;
        }
        return false;
    }
    public void display(){
        for(int i=0; i< end; i++){
            System.out.print(data[i] + "->");
        }
        System.out.println("END");
    }
}
