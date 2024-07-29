public class Custom_stack{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr =-1;

    public Custom_stack(){
        this(DEFAULT_SIZE);
    }

    public Custom_stack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public boolean isFull(){
        if(ptr == data.length-1){
            return true;
        }
        return false;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public boolean isEmpty(){
        if(ptr == -1){
            return true;
        }
        return false;
    }
}
