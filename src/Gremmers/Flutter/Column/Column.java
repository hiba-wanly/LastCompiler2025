package Gremmers.Flutter.Column;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.var.InputClasses;

import java.util.ArrayList;

public class Column extends AST {

    private String COLUMN;
    private String CHILDREN;
    private ArrayList<FlutterWidget> flutterWidget;


    public void setCOLUMN( String COLUMN ){
        this.COLUMN=COLUMN;
    }

    public String getCOLUMN (){
        return COLUMN;
    }

    public void setCHILDREN( String CHILDREN ){
        this.CHILDREN=CHILDREN;
    }

    public String getCHILDREN(){
        return CHILDREN;
    }

    public void setFlutterWidget( FlutterWidget flutterWidget ){
        this.flutterWidget.add(flutterWidget);

    }

    public ArrayList<FlutterWidget> getFlutterWidget(){
        return flutterWidget;
    }

    @Override
    public String toString() {
        return "Column{" +
                "COLUMN='" + COLUMN + '\'' +
                ", CHILDREN='" + CHILDREN + '\'' +
                ", flutterWidget=" + flutterWidget +
                '}';
    }
}
