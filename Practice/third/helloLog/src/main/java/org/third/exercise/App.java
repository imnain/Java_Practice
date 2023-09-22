package org.third.exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{	
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {	
    	logger.info("Hello World from logger");
        System.out.println( "Hello World!" );
        logger.info("hello hello");
    }
}
