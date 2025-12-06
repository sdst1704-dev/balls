import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main extends JFrame {

    public Main(){
        super("title");
        setSize(420, 420);
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonplus = new JButton("+");
        JButton buttonminus = new JButton("-");
        JButton buttonmn = new JButton("*");
        JButton buttondel = new JButton(":");
        setLayout(null);
        JTextField textField = new JTextField(20);
        textField.setText("");
        textField.setBounds(0,0, 400, 20);
        button1.setBounds(40, 40, 50, 40);
        button2.setBounds(40, 90, 50, 40);
        button3.setBounds(40, 140, 50, 40);
        button4.setBounds(90, 40, 50, 40);
        button5.setBounds(90, 90, 50, 40);
        button6.setBounds(90, 140, 50, 40);
        button7.setBounds(140, 40, 50, 40);
        button8.setBounds(140, 90, 50, 40);
        button9.setBounds(140, 140, 50, 40);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(textField);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("1");
            }
        });
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
    }
}