/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dsa;
import java.util.*;

/**
 *
 * @author GT-Tech
 */
public class DSA {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
//   
//      
//      int numbers[]={2,3,4,5};
//      for(int i=0;i<4;i++){
//          System.out.println(numbers[i]);
//      }
  
//        System.out.println("Enter the size of the array");
//        int size=sc.nextInt();
//        int []array=new int[size];
//    for(int i=0;i<size;i++){
//        array[i]=sc.nextInt();
//    }
//    
//    for( int i=0;i<size;i++){
//    System.out.println(array[i]);
//}Search array by the number
//int array1[]={1,2,3,4,5};
//        System.out.println("Enter a number to search in the array");
//        int search=sc.nextInt();
//        for(int i=0;i<array1.length;i++){
//        if(array1[i]==search){
//            System.out.println("Array found at index"+i+"array is "+array1[i]);
//        }
//        
//    
//        }
//sum of the array and avg 
//int array2[]={1,2,3,4,5};
//int sum=0;
//        for(int i=0;i<array2.length;i++){
//     sum+=array2[i];
// }
//        System.out.println("SUm is "+sum);
//        System.out.println("Avg "+sum/array2.length);

// largest and minimum


int array3[]={3,2,3,4,5,10};
int largest=array3[0];
int smallest=array3[0];
 for(int i=0;i<array3.length;i++){
     if(array3[i]>largest){
         largest=array3[i];
        
     }
     
     else if(array3[i]<smallest){
         smallest=array3[i];
     }
     
 }
  System.out.println("largest is "+largest);
        System.out.println("smallest is "+smallest);
    }
}
