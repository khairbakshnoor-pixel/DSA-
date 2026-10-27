public class  MyStack{



public  static void  main(String[] args){
   stack1 s1=new stack1(10);
   s1.push(5);
   s1.push(10);
   s1.push(15);
   s1.push(20);
   s1.displaY();
 
   System.err.println("size is "+s1.size());
   s1.pop();
s1.displaY();
  System.out.println("The top is "+s1.peak());
   
}
}