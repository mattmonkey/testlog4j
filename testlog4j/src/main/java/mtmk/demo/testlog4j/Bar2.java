package mtmk.demo.testlog4j;

import org.apache.log4j.Logger;

public class Bar2 {
	static Logger logger = Logger.getLogger(Bar2.class);

	public void doIt() {
		logger.debug("Did it again!");
	}
}
