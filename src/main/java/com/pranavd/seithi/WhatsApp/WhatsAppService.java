package com.pranavd.seithi.WhatsApp;

public class WhatsAppService {


    public void sendText(String phoneNo,String message){
        WhatsAppClient.sendText(phoneNo,message);
    }
}
