import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LoginPanel extends JPanel implements ActionListener {
        private final JButton login;
        private final JFrame frame;
        private final JTextField un;
        private final JTextField pw;


        public LoginPanel() throws IOException {
            new JPanel();
            setLayout(null);
            setBackground(Color.ORANGE);

            frame = new JFrame("LOGIN");
            frame.setSize(1080, 720);
            frame.setLocation(200, 150);

            JLabel heading = new JLabel("Welcome to CarWatch");
            heading.setBounds(330, 20, 700, 60);
            heading.setFont(new Font("Oswald", Font.BOLD, 40));
            heading.setForeground(new Color(30, 144, 254));
            add(heading);

            JLabel motto = new JLabel("we keep an eye on your car");
            motto.setBounds(415, 80, 700, 60);
            motto.setFont(new Font("Arial", Font.ITALIC, 20));
            motto.setForeground(new Color(30, 144, 254));
            add(motto);



            un = new JTextField();
            un.setBounds(370,220,400,50);
            un.setFont(new Font("Arial", Font.PLAIN, 30));
            add(un);

            JLabel usernameLabel = new JLabel("username:");
            usernameLabel.setBounds(255,220,150,50);
            usernameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
            add(usernameLabel);

            pw = new JPasswordField();
            pw.setBounds(370,300,400,50);
            add(pw);

            JLabel passwordLabel = new JLabel("password:");
            passwordLabel.setBounds(255,300,150,50);
            passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
            add(passwordLabel);

            login = new JButton("Log In");
            login.setBounds(450, 400, 200, 80);
            login.setBackground(Color.WHITE);
            login.setForeground(Color.BLACK);
            login.addActionListener(this);
            add(login);
            frame.getContentPane().add(this);
            frame.setVisible(true);
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == login){
                String user = un.getText();
                if(!user.equals("eplsn") || !pw.getText().equals("Chicken18")){
                    un.setBackground(Color.RED);
                    pw.setBackground(Color.RED);
                }
                else{
                    un.setBackground(Color.GREEN);
                    pw.setBackground(Color.GREEN);
                    frame.getContentPane().remove(this);
                    Profile test = new Profile(user);
                    //frame.getContentPane().add(new MyCarsPanel(profile));
                }
            }
        }


    public static void main(String[] args) throws IOException {
        new LoginPanel();
    }


}
