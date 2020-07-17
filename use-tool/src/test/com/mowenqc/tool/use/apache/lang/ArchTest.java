package com.mowenqc.tool.use.apache.lang;

import org.apache.commons.lang3.ArchUtils;
import org.junit.Test;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/2 14:08
 * @description:
 *****/
public class ArchTest {

    @Test
    public void testArch(){
        String label = ArchUtils.getProcessor().getArch().getLabel();
        System.out.println(label);

        String name = ArchUtils.getProcessor().getType().name();
        System.out.println(name);

        boolean x86 = ArchUtils.getProcessor().isX86();
        System.out.println(x86);
    }
}
