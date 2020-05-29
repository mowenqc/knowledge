package com.mowen.base;

import java.util.Collections;
import java.util.List;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/5/28 16:31
 * @description:
 *****/
public class CollectionsTest {

    public void testCollections(){
        List<String> objects = Collections.emptyList();
        Collections.shuffle(objects);
        Collections.reverse(objects);
        Collections.sort(objects);
    }
}
