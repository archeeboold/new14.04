import javax.swing.*;
import java.awt.*;

public class JFrame_ {
    public static void main(String[] args) {

        Text person1 = new Text();
        person1.name = "Roman";
        person1.age = 36;

        JFrame okno = new JFrame(); //new frame
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(); //text in this frame
        textArea.setText("   My name is  "+person1.name+", and i am"+person1.age+" years old");
        textArea.setSelectionColor(Color.RED);
        textArea.setSelectedTextColor(Color.WHITE);

        textArea.setSelectionStart(15);
        textArea.setSelectionEnd(20);

        okno.getContentPane().add(textArea);//displaying text in the frame

        okno.setVisible (true);
        okno.setSize(300, 200);
        okno.setLocationRelativeTo(null);


    }
}
class Text{
    String name;
    int age;
}
