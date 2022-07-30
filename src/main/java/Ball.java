import processing.core.PApplet;
public class Ball {
    private final int radius;
    private final int speed;
    private final int positionY;
    private int positionX = 0;
    public Ball(int radius,int speed,int positionY){
        this.radius = radius;
        this.speed = speed;
        this.positionY = positionY;
    }

    public void run(PApplet pApplet){
        pApplet.ellipse(positionX,positionY,radius,radius);
        positionX+=speed;
    }
}
