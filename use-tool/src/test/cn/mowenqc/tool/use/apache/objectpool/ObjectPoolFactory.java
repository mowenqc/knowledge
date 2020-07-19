package cn.mowenqc.tool.use.apache.objectpool;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/1 17:00
 * @description:
 *****/
public class ObjectPoolFactory extends BasePooledObjectFactory<ObjectName> {

    @Override
    public ObjectName create() {
        return new ObjectName();
    }

    @Override
    public PooledObject wrap(ObjectName thread) {
        return new DefaultPooledObject(thread);
    }
}
