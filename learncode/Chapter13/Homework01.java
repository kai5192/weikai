package learncode.Chapter13;

public class Homework01 {
    public static void main(String[] args) {
        String string = "abcdef";
        System.out.println(string);
        string = reverse(string, 1, 4);
        System.out.println(string);
    }

    public static String reverse(String string, int start, int end) {
        char[] chars = string.toCharArray();
        if (!(start < end && string != null && start > 0 && end <= string.length())) {
            throw new RuntimeException("参数不正确");
        }
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

}
