import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        // 1. 生成 [0, 100) 之间的随机整数
        int intNum = ThreadLocalRandom.current().nextInt(0, 100);
        System.out.println("随机整数 (0-100): " + intNum);

        // 2. 生成 0.0 到 1.0 之间的随机小数
        double doubleNum = ThreadLocalRandom.current().nextDouble();
        System.out.println("随机小数 (0.0-1.0): " + doubleNum);

        // 3. 生成指定长度的随机字母字符串 (如：8位)
        String randomStr = generateRandomString(8);
        System.out.println("随机字符串 (8位): " + randomStr);
    }

    // 生成随机字符串的方法
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(RANDOM.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
