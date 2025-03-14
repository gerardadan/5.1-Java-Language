package org.exercice1;

import org.utils.FileUtils;
import org.utils.SortOrder;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Main {
    static final String resourcesPath = "/src/main/resources";

    public static void main(String[] args) {
        readAllFilesFromDir(FileUtils.getDirPath(resourcesPath), SortOrder.ASC);
    }

    public static void readAllFilesFromDir(String dirName, SortOrder sortOrder) {
        List<File> files = new java.util.ArrayList<>(List.of(FileUtils.getAllFilesFromDir(dirName)));
        Collections.sort(files);
        if (sortOrder == SortOrder.DESC) {
            files.sort(Collections.reverseOrder());
        }
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

}