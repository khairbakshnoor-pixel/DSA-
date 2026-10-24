public class CircularQueue {
    private  int rear;
    private  int front;
    private  int size;
    private int [] arr;

    public  CircularQueue(int capacity){
        arr=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    public boolean isempty(){
        return  size==0;
    }
    public boolean isfull(){
        return size==arr.length;
    }
    public  int size(){
        return  size;
    }
    public  void enque(int value){
        if( isfull()){
            System.out.println("The queue is Over flow");
            return ;
        }
        rear=(rear+1)% +arr.length;
        arr[rear]=value;
        size++;
    }
    public int deque(){
        if(isempty()){
            System.out.println("Queue is underflow");
            return -1;
        }
        int value=arr[front];
         front=(front+1)% +arr.length;
        
        size--;
        return  value;
    }
    public void displaY(){
          if(isempty()){
            System.out.println("Queue is underflow");
            return ;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[(front+i)%arr.length]);
        }
    }
    public  int peak(){
        if(isempty()){
            System.out.println("Queue is underflow");
            return -1;
        }
        return arr[front];
    }

   
}
