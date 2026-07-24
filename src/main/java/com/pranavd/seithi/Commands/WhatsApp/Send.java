package com.pranavd.seithi.Commands.WhatsApp;

import com.pranavd.seithi.Service.WhatsAppService;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;

@Command(
        name="send",
        description = "Send a WhatsApp message."
)
public class Send implements Runnable{

    @Option(
            names={"-t","--to"},
            description = "Required Phone Number.",
            required = true
    )
    private String to;

    @Option(
            names={"-m","--message"},
            description = "Message to Send.",
            required = true
    )
    private String message;

    @Override
    public void run(){
        WhatsAppService whatsAppService=new WhatsAppService();
        whatsAppService.sendText(to,message);
    }
}
