package com.mrl.simplefactorypattern;

import java.util.Scanner;

/**
 *  大话设计模式
 *  [功能详细描述]
 * @作者 lwq
 * @version [版本号, 2018年6月1日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
public class FirstCalculate
{
    public static void main(String[] args) {
        //写一个计算器程序，输入两个数和运算符号，输出结果
        // 用Scanner获取输入
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
        
        switch (operator) {
            case "+":
                result = String.valueOf(Double.parseDouble(inputNumLeft)+Double.parseDouble(inputNumright));
                break;
            case "-":
                result = String.valueOf(Double.parseDouble(inputNumLeft)-Double.parseDouble(inputNumright));
                break;
            case "*":
                result = String.valueOf(Double.parseDouble(inputNumLeft)*Double.parseDouble(inputNumright));
                break;
            case "/":
                if(Double.parseDouble(inputNumright)==0){
                    result="输入错误!";
                    break;
                }else{
                    result = String.valueOf(Double.parseDouble(inputNumLeft)+Double.parseDouble(inputNumright));
                    break; 
                }
            default:
                result="占不支持!!";
                break;
        }
        
        System.err.println("结果是："+result);
    }
}
