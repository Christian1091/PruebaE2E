package com.prueba.tasks;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
    public List<String[]> readCsv(String filePath) throws IOException {
        List<String[]> rows = new ArrayList<>();
        FileReader reader = new FileReader(filePath);

        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader().parse(reader);
        for (CSVRecord record : records) {
            String[] row = new String[5];
            row[0] = record.get("username");
            row[1] = record.get("password");
            row[2] = record.get("firstName");
            row[3] = record.get("lastName");
            row[4] = record.get("codePostal");
            rows.add(row);
        }

        return rows;
    }
}
