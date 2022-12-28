package com.nie.judgloop;

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        System.out.println("请输入数字:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;

        int endNum = 0;

        while (num != 0){

            int num2 =  num%10;
            num = num/10;
            endNum = endNum*10 + num2;
        }
        if (temp==endNum){
            System.out.println(temp + "是回文数");
        }else{
            System.out.println(temp +"不是回文数");
        }
    }
}
