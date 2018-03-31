package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeB;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeB practiceBS2 = new PracticeB();
        Map<String, Integer> map = practiceBS2.countSameElements(collectionA);
        cn.school.thoughtworks.section3.PracticeB practiceBS3 = new cn.school.thoughtworks.section3.PracticeB();
        return practiceBS3.createUpdatedCollection(map, object);
    }
}
