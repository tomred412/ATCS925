package Ch9Inheritance.SnakeGame;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        //add the GamePanel inside the GameFrame
        add(new GamePanel());

        //set the title of the window
        setTitle("The Classic Game Snake Game!");

        //allow the user to close the window when the 'X' is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //prevent the user from resizing the window
        setResizable(false);

        //fit the JFrame tightly around the GamePanel
        pack();

        //make the window pop up in the middle of the screen (relative to screen size)
        setLocationRelativeTo(null);
        
        //make the window visible
        setVisible(true);
    }
}
