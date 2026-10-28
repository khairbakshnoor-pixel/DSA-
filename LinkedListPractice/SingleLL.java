public class SingleLL {
    Node head;
    int size;

    public class Node{
int data;
Node next;
Node(int data){
    this.data=data;
    next=null;
    
}
    }
public  boolean isempty(){
    return  size==0;
}
public  int size(){
    return size;
}
public  void insertathead(int value){
    Node n=new Node(value);
    n.next=head;
    head=n;
    size++;

    }
public  void  inserttail(int value){
    Node n=new Node(value);
    if(head==null){
        head=n;
        return ;
    }
    Node cur=head;
    while (cur.next!=null) {
        cur=cur.next;
    }
    cur.next=n;
    size++;
}
public  void insertat(int index,int value){
    if(index<0 || index>size){
        System.out.println("Index doesnt exist");
        return ;
    }
    if(index==0){
        insertathead(value);
        return ;
    }
    Node cur=head;
    for(int i=0;i<index-1;i++){
        cur=cur.next;
    }
    Node n=new Node(value);
    n.next=cur.next;
    cur.next=n;
    size++;
}
public  void insert(int value){
    Node n=new Node(value);
    if(head==null){
head=n;
return ;
    }
    Node cur=head;
    while(cur.next!=null){
        cur=cur.next;
    }
    cur.next=n;
    size++;

}

public  void deleteathead(){
    if(isempty()){
        System.out.println("Linked list is empty");
        return ;
    }
  head=head.next;
  size--;
}
public void deleteattail(){
     if(isempty()){
        System.out.println("Linked list is empty");
        return ;
    }
   if(head.next==null){
    head=null;
    return ;
   }
    Node cur=head;
    while(cur.next.next!=null){
        cur=cur.next;
    }
    cur.next=null;
    size--;

}
public  boolean delete(int value){
    if(head==null){
        System.out.println("Linked list is empty");
        return false ;
    }
if (head.data==value){
    head=head.next;
return true; 
}
Node cur=head;
while(cur.next!=null  && cur.data!=value){
    cur=cur.next;
}
if(cur.next==null){
    return false;
}
cur.next=cur.next.next;
return true;
}
void deleteAt(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 0) {
            deleteathead();
            return;
        }
        Node cur = head;
        for (int i = 0; i < pos - 1; i++) {     // go to the node BEFORE pos
            cur = cur.next;
        }
        cur.next = cur.next.next;               // skip the node at pos
        size--;
    }

    public  int  search(int value){
        Node cur=head;
        int index=0;
        while(cur!=null){
    if(cur.data==value){
                return index;
    }
    cur=cur.next;
    index++;

        }
        return -1;
    }
    public void displaY(){
        if(isempty()){
            System.out.println("Linked list is empty");
            return ;
        }
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
        System.out.println("null");
    }
    public void reverse(){
         if(isempty()){
            System.out.println("Linked list is empty");
            return ;
        }
        Node prev=null;
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
    }


}
    

    

