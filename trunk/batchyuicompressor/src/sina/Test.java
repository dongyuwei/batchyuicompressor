package sina;

import java.io.IOException;

import org.mozilla.javascript.EvaluatorException;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws EvaluatorException 
	 */
	public static void main(String[] args) throws EvaluatorException, IOException {
		// TODO Auto-generated method stub
		BatchCompressor compressor = new BatchCompressor();
		String[] arg = {"/Users/ilfe/compress/input","/Users/ilfe/compress/output","false"};
		compressor.main(arg);
	}

}
