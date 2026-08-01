package com.pranavd.seithi.Parser;

import com.pranavd.seithi.Service.WhatsAppService;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadExcel {

    private final Path FILE_PATH ;

    public ReadExcel(Path path){
        FILE_PATH=path;
    }

    public void readDataLineByLine(String message) throws IOException{

        try (InputStream inp = new FileInputStream(FILE_PATH.toFile())) {
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheetAt(0);

            Row headerRow=sheet.getRow(0);
            if (headerRow==null){
                System.out.println("Sheet is empty!");
                return;
            }

            List<String> headers=new ArrayList<>();
            DataFormatter formatter=new DataFormatter();

            for (Cell cell : headerRow){
                headers.add(formatter.formatCellValue(cell));
            }

            for (int i=1;i<=sheet.getLastRowNum();i++){
                Row row=sheet.getRow(i);
                if (row==null){
                    continue;
                }
                Map<String, String> rowMap = new HashMap<>();
                for (int j=0;j<headers.size();j++){
                    Cell cell=row.getCell(j);
                    String cellValue=formatter.formatCellValue(cell);
                    rowMap.put(headers.get(j),cellValue);
                }
                WhatsAppService whatsAppService=new WhatsAppService();
                whatsAppService.sendDetails(rowMap,message);
            }

        }
    }
}
