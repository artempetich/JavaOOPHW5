package org.example.HWMVC.model.utils;

import java.util.Scanner;

public interface Input2 {
    default String input(String line) {
        System.out.println(line);
        Scanner cs = new Scanner(System.in);
        return cs.nextLine();
    }
}
