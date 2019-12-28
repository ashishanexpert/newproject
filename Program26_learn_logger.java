import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Program26_learn_logger {

	
	 static Logger Log= Logger.getLogger(Program26_learn_logger.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Log.setLevel(Level.ALL);
		Log.info("Test Started");
		Log.info("Test under Execution--------");
		Log.info("Test id over --------");
		Log.debug("Program is under Exection");
		Log.fatal("Error");
		Log.error("There is the Error in the Program");

	}

}
