package org.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

     static {
         String path = "/src/main/resources/application.properties";
         try {
             FileInputStream input = new FileInputStream(path);
             properties = new Properties();
             properties.load(input);
             input.close();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

     }

     public static String getProperty(String key){
         return properties.getProperty(key);
     }
}
