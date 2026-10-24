/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;

/**
 *
 * @author GT-Tech
 */
public class Array {

    public static void main(String[] args) {
       myarray a1=new myarray(10);
      a1.insert(0);
      a1.insert(5);
      a1.insert(8);
      a1.insertat(1,5);
      a1.display();
      a1.deleteat(1, 5);
      a1.display();
    }
}
