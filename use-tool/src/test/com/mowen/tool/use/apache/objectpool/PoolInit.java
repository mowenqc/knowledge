package com.mowen.tool.use.apache.objectpool;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/6/1 17:34
 * @description:
 *****/
public class PoolInit {

    private static MyObjectPool myObjectPool;

    static {
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setMaxTotal(10);
        config.setMinIdle(5);
        config.setMaxIdle(10);
        myObjectPool = new MyObjectPool(config);
    }

    public static ObjectName getObject() throws Exception {
        ObjectName objectName = myObjectPool.borrowObject();
        return objectName;
    }

    public static void returnObject(ObjectName objectName){
        myObjectPool.returnObject(objectName);
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100;i++){
            new Thread(new MyThead(i)).start();
        }
    }
}
