import javax.swing.*;
import java.awt.*;

public class Gui {
    public static void main(String[] args) {

        JFrame okno = new JFrame(); //new frame
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible (true);
        okno.setSize(300, 200);
        okno.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea(); //text in this frame
        textArea.setText("Hey Hey");

        textArea.setSelectionColor(Color.RED); //
        textArea.setSelectedTextColor(Color.WHITE);
        textArea.setSelectionStart(0);
        textArea.setSelectionEnd(3);

        okno.getContentPane().add(textArea);//displaying text in the frame
    }
}

