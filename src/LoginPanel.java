import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Login extends  {
        /**
         * button to start quiz
         */
        JButton start;
        /**
         * existing JFrame
         */
        JFrame frame;
        /**
         * new panel that will be added to frame
         */
        JPanel panel;

        /**
         * creates a JFrame and adds a main menu panel to it
         * where quiz taker can start quiz
         */
        public Login() {
            panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.ORANGE);

            frame = new JFrame("A02_QuizGUI");
            frame.setSize(750, 550);
            frame.setLocation(350, 100);

            JLabel heading = new JLabel("Welcome to Eli's Crazy Quiz");
            heading.setBounds(100, 20, 700, 60);
            heading.setFont(new Font("Oswald", Font.BOLD, 40));
            heading.setForeground(new Color(30, 144, 254));
            panel.add(heading);

            JLabel menu = new JLabel();
            menu.setBounds(160, 60, 700, 350);
            menu.setFont(new Font("Arial", Font.PLAIN, 20));
            menu.setText(
                    "<html>"+
                            "1. NO CHEATING! WE ARE WATCHING..." + "<br><br>" +
                            "2. THIS QUIZ IS WORTH 95% OF YOUR FINAL GRADE" + "<br><br>" +
                            "3. THIS QUIZ IS NOT FOR THE FAINT OF HEART" + "<br><br>" +
                            "4. GOOD LUCK" + "<br><br>" +
                            "<html>"
            );
            panel.add(menu);

            start = new JButton("START QUIZ");
            start.setBounds(275, 380, 200, 80);
            start.setBackground(Color.WHITE);
            start.setForeground(Color.BLACK);
            start.addActionListener(this);
            panel.add(start);

            frame.getContentPane().add(panel);
            frame.setVisible(true);
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == start){
                frame.getContentPane().remove(panel);
                new MultipleChoice(frame);
            }
        }




}
