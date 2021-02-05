package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class InputUtils {
    private static final Logger LOGGER = LogManager.getLogger(InputUtils.class);

    public static int inputIntValue(String massage) {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info(massage);

        return scanner.nextInt();
    }

    public static String inputStringValue(String massage) {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info(massage);

        return scanner.nextLine();
    }
}
