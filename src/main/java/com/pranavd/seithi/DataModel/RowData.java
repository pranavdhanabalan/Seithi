package com.pranavd.seithi.DataModel;

import java.util.Map;

public class RowData {
    private final String phoneNumber;
    private final Map<String,String> rowMap;

    public RowData(Map<String,String> rowMap){
        this.phoneNumber=rowMap.get("phone_number");
        this.rowMap=rowMap;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Map<String, String> getRowMap() {
        return rowMap;
    }


}
