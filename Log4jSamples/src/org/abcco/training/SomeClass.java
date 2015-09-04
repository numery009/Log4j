package org.abcco.training;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SomeClass {

    static {
        // Log4J configuration
        try {
            PropertyConfigurator.configure("log4j.properties");
        }
        catch (RuntimeException e) {
                 
        }
    }

    
    /**
	 * Logger for Log4J
	 */
    private static final Logger log = Logger.getLogger(SomeClass.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//step1
		//step2
		
	if (log.isDebugEnabled()) log.debug("This is debug" + "1" + "2" + "4");
	
		//mylogic
		log.info("This is info");
		log.warn("This is warning");
		try{
			 int i = 2/0;
		} catch (Exception e){
			log.error("There is generated from this program", e);
		}
		log.fatal("This is fatal");
	}

}
