package looptest;

public class LoopTest4 {

    public static void main(String[] args){

        /*do while 循环
        初始化语句;
        do {
            循环体;
            迭代语句；
        }while(循环条件语句);
        */
        int result = 0;
        int i = 0;

        do{
            result += i;
            i++;
        }while (i <= 5);

        System.out.println("result: " + result);
        System.out.println("i: " + i);  // ？
    }
}
