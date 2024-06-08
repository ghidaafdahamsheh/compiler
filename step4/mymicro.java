import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

 class SymbolTable {
    private Stack<Map<String, SymbolEntry>> scopes;
    private Stack<String> scopeNames;

    public SymbolTable() {
        scopes = new Stack<>();
        scopeNames = new Stack<>();
    }

    public void openScope(String name) {
        scopes.push(new HashMap<>());
        scopeNames.push(name);
    }

     public String closeScope() {
         if (scopes.size() > 1) {
             scopes.pop();
             scopeNames.pop();
             return scopeNames.peek();
         }
         return null;
     }


     public void addSymbol(String name, String type) {
         if (!scopes.isEmpty() && !scopes.peek().containsKey(name)) {
             scopes.peek().put(name, new SymbolEntry(name, type));
         } else {
             System.out.println("Symbol " + name + " already defined in the current scope.");
         }
     }
     public void addSymbol(String name, String type ,String value) {
         if (!scopes.isEmpty()) {
             scopes.peek().put(name, new SymbolEntry(name, type ,value));
         }
     }

    public void printSymbolTable() {
        for (int i = 0; i < scopes.size(); i++) {
            System.out.println("<<Scope " + scopeNames.get(i) + ">>");
            System.out.println("<< element in scope " + scopes.get(i).keySet() + ">>");

            Map<String, SymbolEntry> scope = scopes.get(i);
            for (SymbolEntry entry : scope.values()) {
                if(entry.getType().equals("STRING")) {
                    System.out.println("name " + entry.getName() + " type " + entry.getType() + " value " +entry.getValue());
                }
                else
                {
                    System.out.println("name " + entry.getName() + " type " + entry.getType());
                }
            }

            System.out.println();
        }
    }
     public String getType(String variableName) {
         for (int i = 0; i < scopes.size(); i++) {
             Map<String, SymbolEntry> scope = scopes.get(i);
             SymbolEntry entry = scope.get(variableName);
             if (entry != null) {
                 return entry.getType();
             }
         }
         return null; // Variable not found
     }
}

class SymbolEntry {
    private String name;
    private String type;
    private String value;
    public SymbolEntry(String name, String type) {
        this.name = name;
        this.type = type;
    }
     public SymbolEntry(String name, String type ,String value) {
         this.name = name;
         this.type = type;
         this.value=value;
     }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
     public String getValue() {
         return value;
     }
}
class LookupTable {
    private String[] keys;
    private String[] values;
    private int size;

    public LookupTable(int capacity) {
        keys = new String[capacity];
        values = new String[capacity];
        size = 0;
    }

    public void put(String key, String value) {
        if (size < keys.length) {
            keys[size] = key;
            values[size] = value;
            size++;
        } else {
            System.out.println("LookupTable is full. Cannot add more elements.");
        }
    }

    public String get(String key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null; // Key not found
    }
}
class Type {

        private final String typeName;

        Type(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return typeName;
        }

        @Override
        public String toString() {
            return typeName;
        }
    }
    public class mymicro extends MicroBaseVisitor<SymbolTable> {
       SymbolTable symbolTables = new SymbolTable();
//        private String currentScopeName;
        private Type p;
        int Ghid=1;
        String id;

        public SymbolTable getSymbolTable() {
             return symbolTables;
        }


        @Override
        public SymbolTable visitProgram(MicroParser.ProgramContext ctx) {
            symbolTables.openScope(ctx.id().getText());
            visitChildren(ctx);
//            symbolTables.closeScope();
            return null;
        }

        @Override
        public SymbolTable visitString_decl(MicroParser.String_declContext ctx) {
            String idName = ctx.id().getText();
            String Type = "STRING";
            String value = ctx.str().getText();
            symbolTables.addSymbol(idName,Type, value);
            return null;
        }

        @Override
        public SymbolTable visitVar_decl(MicroParser.Var_declContext ctx) {
//            p = new Type(ctx.var_type().toString());
            visitChildren(ctx);
            return null;
        }
        @Override public SymbolTable visitFloatType(MicroParser.FloatTypeContext ctx) {
            p= new Type("FLOAT");
            visitChildren(ctx);
            return null;
        }
        @Override public SymbolTable visitIntType(MicroParser.IntTypeContext ctx) {
            p= new Type("INT");
            visitChildren(ctx);
            return null;
        }
        @Override
        public SymbolTable visitId_list(MicroParser.Id_listContext ctx) {

            String id = ctx.id().getText();
            symbolTables.addSymbol(id,p.getTypeName());
            visit(ctx.id_tail());
            return null;
        }

        @Override
        public SymbolTable visitIdtail(MicroParser.IdtailContext ctx) {
            String id = ctx.id().getText();
            symbolTables.addSymbol(id,p.toString());
            visit(ctx.id_tail());
            return null;
        }

        @Override
        public SymbolTable visitParam_decl(MicroParser.Param_declContext ctx) {
            visit(ctx.var_type());
            String name = ctx.id().getText();
            symbolTables.addSymbol(name,p.getTypeName());
            return null;
        }

        @Override
        public SymbolTable visitFunc_decl(MicroParser.Func_declContext ctx) {
            symbolTables.openScope(ctx.id().getText());
//          System.out.println("scope function " + idName);
            visitChildren(ctx);
//          symbolTables.closeScope();
            return null;
        }
        @Override public SymbolTable visitRead_stmt(MicroParser.Read_stmtContext ctx) {
//            visitChildren(ctx.id_list());
            return null; }
        @Override public SymbolTable visitWrite_stmt(MicroParser.Write_stmtContext ctx) {
//            visitChildren(ctx.id_list());
            return null; }


        @Override
        public SymbolTable visitIf_stmt(MicroParser.If_stmtContext ctx) {
            symbolTables.openScope("block #"+Ghid);
            Ghid=Ghid+1;
            visitChildren(ctx);
//            symbolTables.closeScope();
            return null;
        }
        @Override public SymbolTable visitElseSrtatmentScope(MicroParser.ElseSrtatmentScopeContext ctx) {
            symbolTables.openScope("block #"+Ghid);
            Ghid=Ghid+1;
            visitChildren(ctx);
//            symbolTables.closeScope();
            return null;
        }
        @Override
        public SymbolTable visitFor_stmt(MicroParser.For_stmtContext ctx) {
            symbolTables.openScope("block #"+Ghid);
            Ghid=Ghid+1;
            visitChildren(ctx);
//            symbolTables.closeScope();
            return null;
        }
    }
