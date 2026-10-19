package CALCULATOR;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cviews extends JFrame {

    JLabel a, b, result;
    JTextField txta, txtb, txtresult;
    JButton add, sub, mul, div;

    public Cviews() {

        setTitle("Calculator");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a = new JLabel("Enter A");
        a.setBounds(50, 30, 100, 30);
        add(a);

        txta = new JTextField();
        txta.setBounds(150, 30, 150, 30);
        add(txta);

        b = new JLabel("Enter B");
        b.setBounds(50, 80, 100, 30);
        add(b);

        txtb = new JTextField();
        txtb.setBounds(150, 80, 150, 30);
        add(txtb);

        add = new JButton("+");
        add.setBounds(30, 140, 70, 40);
        add(add);

        sub = new JButton("-");
        sub.setBounds(110, 140, 70, 40);
        add(sub);

        mul = new JButton("*");
        mul.setBounds(190, 140, 70, 40);
        add(mul);

        div = new JButton("/");
        div.setBounds(270, 140, 70, 40);
        add(div);

        result = new JLabel("Result");
        result.setBounds(50, 220, 100, 30);
        add(result);

        txtresult = new JTextField();
        txtresult.setBounds(150, 220, 150, 30);
        txtresult.setEditable(false);
        add(txtresult);
    }
}