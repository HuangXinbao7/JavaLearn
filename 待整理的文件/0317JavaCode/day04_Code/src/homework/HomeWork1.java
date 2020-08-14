package homework;

/*
第一题：
编写程序：接收三个命令行字符串并转换为整数分别存入变量num1、num2、num3, num4，
对它们进行排序(使用 if-else if-else),并且从小到大输出。
*/
public class HomeWork1 {
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        int tmp;

        // 第一遍处理1,2,3,4，得到的最大值保存在num4的位置
        if(num1 > num2) {
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        // 此时num2中保存的是1和2中的较大值
        if(num2 > num3){
            tmp = num2;
            num2 = num3;
            num3 = tmp;
        }
        // 此时num3中保存的是1,2和3中的较大者
        if(num3 > num4){
            tmp = num3;
            num3 = num4;
            num4 = tmp;
        }
        // 此时num4中保存的是1,2,3,4中的最大值

        // 第二遍处理1,2,3，得到的最大值保存在num3的位置
        if(num1 > num2){
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        if(num2 > num3){
            tmp = num2;
            num2 = num3;
            num3 = tmp;
        }
        // 此时num3中保存的值1,2,3中的最大值

        // 第三遍，最后处理num1 和 num2
        if(num1 > num2){
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        System.out.println(num1 + "," + num2 + "," + num3 + "," + num4);
    }
}
