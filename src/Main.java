public class Main {
    public static void main(String[] args)
    {
        MovablePoint point = new MovablePoint(1, 1, 2, 2);
        System.out.println("Point:");
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println("Up+Right ->" + point);
        MovableCircle circle = new MovableCircle(1, 1, 2, 2, 2);
        System.out.println("circle:");
        System.out.println(circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Down+Left ->" + circle);
    }
}
