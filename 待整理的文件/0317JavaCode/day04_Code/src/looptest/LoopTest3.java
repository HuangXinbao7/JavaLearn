package looptest;

public class LoopTest3 {
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);
        int result = 0;
        int i = 0;          // 循环因子通常是从0开始
        while(i < n){       // 如果初始值是0，比较中没有=，则它的循环次数就一目了然，实际写循环时必须这样写
            result += 1;
            i++;
        }
        System.out.println("result: " + result);
        System.out.println("i: " + i);  // ？
    }
}
