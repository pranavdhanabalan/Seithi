package com.pranavd.seithi.Commands.WhatsApp;

import picocli.CommandLine.Option;
import picocli.CommandLine.Command;

import java.nio.file.Path;

@Command(
        name="bulk-send",
        description = "Send a WhatsApp messages in bulk."
)
public class Bulk {

    @Option(
            names={"-f","--file"},
            description="Path to CSV or Excel file.",
            required = true
    )
    private Path file;

    @Option(
            names={"-t","--to"},
            description="Phone numbers if Customers.",
            required = true
    )
    private String to;

    @Override
    public void run(){

    }
}
