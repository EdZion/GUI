import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class GUI {
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton Save;
    private JButton Openfile;
    private JButton menuButton;
}
    public GUI() {
        Openfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent)  {
                String fil;
                BufferedReader instrom  = new BufferedReader(new FileReader("fil"));

                while (true){
                    String rad = instrom.readLine();
                    if(rad == null)
                        break;
                }
                textArea1.append(fil);
            });

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


