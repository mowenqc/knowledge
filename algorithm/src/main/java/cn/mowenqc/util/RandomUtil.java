package cn.mowenqc.util;

import java.util.Random;

/**
 * @description: knowledge_parent
 * @author: mowenqc
 * @createTime: 2020/7/17 14:42
 */
public class RandomUtil {

    public static int randomInt(int seed, int field) {
        Random random = new Random(seed);
        return random.nextInt(field);
    }


    public static void main(String[] args) {
        int[] data = new int[10];
        for (int i = 1; i <= 10; i++) {
            data[i - 1] = randomInt(i, 100);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int datum : data) {
            if (stringBuilder.toString().length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(datum);
        }
        System.out.println(stringBuilder.toString());
    }
}
