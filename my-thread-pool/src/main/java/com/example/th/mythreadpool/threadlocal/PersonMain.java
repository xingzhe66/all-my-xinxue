package com.example.th.mythreadpool.threadlocal;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/7/4
 * @return
 **/
public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person();

        // 当前两线程同时修改了person的值，如果不使用ThreadLocal,name值就是第二次修改的值，
        new Thread(new Runnable() {
            @Override
            public void run() {
                person.setName("线程1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("线程1输出："+person.getName());
            }

        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                person.setName("线程2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("线程2输出："+person.getName());
            }
        }).start();

    }

}
