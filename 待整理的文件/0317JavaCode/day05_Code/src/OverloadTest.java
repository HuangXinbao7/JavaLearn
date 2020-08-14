public class OverloadTest {

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    // 方法重载1, 形参类型不同
    public static double add(double a, double b) {
        double c = a + b;
        return c;
    }

    // 方法重载2，形参类型不同
    public static double add(int a, double b) {
        double c = a + b;
        return c;
    }

    // 方法重载3，形参顺序不同
    public static double add(double a, int b) {
        double  d = a + b;
        return d;
    }

    // 方法重载4，形参个数不同
    public static int add(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }


    public static void main(String[] args) {
        // 兼容性有：完全匹配和兼容性匹配，优先完全匹配
        // 方法在调用时究竟执行哪个，由实参来决定
        int c = add(10, 30);
        System.out.println(c);
        int d = add(10, 30, 50);
        System.out.println(d);


        // 为什么使用方法重载，为了让调用者调用方便
        System.out.println(100);
        System.out.println(10.22);
        System.out.println(false);
        System.out.println("fadfa");
        System.out.println('a');
    }
}
