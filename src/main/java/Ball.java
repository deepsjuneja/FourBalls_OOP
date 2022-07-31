import processing.core.PApplet;

public class Ball {
    private float x_pos;
    private final float y_pos;
    private final float diameter;
    private final int speed;

    public Ball(int startPosForBall, int height, float ball_diameter, int ball_speed) {
        this.x_pos = startPosForBall;
        this.y_pos = (float)(height * ball_speed / 5);
        this.diameter = ball_diameter;
        this.speed = ball_speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(x_pos, y_pos, diameter, diameter);
        x_pos += speed;
    }
}
