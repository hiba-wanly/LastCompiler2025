package Gremmers.Flutter.TextButton;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;

import java.util.ArrayList;

public class textButton extends AST {

    public String TEXTBUTTON;
    public String CHILD ;
    ArrayList<FlutterWidget> flutterWidget;
    public String ONPRESSED;

    public String getTEXTBUTTON() {
        return TEXTBUTTON;
    }

    public String getCHILD() {
        return CHILD;
    }

    public ArrayList<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public String getONPRESSED() {
        return ONPRESSED;
    }

    public void setTEXTBUTTON(String TEXTBUTTON) {
        this.TEXTBUTTON = TEXTBUTTON;
    }

    public void setCHILD(String CHILD) {
        this.CHILD = CHILD;
    }

    public void setFlutterWidget(ArrayList<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    public void setONPRESSED(String ONPRESSED) {
        this.ONPRESSED = ONPRESSED;
    }

    @Override
    public String toString() {
        return "textButton{" +
                "TEXTBUTTON='" + TEXTBUTTON + '\'' +
                ", CHILD='" + CHILD + '\'' +
                ", flutterWidget=" + flutterWidget +
                ", ONPRESSED='" + ONPRESSED + '\'' +
                '}';
    }
}
