package com.mrl.simplefactorypattern.version2;

import java.util.Scanner;

/**
 *  控制台
 *  [功能详细描述]
 * @作者 lwq
 * @version [版本号, 2018年6月1日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
public class CalConsole
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
        
        double calculator = new Operation().calculator(Double.parseDouble(inputNumLeft), Double.parseDouble(inputNumright), operator);
        
        System.out.println("结果是："+calculator);
    }
}
