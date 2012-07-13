package mtmk.demo.testlog4j;

import org.apache.log4j.Logger;

public class MyApp2 {
	// Define a static logger variable so that it references the
	// Logger instance named "MyApp".
	static Logger logger = Logger.getLogger(MyApp2.class);

	public static void main(String[] args) {
		// BasicConfigurator replaced with PropertyConfigurator.
		// PropertyConfigurator.configure(args[0]);
		logger.info("Entering application.");
		Bar bar = new Bar();
		bar.doIt();
		logger.info("Exiting application.");
	}
}
