public class LoopTest7 {
    public static void main(String[] args) {

        // 打印100以内所有能被13整除的数
        l1: for (int i = 13; i < 100; i++){
            // 如果i不能被13整除，制造小意外
            if (i % 13 != 0) {
                continue l1;
            }
            System.out.println(i + "能被13整除");
        }
    }
}
