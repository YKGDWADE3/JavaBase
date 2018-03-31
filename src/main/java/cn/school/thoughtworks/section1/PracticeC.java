package cn.school.thoughtworks.section1;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        if (collection1 != null && collection1.size() > 0 && collection2 != null && collection2.containsKey("value")) {
            List<String> temp = collection2.get("value");
            PracticeA practiceA = new PracticeA();
            return practiceA.collectSameElements(collection1, temp);
        }
        return null;
    }
}
