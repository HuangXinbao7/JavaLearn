package looptest;

public class LoopTest8 {

    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);
        int result = 0;

        // 循环因子的变量名，必须使用i（约定俗成）
        for(int i = 0; i < n; i++){
            result += i;
        }
        System.out.println("result: " + result);

        // 不使用i也不报错，但是不推荐
        for(int j = 0; j < n; j++){
            result += j;
        }
        System.out.println("result: " + result);
    }
}
