import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyBird extends JPanel {
    int boardsWidth =360;
    int boardHeight =640;

    FlappyBird(){
        setPreferredSize(new Dimension(boardsWidth,boardHeight));
        setBackground(Color.blue);
    }
}
