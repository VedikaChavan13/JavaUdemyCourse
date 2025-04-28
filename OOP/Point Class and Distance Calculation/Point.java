public class Point {

    private int x;
    private int y;

    // No-arg constructor
    public Point() {
    }

    // Constructor with x and y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Distance to (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Distance to (x,y)
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    // Distance to another Point
    public double distance(Point second) {
        return Math.sqrt((this.x - second.getX()) * (this.x - second.getX()) + (this.y - second.getY()) * (this.y - second.getY()));
    }
}
