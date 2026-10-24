public class Queuemain {
    
     public static void main(String[] args){
LinearQueue l1=new LinearQueue(10);
l1.enque(10);
l1.enque(20);
l1.enque(30);
l1.deque();


l1.enque(40);
l1.displaY();
System.out.println(l1.peak());
    }
}
