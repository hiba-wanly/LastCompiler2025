package Gremmers.Flutter.SizedBox;

import Gremmers.AST;

public class SizedBoxClasses extends AST {

    public hight_AND_widthSizedBox attr_hight_AND_widthSizedBox;
    public widthHight_SizedBox attr_widthHight_SizedBox;

    public hight_AND_widthSizedBox gethight_AND_widthSizedBox() {
        return attr_hight_AND_widthSizedBox;
    }

    public void sethight_AND_widthSizedBox(hight_AND_widthSizedBox attr_hight_AND_widthSizedBox) {
        this.attr_hight_AND_widthSizedBox = attr_hight_AND_widthSizedBox;
    }

    public widthHight_SizedBox getwidthHight_SizedBox() {
        return attr_widthHight_SizedBox;
    }

    public void setwidthHight_SizedBox(widthHight_SizedBox attr_widthHight_SizedBox) {
        this.attr_widthHight_SizedBox = attr_widthHight_SizedBox;
    }

    @Override
    public String toString() {
        return "SizedBoxClasses{" +
                "attr_hight_AND_widthSizedBox=" + attr_hight_AND_widthSizedBox +
                ", attr_widthHight_SizedBox=" + attr_widthHight_SizedBox +
                '}';
    }
}
