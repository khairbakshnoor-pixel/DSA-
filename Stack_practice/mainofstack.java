public class mainofstack {

    public static void main(String[] args){
    stack s1=new stack(10);
   s1.push(20);
    s1.push(15);
    s1.push(20);
    s1.pop();
    s1.displaY();
    System.out.println(s1.peak());
}
}