package com.pranavd.seithi;

import com.pranavd.seithi.Configure.ConfigureCommand;
import com.pranavd.seithi.WhatsApp.Commands.Send;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name="seithi",
        subcommands={ConfigureCommand.class,
        Send.class
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
