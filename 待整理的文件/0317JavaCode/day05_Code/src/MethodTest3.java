/*
方法的调用顺序
* */
public class MethodTest3 {

    public static void test(int a) {
        System.out.println("test()..." + a);
    }

    // 方法参数的传递体现和返回值的实际类型 兼容性原则
    public static int add(int a, int b) {
        test(a);
        System.out.println("add()..." + a + ", " + b);
        int c = a + b;
        return c;
    }


    public static void main(String[] args) {
        System.out.println("main begin");

        short n = 10;
        byte m = 20;
        //int c = add(10, 20);
        int c = add(n, m);  // 实参类型只要能被形参类型兼容即可，不需要完全匹配
        System.out.println(c);

        System.out.println("main end");
    }
}
