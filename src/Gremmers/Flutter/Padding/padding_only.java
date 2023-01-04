package Gremmers.Flutter.Padding;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.Flutter.Padding.direction.direction;

import java.util.ArrayList;

public class padding_only extends AST {

    private String PADDING;
    private String PAD_ON;

    private ArrayList<direction> attr_direction;
    private String CHILD ;
    private ArrayList<FlutterWidget> flutterWidget;

    public ArrayList<direction> getdirection() {
        return attr_direction;
    }

    public void setdirection(ArrayList<direction> attr_direction) {
        this.attr_direction = attr_direction;
    }

    public void setPADDING(String PADDING){
        this.PADDING=PADDING;
    }

    public String getPADDING(){
        return PADDING;
    }

    public void setPAD_ALL(String PAD_ON){
        this.PAD_ON=PAD_ON;
    }
    public String getPAD_ALL(){
        return PAD_ON;
    }

    public void setCHILD( String CHILD){
        this.CHILD=CHILD;
    }
    public String getCHILD(){
        return CHILD;
    }

    public void setFlutterWidget( FlutterWidget flutterWidget){
        this.flutterWidget.add(flutterWidget);
    }
    public ArrayList<FlutterWidget> getFlutterWidget(){
        return flutterWidget;
    }

    @Override
    public String toString() {
        return "padding_only{" +
                "PADDING='" + PADDING + '\'' +
                ", PAD_ON='" + PAD_ON + '\'' +
                ", attr_direction=" + attr_direction +
                ", CHILD='" + CHILD + '\'' +
                ", flutterWidget=" + flutterWidget +
                '}';
    }
}
