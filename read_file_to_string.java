import java.io.*;
import java.util.*;
import java.net.*;

public class read_file_to_string {

    public static String lib_readFile12(InputStreamReader is) throws IOException {
        StringBuilder s = new StringBuilder();
        BufferedReader br = new BufferedReader(is);
        while (br.ready()) {
            s.append(br.readLine() + "\n");
        }
        String s2 = s.toString();
        br.close();
        return s2;
    }

    public static String lib_concat_0_2(String path1, String path2) {
        File file1 = new File(path1);
        File file2 = new File(file1, path2);
        return file2.getPath();
    }

    public static String lib_getBaseName_0_1(String input){
        String[] tokens = input.split("\\.(?=[^\\.]+$)");
        return tokens[tokens.length - 2];
    }

}