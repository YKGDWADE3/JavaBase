package cn.school.thoughtworks;

import java.util.List;

public class PracticeUtils {
    public static boolean listVaild(List list) {
        return (list != null && list.size() > 0);
    }

    public static String getItemFromString(String string){
        if (string != null && !string.isEmpty()) {
            int index = string.length();
            if (string.contains("-")){
                index = string.indexOf("-");
            } else if (string.contains(":")) {
                index = string.indexOf(":");
            } else if (string.contains("[")) {
                index = string.indexOf("[");
            }
            return string.substring(0, index);
        }
        return null;
    }

    public static int getNumberFromString(String string) {
        if (string != null && !string.isEmpty()) {
            int index;
            if (string.contains("-")){
                index = string.indexOf("-");
                return Integer.parseInt(string.substring(index+1, string.length()));
            } else if (string.contains(":")) {
                index = string.indexOf(":");
                return Integer.parseInt(string.substring(index+1, string.length()));
            } else if (string.contains("[")) {
                index = string.indexOf("[");
                int end = string.indexOf("]");
                return Integer.parseInt(string.substring(index+1, end));
            }
            return 1;
        }
        return 0;
    }
}
