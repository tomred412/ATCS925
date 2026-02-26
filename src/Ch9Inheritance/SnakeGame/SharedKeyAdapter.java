package Ch9Inheritance.SnakeGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static Ch9Inheritance.SnakeGame.GamePanel.SNAKE_SIZE;

public class SharedKeyAdapter extends KeyAdapter {
    private Directional game;

    public SharedKeyAdapter(Directional game) {
        this.game = game;
    }

    public void keyPressed(KeyEvent event) {
        switch (event.getKeyCode()) {
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                game.setDirection('L');
                break;

            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                game.setDirection('R');
                break;

            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                game.setDirection('U');
                break;

            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                game.setDirection('D');
                break;
        }
    }
}