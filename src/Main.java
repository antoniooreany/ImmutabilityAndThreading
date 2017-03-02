/**
 * Created by User on 01.03.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Point point = new Point(0, 0);
        ThreadInc threadInc0 = new ThreadInc(point);
        ThreadInc threadInc1 = new ThreadInc(point);
        threadInc0.start();
        threadInc1.start();
        threadInc0.join();
        threadInc1.join();
        System.out.println("point.x = " + point.getX() + "     point.y = " + point.getY());
        System.out.println("threadInc0.point.getX() = " + threadInc0.point.getX() + "     threadInc0.point.getX() = " + threadInc0.point.getY());
        System.out.println("threadInc1.point.getX() = " + threadInc1.point.getX() + "     threadInc1.point.getX() = " + threadInc1.point.getY());
        System.out.println("threadInc0.getResult().getX() = " + threadInc0.getResult().getX() + "     threadInc0.getResult().getY() = " + threadInc0.getResult().getY());
        System.out.println("threadInc1.getResult().getX() = " + threadInc1.getResult().getX() + "     threadInc1.getResult().getY() = " + threadInc1.getResult().getY());
        Point resultPoint = new Point(threadInc0.getResult().getX() + threadInc1.getResult().getX(),
                threadInc0.getResult().getY() + threadInc1.getResult().getY());
        System.out.println("resultPoint.getX() = " + resultPoint.getX() + "    resultPoint.getY() = " + resultPoint.getY());
    }
}
