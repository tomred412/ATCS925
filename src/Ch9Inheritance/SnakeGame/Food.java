package Ch9Inheritance.SnakeGame;

import java.util.Random;

import static Ch9Inheritance.SnakeGame.GamePanel.*;

public class Food {
    private int x, y;
    private Random random;

    public Food() {
        random = new Random();
        respawn();
    }

    public void respawn() {
        x = random.nextInt(SCREEN_WIDTH / SNAKE_SIZE) * SNAKE_SIZE;
        y = random.nextInt(SCREEN_HEIGHT / SNAKE_SIZE) * SNAKE_SIZE;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}
