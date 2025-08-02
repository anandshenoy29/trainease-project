import java.awt.*;
import javax.swing.*;
public class Home extends JFrame
{
    Home()
    {
        setTitle("TrainEase");
        setSize(500,500);
        setLocationRelativeTo(null);

        ImageIcon ImageIcon1=new ImageIcon(ClassLoader.getSystemResource("TrainEase1.png"));
        Image Image1=ImageIcon1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon ImageIcon2=new ImageIcon(Image1);
        JLabel ImageLabel1=new JLabel(ImageIcon2);
        ImageLabel1.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        add(ImageLabel1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        try
        {
            Thread.sleep(5000);
            setVisible(false);
            new Main("");
        }
        catch(Exception e)
        {
            System.out.println("Error!");
        }
    }
    public static void main(String[] args)
    {
        new Home();
    }
}