/**
 * Created by gorshkov on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Point point = new Point(0, 0);
        ThreadInc threadInc0 = new ThreadInc(point);
        ThreadInc threadInc1 = new ThreadInc(point);
        ThreadInc[] threadIncs = new ThreadInc[]{threadInc0, threadInc1};
        for (Thread thread :
                threadIncs) {
            thread.start();
        }
        for (Thread thread :
                threadIncs) {
            thread.join();
        }
        System.out.printf("point.getX() = %d    point.getY() = %d\n", point.getX(), point.getY());
        for (int i = 0; i < threadIncs.length; i++) {
            point = threadIncs[i].getPoint();
            System.out.printf("threadInc%d.getPoint().getX() = %d    threadInc%d.getPoint().getY() = %d\n",
                    i, point.getX(), i, point.getY());
        }
    }
}
