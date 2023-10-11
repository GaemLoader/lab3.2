public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    @Override
    public String toString(){
        return "MovableCircle{" +
                "radius =" + radius +
                ", center = " + center +'}';
    }
    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed){
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        this.center.x += 5;
        this.center.y += 2;
    }

    @Override
    public void moveDown() {
        this.center.x -= 2;
        this.center.y -= 2;
    }

    @Override
    public void moveLeft() {
        this.center.x -= 1;
        this.center.y -= 2;
    }

    @Override
    public void moveRight() {
        this.center.x += 6;
        this.center.y += 5;
    }
}

