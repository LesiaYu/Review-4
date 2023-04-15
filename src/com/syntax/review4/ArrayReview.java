package com.syntax.review4;

public class ArrayReview {
    public static void main(String[] args) {

        int a=10;

        int [] arr=new int[3];

        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        System.out.println(arr[1]);

        for (int b:arr){
            System.out.println(b);
        }

        String [] planets={"Earth","Mars","Jupiter","Saturn","Neptune"};

        System.out.println("         Enhanced for loop         ");

        for (String planet:planets){
            System.out.println(planet);

        }


        for (int i=0; i < planets.length; i++) {
            System.out.print(planets[i]+" ");

        }

    }
}
