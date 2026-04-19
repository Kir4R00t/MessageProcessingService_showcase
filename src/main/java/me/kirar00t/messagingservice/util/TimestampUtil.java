package me.kirar00t.messagingservice.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampUtil {
    public static String createTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return now.format(formatPattern);
    }
}
