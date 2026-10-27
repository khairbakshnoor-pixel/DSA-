public class Queuemain {

    public static void main(String[] args) {
        SimpleQueue s1=new SimpleQueue(10);
        s1.enque(10);
        s1.enque(20);
        s1.enque(30);
        s1.deque();
        s1.displaY();
        System.out.println("New Queue");
        CircularQueue c1= new CircularQueue(10);
        c1.enque(10);
        c1.enque(30);
        c1.enque(40);
        c1.displaY();
    }
    
}
