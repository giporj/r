import java.util.concurrent.ThreadLocalRandom;
import java.util.UUID;

public class RandomGenerator {

    // 1. 生成 [min, max] 范围内的随机整数
    public static int generateInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    // 2. 生成 [0.0, 1.0) 范围内的随机小数
    public static double generateDouble() {
        return ThreadLocalRandom.current().nextDouble();
    }

    // 3. 生成随机布尔值
    public static boolean generateBoolean() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    // 4. 生成长度可变、仅含数字和字母的随机字符串
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = ThreadLocalRandom.current().nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }

    // 5. 生成 32 位的标准 UUID（全球唯一标识符）
    public static String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println("随机整数 (1-100): " + generateInt(1, 100));
        System.out.println("随机小数: " + generateDouble());
        System.out.println("随机布尔值: " + generateBoolean());
        System.out.println("随机字符串 (8位): " + generateRandomString(8));
        System.out.println("UUID: " + generateUUID());
    }
}
