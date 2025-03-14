package org.exercici2;

import org.utils.FileUtils;
import org.utils.SortOrder;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main {
    static final String resourcesPath = "/src/main/resources";
    static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        List<File> listFile = FileUtils.getAllFilesFromDirRecursive(new File(FileUtils.getDirPath(resourcesPath)));
        readAllFilesFromDirWithMarks(listFile, 0);
    }

    public static void readAllFilesFromDirWithMarks(List<File> files, int i) {
        Collections.sort(files);
        for (File file : files) {
            if (file.isFile()) {
                String message = file.getName() + (" - (F) - ") + formatter.format(file.lastModified());
                writeIndexMarks(i, message);
            } else if (file.isDirectory()) {
                String message = file.getName() + (" - (D) - ") + formatter.format(file.lastModified());
                writeIndexMarks(i, message);
                List<File> filesNode = new ArrayList<>(List.of(Objects.requireNonNull(file.listFiles())));
                readAllFilesFromDirWithMarks(filesNode, i + 1);
            }
        }
    }

    public static String writeIndexMarks(int index, String message) {
        String mark = "";
        for (int i = 0; i < index; i++) {
            mark += "---";
        }
        System.out.println(mark + message);

        return mark;
    }

}