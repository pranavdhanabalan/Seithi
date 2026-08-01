package com.pranavd.seithi.Formatter;

import com.pranavd.seithi.Service.WhatsAppService;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemplateEngine {

    public void matcher(String template, Map<String,String> rowMap,String phoneNumber){

        if (template == null) {
            throw new IllegalArgumentException("Message template cannot be null.");
        }

        Pattern pattern=Pattern.compile("\\{([^}]*)\\}");
        Matcher matcher=pattern.matcher(template);

        StringBuffer message=new StringBuffer();

        while(matcher.find()){
            String column = matcher.group(1);
            String value = rowMap.getOrDefault(column.toLowerCase(), "");
            matcher.appendReplacement(message,matcher.quoteReplacement(value));
        }
        matcher.appendTail(message);
        WhatsAppService whatsAppService=new WhatsAppService();
        whatsAppService.sendText(phoneNumber,String.valueOf(message));
    }
}
