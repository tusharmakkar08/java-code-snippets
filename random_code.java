import java.io.*;
import java.util.*;
import java.net.*;

public class random_code {

    public static String lib_getExtension_0_0(String fileName){
        String extension = "";
        int i = fileName.lastIndexOf('.');
        int p = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));

        if (i > p) {
            extension = fileName.substring(i+1);
        }
        return extension;
    }

    public static int lib_indexOfExtension_0_0(final String filename) {
        if (filename == null) {
            return -1;
        }
        final int lastUnixPos = filename.lastIndexOf("/");
        final int lastWindowsPos = filename.lastIndexOf("\\");
        final int extensionPos = filename.lastIndexOf(".");
        return Math.max(lastUnixPos, lastWindowsPos) > extensionPos ? -1 : extensionPos;
    }

    public static String lib_separatorsToUnix_0_1(final String path) {
        if (path.indexOf("\\") == -1) {
            return path;
        }
        return path.replace("\\", "/");
    }

}