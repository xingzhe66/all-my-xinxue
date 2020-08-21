package com.example.lam.mylambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sir
 * 22:15
 * 境由心生,事在人为
 */
public class MainClass {

    public static void main(String[] args) {

        // 1.无参无返回值
        NoArgsNoReturn no = ()->System.out.println("无参无返回值");
        no.noArgsNoReturn();
        // 2.有参数，有返回值.在使用处直接实现函数式接口中的方法，然后直接调用
        ArgsAndReturn andReturn = (a,b)->a+b;
        // 这种写法和上面的写法一样，可以省去 return
        ArgsAndReturn andReturn2 = (a,b)->{return a+b;};
        int add = andReturn.add(10, 12);
        System.out.println(add);
        // 3.List 集合排序用法
        List<CupClas> list = new ArrayList<>();
        list.add(new CupClas("水杯",2));
        list.add(new CupClas("茶杯",4));
        list.add(new CupClas("儿童杯",9));
        list.add(new CupClas("咖啡杯",3));
        list.add(new CupClas("专用杯",7));
        list.add(new CupClas("大人杯",6));
        list.sort((t1,t2)->t1.getNum()-t2.getNum());
        // 这可以有 return
        //list.sort((t1,t2)->{return t1.getNum()-t2.getNum();});
        // 4.方法引用 只需要寫方法名，不需要寫入參，但是入參必須要和接口中保持一致
        ArgsAndReturn args1 = MainClass::add2;
        args1.add(12,12);

    }

    public static int add2(int a,int b){
        return a + b;
    }
}
