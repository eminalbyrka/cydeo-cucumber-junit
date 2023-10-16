package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static{// static block ilk execute olduğu için.
        // ve aşağıdakilerin ilk execute olması için.static yapmış.
        // hemde kodlarımız bir blok içinde olmalıymış.sanırım main method filan kullanmak istemedi.

        try {

            //2- We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties object using FileInputStream object
            properties.load(file);

            //close the file
            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){//BURADAKİ KEYWORD :"browser",
        // yani String olarak bunu yazsak dahi bir işlevi var.(configuration.propertiesten alıyor bunu.
        // ve return olarak bize value veriyor.orada browserin karşılığı ne ise onu veriyor.
        return properties.getProperty(keyword);//step 4

    }

}
