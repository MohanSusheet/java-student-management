package com.susheet.studentmanagement.util;

public class StudentIdGenerator {
    private static Long count = 1L;

    public Long generateId()
    {
        return count++; //return current Id and the increments by 1.
    }
}
