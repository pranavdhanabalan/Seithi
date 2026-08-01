package com.pranavd.seithi.Service;

import com.pranavd.seithi.Configure.WhatsApp.WhatsAppConfigReader;
import com.pranavd.seithi.Clients.WhatsAppClient;
import com.pranavd.seithi.Formatter.TemplateEngine;
import com.pranavd.seithi.Parser.ReadExcel;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class WhatsAppService {

    private String message;
    private String phoneNumber;

    public void sendText(String phoneNo,String message){

        WhatsAppConfigReader whatsAppConfigReader= new WhatsAppConfigReader();
        WhatsAppClient whatsAppClient=new WhatsAppClient();

        whatsAppConfigReader.loadConfig();
        whatsAppClient.sendText(phoneNo,message, whatsAppConfigReader.getApiVersion(), whatsAppConfigReader.getPhoneNumberId(), whatsAppConfigReader.getAccessToken());

    }

    public void sendText(String message){

        WhatsAppConfigReader whatsAppConfigReader= new WhatsAppConfigReader();
        WhatsAppClient whatsAppClient=new WhatsAppClient();

        whatsAppConfigReader.loadConfig();
        whatsAppClient.sendText(phoneNumber,message, whatsAppConfigReader.getApiVersion(), whatsAppConfigReader.getPhoneNumberId(), whatsAppConfigReader.getAccessToken());

    }

    public void sendCommandDetails(Path file, String message){
        ReadExcel readExcel=new ReadExcel(file);
        try {
            this.message=message;
            readExcel.readDataLineByLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendDetails(Map<String,String> rowMap){
        TemplateEngine templateEngine=new TemplateEngine();
        phoneNumber=rowMap.get("phone number");
        templateEngine.matcher(message,rowMap);
    }
}
