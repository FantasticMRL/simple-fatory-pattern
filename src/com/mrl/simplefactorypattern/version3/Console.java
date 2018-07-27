package com.mrl.simplefactorypattern.version3;

import java.util.Scanner;

public class Console
{
    public static void main(String[] args) {
     
        String inputNumLeft = "";
        String inputNumright = "";
        String result = "";
        String operator = "";
        Scanner  scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        inputNumLeft = scanner.nextLine();
        System.out.println("请输入第二个数字");
        inputNumright = scanner.nextLine();
        System.out.println("请输入运算符,+,-,*,/");
        operator = scanner.nextLine();
        
        //创建那个对象,由工厂帮我们
        Operation operationInstance = new SimpleOperationFactory().getOperationInstance(operator);
        double res= operationInstance.getRes(Double.parseDouble(inputNumLeft), Double.parseDouble(inputNumright));
        System.out.println(res);
    }
}
