package com.munvo.enrichment.configuration;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Configuration {

    private String studentName;
    private String type;
    private String fileName;

    //Create Singleton
    private static Configuration confInstance;

    public static Configuration getInstance()
    {
        if (confInstance == null)
            confInstance = new Configuration();


        return confInstance;
    }


    public Configuration() {
        Config config = ConfigFactory.load();
        this.studentName = config.getString("name");
        this.type = config.getString("type");
        this.fileName = config.getString("fileName");
    }

    public String getStudentName() {
        return studentName;
    }

    public String getType() {
        return type;
    }

    public String getFileName() {
        return fileName;
    }
}