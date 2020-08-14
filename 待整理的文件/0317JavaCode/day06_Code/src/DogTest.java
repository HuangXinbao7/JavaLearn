/*
再写一个DogTest测试类，在主方法中创建一个Dog对象，
给这个Dog对象的所有属性赋值，打印输出所有属性值，再调用它的所有方法。
*/
public class DogTest {

    public static void main(String[] args) {

        Dog d = new Dog();

        // 给属性赋值
        d.name = "八哥";
        d.age = 3;
        d.weight = 15;

        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.weight);

        d.shout();
        d.eat("骨头");
        String s = d.say();
        System.out.println(s);

        // 再创建一个新的狗对象，给它的所有属性赋值，并打印它的详细信息
        Dog d2 = new Dog();
        d2.name = "小黑";
        d2.age = 3;
        d2.weight = 10;

        d2.shout();
        System.out.println(d2.say());
    }
}
