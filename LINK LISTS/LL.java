/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GT-Tech
 */
public class LL {
    Node head;
   private int size;
   LL(){
       this.size=0;
   }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
        public void insertatbegining(int value){
            Node newnode=new Node(value);
            if(head==null){
           head=newnode;
           return;
        }
            newnode.next=head;
            head=newnode;
            
        }
        public void insertatend(int value){
            Node newnode=new Node(value);
           if(head==null){
               head=newnode;
               return;
           }
           Node temp=head;
           while(temp.next!=null){
               temp=temp.next;
              
           }
            temp.next = newnode;
        }
        public void display(){
            if(head==null){
                System.out.println("List is empty");
            }
           Node temp=head;
            
             while(temp!=null){
                 System.out.print(temp.data+"->");
                 temp=temp.next;
             }  
           
        }
        public void deletefirst(){
            if(head==null){
                System.out.println("List doesnt exist");
                return;
            }
            size--;
            head=head.next;
        }
        public void deletelast(){
            if(head==null){
                System.out.println("List doesnt exist");
                return;
            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node secondlast=head;
            Node lastnode=head.next;
            while(lastnode.next==null){
                lastnode=lastnode.next;
                secondlast=secondlast.next;
            }
            secondlast=null;
        }
        public void deletevalue(int value){
            if(head==null){
                return;
        }
            size--;
            if(head.data==value){
                head=head.next;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                if(temp.next.data==value){
                    temp.next=temp.next.next;
                    return;
                }
                temp=temp.next;
            }
            
        }
        public int getsize(){
            return this.size;
        }
        //Reverse link list
        public void reverselinklist(){
            if(head==null|| head.next==null){
                return;
            }
           
            Node prev=head;
            Node curr=head.next;
            while(curr!=null){
                Node nextnode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextnode;
                
            }
            head.next=null;
            head=prev;
        }
        
    
    
    
}

