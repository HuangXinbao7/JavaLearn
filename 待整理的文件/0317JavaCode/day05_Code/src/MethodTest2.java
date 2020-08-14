public class MethodTest2 {

    public static void test() {
        System.out.println("test()...");
        // 如果方法没有返回值，并且return在最后，这个return可以省略，仅表示方法体执行结束了
        return;
    }

    public static void main(String[] args) {
        System.out.println("main begin");
        // 方法调用
        // 如果方法不需要参数，则参数列表空着，凡是 () 必须要有
        // 如果方法没有返回值，不可以用变量接收它的返回值
        test();

        //System.out.println(test());   如果方法没有返回值，不可以打印方法调用！
        test();

        System.out.println("main end");
    }
}
