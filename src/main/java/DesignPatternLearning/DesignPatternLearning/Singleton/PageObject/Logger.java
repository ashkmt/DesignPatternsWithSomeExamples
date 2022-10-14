package DesignPatternLearning.DesignPatternLearning.Singleton.PageObject;
/**
 * Singleton logger class following gof principles:
 * 	1. private constructor to block instantiation.
 * 	2. getInstance method checking existance of an instance and returning
 * 	   new instance accordingly.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

	private final String logFile = "c:\\framework.log";
	private PrintWriter writer;
	
	private Logger() {
	FileWriter fw = null;
	try {
		fw = new FileWriter(logFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	writer = new PrintWriter(fw,true);

	}
	
	private static Logger logger;
	public static Logger getInstance() {
		if(logger==null)
			logger = new Logger();
		return logger;
	}
	
	public void log(String log) {
		writer.println(log);
	}
}
