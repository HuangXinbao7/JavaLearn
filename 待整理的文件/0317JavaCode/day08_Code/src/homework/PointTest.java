package homework;

public class PointTest {

    public static void main(String[] args){

        Point p = new Point(3,4);
        System.out.println(p.say());

        System.out.println("点p到原点的距离的平方：" + p.getDistance());
    }
}
