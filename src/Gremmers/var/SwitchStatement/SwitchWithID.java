package Gremmers.var.SwitchStatement;

import Gremmers.AST;
import Gremmers.var.SwitchStatement.Case.CaseStatement;

import java.util.ArrayList;

public class SwitchWithID extends AST {
    private String switchh;
    private String id;
    private ArrayList<CaseStatement> casestat;
    private DefaultStatement def;

    public String getSwitchh() {
        return switchh;
    }

    public void setSwitchh(String switchh) {
        this.switchh = switchh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<CaseStatement> getCasestat() {
        return casestat;
    }

    public void setCasestat(CaseStatement casestat) {
        this.casestat.add(casestat);
    }

    public DefaultStatement getDef() {
        return def;
    }

    public void setDef(DefaultStatement def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return "SwitchWithID{" +
                "switchh='" + switchh + '\'' +
                ", id='" + id + '\'' +
                ", casestat=" + casestat +
                ", def=" + def +
                '}';
    }
}
