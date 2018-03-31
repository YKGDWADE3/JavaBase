package cn.school.thoughtworks.section2;

import cn.school.thoughtworks.VaildUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        if (VaildUtils.listVaild(collection1)) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < collection1.size(); i++) {
                String temp = collection1.get(i);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
            return map;
        }

        return null;
    }
}
