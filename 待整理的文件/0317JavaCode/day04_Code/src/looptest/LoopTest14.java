package looptest;

public class LoopTest14 {

    public static void main(String[] args){
        // 练习1：打印20*8的矩形
        // 练习2：打印n*8的矩形
        int n = Integer.parseInt(args[0]);

        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 8; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======================");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 8; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
