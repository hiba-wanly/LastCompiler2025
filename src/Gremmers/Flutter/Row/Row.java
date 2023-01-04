package Gremmers.Flutter.Row;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;

import java.util.ArrayList;

public class Row extends AST {

    private String ROW;
    private String CHILDREN;
    private ArrayList<FlutterWidget> flutterWidget;

    public String getROW() {
        return ROW;
    }

    public void setROW(String ROW) {
        this.ROW = ROW;
    }

    public String getCHILDREN() {
        return CHILDREN;
    }

    public void setCHILDREN(String CHILDREN) {
        this.CHILDREN = CHILDREN;
    }

    public ArrayList<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public void setFlutterWidget(ArrayList<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    @Override
    public String toString() {
        return "Row{" +
                "ROW='" + ROW + '\'' +
                ", CHILDREN='" + CHILDREN + '\'' +
                ", flutterWidget=" + flutterWidget +
                '}';
    }
}
