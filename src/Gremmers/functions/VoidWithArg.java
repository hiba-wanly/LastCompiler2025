package Gremmers.functions;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.Input;

import java.util.ArrayList;

public class VoidWithArg extends AST {
    private String voidd;
    private NameN namee;
    private ArrayList<ArgumentFunctionType> argumentFunctionTypes;
    private ArrayList<Input> inputs;

    public String getVoidd() {
        return voidd;
    }

    public void setVoidd(String voidd) {
        this.voidd = voidd;
    }

    public NameN getNamee() {
        return namee;
    }

    public void setNamee(NameN namee) {
        this.namee = namee;
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

    @Override
    public String toString() {
        return "VoidWithArg{" +
                "voidd='" + voidd + '\'' +
                ", namee=" + namee +
                ", argumentFunctionTypes=" + argumentFunctionTypes +
                ", inputs=" + inputs +
                '}';
    }
}
