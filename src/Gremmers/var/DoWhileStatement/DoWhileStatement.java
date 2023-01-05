package Gremmers.var.DoWhileStatement;

import Gremmers.AST;
import Gremmers.var.Input;
import Gremmers.var.WhileStatement.WhileStatement;

import java.util.ArrayList;

public class DoWhileStatement extends AST {
    private String doo;
    private ArrayList<Input> inn;
    private WhileStatement whileStatement;

    public String getDoo() {
        return doo;
    }

    public void setDoo(String doo) {
        this.doo = doo;
    }

    public ArrayList<Input> getInn() {
        return inn;
    }

    public void setInn(Input inn) {
        this.inn.add(inn);
    }

    public WhileStatement getWhileStatement() {
        return whileStatement;
    }

    public void setWhileStatement(WhileStatement whileStatement) {
        this.whileStatement = whileStatement;
    }

    @Override
    public String toString() {
        return "DoWhileStatement{" +
                "doo='" + doo + '\'' +
                ", inn=" + inn +
                ", whileStatement=" + whileStatement +
                '}';
    }
}
