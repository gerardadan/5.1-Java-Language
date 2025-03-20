package org.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileLister extends FileUtils {

    public static List<File> listFiles(String path, SortOrder sortOrder) {
        List<File> files = new ArrayList<>(List.of(FileUtils.getAllFilesFromDir(new File(path))));
        Collections.sort(files);
        if (sortOrder == SortOrder.DESC) {
            files.sort(Collections.reverseOrder());
        }

        return files;
    }

}
