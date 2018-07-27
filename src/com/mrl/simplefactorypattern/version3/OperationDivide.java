package com.mrl.simplefactorypattern.version3;

public class OperationDivide extends Operation
{

    @Override
    double getRes(double leftNum, double rightNum) {
        return leftNum/rightNum;
    }
    
}
