package com.pranavd.seithi.DataModel;

public class RenderedMessage {
    private String phoneNumber;
    private String message;

    public RenderedMessage(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
