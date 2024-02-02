package jh.test.cloud;

import java.util.Random;

public class RandomNumberGenerator {
    // 创建一个Random实例
    private static final Random random = new Random();

    /**
     * 生成指定范围[min, max]之间的随机整数
     * @param min 包含的最小值
     * @param max 不包含的最大值
     * @return 返回[min, max)区间内的随机整数
     */
    public static int getRandomInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        // 测试生成0到10之间的随机数
        for (int i = 0; i < 10; i++) {
            int randomNumber = getRandomInt(0, 9);
            System.out.println("生成的随机数：" + randomNumber);
        }
    }
}
