package com.atguigu.javase.abstracttest;

/**
 * 模板方法设计模式
 * 当功能内部一部分实现是确定，一部分实现是不确定的。这时可以把不确定的部分暴露出去，让子类去实现。
 * 编写一个抽象父类，父类提供了多个子类的通用方法，并把一个或多个方法留给其子类实现，就是一种模板模式。
 */
abstract class Template {

    public final void getTime() {   // 这是固定的
        long start = System.currentTimeMillis();    // 当前时间的毫秒. 这是相对时间, 以 1970-01-01:00:00:00.000
        code();
        long end = System.currentTimeMillis();
        System.out.println("执行时间是：" + (end - start));
    }
    public abstract void code();    // 抽象方法，给子类去实现
}

class SubTemplate extends Template {
    // 对抽象方法的重写
    @Override
    public void code() {
        for(int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
    }
}

class SubTemplate2 extends Template {

    @Override
    public void code() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}


public class TemplateTest {

    public static void main(String[] args) {

        Template t = new SubTemplate();     // 多态
        t.getTime();

        //SubTemplate s = new SubTemplate();
        //s.code();
        //s.getTime();
    }
}