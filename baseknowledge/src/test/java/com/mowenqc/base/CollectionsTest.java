package com.mowenqc.base;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/5/28 16:31
 * @description:
 *****/
public class CollectionsTest {

    @Test
    public void testCollections(){
        List<String> objects = Lists.newArrayList();
        Collections.addAll(objects,"hello","world","!");
        Collections.shuffle(objects);
        Collections.reverse(objects);
        Collections.sort(objects);
        System.out.println(objects);

    }
}
