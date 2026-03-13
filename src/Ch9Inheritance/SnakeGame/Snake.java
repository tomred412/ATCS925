package Ch9Inheritance.SnakeGame;

public class Snake implements Directional {
    //fields
    private int[][] coordinates;
    private int bodyParts;
    private char direction;

    //constructors
    public Snake() {
        coordinates = new int[2][GamePanel.GAME_UNITS];
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
        return coordinates[0][index];
    }

    public int getY(int index) {
        return coordinates[1][index];
    }

    public boolean checkCollision() {
        //if the snake touches any of the edges, then return true
        if (coordinates[0][0] < 0 || coordinates[1][0] < 0) return true;
        if (coordinates[0][0] >= GamePanel.SCREEN_WIDTH || coordinates[1][0] >= GamePanel.SCREEN_HEIGHT) return true;

        //if the snake touches itself, then return true
        for (int i = 1; i < bodyParts; ++i) {
            if (coordinates[0][0] == coordinates[0][i] && coordinates[1][0] == coordinates[1][i]) return true;
        }
        return false;
    }

    public boolean isLocationOnSnake(int check_x, int check_y) {
        for (int i = 0; i < bodyParts; ++i) {
            if (check_x == coordinates[0][i] && check_y == coordinates[1][i]) return true;
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
            coordinates[0][i] = coordinates[0][i - 1];
            coordinates[1][i] = coordinates[1][i - 1];
        }

        switch (direction) {
            case 'U':
                coordinates[1][0] = coordinates[1][0] - GamePanel.SNAKE_SIZE;
                break;
            case 'D':
                coordinates[1][0] = coordinates[1][0] + GamePanel.SNAKE_SIZE;
                break;
            case 'L':
                coordinates[0][0] = coordinates[0][0] - GamePanel.SNAKE_SIZE;
                break;
            case 'R':
                coordinates[0][0] = coordinates[0][0] + GamePanel.SNAKE_SIZE;
                break;
        }

    }

    public void grow() {
        coordinates[0][bodyParts] = coordinates[0][bodyParts - 1];
        coordinates[1][bodyParts] = coordinates[1][bodyParts - 1];
        ++bodyParts;
    }
    //toString
}
