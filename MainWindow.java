import javax.swing.JFrame;


public class MainWindow extends JFrame {

    public MainWindow(String name) {
        super(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setJMenuBar(new MenuBar(this));
    }

    public void makeVisible() {
        this.setVisible(true);
    }
}
