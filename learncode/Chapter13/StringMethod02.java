package learncode.Chapter13;

public class StringMethod02 {
    public static void main(String[] args) {
        //1.toUpperCase转换为大写
        String str1 = "hellosHSA";
        System.out.println("1.: "+str1.toUpperCase());
        //2.toLowerCase转换为小写
        System.out.println("2.: "+str1.toLowerCase());
        String str2 ="saldj";
        String str3 = "jjj";
        //3.contact拼接字符串
        String str4 = str1.concat(str2).concat(str3).concat(str2);
        System.out.println("3. "+str4);
        String str5 ="宝玉 宝钗 宝钗 宝玉";
        //4.replace()方法执行后返回的结果才是替换的
        //对原字符串无影响
        System.out.println("4. "+str5.replace("宝钗","林黛玉"));
        System.out.println("4. "+str5);
        //5.split分割字符串，对于某些分割字符，我们需要 转义比如 | \\等
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        // 1. 以 , 为标准对 poem 进行分割 , 返回一个数组
        // 2. 在对字符串进行分割时，如果有特殊字符，需要加入 转义符
        String[] split = poem.split(",");
        System.out.println("分割后的字符串1");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //特殊字符串需要加入转义字符\\
        poem = "E:\\aaa\\bbb";
        split = poem.split("\\\\");
        System.out.println("分割后的字符串2");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //6.toCharArray转换为字符组
        String str6 = "hello";
        char [] char1 = str6.toCharArray();
        System.out.print("6: "+"\t");
        for (int i = 0; i < char1.length; i++) {
            System.out.print(char1[i]+"\t");
        }
        // 7.compareTo 比较两个字符串的大小，如果前者大，
        // 则返回正数，后者大，则返回负数，如果相等，返回 0
        // (1) 如果长度相同，并且每个字符也相同，就返回 0
        // (2) 如果长度相同或者不相同，但是在进行比较时，可以区分大小
        // 就返回
        // if (c1 != c2) {
        // return c1 - c2; //
        // }
        // (3) 如果前面的部分都相同，就返回 str1.len - str2.len
        String a = "jcck";// len = 3
        String b = "jack";// len = 4
        System.out.println();
        System.out.println("7: "+a.compareTo(b)); // 返回值是 'c' - 'a' = 2 的值
        // 8.format 格式字符串
        /* 占位符有:
        * %s 字符串 %c 字符 %d 整型 %.2f 浮点型
        **/
        String name = "john";
        int age = 10;
        double score = 56.857;
        char gender = '男';
        //将所有的信息都拼接在一个字符串
        //第一种方式
        String str11 ="我的姓名是" + name + "年龄是" + age + ",成绩是" + score + "性别是" + gender + "。希望大家喜欢我！";
        //第二种方式
        String formatStr11 = "我的姓名是%s 年龄是%d，成绩是%.2f 性别是%c.希望大家喜欢我！";
        System.out.println(String.format(formatStr11, name,age,score,gender));
    }
}
