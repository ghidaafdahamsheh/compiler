// import antlr
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;
import java.io.FileInputStream;
import java.io.InputStream;
//ghidaa falah aldahamsheh 0199959
public class Driver {

	public static void main(String[] args) throws Exception{
		// read input MICRO code
		InputStream is=null;
		try{
			String inputFile;
			inputFile = args[0];
			is = new FileInputStream(inputFile);
		}
		catch ( Exception e){
			System.out.println("You must specify an input file");
			System.exit(0);
		}

		ANTLRInputStream input = new ANTLRInputStream(is);
		MicroLexer lexer = new MicroLexer(input);
		MicroParser parser = new MicroParser(new CommonTokenStream(lexer));

			ParseTree tree = parser.program();
			System.out.println("number of errors is " + parser.getNumberOfSyntaxErrors());
			mymicro Visitor = new mymicro();
			Visitor.visitProgram((MicroParser.ProgramContext) tree);
		    SymbolTable GHidaa=Visitor.getSymbolTable();
            GHidaa.printSymbolTable();

		    MYVISIT Visitor1 = new MYVISIT(GHidaa);
		    Visitor1.visitProgram((MicroParser.ProgramContext) tree);
		    IRStack gogo=Visitor1.getIRStack();
//			gogo.printIR();
			gogo.printIR2();

		}
	}


