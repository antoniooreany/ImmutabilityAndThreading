/**
 * Created by gorshkov on 02.03.2017.
 */
class ThreadInc extends Thread {
    private Point point;

    ThreadInc(Point point) {
        this.point = point;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            point = new Point(point.getX() + 1, point.getY() + 1);
        }
    }

    public Point getPoint() {
        return point;
    }
}
