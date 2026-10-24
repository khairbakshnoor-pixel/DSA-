/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author GT-Tech
 */
public class myarray {
    private int[] arr;
   private  int size;
   
    public myarray(int capacity){
       arr=new int[capacity];
       size=0;
   }
   public boolean isfull(){
       return size==arr.length;
   }
   public boolean isempty(){
       return size==0;
   }
   public int getarray(int index){
       return arr[index];
   }
   public void setarray(int index,int value){
       if(index<0|| index>=size){
           System.out.println("index doesnt exist");
       }
       arr[index]=value;
       size++;
   }
   public void insert(int value){
       if(isfull()){
           System.out.println("The array is full");
           return;
       }
       arr[size]=value;
       size++;
   }
   public void insertat(int index,int value){
       if(isfull()){
           System.out.println("The array is full");
           return;
       }
       for(int i=size-1;i>=index;i--){
           arr[i+1]=arr[i];
       }
       arr[index]=value;
       size++;
   }
   public void deleteat(int index,int value){
       if(isempty()){
           System.out.println("Array is empty ");
           return;
       }
       //
       for(int i = index;i<=size-1;i++){
       arr[i]=arr[i+1];
   }
       size--;
   }
   public void display(){
       if(isempty()){
           System.out.println("The Array is Empty");
           return;
       }
       for(int i=0;i<size-1;i++){
           System.out.println(arr[i]);
       }
   }
   
}

