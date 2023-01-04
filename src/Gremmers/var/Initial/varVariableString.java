package Gremmers.var.Initial;

import Gremmers.AST;
import Gremmers.NameN;

import java.util.ArrayList;

public class varVariableString extends AST {

    private  String type;

    private  NameN id ;

    private ArrayList<Rule> rule;

    public void setVarVaiableType(String type){
        this.type = type;
    }

    public void setVarVaiableId(NameN id){
        this.id = id;
    }


    public void setVarVaiableRule(Rule rule){
        this.rule.add(rule);
    }

    public String getVarVaiabletype(){
        return type;
    }
    public NameN getVarVaiableid(){
        return id;
    }


    public ArrayList<Rule> getVarVaiablerule(){
        return rule;
    }

    @Override
    public String toString() {
        return "varVariableString{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", rule=" + rule +
                '}';
    }
}
