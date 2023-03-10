package Gremmers.var.IfStatement;

import Gremmers.AST;
import Gremmers.var.Input;

import java.util.ArrayList;

public class IFIF extends AST {
    private ArrayList<Input> inp;
    private String brek;
    private String cont;

    public ArrayList<Input> getInp() {
        return inp;
    }

    public void setInp(Input inp) {
        this.inp.add(inp);
    }

    public String getBrek() {
        return brek;
    }

    public void setBrek(String brek) {
        this.brek = brek;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }


    @Override
    public String toString() {
        return "IFIF{" +
                "inp=" + inp +
                ", brek='" + brek + '\'' +
                ", cont='" + cont + '\'' +
                '}';
    }
}
