package com.syntax.review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        int sum=0;
        System.out.println("Please Enter integer values");

        while(scanner.hasNextInt()) {

            int num = scanner.nextInt();
            sum+=num;
        }
        System.out.println("Sum = "+sum);

    }
}
