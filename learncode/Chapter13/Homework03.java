package learncode.Chapter13;

import java.util.Locale;

/*
(1)编写java程序，输入形式为：Han shun ping 的格式，以Ping,Han.S的
格式输出。其中.S是中间单词的首字母
 */
public class Homework03 {
    public static void main(String[] args) {
        String string = "Han Shun Ping";
        formatTrans(string);
    }
    public static void formatTrans(String string){
        if(string == null){
            throw new RuntimeException("字符串为空");
        }
        String[] strings = string.split(" ");
        if(strings.length != 3){
            throw new RuntimeException("格式不正确");
        }
        String string1 = String.format("%s,%s.%s", strings[2],strings[0],
                strings[1].toUpperCase(Locale.ROOT).charAt(0));
        System.out.println(string1);
    }
}
