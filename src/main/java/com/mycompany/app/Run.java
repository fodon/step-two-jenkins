package com.mycompany.app;

import org.apache.commons.io.FileUtils;

public class Run {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));
        System.out.println("Temp Dir: "+FileUtils.getTempDirectoryPath());
    }
}
