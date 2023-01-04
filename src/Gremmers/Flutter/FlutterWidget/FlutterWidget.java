package Gremmers.Flutter.FlutterWidget;

import Gremmers.AST;
import Gremmers.Flutter.Column.Column;
import Gremmers.Flutter.Container.Container;
import Gremmers.Flutter.Image.imageClasses;
import Gremmers.Flutter.Padding.paddingClasses;
import Gremmers.Flutter.Row.Row;
import Gremmers.Flutter.SizedBox.SizedBoxClasses;
import Gremmers.Flutter.TextButton.textButton;
import Gremmers.Flutter.TextStatement.TextClasses;
import Gremmers.var.InputClasses;

import java.util.ArrayList;

public class FlutterWidget extends AST {

    private Container attr_Container;
    private Column attr_Column;
    private Row attr_Row;
    private ArrayList<TextClasses>  attr_TextClasses;
    private ArrayList<SizedBoxClasses> attr_SizedBoxClasses;
    private textButton attr_textButton;
    private ArrayList<imageClasses> attr_imageClasses;
    private ArrayList<paddingClasses> attr_paddingClasses;

    public void setContainer(Container attr_Container){
        this.attr_Container=attr_Container;
    }
    public Container getContainer(){
        return  attr_Container;
    }

    public void setColumn(Column attr_Column){
        this.attr_Column=attr_Column;
    }
    public Column getColumn(){
        return attr_Column;
    }
    public void setRow(Row attr_Row ){
        this.attr_Row =attr_Row;
    }

    public Row getRow(){
        return attr_Row;
    }

    public void setTextClasses( TextClasses attr_TextClasses){
        this.attr_TextClasses.add(attr_TextClasses);
    }

    public ArrayList<TextClasses> getTextClasses(){
        return attr_TextClasses;
    }

    public void setSizedBoxClasses ( SizedBoxClasses attr_SizedBoxClasses ){
        this.attr_SizedBoxClasses.add(attr_SizedBoxClasses);

    }

    public ArrayList<SizedBoxClasses> getSizedBoxClasses (){
        return attr_SizedBoxClasses;
    }

    public void settextButton( textButton attr_textButton ){
        this.attr_textButton=attr_textButton;
    }

    public textButton gettextButton(){
        return attr_textButton;
    }

    public void setimageClasses( imageClasses attr_imageClasses ){
        this.attr_imageClasses.add(attr_imageClasses);
    }

    public ArrayList<imageClasses> getimageClasses (){
        return attr_imageClasses;
    }

    public void setpaddingClasses( paddingClasses attr_paddingClasses ){
        this.attr_paddingClasses.add(attr_paddingClasses);
    }

    public ArrayList<paddingClasses> getpaddingClasses(){
        return attr_paddingClasses;
    }


    @Override
    public String toString() {
        return "FlutterWidget{" +
                "attr_Container=" + attr_Container +
                ", attr_Column=" + attr_Column +
                ", attr_Row=" + attr_Row +
                ", attr_TextClasses=" + attr_TextClasses +
                ", attr_SizedBoxClasses=" + attr_SizedBoxClasses +
                ", attr_textButton=" + attr_textButton +
                ", attr_imageClasses=" + attr_imageClasses +
                ", attr_paddingClasses=" + attr_paddingClasses +
                '}';
    }
}
