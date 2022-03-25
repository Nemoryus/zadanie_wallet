package main.gui;

import main.java.CreatePerson;
import main.java.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Nemoryus 22.3.2022
 x */

public class MainFrame extends JFrame{
    private JButton findButton;
    private JTextField nameTextFile;
    private JPanel mainPanel;
    private JLabel nameLabel;
    private JTextPane zadajteJednoZMienTextPane;

    public MainFrame() throws HeadlessException {
        setContentPane(mainPanel);
        setTitle("Wallet");
        setSize(500,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameTextFile = MainFrame.this.nameTextFile.getText();
                try {
                    CreatePerson createPerson = new CreatePerson();
                    Person findPerson = createPerson.listOfPeople.stream()
                            .filter(person -> person.getName().equalsIgnoreCase(nameTextFile)).findAny().orElse(null);

                    if (findPerson == null){
                        nameLabel.setText(nameTextFile+" --> táto osoba sa nenašla");
                        ImageIcon imgThisImg = new ImageIcon(new ImageIcon("img\\osobaSaNenasla.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
                        nameLabel.setIcon(imgThisImg);
                    } else{
                        ImageIcon imgThisImg = new ImageIcon(new ImageIcon("img\\"+findPerson.getName()+".png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
                        nameLabel.setIcon(imgThisImg);
                        nameLabel.setText("<html>    "+findPerson.getName() +" má v penaženke: <br/> Najmenšiu bankovku: "+findPerson.getSmallestBanknote()+" <br/>      Najväčšiu bakovku: "+findPerson.getLargestBanknote()+"</html>");
                    };

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}
