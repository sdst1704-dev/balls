import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main extends JFrame {

    int i;

    public Main(){
        super("title");
        setSize(600, 600);
        JButton [] btns = new JButton[10];
        for (int i=0; i<10; i++) {
            btns[i] = new JButton(String.valueOf(i));
        }
        JButton buttonplus = new JButton("+");
        JButton buttonminus = new JButton("-");
        JButton buttonmn = new JButton("*");
        JButton buttondel = new JButton(":");
        JButton buttonrav = new JButton("=");
        setLayout(null);
        JTextField textField = new JTextField(20);
        textField.setText("");
        textField.setBounds(0,0, 400, 20);
        for (int i=0; i<10; i++) {
            btns[i].setBounds(40, 50*i+50, 50, 40);
        }
        buttonplus.setBounds(190, 40, 50, 40);
        buttonminus.setBounds(190, 90, 50, 40);
        buttondel.setBounds(190, 140, 50, 40);
        buttonmn.setBounds(190, 190, 50, 40);
        buttonrav.setBounds(190, 240, 50, 40);
        for (int i=0; i<10; i++) {
            add(btns[i]);
        }
        add(buttonplus);
        add(buttonminus);
        add(buttondel);
        add(buttonmn);
        add(buttonrav);
        double x =0;
        double y =0;
        add(textField);
        for (int i = 1; i<10; i++) {
            int finalI = i;
            btns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int a = finalI;
                    textField.setText(textField.getText()+String.valueOf(a));
                }
            });
        }
        String t = textField.getText();

    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
    }
}