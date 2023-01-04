package Gremmers.Flutter.extendClasses.extendClasses;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.NameN;
import Gremmers.var.InputClasses;

import java.util.ArrayList;

public class extends_ClassStateFull_AND_Less_withinput extends AST {


    private String CLASS ;
    private NameN ID ;
    private String STATEFULLWIDGET;
    private String STATELESSWIDGET ;
    private String OVERRIDE;
    private String BUILD_WIDGET;
    private String RETURN;
    private String SCAFFOLD;
    private String BODY;
    private ArrayList<FlutterWidget> flutterWidget;
    private ArrayList<InputClasses> inputClasses;

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

    public String getSTATEFULLWIDGET() {
        return STATEFULLWIDGET;
    }

    public void setSTATEFULLWIDGET(String STATEFULLWIDGET) {
        this.STATEFULLWIDGET = STATEFULLWIDGET;
    }

    public String getSTATELESSWIDGET() {
        return STATELESSWIDGET;
    }

    public void setSTATELESSWIDGET(String STATELESSWIDGET) {
        this.STATELESSWIDGET = STATELESSWIDGET;
    }

    public String getOVERRIDE() {
        return OVERRIDE;
    }

    public void setOVERRIDE(String OVERRIDE) {
        this.OVERRIDE = OVERRIDE;
    }

    public String getBUILD_WIDGET() {
        return BUILD_WIDGET;
    }

    public void setBUILD_WIDGET(String BUILD_WIDGET) {
        this.BUILD_WIDGET = BUILD_WIDGET;
    }

    public String getRETURN() {
        return RETURN;
    }

    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    public String getSCAFFOLD() {
        return SCAFFOLD;
    }

    public void setSCAFFOLD(String SCAFFOLD) {
        this.SCAFFOLD = SCAFFOLD;
    }

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public ArrayList<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public void setFlutterWidget(ArrayList<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    public ArrayList<InputClasses> getInputClasses() {
        return inputClasses;
    }

    public void setInputClasses(ArrayList<InputClasses> inputClasses) {
        this.inputClasses = inputClasses;
    }

    @Override
    public String toString() {
        return "extends_ClassStateFull_AND_Less_withinput{" +
                "CLASS='" + CLASS + '\'' +
                ", ID='" + ID + '\'' +
                ", STATEFULLWIDGET='" + STATEFULLWIDGET + '\'' +
                ", STATELESSWIDGET='" + STATELESSWIDGET + '\'' +
                ", OVERRIDE='" + OVERRIDE + '\'' +
                ", BUILD_WIDGET='" + BUILD_WIDGET + '\'' +
                ", RETURN='" + RETURN + '\'' +
                ", SCAFFOLD='" + SCAFFOLD + '\'' +
                ", BODY='" + BODY + '\'' +
                ", flutterWidget=" + flutterWidget +
                ", inputClasses=" + inputClasses +
                '}';
    }
}
