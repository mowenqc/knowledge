package com.mowenqc.tool.use.apache.objectpool;

/****
 * @project: knowledge_parent
 * @author: mowenqc
 * @create-time: 2020/6/1 17:39
 * @description:
 *****/
public class MyThead implements Runnable {
    private int i;
    public MyThead(){}
    public MyThead(int i){
        this.i = i;
    }
    @Override
    public void run() {
        try {
            ObjectName object = PoolInit.getObject();
            object.print();
            object.print("hi " + i);
            PoolInit.returnObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
