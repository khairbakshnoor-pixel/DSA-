public class stack {
    int [] arr;
    int top;
    stack(int capacity){
        arr=new int[capacity];
        top=-1;
    }
    public boolean isempty(){
        return  top==-1;
    }
    public  boolean isfull(){
        return top==arr.length-1;
    }
    public void push(int value){
        if(isfull()){
            System.out.println("stack is Overflow");
            return ;
        }
    top++;
    arr[top]=value;
    }
    public int  pop(){
        if(isempty()){
            System.out.println("Stack is underflow");
            return -1 ;
        }
        int value=arr[top];
        top--;
        return value;
    }
    public int peak(){
        if(isempty()){
            System.out.println("Stack underflow");
return -1;
        }
        return arr[top];

    }
    public  void displaY(){
        if(isempty()){
            System.out.println("Stack is underflow");
            return ;
        }
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    
}

