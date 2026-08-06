package com.pranavd.seithi.Commands.WhatsApp;

import com.pranavd.seithi.PipelineManager;
import com.pranavd.seithi.Service.WhatsAppService;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;

import java.nio.channels.Pipe;
import java.nio.file.Path;

@Command(
        name="bulk-send",
        description = "Send a WhatsApp messages in bulk."
)
public class Bulk implements Runnable{

    @Option(
            names={"-f","--file"},
            description="Path to CSV or Excel file.",
            required = true
    )
    private Path file;

    @Option(
            names={"-m","--message"},
            description="Message to Send.",
            required = true
    )
    private String message;

    @Override
    public void run(){

    }
}
