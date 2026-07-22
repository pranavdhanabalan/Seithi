package com.pranavd.seithi.Configure;

import picocli.CommandLine.Command;

@Command(name="configure",
        subcommands = {WhatsAppConfigCommand.class},
        description = "Configure messaging providers."
)
public class ConfigureCommand{

}
