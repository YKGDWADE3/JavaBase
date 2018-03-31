package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeA practiceAS2 = new PracticeA();
        Map<String, Integer> map = practiceAS2.countSameElements(collectionA);
        PracticeB practiceBS3 = new PracticeB();
        return practiceBS3.createUpdatedCollection(map, object);
    }
}
