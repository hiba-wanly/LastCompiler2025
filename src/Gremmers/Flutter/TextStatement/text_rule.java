package Gremmers.Flutter.TextStatement;

import Gremmers.AST;

import java.util.ArrayList;

public class text_rule extends AST {

    private String TEXT;
    private ArrayList<rules> rules;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public ArrayList<rules> getRules() {
        return rules;
    }

    public void setRules(ArrayList<rules> rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "text_rule{" +
                "TEXT='" + TEXT + '\'' +
                ", rules=" + rules +
                '}';
    }
}
