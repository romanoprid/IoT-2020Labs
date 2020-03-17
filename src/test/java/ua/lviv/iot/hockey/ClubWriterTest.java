package ua.lviv.iot.hockey;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.hockey.manager.ClubManager;
import ua.lviv.iot.hockey.model.Good;
import ua.lviv.iot.hockey.model.Purpose;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClubWriterTest extends ClubManager {

    @Test
    public void writeReadFile() {
        ClubManager clubManager = new ClubManager();
        clubManager.add(new Good("Hockey",100,"North", "Ukraine",
                "Leather", Purpose.GOALKEEPER));
        clubManager.add(new Good("Sweater",100,"Gan", "Ukraine",
                "Leather", Purpose.GOALKEEPER));
        clubManager.add(new Good("Helmet",100,"Tiger", "Ukraine",
                "Leather", Purpose.GOALKEEPER));
       clubManager.readFromFile("C:\\Users\\User\\IdeaProjects\\Lab4\\src\\List.csv");

    }





}