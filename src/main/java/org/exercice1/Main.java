package org.exercice1;

import org.utils.FileUtils;
import org.utils.SortOrder;

import java.io.File;

public class Main {
    static final String resourcesPath = "/src/main/resources";
    public static void main(String[] args) {
        readAllFilesFromDir(FileUtils.getDirPath(resourcesPath));
    }

    public static void readAllFilesFromDir(String dirName){
        File[] files = FileUtils.getAllFilesFromDir(FileUtils.getDirPath(resourcesPath));
        FileUtils.sortFiles(files, SortOrder.DESC);
        for(String file : FileUtils.convertFilesToArray(files)){
            System.out.println(file);
        }
    }

}