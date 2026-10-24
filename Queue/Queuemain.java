public class Queuemain {
    
     public static void main(String[] args){
LinearQueue l1=new LinearQueue(10);
CircularQueue c1=new CircularQueue(10);
l1.enque(10);
l1.enque(20);
l1.enque(30);
l1.deque();


l1.enque(40);
l1.displaY();
System.out.println(l1.peak());
System.out.println("NOw Cricular enque");
c1.enque(15);
c1.enque(20);
c1.enque(30);
c1.deque();
c1.displaY();
System.out.println("THe top cir is "+c1.peak());
    }
}
