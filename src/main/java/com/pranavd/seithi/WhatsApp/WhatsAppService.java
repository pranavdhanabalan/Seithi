package com.pranavd.seithi.WhatsApp;

import com.pranavd.seithi.Configure.WhatsAppConfigReader;

public class WhatsAppService {

    public void sendText(String phoneNo,String message){

        WhatsAppConfigReader whatsAppConfigReader= new WhatsAppConfigReader();
        WhatsAppClient whatsAppClient=new WhatsAppClient();

        whatsAppConfigReader.loadConfig();
        whatsAppClient.sendText(phoneNo,message, whatsAppConfigReader.getApiVersion(), whatsAppConfigReader.getPhoneNumberId(), whatsAppConfigReader.getAccessToken());

    }
}
