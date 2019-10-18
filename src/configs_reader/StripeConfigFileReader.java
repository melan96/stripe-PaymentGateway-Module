package configs_reader;

import configs_store.StringResourcesDataStore;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author melanrashitha
 *
 */

/*
 * Class StripeConfigFileReader Handles configs.props properties 
 * Dynamically reads and write configs to props file, manage by StripeModule class
 * Used additional dependencies 
 * 		# FileInputStream.io
 * 		# IOExceptions Handlers
 */

public class StripeConfigFileReader {

    //Logger Initializer
    final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void readStripeConfigFile(){
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(StringResourcesDataStore.CONFIG_PROP_PATH));
        } catch (IOException e) {
            //Logger exception fetched
            log.log(Level.SEVERE, e.getLocalizedMessage());
        }
    }
}
