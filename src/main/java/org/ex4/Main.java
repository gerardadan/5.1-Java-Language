package org.ex4;

import org.utils.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    static final String resourcesPath = "/src/main/resources";

    public static void main(String[] args) {
        String path = FileUtils.getAbsoluteFilePath(FileUtils.getProjectPath() + "\\src\\main\\resources\\resultEx03.txt");
        if (args.length > 0) {
            try {
                path = FileUtils.getAbsoluteFilePath(args[0]);
            } catch (Exception e) {
                Print.printConsole("Path don't exist");
            }
        }
        checkInputParamFile(path);
    }

    public static void checkInputParamFile(String path) {
        if (new File(path).isFile()) {
            ReadFileFromPath(path);
        } else if (new File(path).isDirectory()) {
            List<File> files = FileLister.listFiles(path, SortOrder.ASC);
            FilePrint.printFiles(files, System.out, 0);
        } else {
            Print.printConsole("Incorrect initial input param");
        }
    }

    public static void ReadFileFromPath(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            Print.printConsole("Error reading file: " + e.getMessage());
        }
    }
}