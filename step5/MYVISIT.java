import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
//ghidaa falah aldahamsheh 0199959//
class IR_node{
    private String op;
    private String operand1;
    private String operand2;
    private String result;
    LABEL lable;
    public IR_node(){}
    public IR_node(String op, String result) {// lable + Read (float/int) + Write(float/int/string)  + RETURN
        this.op = op;
        this.result = result;
    }
    public IR_node(String op,String operand1, String result) {// Store (float/int)
        this.op = op;
        this.operand1 = operand1;
        this.result = result;
    }
    public IR_node(String op,String operand1 ,String operand2, String result) {//add + mul + div + sub
        this.op = op;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
    }
    public IR_node(String op,String operand1 ,String operand2, LABEL lable) {
        this.op = op;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.lable = lable;
    }
    public IR_node(String op, LABEL lable) {// jump
        this.op = op;
        this.lable = lable;
    }

    public String getop() {
        return op;
    }
    public String getoperand1() {
        return operand1;
    }
    public String getoperand2() {
        return operand2;
    }
    public String getresult() {
        return result;
    }
    public LABEL getLable(){return lable;}

    public void setop(String op) {
        this.op=op;
    }
    public void setoperand1(String operand1) {
        this.operand1=operand1;
    }
    public void setoperand2(String operand2) {
        this.operand2=operand2;
    }
    public void setresult(String result) {
        this.result=result;
    }
    public void setLable(LABEL lable){this.lable=lable;}
}
class LABEL {
    private String lable;
    public LABEL(String lable, int num) {
        this.lable = lable+num;
    }
    public String temp() {
        return lable;
    }
}


class IRStack {
    private LinkedList<IR_node> irStack;
    public LinkedList<IR_node> getIrStack()
    {
        return irStack;
    }
    public IRStack() {
        this.irStack = new LinkedList<>();
    }

    public void push(IR_node irNode) {
        irStack.push(irNode);
    }

    public void printIR() {
        while (!irStack.isEmpty()) {
            IR_node irNode = irStack.pop();

            if (irNode.getLable() != null) {
                System.out.println(irNode.getLable().temp());
            }

            String op = irNode.getop();
            if ("STOREI".equals(op) || "STOREF".equals(op))
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getresult());
            }

            else if ("READI".equals(op) || "READF".equals(op) || "RETURN".equals(op) ) {
                System.out.println(op + "  " + irNode.getresult());
            }

            else if ("WRITEI".equals(op) || "WRITEF".equals(op) || "WRITES".equals(op) )
            {
                System.out.println(op + "  " + irNode.getresult());
            }


            else if ("LABEL".equals(op)|| "JUMP".equals(op)) {
                System.out.println(op + "  " + irNode.getresult());
            }

            else if ("ADDI".equals(op) || "ADDF".equals(op) || "SUBI".equals(op) || "SUBF".equals(op) ||"MULTI".equals(op) || "MULTF".equals(op) || "DIVI".equals(op) || "DIVF".equals(op))
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getoperand2() + "  " + irNode.getresult());
            }
            else if ("GT".equals(op) || "GE".equals(op) || "LT".equals(op) || "LE".equals(op) ||"NE".equals(op) || "EQ".equals(op) )
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getoperand2() + "  " + irNode.getresult());
            }




        }
    }
    public void printIR2() {
        List<IR_node> irNodes = new ArrayList<>(irStack);

        for (int i = irNodes.size() - 1; i >= 0; i--) {
            IR_node irNode = irNodes.get(i);

            if (irNode.getLable() != null) {
                System.out.println(irNode.getLable().temp());
            }

            String op = irNode.getop();
            if ("STOREI".equals(op) || "STOREF".equals(op))
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getresult());
            } else if ("var".equals(op)) {
                System.out.println(op +" "+ irNode.getoperand1() );

            } else if ("str".equals(op)) {
                System.out.println(op +" "+ irNode.getoperand1() +" "+irNode.getoperand2());
            } else if ("READI".equals(op) || "READF".equals(op) || "RETURN".equals(op) ) {
                System.out.println(op + "  " + irNode.getresult());
            }

            else if ("WRITEI".equals(op) || "WRITEF".equals(op) || "WRITES".equals(op) )
            {
                System.out.println(op + "  " + irNode.getresult());
            }


            else if ("LABEL".equals(op)|| "JUMP".equals(op)) {
                System.out.println(op + "  " + irNode.getresult());
            }

            else if ("ADDI".equals(op) || "ADDF".equals(op) || "SUBI".equals(op) || "SUBF".equals(op) ||"MULTI".equals(op) || "MULTF".equals(op) || "DIVI".equals(op) || "DIVF".equals(op))
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getoperand2() + "  " + irNode.getresult());
            }
            else if ("GT".equals(op) || "GE".equals(op) || "LT".equals(op) || "LE".equals(op) ||"NE".equals(op) || "EQ".equals(op) )
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getoperand2() + "  " + irNode.getresult());
            }
        }
    }
    public void pushAtPosition(int index, IR_node irNode) {
        irStack.add(index, irNode);
    }
    public IR_node popLastPushed() {
        if (!irStack.isEmpty()) {
            return irStack.pop();
        } else {
            return null;
        }
    }
    public int getCurrentIndex(IR_node irNode) {
        int index = 0;
        for (IR_node node : irStack) {
            if (node == irNode) {
                return index;
            }
            index++;
        }
        return -1;
    }
}




public class MYVISIT extends MicroBaseVisitor<String> {

    SymbolTable symbolTables;
    int fors=0;
    int T=0;
    IR_node current=new IR_node();
    String typeglobal=null;
    public MYVISIT(SymbolTable symbolTable)
    {
        this.symbolTables=symbolTable;
    }
    IRStack irStack = new IRStack();
    private Type p;
    int Ghid=1;
    String id;
    String op=null;
    public static String checkType(String input) {
        try {
            // Try parsing as Double (float)
            Double.parseDouble(input);
            return "Float";
        } catch (NumberFormatException e1) {
            try {
                // Try parsing as Integer
                Integer.parseInt(input);
                return "Int";
            } catch (NumberFormatException e2) {
                // Neither float nor int, consider it as String
                return "String";
            }
        }
    }
    public String compar(String comp)
    {
        if(comp.equals(">"))
        {
            return "LE";
        }
        else if (comp.equals("<"))
        {
            return "GE";
        }
        else if (comp.equals(">="))
        {
            return "LT";
        }
        else if (comp.equals("<="))
        {
            return "GT";
        }
        else if (comp.equals("="))
        {
            return "NE";
        }
        else if (comp.equals("!="))
        {
            return "EQ";
        }

        return null;
    }
    public IRStack getIRStack() {
        return irStack;
    }
    @Override
    public String visitProgram(MicroParser.ProgramContext ctx) {
        String name =ctx.id().getText();
        IR_node node =new IR_node("LABEL",name);
        irStack.push(node);
        visitChildren(ctx);
        return null;
    }


    @Override public String visitReturn_stmt(MicroParser.Return_stmtContext ctx) {
        String x=visit(ctx.expr());
        IR_node node= new IR_node("RETURN",x);
        irStack.push(node);
        return null;

  }
    public static String modifyString(String input) {
        if (input.endsWith("I")) {

            return input.substring(0, input.length() - 1) + "F";
        } else {

            return input;
        }
    }
    @Override
    public String visitId_list(MicroParser.Id_listContext ctx) {
        String id = ctx.id().getText();
        String  opcode = symbolTables.getType(id);
            if(opcode.equals("INT"))
            {
                opcode=op+"I";
            }
            else if (opcode.equals("FLOAT"))
            {
                opcode=op+"F";
            }
            else if (opcode.equals("STRING"))
            {
                opcode=op+"S";
            }
            IR_node node= new IR_node(opcode,id);
            irStack.push(node);

        visit(ctx.id_tail());
        return null;
    }

    @Override
    public String visitIdtail(MicroParser.IdtailContext ctx) {
        String id = ctx.id().getText();
        String  opcode = symbolTables.getType(id);
            if(opcode.equals("INT"))
            {
                opcode=op+"I";
            }
            else if (opcode.equals("FLOAT"))
            {
                opcode=op+"F";
            }
            else if (opcode.equals("STRING"))
            {
                opcode=op+"S";
            }
        IR_node node= new IR_node(opcode,id);
        irStack.push(node);

        visit(ctx.id_tail());
        return null;
    }



    @Override
    public String visitFunc_decl(MicroParser.Func_declContext ctx) {
        IR_node node=new IR_node("lable","main");
        irStack.push(node);
        visitChildren(ctx);
        return null;
    }
    @Override public String visitRead_stmt(MicroParser.Read_stmtContext ctx) {
        op="READ";
        visit(ctx.id_list());
        return null;
    }
    @Override public String visitWrite_stmt(MicroParser.Write_stmtContext ctx) {
        op="WRITE";
        visit(ctx.id_list());
        return null;
    }


    @Override public String visitAssign_expr(MicroParser.Assign_exprContext ctx) {
        String id=ctx.id().getText();
        String  opcode = symbolTables.getType(id);
        typeglobal =opcode;
        if(opcode.equals("INT"))
        {
            opcode="STORE"+"I";
        }
        else if (opcode.equals("FLOAT"))
        {
            opcode="STORE"+"F";
        }
        String x=visit(ctx.expr());
        IR_node node= new IR_node(opcode,x,id);
        irStack.push(node);
        return null;
    }


    @Override
    public String visitExpr(MicroParser.ExprContext ctx) {
        String e_p=visit(ctx.expr_prefix());

        if (e_p==null)
        {
            String t=visit(ctx.term());
            String type=checkType(t);
            String typelocal=typeglobal;
            if (type.equals("String"))//id
            {
                String opcode = symbolTables.getType(t);
                if (opcode != null) {
                    if (opcode.equals( "FLOAT") ){
                        typelocal="F";
                        typeglobal="F";
                    }
                    else if(opcode.equals("INT"))
                    {
                        typelocal="I";
                        typeglobal="I";
                    }
                }
                else //temp variable
                {
                    IR_node xx= irStack.popLastPushed();
                    IR_node xx2=irStack.popLastPushed();
                    if (xx2.getop().endsWith("F")) {
                        typeglobal="F";
                        typelocal="F";

                    }
                    else
                    {
                        typelocal = typeglobal ;
                    }

                    irStack.push(xx2);
                    irStack.push(xx);
                }
            }
            return t;
        }
        else  {
            IR_node x = irStack.popLastPushed();
            String t=visit(ctx.term());
            String type=checkType(t);
            String typelocal=typeglobal;
            if (type.equals("String"))//id
            {
                String opcode = symbolTables.getType(t);
                if (opcode != null) {
                    if (opcode.equals( "FLOAT") ){
                        typelocal="F";
                        typeglobal="F";
                    }
                    else if(opcode.equals("INT"))
                    {
                        typelocal="I";
                        typeglobal="I";
                    }
                }
                else //temp variable
                {
                    IR_node xx= irStack.popLastPushed();
                    IR_node xx2=irStack.popLastPushed();
                    if (xx2.getop().endsWith("F")) {
                        typeglobal="F";
                        typelocal="F";

                    }
                    else
                    {
                        typelocal = typeglobal ;
                    }

                    irStack.push(xx2);
                    irStack.push(xx);
                }
            }
            x.setoperand2(t);
            if(typeglobal.equals("F") || typelocal.equals("F"))
            {
                x.setop(modifyString(x.getop()));
            }
            T=T+1;
            x.setresult("$T"+T);
            irStack.push(x);
            return "$T"+T;
        }
    }
    @Override public String visitExpr_prefixs(MicroParser.Expr_prefixsContext ctx) {
        String e_p=visit(ctx.expr_prefix());



        if (e_p==null) {
            String term=visit(ctx.term());
            String localtype=typeglobal;
            String addsub=visit(ctx.addop());
            String type=checkType(term);
            if (type.equals("String"))//id
            {
                String opcode = symbolTables.getType(term);
                if (opcode != null) {
                    if (opcode.equals( "INT")) {
                        addsub = addsub +"I";
                        typeglobal="I";
                        localtype="I";
                    } else if (opcode.equals( "FLOAT") ){
                        addsub = addsub +"F";
                        localtype="F";
                        typeglobal="F";
                    }
                }
                else
                {
                    IR_node xx= irStack.popLastPushed();
                    IR_node xx2=irStack.popLastPushed();
                    if (xx2.getop().endsWith("F")) {
                        localtype="F";
                        typeglobal="F";
                        addsub=addsub+"F";
                    }
                    else
                    {
                        addsub = addsub + typeglobal ;
                    }

                    irStack.push(xx2);
                    irStack.push(xx);
                }
            }

            else
            {
                addsub=addsub+typeglobal;
            }
            IR_node x = new IR_node();
            x.setop(addsub);
            x.setoperand1(term);
            irStack.push(x);
        }
        else  {
            IR_node x = irStack.popLastPushed();
            String term=visit(ctx.term());
            String localtype=typeglobal;
            String addsub=visit(ctx.addop());
            String type=checkType(term);
            if (type.equals("String"))//id
            {
                String opcode = symbolTables.getType(term);
                if (opcode != null) {
                    if (opcode.equals( "INT")) {
                        addsub = addsub +"I";
                        typeglobal="I";
                        localtype="I";
                    } else if (opcode.equals( "FLOAT") ){
                        addsub = addsub +"F";
                        localtype="F";
                        typeglobal="F";
                    }
                }
                else
                {
                    IR_node xx= irStack.popLastPushed();
                    IR_node xx2=irStack.popLastPushed();
                    if (xx2.getop().endsWith("F")) {
                        localtype="F";
                        typeglobal="F";
                        addsub=addsub+"F";
                    }
                    else
                    {
                        addsub = addsub + typeglobal ;
                    }

                    irStack.push(xx2);
                    irStack.push(xx);
                }
            }
            else
            {
                addsub=addsub+typeglobal;
            }
            x.setoperand2(term);
            if(localtype.equals("F") || typeglobal.equals("F"))
            {
                x.setop(modifyString(x.getop()));
            }
            T=T+1;
            x.setresult("$T"+T);
            irStack.push(x);
            IR_node x2 = new IR_node();
            x2.setoperand1("$T"+T);
            x2.setop(addsub);
            irStack.push(x2);

        }
        return "not null";
   }


    @Override public String visitTerm(MicroParser.TermContext ctx) {
        String f_p=visit(ctx.factor_prefix());
        String localtype=typeglobal;
        if (f_p==null)
        {
            String factor=visit(ctx.factor());
            String type=checkType(factor);
            if (type.equals("String"))//id
            {
                String opcode = symbolTables.getType(factor);
                if (opcode != null) {
                    if (opcode.equals( "FLOAT") ){
                        localtype="F";
                        typeglobal="F";
                    }
                    else if(opcode.equals("INT"))
                    {
                        localtype="I";
                        typeglobal="I";
                    }
                }
                else
                {
                    IR_node xx= irStack.popLastPushed();
                    IR_node xx2=irStack.popLastPushed();
                    if (xx2.getop().endsWith("F")) {
                        localtype="F";
                        typeglobal="F";
                    }
                    else
                    {
                        localtype= typeglobal ;
                    }
                    irStack.push(xx2);
                    irStack.push(xx);

                }
            }
            else
            {
                localtype= typeglobal ;
            }
            return factor;
        }
        else  {
            IR_node x = irStack.popLastPushed();
            String factor=visit(ctx.factor());
            String type=checkType(factor);
            if (type.equals("String"))//id
            {
                String opcode = symbolTables.getType(factor);
                if (opcode != null) {
                    if (opcode.equals( "FLOAT") ){
                        localtype="F";
                        typeglobal="F";
                    }
                    else if(opcode.equals("INT"))
                    {
                        localtype="I";
                        typeglobal="I";
                    }
                }
                else
                {
                    IR_node xx= irStack.popLastPushed();
                    IR_node xx2=irStack.popLastPushed();
                    if (xx2.getop().endsWith("F")) {
                        localtype="F";
                        typeglobal="F";
                    }
                    else
                    {
                        localtype= typeglobal ;
                    }
                    irStack.push(xx2);
                    irStack.push(xx);

                }
            }
            x.setoperand2(factor);
            if(typeglobal.equals("F") || localtype.equals("F"))
            {
                x.setop(modifyString(x.getop()));
            }
            T=T+1;
            x.setresult("$T"+T);
            irStack.push(x);
            return "$T"+T;
        }
    }
    @Override public String visitFactor_prefixs(MicroParser.Factor_prefixsContext ctx) {
        String f_p=visit(ctx.factor_prefix());
        String muldiv=visit(ctx.mulop());
        String localType=typeglobal;
        if (f_p==null) {
            String factor=visit(ctx.factor());
            String type=checkType(factor);
            if (type.equals("String"))//id
            {
                String opcode = symbolTables.getType(factor);

                if (opcode != null) {
                    if (opcode.equals("INT")) {
                        muldiv = muldiv + "I";
                        localType = "I";
                        typeglobal = "I";
                    } else if (opcode.equals("FLOAT")) {
                        muldiv = muldiv + "F";
                        localType = "F";
                        typeglobal = "F";
                    }
                }

                else
                {
                    IR_node xx= irStack.popLastPushed();
                    IR_node xx2=irStack.popLastPushed();
                    if (xx.getop().endsWith("F")) {
                        muldiv = muldiv + "F";
                        localType="F";
                        typeglobal="F";
                    }
                    else
                    {
                        muldiv=muldiv+typeglobal;
                    }
                    irStack.push(xx2);
                    irStack.push(xx);
                }

            }
            else//(exp)
            {
                muldiv = muldiv +typeglobal;
            }
            IR_node x = new IR_node();
            x.setop(muldiv);
            x.setoperand1(factor);
            irStack.push(x);
        }
        else  {
            IR_node x = irStack.popLastPushed();
            String factor=visit(ctx.factor());
            String type=checkType(factor);
            if (type.equals("String"))//id
            {
                String opcode = symbolTables.getType(factor);

                if (opcode != null) {
                    if (opcode.equals("INT")) {
                        muldiv = muldiv + "I";
                        localType = "I";
                        typeglobal = "I";
                    } else if (opcode.equals("FLOAT")) {
                        muldiv = muldiv + "F";
                        localType = "F";
                        typeglobal = "F";
                    }
                }

                else
                {
                    IR_node xx= irStack.popLastPushed();
                    IR_node xx2=irStack.popLastPushed();
                    if (xx.getop().endsWith("F")) {
                        muldiv = muldiv + "F";
                        localType="F";
                        typeglobal="F";
                    }
                    else
                    {
                        muldiv=muldiv+typeglobal;
                    }
                    irStack.push(xx2);
                    irStack.push(xx);
                }

            }
            else//(exp)
            {
                muldiv = muldiv +typeglobal;
            }
            x.setoperand2(factor);
            if(localType.equals("F") || typeglobal.equals("F"))
            {
                x.setop(modifyString(x.getop()));
            }
            T=T+1;
            x.setresult("$T"+T);
            irStack.push(x);
            IR_node x2 = new IR_node();
            x2.setoperand1("$T"+T);
            x2.setop(muldiv);
            irStack.push(x2);

        }
        return "not null";

         }


    @Override public String visitFactor(MicroParser.FactorContext ctx) {
        return visitChildren(ctx);
    }
    @Override public String visitBrackets(MicroParser.BracketsContext ctx) {
        return visit(ctx.expr());
    }
    @Override public String visitVariableID(MicroParser.VariableIDContext ctx) {
       String id=ctx.getText();
       return id;
    }
    @Override public String visitINTvalue(MicroParser.INTvalueContext ctx) {
        String num=ctx.INTLITERAL().getText();
        typeglobal="I";
        return num;
    }

    @Override public String visitFLOATvalue(MicroParser.FLOATvalueContext ctx) {
        String num=ctx.FLOATLITERAL().getText();
        typeglobal="F";
        return num;
    }
    @Override public String visitAddop(MicroParser.AddopContext ctx) {
        String addsub=ctx.getText();
        if (addsub.equals("-"))
        {
            addsub="SUB";

        }
        else
        {
            addsub="ADD";
        }
        return addsub;
    }
    @Override public String visitMulop(MicroParser.MulopContext ctx) {
        String muldiv=ctx.getText();

        if (muldiv.equals("*"))
        {
            muldiv="MULT";

        }
        else
        {
            muldiv="DIV";
        }

        return muldiv;
    }
    @Override public String visitFunc_body(MicroParser.Func_bodyContext ctx) {
        return visit(ctx.stmt_list()); }

    @Override
    public String visitFor_stmt(MicroParser.For_stmtContext ctx) {
        visit(ctx.init_expr());
        fors=fors+1;
        int f=fors;
        IR_node node =new IR_node("LABEL","L"+f);
        irStack.push(node);
        visit(ctx.cond());
        visit(ctx.stmt_list());
        visit(ctx.incr_expr());
        IR_node node2 =new IR_node("JUMP","L"+f);
        irStack.push(node2);
        f=f+1;
        IR_node node3 =new IR_node("LABEL","L"+f);
        irStack.push(node3);
        return null;
    }
    @Override public String visitIf_stmt(MicroParser.If_stmtContext ctx) {
        visit(ctx.cond());
        int f=fors;
        visit(ctx.stmt_list());
        IR_node node3=new IR_node("LABEL","L"+f);
        irStack.push(node3);
        visit(ctx.else_part());
          return null;
    }


    @Override public String visitElseSrtatmentScope(MicroParser.ElseSrtatmentScopeContext ctx) {
        fors=fors+1;
        int f=fors;
        IR_node node=new IR_node("JUMP","L"+f);
        irStack.pushAtPosition(1,node);
        visit(ctx.stmt_list());
        IR_node node1=new IR_node("LABEL","L"+f);
        irStack.push(node1);
        return "no null";
    }

    @Override public String visitCond(MicroParser.CondContext ctx) {
        String op =ctx.compare().getText();
        String op1=visit(ctx.expr(0));
        String op2= visit(ctx.expr(1));
        String ope =compar(op);
        fors=fors+1;
        IR_node node=new IR_node(ope,op1,op2,"L"+fors);
        irStack.push(node);
        return null;
    }

    @Override public String visitCompare(MicroParser.CompareContext ctx) {
        String com=compar(ctx.getText());
        return com;
    }



}
