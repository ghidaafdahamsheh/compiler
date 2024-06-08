import java.util.*;
import java.util.Map;
import java.util.Stack;
public class Gentiny extends MicroBaseVisitor<String>{
    Stack<Map<String, SymbolEntry>> scopes;
    LinkedList<IR_node> irStack = new LinkedList<IR_node>();
    LinkedList<IR_node> irStacknew = new LinkedList<IR_node>();
    SymbolTable symbolTables;
    int r =1;
    int count=0;
    public static String checkType(String input) {
        try {
            // Try parsing as Double (float)
            Integer.parseInt(input);
            return "Int";

        } catch (NumberFormatException e1) {
            try {
                // Try parsing as Integer
                Double.parseDouble(input);
                return "Float";
            } catch (NumberFormatException e2) {
                // Neither float nor int, consider it as String
                return "String";
            }
        }
    }

    public Gentiny(Stack<Map<String, SymbolEntry>> symbolTable , LinkedList<IR_node> irStack, SymbolTable symbolTables )
    {
        this.scopes=symbolTable;
        this.irStack=irStack;
        this.symbolTables=symbolTables;
    }


    public void tiny() {
        for (int i = 0; i < scopes.size(); i++) {

            Map<String, SymbolEntry> scope = scopes.get(i);
            for (SymbolEntry entry : scope.values()) {
                if(entry.getType().equals("STRING")) {
                    IR_node ir=new IR_node();
                    ir.setop("str");
                    ir.setoperand1(entry.getName());
                    ir.setoperand2(entry.getValue().toString());
                    irStacknew.push(ir);

                }
                else
                {
                    IR_node ir=new IR_node();
                    ir.setop("var");
                    ir.setoperand1(entry.getName());
                    irStacknew.push(ir);

                }
            }

        }
    }
    public void tiny2() {
        List<IR_node> irNodes = new ArrayList<>(irStack);
        for (int i = irNodes.size() - 1; i >= 0; i--) {
            IR_node irNode = irNodes.get(i);

            if (irNode.getLable() != null) {
                System.out.println(irNode.getLable().temp());
            }

            String op = irNode.getop();
            if ("STOREI".equals(op) || "STOREF".equals(op))
            {
                if (irNode.getoperand1().length() >= 2 && irNode.getoperand1().substring(0, 2).equals("$T")) {
                    int x=r-1;
                    IR_node ir =new IR_node();
                    ir.setop("move");
                    ir.setoperand1("r"+x);
                    ir.setoperand2(irNode.getresult());
                    irStacknew.push(ir);
                } else {
                    IR_node ir =new IR_node();
                    ir.setop("move");
                    ir.setoperand1(irNode.getoperand1());
                    ir.setoperand2(irNode.getresult());
                    irStacknew.push(ir);
                }
            }


            else if ("READI".equals(op) ) {
                IR_node ir =new IR_node();
                ir.setop("sys");
                ir.setoperand1("readi");
                ir.setoperand2(irNode.getresult());
                irStacknew.push(ir);

            } else if ("READF".equals(op) ) {
                IR_node ir =new IR_node();
                ir.setop("sys");
                ir.setoperand1("readr");
                ir.setoperand2(irNode.getresult());
                irStacknew.push(ir);

            }


            else if ("WRITES".equals(op))
            {
                IR_node ir =new IR_node();
                ir.setop("sys");
                ir.setoperand1("writes");
                ir.setoperand2(irNode.getresult());
                irStacknew.push(ir);

            } else if ("WRITEI".equals(op)) {
                IR_node ir =new IR_node();
                ir.setop("sys");
                ir.setoperand1("writei");
                ir.setoperand2(irNode.getresult());
                irStacknew.push(ir);


            } else if ("WRITEF".equals(op)) {
                IR_node ir =new IR_node();
                ir.setop("sys");
                ir.setoperand1("writer");
                ir.setoperand2(irNode.getresult());
                irStacknew.push(ir);

            }
            else if ("MULTI".equals(op))
            {
                IR_node ir =new IR_node();
                ir.setop("move");
                if (irNode.getoperand1().length() >= 2 && irNode.getoperand1().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand1().charAt(irNode.getoperand1().length() - 1);
                    String lastChar1 = irNode.getoperand1().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir.setoperand1("r"+intValue);
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }
                else {
                    ir.setoperand1(irNode.getoperand1());
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }

                IR_node ir2 =new IR_node();
                ir2.setop("muli");
                if (irNode.getoperand2().length() >= 2 && irNode.getoperand2().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand2().charAt(irNode.getoperand2().length() - 1);
                    String lastChar1 = irNode.getoperand2().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir2.setoperand1("r"+intValue);
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }
                else {
                    ir2.setoperand1(irNode.getoperand2());
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }

                r=r+1;

            }
            else if ("MULTF".equals(op))
            {
                IR_node ir =new IR_node();
                ir.setop("move");
                if (irNode.getoperand1().length() >= 2 && irNode.getoperand1().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand1().charAt(irNode.getoperand1().length() - 1);
                    String lastChar1 = irNode.getoperand1().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir.setoperand1("r"+intValue);
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }
                else {
                    ir.setoperand1(irNode.getoperand1());
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }

                IR_node ir2 =new IR_node();
                ir2.setop("mulr");
                if (irNode.getoperand2().length() >= 2 && irNode.getoperand2().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand2().charAt(irNode.getoperand2().length() - 1);
                    String lastChar1 = irNode.getoperand2().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir2.setoperand1("r"+intValue);
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }
                else {
                    ir2.setoperand1(irNode.getoperand2());
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }

                r=r+1;

            }

            else if ("ADDI".equals(op)) {
                IR_node ir =new IR_node();
                ir.setop("move");
                if (irNode.getoperand1().length() >= 2 && irNode.getoperand1().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand1().charAt(irNode.getoperand1().length() - 1);
                    String lastChar1 = irNode.getoperand1().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir.setoperand1("r"+intValue);

                }
                else {
                    ir.setoperand1(irNode.getoperand1());
                }
                ir.setoperand2("r"+r);
                irStacknew.push(ir);
                IR_node ir2 =new IR_node();
                ir2.setop("addi");
                if (irNode.getoperand2().length() >= 2 && irNode.getoperand2().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand2().charAt(irNode.getoperand2().length() - 1);
                    String lastChar1 = irNode.getoperand2().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir2.setoperand1("r"+intValue);

                }
                else {
                    ir2.setoperand1(irNode.getoperand2());
                }
                ir2.setoperand2("r"+r);
                irStacknew.push(ir2);
                r=r+1;


            }
            else if ("ADDF".equals(op) ) {
                IR_node ir =new IR_node();
                ir.setop("move");
                if (irNode.getoperand1().length() >= 2 && irNode.getoperand1().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand1().charAt(irNode.getoperand1().length() - 1);
                    String lastChar1 = irNode.getoperand1().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir.setoperand1("r"+intValue);
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }
                else {
                    ir.setoperand1(irNode.getoperand1());
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }

                IR_node ir2 =new IR_node();
                ir2.setop("addr");
                if (irNode.getoperand2().length() >= 2 && irNode.getoperand2().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand2().charAt(irNode.getoperand2().length() - 1);
                    String lastChar1 = irNode.getoperand2().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir2.setoperand1("r"+intValue);
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }
                else {
                    ir2.setoperand1(irNode.getoperand2());
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }

                r=r+1;


            }
            else if ("SUBI".equals(op) ) {
                IR_node ir =new IR_node();
                ir.setop("move");
                if (irNode.getoperand1().length() >= 2 && irNode.getoperand1().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand1().charAt(irNode.getoperand1().length() - 1);
                    String lastChar1 = irNode.getoperand1().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir.setoperand1("r"+intValue);
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }
                else {
                    ir.setoperand1(irNode.getoperand1());
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }

                IR_node ir2 =new IR_node();
                ir2.setop("subi");
                if (irNode.getoperand2().length() >= 2 && irNode.getoperand2().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand2().charAt(irNode.getoperand2().length() - 1);
                    String lastChar1 = irNode.getoperand2().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir2.setoperand1("r"+intValue);
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }
                else {
                    ir2.setoperand1(irNode.getoperand2());
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }

                r=r+1;

            }
            else if ("SUBF".equals(op)) {
                IR_node ir =new IR_node();
                ir.setop("move");
                if (irNode.getoperand1().length() >= 2 && irNode.getoperand1().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand1().charAt(irNode.getoperand1().length() - 1);
                    String lastChar1 = irNode.getoperand1().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir.setoperand1("r"+intValue);
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }
                else {
                    ir.setoperand1(irNode.getoperand1());
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }

                IR_node ir2 =new IR_node();
                ir2.setop("subr");
                if (irNode.getoperand2().length() >= 2 && irNode.getoperand2().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand2().charAt(irNode.getoperand2().length() - 1);
                    String lastChar1 = irNode.getoperand2().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir2.setoperand1("r"+intValue);
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }
                else {
                    ir2.setoperand1(irNode.getoperand2());
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }

                r=r+1;

            }
            else if ("DIVI".equals(op)) {
                IR_node ir =new IR_node();
                ir.setop("move");
                if (irNode.getoperand1().length() >= 2 && irNode.getoperand1().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand1().charAt(irNode.getoperand1().length() - 1);
                    String lastChar1 = irNode.getoperand1().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir.setoperand1("r"+intValue);
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }
                else {
                    ir.setoperand1(irNode.getoperand1());
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }

                IR_node ir2 =new IR_node();
                ir2.setop("divi");
                if (irNode.getoperand2().length() >= 2 && irNode.getoperand2().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand2().charAt(irNode.getoperand2().length() - 1);
                    String lastChar1 = irNode.getoperand2().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir2.setoperand1("r"+intValue);
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }
                else {
                    ir2.setoperand1(irNode.getoperand2());
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }

                r=r+1;


            }
            else if ( "DIVF".equals(op))
            {
                IR_node ir =new IR_node();
                ir.setop("move");
                if (irNode.getoperand1().length() >= 2 && irNode.getoperand1().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand1().charAt(irNode.getoperand1().length() - 1);
                    String lastChar1 = irNode.getoperand1().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir.setoperand1("r"+intValue);
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }
                else {
                    ir.setoperand1(irNode.getoperand1());
                    ir.setoperand2("r"+r);
                    irStacknew.push(ir);
                }
                IR_node ir2 =new IR_node();
                ir2.setop("divr");
                if (irNode.getoperand2().length() >= 2 && irNode.getoperand2().substring(0, 2).equals("$T")) {
                    char lastChar = irNode.getoperand2().charAt(irNode.getoperand2().length() - 1);
                    String lastChar1 = irNode.getoperand2().substring(2);
                    int intValue = Integer.parseInt(lastChar1);
                    intValue=intValue+count;
                    ir2.setoperand1("r"+intValue);
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }
                else {
                    ir2.setoperand1(irNode.getoperand2());
                    ir2.setoperand2("r"+r);
                    irStacknew.push(ir2);
                }

                r=r+1;

            }
            else if ("GT".equals(op)) {
                IR_node ir =new IR_node();
                ir.setop("move");
                ir.setoperand1(irNode.getoperand2());
                ir.setoperand2("r"+r);
                irStacknew.push(ir);
                IR_node ir2 =new IR_node();
                String type1=checkType(irNode.getoperand1());
                String type2=checkType(irNode.getoperand2());
                if(type1.equals("Float") || type2.equals("Float")) {
                    ir2.setop("cmpr");

                }
                else if (type1.equals("Int") && type2.equals("Int")) {
                    ir2.setop("cmpi");

                }
                else if (type1.equals("String") && type2.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand1());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }
                else if (type2.equals("String") && type1.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand2());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }

                else {
                    ir2.setop("cmpi");
                }
                ir2.setoperand1(irNode.getoperand1());
                ir2.setoperand2("r"+r);
                irStacknew.push(ir2);
                IR_node ir3 =new IR_node();
                ir3.setop("jgt");
                ir3.setoperand1(irNode.getresult());
                irStacknew.push(ir3);
                r=r+1;
                count++;
            }
            else if ("GE".equals(op)) {
                IR_node ir =new IR_node();
                ir.setop("move");
                ir.setoperand1(irNode.getoperand2());
                ir.setoperand2("r"+r);
                irStacknew.push(ir);
                IR_node ir2 =new IR_node();
                String type1=checkType(irNode.getoperand1());
                String type2=checkType(irNode.getoperand2());
                if(type1.equals("Float") || type2.equals("Float")) {
                    ir2.setop("cmpr");

                }
                else if (type1.equals("Int") && type2.equals("Int")) {
                    ir2.setop("cmpi");

                }
                else if (type1.equals("String") && type2.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand1());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }
                else if (type2.equals("String") && type1.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand2());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }

                else {
                    ir2.setop("cmpi");
                }
                ir2.setoperand1(irNode.getoperand1());
                ir2.setoperand2("r"+r);
                irStacknew.push(ir2);
                IR_node ir3 =new IR_node();
                ir3.setop("jge");
                ir3.setoperand1(irNode.getresult());
                irStacknew.push(ir3);
                r=r+1;
                count++;
            }
            else if ("LT".equals(op) ) {
                IR_node ir =new IR_node();
                ir.setop("move");
                ir.setoperand1(irNode.getoperand2());
                ir.setoperand2("r"+r);
                irStacknew.push(ir);
                IR_node ir2 =new IR_node();
                String type1=checkType(irNode.getoperand1());
                String type2=checkType(irNode.getoperand2());
                if(type1.equals("Float") || type2.equals("Float")) {
                    ir2.setop("cmpr");

                }
                else if (type1.equals("Int") && type2.equals("Int")) {
                    ir2.setop("cmpi");

                }
                else if (type1.equals("String") && type2.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand1());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }
                else if (type2.equals("String") && type1.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand2());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }

                else {
                    ir2.setop("cmpi");
                }

                ir2.setoperand1(irNode.getoperand1());
                ir2.setoperand2("r"+r);
                irStacknew.push(ir2);
                IR_node ir3 =new IR_node();
                ir3.setop("jlt");
                ir3.setoperand1(irNode.getresult());
                irStacknew.push(ir3);
                r=r+1;
                count++;
            }
            else if ("LE".equals(op) ) {
                IR_node ir =new IR_node();
                ir.setop("move");
                ir.setoperand1(irNode.getoperand2());
                ir.setoperand2("r"+r);
                irStacknew.push(ir);
                IR_node ir2 =new IR_node();
                String type1=checkType(irNode.getoperand1());
                String type2=checkType(irNode.getoperand2());
                if(type1.equals("Float") || type2.equals("Float")) {
                    ir2.setop("cmpr");

                }
                else if (type1.equals("Int") && type2.equals("Int")) {
                    ir2.setop("cmpi");

                }
                else if (type1.equals("String") && type2.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand1());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }
                else if (type2.equals("String") && type1.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand2());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }

                else {
                    ir2.setop("cmpi");
                }
                ir2.setoperand1(irNode.getoperand1());
                ir2.setoperand2("r"+r);
                irStacknew.push(ir2);
                IR_node ir3 =new IR_node();
                ir3.setop("jle");
                ir3.setoperand1(irNode.getresult());
                irStacknew.push(ir3);
                r=r+1;
                count++;
            }
            else if ("NE".equals(op) ) {
                IR_node ir =new IR_node();
                ir.setop("move");
                ir.setoperand1(irNode.getoperand2());
                ir.setoperand2("r"+r);
                irStacknew.push(ir);
                IR_node ir2 =new IR_node();
                String type1=checkType(irNode.getoperand1());
                String type2=checkType(irNode.getoperand2());
                if(type1.equals("Float") || type2.equals("Float")) {
                    ir2.setop("cmpr");

                }
                else if (type1.equals("Int") && type2.equals("Int")) {
                    ir2.setop("cmpi");

                }
                else if (type1.equals("String") && type2.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand1());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }
                else if (type2.equals("String") && type1.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand2());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }

                else {
                    ir2.setop("cmpi");
                }

                ir2.setoperand1(irNode.getoperand1());
                ir2.setoperand2("r"+r);
                irStacknew.push(ir2);
                IR_node ir3 =new IR_node();
                ir3.setop("jne");
                ir3.setoperand1(irNode.getresult());
                irStacknew.push(ir3);
                r=r+1;
                count++;
            }
            else if ("EQ".equals(op) )
            {
                IR_node ir =new IR_node();
                ir.setop("move");
                ir.setoperand1(irNode.getoperand2());
                ir.setoperand2("r"+r);
                irStacknew.push(ir);
                IR_node ir2 =new IR_node();
                String type1=checkType(irNode.getoperand1());
                String type2=checkType(irNode.getoperand2());
                if(type1.equals("Float") || type2.equals("Float")) {
                    ir2.setop("cmpr");

                }
                else if (type1.equals("Int") && type2.equals("Int")) {
                    ir2.setop("cmpi");

                }
                else if (type1.equals("String") && type2.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand1());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }
                else if (type2.equals("String") && type1.equals("Int") )//id
                {
                    String opcode = symbolTables.getType(irNode.getoperand2());
                    if (opcode.equals("FLOAT"))
                    {
                        ir2.setop("cmpr");
                    }
                    else {
                        ir2.setop("cmpi");
                    }

                }

                else {
                    ir2.setop("cmpi");
                }
                ir2.setoperand1(irNode.getoperand1());
                ir2.setoperand2("r"+r);
                irStacknew.push(ir2);
                IR_node ir3 =new IR_node();
                ir3.setop("jeq");
                ir3.setoperand1(irNode.getresult());
                irStacknew.push(ir3);
                r=r+1;
                count++;

            }
            else if ("LABEL".equals(op)) {
                IR_node ir =new IR_node();
                ir.setop("label");
                ir.setresult(irNode.getresult());
                irStacknew.push(ir);

            }
            else if ( "JUMP".equals(op)) {
                IR_node ir =new IR_node();
                ir.setop("jmp");
                ir.setresult(irNode.getresult());
                irStacknew.push(ir);

            }

        }
    }
    public LinkedList<IR_node> getIrStack()
    {
        return irStacknew;
    }


    public void printtiny() {
        List<IR_node> irNodes = new ArrayList<>(irStacknew);

        for (int i = irNodes.size() - 1; i >= 0; i--) {
            IR_node irNode = irNodes.get(i);

            if (irNode.getLable() != null) {
                System.out.println(irNode.getLable().temp());
            }

            String op = irNode.getop();
            if ("move".equals(op))
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getoperand2());
            }
            else if ("var".equals(op)) {
                System.out.println(op +" "+ irNode.getoperand1() );

            } else if ("str".equals(op)) {
                System.out.println(op +" "+ irNode.getoperand1() +" "+irNode.getoperand2());
            }
            else if ("sys".equals(op) ) {
                System.out.println(op + "  " + irNode.getoperand1()+" "+irNode.getoperand2());
            }
            else if ("muli".equals(op) || "mulr".equals(op))
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getoperand2() );
            }
            else if ("addi".equals(op) || "addr".equals(op))
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getoperand2());
            }
            else if ("subi".equals(op) || "subr".equals(op))
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getoperand2());
            }
            else if ("divi".equals(op) || "divr".equals(op))
            {
                System.out.println(op + "  " + irNode.getoperand1() + "  " + irNode.getoperand2());
            }
            else if ("cmpi".equals(op) || "cmpr".equals(op)) {
                System.out.println(op + "  " + irNode.getoperand1() +"  "+irNode.getoperand2());
            }
            else if ("jgt".equals(op) || "jge".equals(op) || "jlt".equals(op) || "jle".equals(op) ||"jne".equals(op) || "jeq".equals(op) )
            {
                System.out.println(op + "  " + irNode.getoperand1());
            }
            else if ("label".equals(op) || "jmp".equals(op)) {
                System.out.println(op + "  " + irNode.getresult());
            }
        }
    }





}
