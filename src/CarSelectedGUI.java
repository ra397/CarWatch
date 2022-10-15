import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CarSelectedGUI extends JFrame{

    //PANELS
    private final JLabel title = new JLabel("Vehicle Overview");
    //main panels
    private final JPanel masterPanel = new JPanel();
    private final JPanel carPanel = new JPanel();
    private final JPanel carSummaryPanel = new JPanel();
    private final JPanel statusPanel = new JPanel();

    private final JLabel carType = new JLabel();
    private final JLabel carMake = new JLabel();
    private final JLabel carModel = new JLabel();
    private final JLabel carYear = new JLabel();
    private final JLabel carServiceLast = new JLabel();
    private final JLabel carServiceNext = new JLabel();

    private final JLabel statusTitle = new JLabel("Vehicle Status...");

    public CarSelectedGUI() {
        //set layout for main panel
        masterPanel.setLayout(new BoxLayout(masterPanel, BoxLayout.Y_AXIS));
        masterPanel.add(title);

        carPanel.setLayout(new BoxLayout(carPanel, BoxLayout.X_AXIS));
        //image read-in
        BufferedImage myPicture;
        try {
            myPicture = ImageIO.read(new File("img/simple-generic-car-rear-automobile-cartoon-vector.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        carPanel.add(picLabel);
        //year make model
        carYear.setText("1999");
        carMake.setText("Nissan");
        carModel.setText("Civic");
        carSummaryPanel.setLayout(new BoxLayout(carSummaryPanel, BoxLayout.Y_AXIS));
        carSummaryPanel.add(carYear);
        carSummaryPanel.add(carMake);
        carSummaryPanel.add(carModel);
        carPanel.add(carSummaryPanel);
        carSummaryPanel.setBackground(Color.lightGray);
        carPanel.setBackground(Color.lightGray);

        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.Y_AXIS));
        statusPanel.add(statusTitle);
        masterPanel.add(carPanel);
        masterPanel.add(statusPanel);

        this.add(masterPanel);
    }
}
