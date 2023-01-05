package Gremmers.functions;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.Input;

import java.util.ArrayList;

public class VoidWithoutArg extends AST {

    private String viodd;
    private NameN namee;
    private ArrayList<Input> inp;

    public String getViodd() {
        return viodd;
    }

    public void setViodd(String viodd) {
        this.viodd = viodd;
    }

    public NameN getNamee() {
        return namee;
    }

    public void setNamee(NameN namee) {
        this.namee = namee;
    }

    public ArrayList<Input> getInp() {
        return inp;
    }

    public void setInp(Input inp) {
        this.inp.add(inp);
    }

    @Override
    public String toString() {
        return "VoidWithoutArg{" +
                "viodd='" + viodd + '\'' +
                ", namee=" + namee +
                ", inp=" + inp +
                '}';
    }
}
