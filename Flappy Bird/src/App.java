import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 1920;
        int boardHeight = 1080;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlappyBird flappybird = new FlappyBird(); // Ensure FlappyBird is implemented
        frame.add(flappybird);
        frame.setVisible(true);
    }
}
