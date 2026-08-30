package com.susheet.studentmanagement.model;

public final class AppConstants {

    // Prevent instantiation
    private AppConstants() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    //Validation constants for Student Entity
    public static final int MIN_NAME_LEN = 2;
    public static final int MAX_NAME_LEN = 50;
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 60;
    public static final double MIN_CGPA = 0;
    public static final double MAX_CGPA = 10;
}
