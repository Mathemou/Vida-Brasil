package br.ufes.inf.jpalmeida.owid;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        try {
            Reader in = new FileReader("/home-temp/aluno/Documents/AulaMaven03/Vida-Brasil/vidabrasil/src/main/java/br/ufes/inf/jpalmeida/owid/female-and-male-life-expectancy-at-birth-in-years.csv");
            Iterable<CSVRecord> records = CSVFormat.EXCEL.withDelimiter(',').parse(in);
            for (CSVRecord record : records) {
                String columnOne = record.get(0);
                String columnTwo = record.get(1);
                System.out.println(columnOne);
                System.out.println(columnTwo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro");
        }

    }
}
