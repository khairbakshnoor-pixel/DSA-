public class LinearQueue {
    int [] arr;
    private int rear;//for adding
    private int front;//for removing
    public LinearQueue(int capacity){
        arr=new int[capacity];
        rear=-1;
        front=-1; 

    }
    public boolean isempty(){
        return front==-1;
    }
    public boolean  isfull(){
        return rear==arr.length-1;
    }
    public int size(){
        return isempty()  ? 0 : rear-front+1;
    }
    public void enque(int value){
        if(isfull()){
            System.out.println("THe QUeue os overflow");
            return ;
        }
        if(isempty()){
            front=0;
        }
        rear++;
        arr[rear]=value;
    }
public int deque(){
    if(isempty()){
        System.out.println("Stack is underflow");
        return -1;
    }
    int value=arr[front];
    if(front==rear){
        rear=-1;
        front=-1;
    }
    else{
        front++;
    }
    return  value;
    }
    public int peak(){
        if(isempty()){
            System.out.println("Stack is underflow");
            return-1 ;
        }
        return  arr[front];

    }
    public  void  displaY(){
 if(isempty()){
            System.out.println("Stack is underflow");
            return ;
        }
        for(int i=front;i<=rear;i++ ){
            System.out.println(arr[i]);
        }
}

}
