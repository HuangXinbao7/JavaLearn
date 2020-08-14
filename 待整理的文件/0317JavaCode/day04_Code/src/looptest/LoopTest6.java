package looptest;

public class LoopTest6 {

    public static void main(String[] args){

        /*for 循环：
        for (初始化语句A; 循环条件B; 迭代语句C){
            循环体D;
        }
        // 迭代语句是每次循环的开始
        */
        int result = 0;

        for (int i = 1; i <= 5; i++){   // i是在for中声明，隶属于for循环
            result += i;
        }
        System.out.println("result: " + result);
        //System.out.println("i: " + i);    不允许访问for中的局部变量
    }
}
