package Gremmers.var.SwitchStatement;

import Gremmers.AST;
import Gremmers.var.Input;

public class DefaultStatement extends AST {
    private String def;
    private Input inp;
    private String breakk;

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public Input getInp() {
        return inp;
    }

    public void setInp(Input inp) {
        this.inp = inp;
    }

    public String getBreakk() {
        return breakk;
    }

    public void setBreakk(String breakk) {
        this.breakk = breakk;
    }

    @Override
    public String toString() {
        return "DefaultStatement{" +
                "def='" + def + '\'' +
                ", inp=" + inp +
                ", breakk='" + breakk + '\'' +
                '}';
    }
}
