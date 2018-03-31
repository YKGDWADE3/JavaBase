package cn.school.thoughtworks.section1;

import cn.school.thoughtworks.PracticeUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        if (PracticeUtils.listVaild(collection1) && PracticeUtils.listVaild(collection2)) {
            LinkedHashSet<String> hashSet = new LinkedHashSet<>();
            for (int i = 0; i < collection2.size(); i++) {
                hashSet.add(collection2.get(i));
            }
            LinkedHashSet<String> sameItemHashset = new LinkedHashSet<>();
            for (int i = 0; i < collection1.size(); i++) {
                if (hashSet.contains(collection1.get(i))) {
                    sameItemHashset.add(collection1.get(i));
                }
            }
            if (sameItemHashset.size() > 0) {
                List<String> result = new ArrayList<>();
                for (String string : sameItemHashset) {
                    result.add(string);
                }
                return result;
            }

        }
        return null;
    }
}
