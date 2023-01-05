package Gremmers.var.IfStatement;

import Gremmers.AST;
import Gremmers.var.Expression.Conditions;

import java.util.ArrayList;

public class IFInput extends AST {
    private String ifif;
    private ArrayList<Conditions> cond ;
    private IFIF ifatr ;

    public String getIfif() {
        return ifif;
    }

    public void setIfif(String ifif) {
        this.ifif = ifif;
    }

    public ArrayList<Conditions> getCond() {
        return cond;
    }

    public void setCond(Conditions cond) {
        this.cond = cond;
    }

    public IFIF getIfatr() {
        return ifatr;
    }

    public void setIfatr(IFIF ifatr) {
        this.ifatr = ifatr;
    }

    @Override
    public String toString() {
        return "IFInput{" +
                "ifif='" + ifif + '\'' +
                ", cond=" + cond +
                ", ifatr=" + ifatr +
                '}';
    }
}
