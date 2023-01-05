package Gremmers.functions;

import Gremmers.AST;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;

public class ReturnStatement extends AST {
    private ReturnType returnType;

    public ReturnType getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "returnType=" + returnType +
                '}';
    }
}
