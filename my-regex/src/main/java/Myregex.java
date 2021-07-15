import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author SUNLLM
 * @description
 * @date 2021/6/23
 */
public class Myregex {

    public static void main(String[] args) {

        // ^ ：开头
        // 123开头的任意字符串
        Pattern p = Pattern.compile("^123.*");
        Matcher m = p.matcher("123gdfasdsaf");
        System.out.println(m.matches());

        // 是否包含了某个字符串
        Pattern p1 = Pattern.compile(".*long.*");
        Matcher m1 = p1.matcher("longljkajfkad");
        System.out.println("=========包含测试===========");
        System.out.println(m1.matches());

        Pattern p2 = Pattern.compile("[,|,]+");
        String [] str = p2.split("as|bc[fe]fs");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }

}
