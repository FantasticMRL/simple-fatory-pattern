package com.mrl.simplefactorypattern.version3;

public class SimpleOperationFactory
{
    public Operation getOperationInstance(String operator){
       
        Operation operation = null;
        
        switch (operator) {
            case "+":
                operation = new OperationAdd();
                break;
            case "/":
                operation = new OperationDivide();
            default:
                throw new RuntimeException("不支持!");
        }
        
        return operation;
    }
}
