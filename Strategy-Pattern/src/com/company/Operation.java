package com.company;

public class Operation {
    IOperation operation;

    public Operation(IOperation operation) {
        this.operation = operation;
    }
    public int  DoOperation(int a, int b) {
        return this.operation.DoOperation(a, b);
    }
}
