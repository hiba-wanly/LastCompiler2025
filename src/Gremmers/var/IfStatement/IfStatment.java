package Gremmers.var.IfStatement;

import Gremmers.AST;

import java.util.ArrayList;

public class IfStatment extends AST {
    private IFInput ifin;
    private ArrayList<ElseIfInput> elseifin;
    private ElseInput elsein;

    public IFInput getIfin() {
        return ifin;
    }

    public void setIfin(IFInput ifin) {
        this.ifin = ifin;
    }

    public ArrayList<ElseIfInput> getElseifin() {
        return elseifin;
    }

    public void setElseifin(ElseIfInput elseifin) {
        this.elseifin.add(elseifin);
    }

    public ElseInput getElsein() {
        return elsein;
    }

    public void setElsein(ElseInput elsein) {
        this.elsein = elsein;
    }

    @Override
    public String toString() {
        return "IfStatment{" +
                "ifin=" + ifin +
                ", elseifin=" + elseifin +
                ", elsein=" + elsein +
                '}';
    }
}
