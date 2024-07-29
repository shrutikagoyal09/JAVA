public class QueueUsingStack extends Custom_stack{
    private Custom_stack first;
    private Custom_stack second;
    public QueueUsingStack() {
        this.first= new Custom_stack();
        this.second = new Custom_stack();
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            System.out.println("Stack is Full");
            return false;
        }
       first.push(item);
       return true;
    }
    public int pop{
     if(this.isEmpty()){
         System.out.println("Stack i empty");
     }
     while(!first.isEmpty()){
         second.push(first.pop());
     }
    }

}
