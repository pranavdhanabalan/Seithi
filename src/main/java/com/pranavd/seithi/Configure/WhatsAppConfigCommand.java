package com.pranavd.seithi.Configure;

import picocli.CommandLine.Command;
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
    }

}
