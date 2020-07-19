package cn.mowenqc.tool.use.apache.runtime;

import org.junit.Test;

public class RuntimeInfo {


    @Test
    public void testRuntime(){
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        int availableProcessors = runtime.availableProcessors();
        System.out.println("totalMemory =" + totalMemory);
        System.out.println("freeMemory =" + freeMemory);
        System.out.println("maxMemory =" + maxMemory);
        System.out.println("availableProcessors =" + availableProcessors);
    }
}
