package Ch9Inheritance.SnakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener, Restartable {
    //screen settings
    public static final int SCREEN_WIDTH = 600;
    public static final int SCREEN_HEIGHT = 600;

    public static final int SNAKE_SIZE = 25; //Snake's head is going to be a 25-pixel square
    public static final int GAME_UNITS = (SCREEN_HEIGHT * SCREEN_WIDTH) / (SNAKE_SIZE * SNAKE_SIZE);
    public static final int DELAY = 75; //delay to render the graphics (use to control the speed)


    //V2
    private Snake snake;
    private boolean running;
    private Timer timer;
    private int applesEaten;
    private Food food;
    private SharedKeyAdapter movementAdapter;

    public GamePanel() {
        //set the size of the panel
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        setFocusable(true);

        timer = new Timer(DELAY, this);
        timer.start();

        addKeyListener(new RestartKeyAdapter(this));
        initializeGame();
    }

    public void initializeGame() {
        snake = new Snake(); //instantiate a new Snake
        applesEaten = 0;
        food = new Food();
        running = true;

        //reset keys
        if (movementAdapter != null) {
            removeKeyListener(movementAdapter);
        }
        movementAdapter = new SharedKeyAdapter(snake);
        addKeyListener(movementAdapter);

        timer.start();
        repaint();
    }

    public void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        draw(pen);
    }

    public void draw(Graphics pen) {
        if (running) {
            pen.setColor(Color.red);
            pen.fillOval(food.getX(), food.getY(), SNAKE_SIZE, SNAKE_SIZE);

            String score = "Score: " + applesEaten;
            pen.setColor(Color.red);
            pen.setFont(new Font("Times New Roman", Font.BOLD, 25));
            FontMetrics metrics = getFontMetrics(pen.getFont());
            pen.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth(score)) / 2, 25);

            for (int i = 0; i < snake.getBodyParts(); ++i) {
                if (i == 0) {
                    pen.setColor(new Color(42, 166, 0));
                    pen.fillRect(snake.getX(i), snake.getY(i), SNAKE_SIZE, SNAKE_SIZE);
                } else {
                    pen.setColor(new Color(0, 255, 41));
                    pen.fillRect(snake.getX(i), snake.getY(i), SNAKE_SIZE, SNAKE_SIZE);
                }
            }
        } else {
            gameOver(pen);
        }
    }

    public void restartGame() {
        initializeGame();
    }

    public void gameOver(Graphics pen) {
        String gameOver = "Game Over";
        pen.setColor(Color.red);
        pen.setFont(new Font("Times New Roman", Font.BOLD, 50));
        FontMetrics metrics = getFontMetrics(pen.getFont());
        pen.drawString("Game Over", (SCREEN_WIDTH - metrics.stringWidth(gameOver)) / 2, SCREEN_HEIGHT / 2 - 50);

        String score = "Score: " + applesEaten;
        pen.setColor(Color.white);
        pen.setFont((new Font("Times New Roman", Font.PLAIN, 25)));
        FontMetrics metrics1 = getFontMetrics(pen.getFont());
        pen.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics1.stringWidth(score)) / 2, (SCREEN_HEIGHT / 2));

        String restart = "Press space to restart.";
        pen.setColor(Color.white);
        pen.setFont((new Font("Times New Roman", Font.PLAIN, 25)));
        FontMetrics metrics2 = getFontMetrics(pen.getFont());
        pen.drawString("Press space to restart.", (SCREEN_WIDTH - metrics2.stringWidth(restart)) / 2, (SCREEN_HEIGHT / 2) + 50);
    }

    public void actionPerformed(ActionEvent event) {
        if (running) {
            snake.move();
            checkFood();
            if (snake.checkCollision()) {
                running = false;
                timer.stop();
            }
        }
        repaint();
    }

    private void checkFood() {
        //check if the head of the snake is making contact with the food
        //Step 1: if the x and y coordinates in their respective snake array at index 0 is the same as the x and y coordinates of the food
        if (snake.getX(0) == food.getX() && snake.getY(0) == food.getY()) {
            //Step 2: grow the snake by 1 body part
            snake.grow();
            //Step 3: increment applesEaten by 1
            ++applesEaten;
            //Step 4: respawn the food
            food.respawn();
        }
    }

    public void placeFoodSafe() {
        do {
            food.respawn();
        } while (snake.isLocationOnSnake(food.getX(), food.getY()));
    }

    public boolean isGameRunning() {
        return running;
    }
    /*
    //create an inner class to control the snake's movement
    public class SnakeKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent event) {
            switch (event.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    x -= SNAKE_SIZE;
                    break;

                case KeyEvent.VK_RIGHT:
                    x += SNAKE_SIZE;
                    break;

                case KeyEvent.VK_UP:
                    y -= SNAKE_SIZE;
                    break;

                case KeyEvent.VK_DOWN:
                    y += SNAKE_SIZE;
                    break;
            }
            repaint();
        }
    }
    */
}
