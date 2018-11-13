package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

import java.util.Scanner;


public class JSONParser implements FileReaderParser
{
    @Override
    public Subscriber parseSubscriber (String jsonStr)
    {
        int id = -1;
        String name = "", phone = "";

        try
        {
           int i = 0;
           //get the id
           while (jsonStr.charAt(i) != 'i') i++;
           i +=5;
           String num = "";
           while(jsonStr.charAt(i) != ',')
           {
               num+= jsonStr.charAt(i);
               i++;
           }
           id = Integer.parseInt(num);

           //get the name
           while (jsonStr.charAt(i) != 'n') i++;
           i +=8;
           while(jsonStr.charAt(i) != '"')
           {
               name+= jsonStr.charAt(i);
               i++;
           }

           //get the phone
           while (jsonStr.charAt(i) != 'p') i++;
           i +=9;
           while(jsonStr.charAt(i) != '"')
           {
               phone+= jsonStr.charAt(i);
               i++;
           }
        }
        catch (Exception e)
        {
            System.err.println("Wrong format of JSON string");
            e.printStackTrace();
        }
        return new Subscriber(id,name,phone);
    }

}
