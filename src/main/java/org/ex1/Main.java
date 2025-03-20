package org.ex1;

import org.utils.*;

import java.io.File;
import java.util.List;

public class Main {

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
        new Print(FileUtils.convertListFilesToListString(files));
    }

}