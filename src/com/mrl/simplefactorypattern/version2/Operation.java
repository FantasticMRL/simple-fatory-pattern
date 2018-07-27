package com.mrl.simplefactorypattern.version2;

/**
 *  计算类
 *  [功能详细描述]
 * @作者 lwq
 * @version [版本号, 2018年6月1日]
 * @see [相关类/方法]
 * @since [产品/模块版本] 
 */
public class Operation
{
    public double calculator(double inputNumLeft,double inputNumright,String operator){
        double res = 0;
        switch (operator) {
            case "+":
                res = inputNumLeft+inputNumright;
                break;
            case "-":
                res = inputNumLeft-inputNumright;
                break;
            case "*":
                res = inputNumLeft*inputNumright;
                break;
            case "/":
                if(inputNumright==0){
                    throw new RuntimeException("输入错误!");
                }else{
                    res = inputNumLeft/inputNumright;
                    break; 
                }
            default:
                throw new RuntimeException("不支持!");
        }
        return res;
    }
}
