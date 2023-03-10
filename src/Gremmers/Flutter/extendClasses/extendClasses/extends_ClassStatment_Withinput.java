package Gremmers.Flutter.extendClasses.extendClasses;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.InputClasses;

import java.util.ArrayList;

public class extends_ClassStatment_Withinput extends AST {

    private String CLASS ;
    private NameN ID ;
    private String ID_ID;
    private ArrayList<InputClasses> inputclasses;

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public NameN getID() {
        return ID;
    }

    public void setID(NameN ID) {
        this.ID = ID;
    }

    public String getID_ID() {
        return ID_ID;
    }

    public void setID_ID(String ID_ID) {
        this.ID_ID = ID_ID;
    }

    public ArrayList<InputClasses> getInputclasses() {
        return inputclasses;
    }

    public void setInputclasses(ArrayList<InputClasses> inputclasses) {
        this.inputclasses = inputclasses;
    }

    @Override
    public String toString() {
        return "extends_ClassStatment_Withinput{" +
                "CLASS='" + CLASS + '\'' +
                ", ID='" + ID + '\'' +
                ", ID_ID='" + ID_ID + '\'' +
                ", inputclasses=" + inputclasses +
                '}';
    }
}
