package cn.mowenqc.tool.use.guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.*;

public class CollectionTest {

    @Test
    public void testCollection() {
        List<String> strings1 = Arrays.asList("1", "2");
        System.out.println(strings1);
        ArrayList<Object> arrayList = Lists.newArrayList();
        LinkedList<Object> objects = Lists.newLinkedList();
        HashMap<Object, Object> objectObjectHashMap = Maps.newHashMap();
    }
}
