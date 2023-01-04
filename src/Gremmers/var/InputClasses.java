package Gremmers.var;

import Gremmers.AST;
import Gremmers.functions.Functions;
import Gremmers.var.DoWhileStatement.DoWhileStatement;
import Gremmers.var.IfStatement.IfStatment;
import Gremmers.var.Initial.Initial;
import Gremmers.var.Loop.Loop;
import Gremmers.var.PrintStatement.PrintStatement;
import Gremmers.var.SwitchStatement.SwitchStatement;
import Gremmers.var.TryCatchStatement.TryCatchStatement;
import Gremmers.var.WhileStatement.WhileStatement;

public class InputClasses extends AST {

    private Initial initial;
    private IfStatment ifStatment;
    private Loop loop;
    private DoWhileStatement doWhileStatement;
    private WhileStatement whileStatement;
    private PrintStatement printStatement;
    private SwitchStatement switchStatement;
    private TryCatchStatement tryCatchStatement;

    private Functions fun;

    public void setInitial(Initial initial){
        System.out.println("addiniti");
        this.initial = initial;
    }
    public Initial getInitial(){
        return initial;
    }
    public void setIfStatment(IfStatment ifStatment){
        this.ifStatment = ifStatment;
    }
    public IfStatment getIfStatment(){
        return ifStatment;
    }
    public void setLoop(Loop loop){
        this.loop = loop;
    }
    public Loop getLoop(){
        return loop;
    }
    public void setDoWhileStatement(DoWhileStatement doWhileStatement){
        this.doWhileStatement = doWhileStatement;
    }
    public DoWhileStatement getDoWhileStatement(){
        return doWhileStatement;
    }
    public void setWhileStatement(WhileStatement whileStatement){
        this.whileStatement = whileStatement;
    }
    public WhileStatement getWhileStatement(){
        return whileStatement;
    }
    public void setPrintStatement(PrintStatement printStatement){
        this.printStatement = printStatement;
    }
    public PrintStatement getPrintStatement(){
        return printStatement;
    }
    public void setSwitchStatement(SwitchStatement switchStatement){
        this.switchStatement = switchStatement;
    }
    public SwitchStatement getSwitchStatement(){
        return switchStatement;
    }
    public void setTryCatchStatement(TryCatchStatement tryCatchStatement){
        this.tryCatchStatement = tryCatchStatement;
    }
    public TryCatchStatement getTryCatchStatement(){
        return tryCatchStatement;
    }


    public void setFun(Functions fun){
        this.fun = fun;
    }
    public Functions getFun(){
        return fun;
    }

    @Override
    public String toString() {
        if (this.initial != null)
            return "\n Body Classes {"+ initial+"\n";
        else  if (this.ifStatment != null)
            return "\n Body Classes {"+ ifStatment+"\n";
        else if (this.loop != null)
            return "\n Body Classes {"+ loop+"\n";
        else if (this.doWhileStatement != null)
            return "\n Body Classes {"+ doWhileStatement+"\n";
        else if (this.whileStatement != null)
            return "\n Body Classes {"+ whileStatement+"\n";
        else if (this.printStatement != null)
            return "\n Body Classes {"+ printStatement+"\n";
        else if (this.switchStatement != null)
            return "\n Body Classes {"+ switchStatement+"\n";
        else if (this.tryCatchStatement != null)
            return "\n Body Classes {"+ tryCatchStatement+"\n";
//        else if (this.abstractStatment != null)
            return "\n Body Classes {"+ fun+"\n";
//        return "InputClasses{" +
//                "initial=" + initial +
//                ", ifStatment=" + ifStatment +
//                ", loop=" + loop +
//                ", doWhileStatement=" + doWhileStatement +
//                ", whileStatement=" + whileStatement +
//                ", printStatement=" + printStatement +
//                ", switchStatement=" + switchStatement +
//                ", tryCatchStatement=" + tryCatchStatement +
//                ", fun=" + fun +
//                '}';
    }
}
