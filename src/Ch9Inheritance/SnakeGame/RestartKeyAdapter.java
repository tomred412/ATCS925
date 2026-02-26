package Ch9Inheritance.SnakeGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RestartKeyAdapter extends KeyAdapter {
    private Restartable game;

    public RestartKeyAdapter(Restartable game) {
        this.game = game;
    }

    public void keyPressed(KeyEvent event) {
        if (!game.isGameRunning() && event.getKeyCode() == KeyEvent.VK_SPACE) {
            game.restartGame();
        }
    }
}
