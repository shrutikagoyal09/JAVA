public class DynamicQueue extends CustomQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
   public boolean insert(int item){
        if(isFull()){
            int[] temp = new int[data.length * 2];
            for(int i=0; i<end; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        data[end++] = item;
        return true;
    }
}
