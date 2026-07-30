package com.pranavd.seithi;

import com.pranavd.seithi.Configure.WhatsApp.ConfigureCommand;
import com.pranavd.seithi.Commands.WhatsApp.Send;
import com.pranavd.seithi.Configure.WhatsApp.WhatsAppConfigCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name="seithi",
        subcommands={WhatsAppConfigCommand.class,
        Send.class
        },
        header = {
                "███████╗ ███████╗ ██╗ ████████╗ ██╗  ██╗ ██╗",
                "██╔════╝ ██╔════╝ ██║ ╚══██╔══╝ ██║  ██║ ██║",
                "███████╗ █████╗   ██║    ██║    ███████║ ██║",
                "╚════██║ ██╔══╝   ██║    ██║    ██╔══██║ ██║",
                "███████║ ███████╗ ██║    ██║    ██║  ██║ ██║",
                "╚══════╝ ╚══════╝ ╚═╝    ╚═╝    ╚═╝  ╚═╝ ╚═╝",
                "",
                "Seithi - WhatsApp Messaging CLI",
                ""
        },
        mixinStandardHelpOptions = true,
        version="seithi 1.0",
        description="Open source messaging automation toolkit."
)
public class SeithiApplication implements Runnable{
    public static void main(String[] args){
        int exitCode = new CommandLine(new SeithiApplication()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        System.out.println("Welcome to Seithi!");
    }
}
