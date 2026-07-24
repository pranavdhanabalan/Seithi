package com.pranavd.seithi.Configure.WhatsApp;

import picocli.CommandLine.Command;

@Command(
        name="whatsapp",
        subcommands={ConfigureCommand.class},
        description="Configure WhatsApp information."
)
public class WhatsAppConfigCommand{

}
