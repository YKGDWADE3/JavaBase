package cn.school.thoughtworks.section2;

import cn.school.thoughtworks.PracticeUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        if (PracticeUtils.listVaild(collection1)){
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < collection1.size(); i++) {
                String temp = PracticeUtils.getItemFromString(collection1.get(i));
                if (temp != null && !temp.isEmpty()) {
                    int number = PracticeUtils.getNumberFromString(collection1.get(i));
                    if (map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + number);
                    }else {
                        map.put(temp, number);
                    }
                }

            }
            return map;
        }
        return null;
    }
}
