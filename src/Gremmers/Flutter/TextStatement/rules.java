package Gremmers.Flutter.TextStatement;

import Gremmers.AST;
import Gremmers.NameN;

public class rules extends AST {

    private NameN ID;
    private String NUM;

    public NameN getID() {
        return ID;
    }

    public void setID(NameN ID) {
        this.ID = ID;
    }

    public String getNUM() {
        return NUM;
    }

    public void setNUM(String NUM) {
        this.NUM = NUM;
    }

    @Override
    public String toString() {
        return "rules{" +
                "ID='" + ID + '\'' +
                ", NUM='" + NUM + '\'' +
                '}';
    }
}
