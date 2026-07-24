package com.pranavd.seithi.Configure.WhatsApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WhatsAppConfigReader {

    private String accessToken;
    private String phoneNumberId;
    private String apiVersion;

    public void loadConfig(){
        Properties properties = new Properties();

        try (FileInputStream input = new FileInputStream("config.properties")) {

            properties.load(input);

            accessToken = properties.getProperty("whatsapp.accessToken");
            phoneNumberId = properties.getProperty("whatsapp.phoneNumberId");
            apiVersion = properties.getProperty("whatsapp.apiVersion");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

}
