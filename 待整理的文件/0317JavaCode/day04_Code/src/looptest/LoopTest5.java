package looptest;

public class LoopTest5 {

    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);
        int result = 0;
        int i = 0;

        do{
            result += i;
            i++;
        }while (i <= n);    // 循环次数 = 条件右面值 - 初始值，如果有 = ，再加1

        System.out.println("result: " + result);
        System.out.println("i: " + i);  // ？
    }
}
