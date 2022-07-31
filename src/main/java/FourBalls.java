import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBalls extends PApplet {
    public final int WINDOW_WIDTH = 700;
    public final int WINDOW_HEIGHT = 500;
    public final int BALL_DIAMETER = 10;
    public final int BALL_COUNT = 4;
    int startPosOfBall = 0;
    int[] speedsOfBalls = {1, 2, 3, 4};
    private List<Ball> listOfBalls = new ArrayList<>();


    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void setup() {
        for(int i=0;i<BALL_COUNT;i++) {
            Ball ball = new Ball(startPosOfBall, WINDOW_HEIGHT, BALL_DIAMETER, speedsOfBalls[i]);
            listOfBalls.add(ball);
        }
    }

    @Override
    public void draw() {
        for(Ball ball : listOfBalls) {
            ball.draw(this);
        }
    }
}
