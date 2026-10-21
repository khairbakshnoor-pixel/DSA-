/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GT-Tech
 */
public class DLL {
    int data;
    Node1 head;
    Node1 tail;

    class Node1{
       
        Node1 next;
        Node1 prev;
        int data;
        Node1(int data){
           this.data=data;
            this.next=null;
            this.prev=null;
            
        }
    }
    //Display forward
    public void pushfront(int val){
        Node1 newnode=new Node1(val);
        if(head==null){
            head=tail=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    public void pushback(int val){
         Node1 newnode=new Node1(val);
        if(head==null){
            head=tail=newnode;
        }
         else{
            newnode.prev=tail;
            tail.prev=newnode;
            tail=newnode;
        }
    }
    public void displayforward(){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
     public void displaybackward(){
        Node1 temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.prev;
        }
        System.out.println("Null");
    }
}
