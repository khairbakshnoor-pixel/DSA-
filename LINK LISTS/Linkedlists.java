/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.LinkedList;

/**
 *
 * @author GT-Tech
 */
public class Linkedlists {

    public static void main(String[] args) {

        DLL l2 = new DLL();
        LL list = new LL();
        CLL c1 = new CLL();
        list.insertatbegining(5);
        list.insertatbegining(60);
        list.insertatend(78);
        list.display();
        System.out.println("size " + list.getsize());
        // 10
        l2.pushfront(7);
        l2.pushfront(45);
        l2.pushfront(9);
        l2.displaybackward();
        c1.insertathead(90);
        c1.insertathead(89);
        System.out.println("THe CLL count : " + c1.countnodes());
        list.reverselinklist();
        list.display();

    }
}
