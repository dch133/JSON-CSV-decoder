package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;



public class CSVParser implements FileReaderParser
{
    @Override
    public Subscriber parseSubscriber(String csvStr) {


        int id = -1;
        String name = "", phone = "";

        //Split csv into the 3 parts
        String[] parts = csvStr.split(",");

        //check for wrong csv format
        if (parts.length != 3)
        {
            System.err.println("Wrong CSV formatting");
            return new Subscriber(id, name, phone);
        }
        id = Integer.parseInt(parts[0]);
        name = parts[1].replace("\"", "");
        phone = parts[2].replace("\"", "");;


        return new Subscriber(id, name, phone);
    }
}
