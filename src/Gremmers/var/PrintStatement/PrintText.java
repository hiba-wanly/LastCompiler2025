package Gremmers.var.PrintStatement;

import Gremmers.AST;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;

public class PrintText extends AST {
    private String prin;
    private ArrayList<Rule> rules;

    public void setPrin(String prin){
        this.prin = prin;
    }
    public void setRules(Rule world){
        this.rules.add(world);
    }

    public String  getPrin(){
        return prin;
    }
    public ArrayList<Rule> getRules(){
        return rules;
    }
}
