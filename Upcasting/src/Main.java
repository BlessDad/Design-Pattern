import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class Main {
    JFrame myframe;
    static JTextField text;

    public Main(){
        myframe = new JFrame();
        myframe.setTitle("예제 1!");
        myframe.setSize(400,400);
        myframe.setLocation(50,50);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gui();
        myframe.setVisible(true);


    }

    void gui() {
        text = new JTextField();
        JButton btn = new JButton("눌러봐요");
        myframe.add(text, BorderLayout.CENTER);
        myframe.add(btn, BorderLayout.EAST);
        btn.addActionListener(new al());
    }



    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();


    }
}
class al implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Main.text.setText("참 찿ㅁㅊ ㅏㅁ");
    }
}

