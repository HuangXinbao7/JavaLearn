public class LoopTest6 {
    // continue 中断循环
    public static void main(String[] args) {

        // 打印100以内的所有质数
        l1: for (int i = 2; i < 100; i++){
            // 如果i不是质数，制造小意外
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue l1;
                }
            }
            System.out.println(i + "是质数");
        }
    }
}
