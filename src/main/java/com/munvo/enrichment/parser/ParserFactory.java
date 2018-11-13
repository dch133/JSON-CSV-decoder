
package com.munvo.enrichment.parser;



public class ParserFactory {

    public FileReaderParser CreateNewFileReaderParser(String type){

        //assume only types are CSV and JSON
        if(type.equals("CSV"))
            return new CSVParser();

        else
            return new JSONParser();


    }

}