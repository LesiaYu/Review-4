package com.syntax.review4;

import java.util.Scanner;

public class ArrayAndScanner {
    public static void main(String[] args) {

       //create array that stores numbers from user
        //and then we want to calculate the average of numbers

        Scanner scan=new Scanner (System.in);
        System.out.println("How many integers we want to store?");
        int size=scan.nextInt();
        int [] numbers= new int[size];

        for (int i = 0; i <size; i++) {
            System.out.println("Please enter "+(i+1)+" element");
            numbers [i]=scan.nextInt();

        }
        int sum=0;
       for (int num:numbers){
           sum=sum+num;
          ;
       } System.out.println(sum+" ");






    }
}
