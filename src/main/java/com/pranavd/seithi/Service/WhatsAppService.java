package com.pranavd.seithi.Service;

import com.pranavd.seithi.Configure.WhatsApp.WhatsAppConfigReader;
import com.pranavd.seithi.Clients.WhatsAppClient;

public class WhatsAppService {

    public void sendText(String phoneNo,String message){

        WhatsAppConfigReader whatsAppConfigReader= new WhatsAppConfigReader();
        WhatsAppClient whatsAppClient=new WhatsAppClient();

        whatsAppConfigReader.loadConfig();
        whatsAppClient.sendText(phoneNo,message, whatsAppConfigReader.getApiVersion(), whatsAppConfigReader.getPhoneNumberId(), whatsAppConfigReader.getAccessToken());

    }
}
