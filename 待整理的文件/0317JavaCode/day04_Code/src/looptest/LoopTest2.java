package looptest;

public class LoopTest2 {
    public static void main(String[] args){

        int result = 0;
        int i = 180;        // 初始化语句，i在循环中的作用循环因子
        while(i <= 300){    // 循环条件，循环次数 = 条件右面的值 - 初始值，如果有=，再加1
            result += 1;    // 循环体，被执行了多少次？
            i++;            // 迭代
        }
        System.out.println("result: " + result);
        System.out.println("i: " + i);  // 此时i的值是？
    }
}
