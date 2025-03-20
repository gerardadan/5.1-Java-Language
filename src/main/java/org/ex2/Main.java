package org.ex2;

import org.utils.*;

import java.io.File;
import java.util.*;

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

        List<File> files = FileLister.listFiles(path, SortOrder.ASC);
        FilePrint.printFiles(files, System.out, 0);
    }
}