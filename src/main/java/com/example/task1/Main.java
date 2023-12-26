package com.example.task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Oles")
                                .age(32)
                                .gender("m")
                                .grade(61)
                                .grade(100)
                                .grades(Arrays.asList(62, 63))
                                .build();
        System.out.println(user);
    }
}