package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.PracticeUtils;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        if (collectionA != null && collectionA.size() > 0 && object.containsKey("value")){
            List<String> list = object.get("value");
            if (PracticeUtils.listVaild(list)) {
                for (int i = 0; i < list.size(); i++) {
                    String temp = list.get(i);
                    if (collectionA.containsKey(temp)){
                        int number = collectionA.get(temp) / 3;
                        collectionA.put(temp, collectionA.get(temp) -number);
                    }

                }
                return collectionA;

            }
        }
        return null;
    }
}
