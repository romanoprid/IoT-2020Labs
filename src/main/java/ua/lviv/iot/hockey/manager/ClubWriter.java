package ua.lviv.iot.hockey.manager;

import ua.lviv.iot.hockey.model.Good;
import ua.lviv.iot.hockey.model.HockeyPuck;

import java.io.*;
import java.util.List;

public class ClubWriter {

    public static void writeToFile(final List<Good> goods) {
            File csvOutputFile = new File("D:\\projects\\Iot-2020Labs\\List.csv");
            try {

                FileWriter pw = new FileWriter(csvOutputFile);
                for (Good good : goods) {
                    String toCSV = good.toCSV();
                    pw.write(toCSV);
                }
                pw.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
