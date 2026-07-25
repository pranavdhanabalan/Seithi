package com.pranavd.seithi.Parser;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class ReadExcel {

    private final Path FILE_PATH ;

    ReadExcel(Path path){
        FILE_PATH=path;
    }

    public void readDataLineByLine() throws IOException{

        try (InputStream inp = new FileInputStream(FILE_PATH.toFile())) {
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        }
    }
}
