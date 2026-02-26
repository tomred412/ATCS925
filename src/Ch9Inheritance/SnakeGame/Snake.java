package Ch9Inheritance.SnakeGame;

public class Snake implements Directional {
    //fields
    private int[] x;
    private int[] y;
    private int bodyParts;
    private char direction;

    //constructors
    public Snake() {
        x = new int[GamePanel.GAME_UNITS];
        y = new int[GamePanel.GAME_UNITS];

        bodyParts = 3;
        direction = 'R';
    }

    //getters
    public int getBodyParts() {
        return bodyParts;
    }

    public char getDirection() {
        return direction;
    }

    public int getX(int index) {
        return x[index];
    }

    public int getY(int index) {
        return y[index];
    }

    public boolean checkCollision() {
        //if the snake touches any of the edges, then return true
        if (x[0] < 0 || y[0] < 0) return true;
        if (x[0] >= GamePanel.SCREEN_WIDTH || y[0] >= GamePanel.SCREEN_HEIGHT) return true;

        //if the snake touches itself, then return true
        for (int i = 1; i < bodyParts; ++i) {
            if (x[0] == x[i] && y[0] == y[i]) return true;
        }
        return false;
    }

    public boolean isLocationOnSnake(int check_x, int check_y) {
        for (int i = 0; i < bodyParts; ++i) {
            if (check_x == x[i] && check_y == y[i]) return true;
        }
        return false;
    }

    //setters
    public void setDirection(char newDirection) {
        switch (newDirection) {
            case 'L':
                if (direction != 'R') direction = 'L';
                break;
            case 'R':
                if (direction != 'L') direction = 'R';
                break;
            case 'U':
                if (direction != 'D') direction = 'U';
                break;
            case 'D':
                if (direction != 'U') direction = 'D';
                break;
        }
    }

    public void move() { //makes the entire snake move
        for (int i = bodyParts - 1; i > 0; --i) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U':
                y[0] = y[0] - GamePanel.SNAKE_SIZE;
                break;
            case 'D':
                y[0] = y[0] + GamePanel.SNAKE_SIZE;
                break;
            case 'L':
                x[0] = x[0] - GamePanel.SNAKE_SIZE;
                break;
            case 'R':
                x[0] = x[0] + GamePanel.SNAKE_SIZE;
                break;
        }

    }

    public void grow() {
        ++bodyParts;
    }
    //toString
}
