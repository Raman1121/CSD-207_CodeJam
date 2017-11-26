import javafx.scene.layout.BorderRepeat;
import sun.applet.Main;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;
import java.awt.*;

public class MainGUI implements ActionListener{

    static JFrame mainFrame;
    static JPanel panel;
    static JFrame frame1;
    static JFrame frame2;
    static JFrame frame3;
    static JFrame frame4;
    static GridLayout grid;

    static JButton button1;
    static JButton button2;
    static JButton button3;
    static JButton button4;

    public void setGUI(){

        mainFrame = new JFrame("Animal Management System");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new JPanel(new GridLayout(2,2));
        mainFrame.setSize(500,500);
        mainFrame.setVisible(true);
        mainFrame.setContentPane(panel);
        JLabel label1 = new JLabel("LION");
        JLabel label2 = new JLabel("ZEBRA");
        JLabel label3 = new JLabel("ELEPHANT");
        JLabel label4 = new JLabel("GIRAFFE");

        button1 = new JButton("LION");
        panel.add(button1);
        button1.addActionListener(this);
        button1.setBackground(Color.RED);

        button2 = new JButton("ZEBRA");
        panel.add(button2);
        button2.addActionListener(this);
        button2.setBackground(Color.GREEN);

        button3 = new JButton("ELEPHANT");
        panel.add(button3);
        button3.addActionListener(this);
        button3.setBackground(Color.GREEN);

        button4 = new JButton("GIRAFFE");
        panel.add(button4);
        button4.addActionListener(this);
        button4.setBackground(Color.GREEN);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            openWindow1();
        } if(e.getSource() == button2){
            openWindow2();
        }if(e.getSource() == button3){
            openWindow3();
        }if(e.getSource() == button4){
            openWindow4();
        }
    }

    public void openWindow1(){

        int counter = 6;
        while(counter!=0){
            playBeep();
            counter--;
        }

        frame1 = new JFrame("Lion Details");
        frame1.setDefaultCloseOperation(3);
        frame1.setSize(600,500);
        frame1.setVisible(true);

        JPanel leftPanel = new JPanel();        //Add Image in the left panel
        JLabel label = new JLabel();
        leftPanel.add(label);

        JPanel rightPanel = new JPanel();

        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("ID: 001");
        JButton button2 = new JButton("Cage Number: 1");
        JButton button3 = new JButton("Health Status: Not Healthy");
        JButton button4 = new JButton("Frequency: 6");
        JButton button5 = new JButton("Consumables: Meat");

        button1.addActionListener(this);


        button3.setBackground(Color.RED);
        button5.setBackground(Color.yellow);

        rightPanel.add(button1);
        rightPanel.add(button2);
        rightPanel.add(button3);
        rightPanel.add(button4);
        rightPanel.add(button5);

        try{
            BufferedImage giraffe = ImageIO.read(new File("/home/raman/Desktop/CSD-207_CodeJam/images/lion.jpg"));
            label.setIcon(new ImageIcon(giraffe));
        }catch (Exception e){
            e.printStackTrace();
        }

        frame1.getContentPane().add(BorderLayout.EAST, rightPanel);
        frame1.getContentPane().add(BorderLayout.WEST, leftPanel);

    }
     public void openWindow2(){

        frame1 = new JFrame(" Zebra Details");
        frame1.setDefaultCloseOperation(3);
        frame1.setSize(600,400);
        frame1.setVisible(true);


        JPanel leftPanel = new JPanel();        //Add Image in the left panel
        JLabel label = new JLabel();
        leftPanel.add(label);

        JPanel rightPanel = new JPanel();

        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("ID: 002");
        JButton button2 = new JButton("Cage Number: 2");
        JButton button3 = new JButton("Health Status: Healthy");
        JButton button4 = new JButton("Frequency: 8");
        JButton button5 = new JButton("Consumables: Grass");
        JButton button6 = new JButton("Status: Walking");

        button3.setBackground(Color.GREEN);
        button5.setBackground(Color.yellow);

        rightPanel.add(button1);
        rightPanel.add(button2);
        rightPanel.add(button3);
        rightPanel.add(button4);
        rightPanel.add(button5);

         //Add action Listeners on button
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        try{
            BufferedImage giraffe = ImageIO.read(new File("/home/raman/Desktop/CSD-207_CodeJam/images/zebra.jpg"));
            label.setIcon(new ImageIcon(giraffe));
        }catch (Exception e){
            e.printStackTrace();
        }

        frame1.getContentPane().add(BorderLayout.EAST, rightPanel);
        frame1.getContentPane().add(BorderLayout.WEST, leftPanel);
    }
     public void openWindow3(){

        int counter = 10;
        while(counter!=0){
            playBeep();
            counter--;
        }
        frame1 = new JFrame("Elephant Details");
        frame1.setDefaultCloseOperation(3);
        frame1.setSize(600,400);
        frame1.setVisible(true);

        JPanel leftPanel = new JPanel();        //Add Image in the left panel
        JLabel label = new JLabel();
        leftPanel.add(label);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("ID: 003");
        JButton button2 = new JButton("Cage Number: 3");
        JButton button3 = new JButton("Health Status: Healthy");
        JButton button4 = new JButton("Frequency: 10");
        JButton button5 = new JButton("Consumables: Grass");
        JButton button6 = new JButton("Status: Walking");

        button3.setBackground(Color.GREEN);
        button5.setBackground(Color.yellow);

        try{
            BufferedImage giraffe = ImageIO.read(new File("/home/raman/Desktop/CSD-207_CodeJam/images/elephant2.jpg"));
            label.setIcon(new ImageIcon(giraffe));
        }catch (Exception e){
            e.printStackTrace();
        }

        rightPanel.add(button1);
        rightPanel.add(button2);
        rightPanel.add(button3);
        rightPanel.add(button4);
        rightPanel.add(button5);

         //Add action Listeners on button
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        button3.setBackground(Color.GREEN);
        button5.setBackground(Color.yellow);

        frame1.getContentPane().add(BorderLayout.EAST, rightPanel);
        frame1.getContentPane().add(BorderLayout.WEST, leftPanel);
    }
     public void openWindow4(){

         int counter = 7;
        while(counter!=0){
            playBeep();
            counter--;
        }
        frame1 = new JFrame("Giraffe Details");
        frame1.setDefaultCloseOperation(3);
        frame1.setSize(800,600);
        frame1.setVisible(true);

        JPanel leftPanel = new JPanel();        //Add Image in the left panel
        JLabel label = new JLabel();
        leftPanel.add(label);       //Add label to the left panel

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("ID: 004");
        JButton button2 = new JButton("Cage Number: 4");
        JButton button3 = new JButton("Health Status: Healthy");
        JButton button4 = new JButton("Frequency: 7");
        JButton button5 = new JButton("Consumables: Grass");

        button3.setBackground(Color.GREEN);
        button5.setBackground(Color.yellow);

        //Set up the right panel
        rightPanel.add(button1);
        rightPanel.add(button2);
        rightPanel.add(button3);
        rightPanel.add(button4);
        rightPanel.add(button5);

         //Add action Listeners on button
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        //Set up the left panel
        try{
            BufferedImage giraffe = ImageIO.read(new File("/home/raman/Desktop/CSD-207_CodeJam/images/giraffe2.jpg"));
            label.setIcon(new ImageIcon(giraffe));
        }catch (Exception e){
            e.printStackTrace();
        }

        frame1.getContentPane().add(BorderLayout.EAST, rightPanel);
        frame1.getContentPane().add(BorderLayout.WEST, leftPanel);
    }

    public void playBeep(){
         Toolkit.getDefaultToolkit().beep();
    }

    public static void main(String[] args){
        MainGUI gui = new MainGUI();
        gui.setGUI();
    }

}
