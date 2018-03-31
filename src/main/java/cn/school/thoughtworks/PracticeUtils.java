package cn.school.thoughtworks;

import java.util.List;

public class PracticeUtils {
    public static boolean listVaild(List list) {
        return (list != null && list.size() > 0);
    }

    public static String getItemFromString(String string){
        if (string != null && !string.isEmpty()) {
            if (string.contains("-")){
                int index = string.indexOf("-");
                return string.subSequence(0, index).toString();
            }
            return string;
        }
        return null;
    }

    public static int getNumberFromString(String string) {
        if (string != null && !string.isEmpty()) {
            if (string.contains("-")){
                int index = string.indexOf("-");
                return Integer.parseInt(string.subSequence(index + 1, string.length()).toString());
            }
            return 1;
        }
        return 0;
    }
}
