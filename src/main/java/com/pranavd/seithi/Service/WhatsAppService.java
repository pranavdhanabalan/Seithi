package com.pranavd.seithi.Service;

import com.pranavd.seithi.Configure.WhatsApp.WhatsAppConfigReader;
import com.pranavd.seithi.Clients.WhatsAppClient;

import java.nio.file.Path;

public class WhatsAppService {

    public void sendText(String phoneNo,String message){

        WhatsAppConfigReader whatsAppConfigReader= new WhatsAppConfigReader();
        WhatsAppClient whatsAppClient=new WhatsAppClient();

        whatsAppConfigReader.loadConfig();
        whatsAppClient.sendText(phoneNo,message, whatsAppConfigReader.getApiVersion(), whatsAppConfigReader.getPhoneNumberId(), whatsAppConfigReader.getAccessToken());

    }

    public void sendBulkText(Path file,String message){

    }

}
