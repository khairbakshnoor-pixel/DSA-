public  class LL{
    Node head;
    int size;
    class Node{
        Node next;
        int data;
        Node(int capacity){
Node n=new node(capacity);
this.data=data;
next=null;
        }
    } 
    public  boolean isempty(){
return  size==0;
    }
    public int size(){
        return size;
    }
    public  void insertathead(int value){
        
        
        Node n=new Node(value);
        n.next=head;
        head=n;
        size++;
    }
    public void insertat(int index,int value){
        if(index<0|| index>size){
            System.out.println("OUT of index");
        }
        if(index==0){
            insertathead(value);
        }
        Node n=new Node(value);
        Node curr=head;
        for(int i=0;i<index-1;i++){
            curr=curr.next;
        }
        n.next=curr.next;
        curr.next=n;
        size++;
    }
}