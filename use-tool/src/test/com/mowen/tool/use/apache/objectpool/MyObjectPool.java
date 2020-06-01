package com.mowen.tool.use.apache.objectpool;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/6/1 17:30
 * @description:
 *****/
public class MyObjectPool extends GenericObjectPool<ObjectName> {
    public MyObjectPool(GenericObjectPoolConfig genericObjectPoolConfig) {
        super(new ObjectPoolFactory(), genericObjectPoolConfig);
    }
}
