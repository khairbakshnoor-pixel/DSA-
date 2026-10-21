/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GT-Tech
 */
public class CLL {
    int data;
    Node1 head;
    Node1 tail;
    
    class Node1{
       
        Node1 next;
       
        int data;
        Node1(int data){
           this.data=data;
            this.next=null;                    
        }
    }
        public void insertathead(int val){
            Node1 newnode=new Node1(val);
            if(head==null){
                head=tail=newnode;
                head.next=newnode;
            }
            else{
                Node1 temp=head;
                while(temp.next!=head){
                    temp=temp.next;
                }
                temp.next=newnode;
                newnode.next=head;
            }
        }
        public int countnodes(){
            if(head==null){
                return 0;
            }
            int count=0;
            Node1 temp=head;
            do{
                count++;
                temp=temp.next;
                
            }while(temp!=head);
            return count;
                    
        }
        
        

}
