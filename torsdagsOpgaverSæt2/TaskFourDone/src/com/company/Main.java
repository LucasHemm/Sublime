package com.company;

import java.util.Random;
public class Main{

    static int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
    static boolean checker = true;

    public static void divideByParameter(int tmpNum){
        int num = tmpNum;
        for(int i = 0; i <= 100; i++){
            if(i % num == 0){
                System.out.println(i);
            }
        }
    }

    public static void randomPrint(){
        Random randomNum = new Random();
        int x = randomNum.nextInt(21);
        System.out.println(arr[x]);
    }

    public static void recursionInt(int tmpNum){
        int num = tmpNum;
        while(checker){
            System.out.println(num);
            num -= 1;
            if(num == 0){
                checker = false;
            }
            System.out.println("extra: "+ num);
            recursionInt(num);
        }
    }
    //opgave 4.e
    static public void fibunacci(int a, int b){
        if(b < 10000) {
            System.out.print(a + "\t"+ b + "\t");
            a = a+b;
            b = a + b;
            fibunacci(a, b);
        }
        else{
            System.out.println("done");
        }
    }



    public static void main(String[] args){
        //divideByParameter(3);
        //randomPrint();
        //recursionInt(10);
        fibunacci(1,1);
    }
}