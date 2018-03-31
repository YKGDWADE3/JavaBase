package cn.school.thoughtworks;

import java.util.List;

public class VaildUtils {
    public static boolean listVaild(List list){
        return (list != null && list.size() > 0);
    }
}
