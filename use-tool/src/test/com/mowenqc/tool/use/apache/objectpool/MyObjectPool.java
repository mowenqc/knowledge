package com.mowenqc.tool.use.apache.objectpool;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/1 17:30
 * @description:
 *****/
public class MyObjectPool extends GenericObjectPool<ObjectName> {
    public MyObjectPool(GenericObjectPoolConfig genericObjectPoolConfig) {
        super(new ObjectPoolFactory(), genericObjectPoolConfig);
    }
}
