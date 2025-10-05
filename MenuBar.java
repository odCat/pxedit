import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JFrame;


public class MenuBar extends JMenuBar {

    public MenuBar(JFrame parentFrame) {
        JMenu fileMenu = new FileMenu(parentFrame);
        this.add(fileMenu);
    }
}
