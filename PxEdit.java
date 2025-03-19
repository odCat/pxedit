import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


class PxEdit implements ActionListener {

    private JFrame frame;

    public static void main(String[] args)
    {
        PxEdit editor = new PxEdit();
        editor.start();
    }

    private void start()
    {
        this.frame = new JFrame("PxEdit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        JButton exit = new JButton("Exit");
        exit.addActionListener(this);
        frame.getContentPane().add(exit);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        this.frame.dispose();
    }
}
