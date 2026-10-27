/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author GT-Tech
 */
public class Array {

    public static void main(String[] args) {
        MyArray a1 = new  MyArray(10);
      
        a1.insert(0);
        a1.insert(5);
        a1.insert(8);
        a1.insertat(1, 5);
        a1.deleteat(1, 5);
          a1.setarray(1,10);
        a1.display();
        a1.search(8);
    }
}
