package com.pranavd.seithi.WhatsApp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WhatsAppClient {

    HttpClient client=HttpClient.newHttpClient();

    public void sendText(String phoneNo,String message,String VERSION,String PHONE_NUMBER_ID,String YOUR_ACCESS_TOKEN){

        String json = """
            {
              "messaging_product": "whatsapp",
              "to": "%s",
              "type": "text",
              "text": {
                "body": "%s"
              }
            }
            """.formatted(phoneNo, message);

        HttpRequest request=HttpRequest.newBuilder()
                .uri(URI.create(
                        "https://graph.facebook.com/"+VERSION+"/"+PHONE_NUMBER_ID+"/messages"))
                .header("Content-Type","application/json")
                .header("Authorization","Bearer "+YOUR_ACCESS_TOKEN)
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        try {
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.statusCode());
            System.out.println(response.body());

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
