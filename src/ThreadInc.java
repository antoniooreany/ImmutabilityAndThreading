/**
 * Created by User on 01.03.2017.
 */
class ThreadInc extends Thread {
    public Point point;

    ThreadInc(Point point) {
        this.point = point;
    }

    @Override
    public void run() {
        for (long l = 0; l < 100_000; l++) {
            point = new Point(point.getX() + 1, point.getY() + 1);
        }
    }

    public Point getResult() {
        return point;
    }
}
