package myregularexpression.myregular.test1;

/**
 * @author SUNLLM
 * @description
 * @date 2021/4/1
 */
public class Test_1 {

    public static void main(String[] args) {
        String str = "fjasd4322433kjsdf--=-jasfer3243";
        String regular = "/^[0-9]+kj$/";
        System.out.println("=====开始输出=====");
        System.out.println(str.matches(regular));
    }
}
