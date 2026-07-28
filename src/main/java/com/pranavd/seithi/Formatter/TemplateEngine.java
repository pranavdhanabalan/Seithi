package com.pranavd.seithi.Formatter;

import com.pranavd.seithi.Service.WhatsAppService;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemplateEngine {

    public void matcher(String template, Map<String,String> rowMap){

        Pattern pattern=Pattern.compile("\\{([^}]*)\\}");
        Matcher matcher=pattern.matcher(template);

        StringBuffer message=new StringBuffer();

        while(matcher.find()){
            String column = matcher.group(1);
            String value = rowMap.getOrDefault(column.toLowerCase(), "");
            matcher.appendReplacement(message, value);
        }
        WhatsAppService whatsAppService=new WhatsAppService();
        whatsAppService.sendText(String.valueOf(message));
    }


}
