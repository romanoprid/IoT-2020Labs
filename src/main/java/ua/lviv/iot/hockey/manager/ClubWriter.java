package ua.lviv.iot.hockey.manager;

import ua.lviv.iot.hockey.model.Good;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class ClubWriter {


    public static void writeToFile(final List<Good> goods, final String fileName) throws FileNotFoundException {
        File csvOutputFile = new File(fileName);
        try {

            PrintWriter pw = new PrintWriter(csvOutputFile);
            goods.stream()
                    .map(Good::toCSV)
                    .forEach(pw::println);
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file");
        }
    }


}
