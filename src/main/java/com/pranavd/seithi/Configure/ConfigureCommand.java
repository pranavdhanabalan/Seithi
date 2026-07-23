package com.pranavd.seithi.Configure;

import picocli.CommandLine.Command;

@Command(name="config",
        subcommands = {WhatsAppConfigCommand.class},
        description = "Configure messaging providers."
)
public class ConfigureCommand{

}
