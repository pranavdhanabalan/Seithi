package com.pranavd.seithi.Configure.WhatsApp;

import com.pranavd.seithi.Commands.WhatsApp.Bulk;
import com.pranavd.seithi.Commands.WhatsApp.Send;
import picocli.CommandLine.Command;

@Command(
        name="whatsapp",
        subcommands={ConfigureCommand.class, Send.class, Bulk.class},
        description="Configure WhatsApp information."
)
public class WhatsAppConfigCommand{

}
