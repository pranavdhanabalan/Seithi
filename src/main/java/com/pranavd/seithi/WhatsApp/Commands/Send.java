package com.pranavd.seithi.WhatsApp.Commands;

import com.pranavd.seithi.WhatsApp.WhatsAppService;
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
        WhatsAppService.sendText(to,message);
    }
}
