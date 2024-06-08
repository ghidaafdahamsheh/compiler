
// import antlr
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.FileInputStream;
import java.io.InputStream;

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
		System.out.println("number of errors is " + parser.getNumberOfSyntaxErrors());
	}
}

