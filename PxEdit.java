import javax.swing.JButton;
import javax.swing.JFrame;


class PxEdit {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("PxEdit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton exit = new JButton("Exit");
        frame.getContentPane().add(exit);
        frame.setVisible(true);
    }
}
