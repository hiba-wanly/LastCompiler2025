package Gremmers.functions;

import Gremmers.AST;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;

public class ReturnType extends AST {
    private String returnn;
    private String idd;
    private ArrayList<Rule> rules;

    public String getReturnn() {
        return returnn;
    }

    public void setReturnn(String returnn) {
        this.returnn = returnn;
    }

    public String getIdd() {
        return idd;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    public ArrayList<Rule> getRules() {
        return rules;
    }

    public void setRules(Rule rules) {
        this.rules.add(rules);
    }

    @Override
    public String toString() {
        return "ReturnType{" +
                "returnn='" + returnn + '\'' +
                ", idd='" + idd + '\'' +
                ", rules=" + rules +
                '}';
    }
}
