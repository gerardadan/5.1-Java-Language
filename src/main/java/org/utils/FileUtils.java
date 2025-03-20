package org.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static String getProjectPath() throws IllegalArgumentException {
        String filePath = System.getProperty("user.dir");
        File file = new File(filePath);

        return file.getAbsolutePath();
    }

    public static String getAbsoluteFilePath(String path) throws IllegalArgumentException {
        File file = new File(path);
        if (!file.exists()) {
            throw new IllegalArgumentException("File not exist : " + path);
        }

        return file.getAbsolutePath();
    }

    public static File[] getAllFilesFromDir(File dir) {
        if (dir.exists() && dir.isDirectory()) {
            return dir.listFiles();
        } else {
            return new File[0];
        }
    }

    public static String[] convertArrayFilesToArrayString(File[] files) {
        String[] sFiles = new String[files.length];
        int i = 0;
        for (File item : files) {
            sFiles[i++] = item.getName();
        }

        return sFiles;
    }

    public static List<String> convertListFilesToListString(List<File> files) {
        List<String> listString = new ArrayList<>();
        int i = 0;
        for (File item : files) {
            listString.add(item.getName());
        }

        return listString;
    }

}