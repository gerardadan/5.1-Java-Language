package org.ex3;

import org.utils.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = FileUtils.getAbsoluteFilePath(FileUtils.getProjectPath() + "/src/main/resources");
        if (args.length > 0) {
            try {
                path = FileUtils.getAbsoluteFilePath(FileUtils.getAbsoluteFilePath(FileUtils.getProjectPath() + args[0]));
            } catch (Exception e) {
                new Print("Path don't exist");
            }
        }

        writeFileList(FileLister.listFiles(path, SortOrder.ASC), "src/main/resources/resultEx03.txt");
    }

    public static void writeFileList(List<File> files, String outPath) {
        try {
            PrintStream printStream = new PrintStream(outPath);
            FilePrint.printFiles(files, printStream, 0);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}