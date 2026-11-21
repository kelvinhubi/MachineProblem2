package org.example.Service.impl;

import org.example.Service.InputValidator;

import java.util.regex.Pattern;

public class PlateNumberValidator implements InputValidator {
    private static final Pattern CAR_PLATE_PATTERN = Pattern.compile("^[A-Z]{3}\\d{3,4}$"); // ABC123 or ABC1234
    private static final Pattern MOTORCYCLE_PLATE_PATTERN = Pattern.compile("^[A-Z]{2}\\d{5}$"); // AB12345
    private static final Pattern MV_FILE_PATTERN = Pattern.compile("^\\d{15}$"); // 15-digit temporary number

    public boolean isFormatValid(String plateNo) {
        if (plateNo == null) {
            return false;
        }

        // 1. Sanitize input: Remove all whitespaces, hyphens, and convert to uppercase
        String cleaned = plateNo.replaceAll("[\\s-]", "").toUpperCase();

        // 2. Match against patterns
        if (CAR_PLATE_PATTERN.matcher(cleaned).matches()) {
            return true;
        }

        if (MOTORCYCLE_PLATE_PATTERN.matcher(cleaned).matches()) {
            return true;
        }

        if (MV_FILE_PATTERN.matcher(cleaned).matches()) {
            return true;
        }

        return false;
    }
}
