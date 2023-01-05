package Gremmers.var.SwitchStatement;

import Gremmers.AST;
import Gremmers.var.SwitchStatement.Case.CaseStatement;

import java.util.ArrayList;

public class SwitchWithNUM extends AST {
    private String switchh;
    private String numm;
    private ArrayList<CaseStatement> casestat;
    private DefaultStatement def;

    public String getSwitchh() {
        return switchh;
    }

    public void setSwitchh(String switchh) {
        this.switchh = switchh;
    }

    public String getNumm() {
        return numm;
    }

    public void setNumm(String numm) {
        this.numm = numm;
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
        return "SwitchWithNUM{" +
                "switchh='" + switchh + '\'' +
                ", numm='" + numm + '\'' +
                ", casestat=" + casestat +
                ", def=" + def +
                '}';
    }
}
