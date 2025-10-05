import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFrame;


public class FileMenu extends JMenu {

    JFrame parentFrame;

    public FileMenu(JFrame parentFrame) {
        super("File");
        this.parentFrame = parentFrame;
        this.setMnemonic('F');

        JMenuItem exit = new JMenuItem("Exit");
        exit.setMnemonic('X');
        exit.addActionListener(e -> parentFrame.dispose());

        this.add(exit);
    }
}
