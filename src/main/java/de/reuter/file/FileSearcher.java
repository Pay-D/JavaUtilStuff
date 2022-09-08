package de.reuter.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {

    public static List<File> searchSubFoldersForFiles(final File folder,String fileEnding){
        return search(folder,new ArrayList<>(),fileEnding);
    }

    public static List<File> searchSubFoldersForFiles(final File folder){
        return search(folder,new ArrayList<>(),null);
    }

    private static List<File> search(final File folder, List<File> result, String fileEnding) {
        for (final File f : folder.listFiles()) {

            if (f.isDirectory()) {
                search(f, result, fileEnding);
            }

            if (f.isFile()) {
                if(fileEnding == null){
                    result.add(f);
                } else if (f.getName().endsWith(fileEnding)) {
                    result.add(f);
                }
            }

        }
        return result;
    }
}
