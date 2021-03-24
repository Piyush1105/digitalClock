package com.practice;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.Date;

public class myWindow extends JFrame {

    private JLabel heading;

    private JLabel clockLabel;

    private Font font = new Font( "", Font.BOLD, 35);

    myWindow(){
        super.setTitle("My Clock");
        super.setSize( 400, 400);
        super.setLocation( 300, 50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }

    public void createGUI(){
        heading = new JLabel( "myClock");

        clockLabel = new JLabel( "Clock");

        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout( 2, 1));

        this.add(heading);
        this.add(clockLabel);
    }

    public void startClock(){
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toLocaleString();

                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }

}
