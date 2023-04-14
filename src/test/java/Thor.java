import javax.swing.*;
import java.awt.*;

public class Thor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Colored Text Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setText("This is an example of colored text.");
        textArea.setSelectionColor(Color.RED);
        textArea.setSelectedTextColor(Color.WHITE);
        textArea.setSelectionStart(0);
        textArea.setSelectionEnd(50);

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}

