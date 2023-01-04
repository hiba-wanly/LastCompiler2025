package Gremmers.Flutter.extendClasses.extendClasses;

import Gremmers.AST;
import Gremmers.NameN;

public class extends_ClassStatment_Withoutinput extends AST {


    private String CLASS ;
    private NameN ID ;
    private NameN ID_ID;

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

    public NameN getID_ID() {
        return ID_ID;
    }

    public void setID_ID(NameN ID_ID) {
        this.ID_ID = ID_ID;
    }

    @Override
    public String toString() {
        return "extends_ClassStatment_Withoutinput{" +
                "CLASS='" + CLASS + '\'' +
                ", ID='" + ID + '\'' +
                ", ID_ID='" + ID_ID + '\'' +
                '}';
    }
}
