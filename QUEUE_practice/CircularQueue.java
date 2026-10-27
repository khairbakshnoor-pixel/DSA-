public class CircularQueue {
    int [] arr;
    int rear;
    int front;
    int size;

    public  CircularQueue(int capacity){
        arr=new int[capacity];
        rear=-1;
        front=0;
        size=0;
    }
    public  boolean isempty(){
        return size==0;
    }
    public boolean isfull(){
        return  size==arr.length;
    }
    public int size(){
        return size;
    }
    public void  enque(int value){
        if(isfull()){
            System.out.println("The Queue is Overflow");
            return ;
        }
        rear=(rear+1)%arr.length;
        arr[rear]=value;
        size++;

    }
    public int  deque(){
        if(isempty()){
            System.out.println("Queue is Underflow");
            return -1;
        }
            int value=arr[front];
            front=(front+1)% arr.length;
            size--;
            return value;
    }
    public int peak(){
        if(isempty()){
            System.out.println("THe Queue is underflow");
            return -1;
        }
    return arr[front];
    }
    public void displaY(){
        if(isempty()){
            System.out.println("The Queue is underflow");
            return ;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[(front+i)%arr.length]);
        }
    }
}
