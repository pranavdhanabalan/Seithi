package com.pranavd.seithi.Configure;

import picocli.CommandLine.Command;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

@Command(
        name="whatsapp",
        description="Configure WhatsApp information."
)
public class WhatsAppConfigCommand implements Runnable{

    @Override
    public void run(){

        Scanner sc=new Scanner(System.in);
        String accessToken;
        String phoneNumberId;
        String apiVersion;
        System.out.print("Access token: ");
        accessToken=sc.nextLine();
        System.out.print("Phone Number Id: ");
        phoneNumberId=sc.nextLine();
        System.out.print("API Version: ");
        apiVersion=sc.nextLine();


        Properties properties=new Properties();
        properties.setProperty("whatsapp.accessToken", accessToken);
        properties.setProperty("whatsapp.phoneNumberId", phoneNumberId);
        properties.setProperty("whatsapp.apiVersion", apiVersion);

        try (FileOutputStream output =
                     new FileOutputStream("config.properties")) {

            properties.store(output, "WhatsApp Configuration");
            System.out.println("Configuration saved successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
