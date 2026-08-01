package com.pranavd.seithi.Service;

import com.pranavd.seithi.Configure.WhatsApp.WhatsAppConfigReader;
import com.pranavd.seithi.Clients.WhatsAppClient;
import com.pranavd.seithi.Formatter.TemplateEngine;
import com.pranavd.seithi.Parser.ReadExcel;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class WhatsAppService {

    public void sendText(String phoneNo,String message){

        WhatsAppConfigReader whatsAppConfigReader= new WhatsAppConfigReader();
        WhatsAppClient whatsAppClient=new WhatsAppClient();

        whatsAppConfigReader.loadConfig();
        whatsAppClient.sendText(phoneNo,message, whatsAppConfigReader.getApiVersion(), whatsAppConfigReader.getPhoneNumberId(), whatsAppConfigReader.getAccessToken());

    }

    public void sendCommandDetails(Path file,String message){
        ReadExcel readExcel=new ReadExcel(file);
        try {
            readExcel.readDataLineByLine(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendDetails(Map<String,String> rowMap,String message){
        TemplateEngine templateEngine=new TemplateEngine();
        String phoneNumber=rowMap.get("phone number");
        templateEngine.matcher(message,rowMap,phoneNumber);
    }
}
