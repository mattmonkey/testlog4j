package mtmk.demo.testlog4j;

import org.apache.log4j.Logger;


// org.apache.log4j.ConsoleAppender(控制台)
// org.apache.log4j.FileAppender(文件)
// org.apache.log4j.DailyRollingFileAppender(每天产生一个日志文件)
// org.apache.log4j.RollingFileAppender(文件大小到达指定尺寸的时候产生一个新的文件)
// org.apache.log4j.WriterAppender(将日志信息以流格式发送到任意指定的地方)

public class MyApp {
	// Define a static logger variable so that it references the
	// Logger instance named "MyApp".
	static Logger logger = Logger.getLogger(MyApp.class);

	public static void main(String[] args) {
		// Set up a simple configuration that logs on the console.
		// BasicConfigurator.configure();
		logger.info("Entering application.");
		Bar bar = new Bar();
		bar.doIt();
		logger.warn("Exiting application.");
	}
}
