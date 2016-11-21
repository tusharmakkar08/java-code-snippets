import java.io.*;
import java.util.*;
import java.net.*;

public class random_code_1 {

    public static String lib_getExtension_0_0(String fileName){
        String extension = "";
        int i = fileName.lastIndexOf('.');
        int p = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));

        if (i > p) {
            extension = fileName.substring(i+1);
        }
        return extension;
    }

    public static String lib_getExtension_0_1(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(".") + 1);
        } catch (Exception e) {
            return "";
        }
    }

    public static String lib_getExtension_0_2(String name) {
        try {
            return name.substring(name.lastIndexOf(".") + 1);
        } catch (Exception e) {
            return "";
        }
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


    public static boolean lib_isExtension_0_1(File file, String ext) {
        String name = file.getName();
        try {
            String extension = name.substring(name.lastIndexOf(".") + 1);
            if (ext == extension) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public static String lib_removeExtension_0_1(String str) {
        return str.substring(0, str.lastIndexOf('.'));
    }

    public static String lib_separatorsToUnix_0_1(final String path) {
        if (path.indexOf("\\") == -1) {
            return path;
        }
        return path.replace("\\", "/");
    }

}