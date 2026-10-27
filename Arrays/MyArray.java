
public class  MyArray{
    private int[] arr;
    private  int size;
   
    public MyArray(int capacity){
       arr=new int[capacity];
       size=0;
   }
   public boolean isfull(){
       return size==arr.length;
   }
   public boolean isempty(){
       return size==0;
   }
   public int getarray(int index){
       if(index<0 || index>=size){
           System.out.println("index doesnt exist");
           return -1;
       }
       return arr[index];
   }
   public void setarray(int index,int value){
       if(index<0|| index>=size){
           System.out.println("index doesnt exist");
           return;
       }
       arr[index]=value;
   }
   public void insert(int value){
       if(isfull()){
           System.out.println("The array is full");
           return;
       }
       arr[size]=value; 
       size++;
   }
   public void insertat(int index,int value){
       if(index<0 || index>size){
           System.out.println("index doesnt exist");
           return;
       }
       if(isfull()){
           System.out.println("The array is full");
           return;
       }
       for(int i=size-1;i>=index;i--){
           arr[i+1]=arr[i];// 
       }
       arr[index]=value;
       size++;
   }
   public void deleteat(int index,int value){
       if(isempty()){
           System.out.println("Array is empty ");
           return;
       }
       if(index<0 || index>=size){
           System.out.println("index doesnt exist");
           return;
       }
       for(int i = index;i<size-1;i++){
       arr[i]=arr[i+1];
   }
       size--;
   }
   public void display(){
       if(isempty()){
           System.out.println("The Array is Empty");
           return;
       }
       for(int i=0;i<=size-1;i++){
           System.out.println(arr[i]);
       }
   }
     public void search(int value){
       for(int i=0;i<size;i++){
           if(arr[i]==value){
               System.out.println("Find at "+i+" value "+value);
           }
       }
   
}
}

