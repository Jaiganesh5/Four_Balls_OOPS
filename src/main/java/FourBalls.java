import processing.core.PApplet;

import java.util.ArrayList;

public class FourBalls extends PApplet {


    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;
    public static final int radius = 10;
    public static final int noOfBalls = 4;
    public ArrayList<Ball> balls = new ArrayList<>();
    public static void main(String[] args){ PApplet.main("FourBalls",args); }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for(int i=1;i<=noOfBalls;i++){
            Ball ball = new Ball(radius,i,HEIGHT*i/5);
            balls.add(ball);
        }
    }

    @Override
    public void draw() {
        for(Ball ball : balls){
            ball.run(this);
        }

    }
}
