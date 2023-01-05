package Gremmers.functions;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.Input;

import java.util.ArrayList;

public class FunWithArg extends AST {
    private String type ;
    private NameN name ;
    private ArrayList<ArgumentFunctionType> argumentFunctionTypes;
    private ArrayList<Input> inputs;
    private ReturnStatement returnStatement;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NameN getName() {
        return name;
    }

    public void setName(NameN name) {
        this.name = name;
    }

    public ArrayList<ArgumentFunctionType> getArgumentFunctionTypes() {
        return argumentFunctionTypes;
    }

    public void setArgumentFunctionTypes(ArgumentFunctionType argumentFunctionTypes) {
        this.argumentFunctionTypes.add(argumentFunctionTypes);
    }

    public ArrayList<Input> getInputs() {
        return inputs;
    }

    public void setInputs(Input inputs) {
        this.inputs.add(inputs);
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        return "FunWithArg{" +
                "type='" + type + '\'' +
                ", name=" + name +
                ", argumentFunctionTypes=" + argumentFunctionTypes +
                ", inputs=" + inputs +
                ", returnStatement=" + returnStatement +
                '}';
    }
}
