package com.javatramp.Lesson1.Task1.util;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReader {

    private static final Logger logger = LogManager.getLogger(DataReader.class);

    private static final String FILE_NAME = "src\\main\\resources\\inputData.txt";

    public static List<String> getData() {

        logger.info("Start reading data from file " + FILE_NAME + ".");
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(FILE_NAME))) {

            list = stream
                    .filter(line -> line.startsWith("Airplane") || line.startsWith("Dirigible") || line.startsWith("Helicopter"))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            logger.error("Cann't read data from file " + FILE_NAME + ".");
            e.printStackTrace();
        }
       
        return list;
    }
}