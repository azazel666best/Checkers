import javax.swing.*;

public class Checkers extends JFrame {
    public static void main(String[] args) {
        new Checkers();
    }
    private Checkers(){
        initFrame();
    }
    private void initFrame(){
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Checkers");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
