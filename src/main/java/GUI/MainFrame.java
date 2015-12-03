package GUI;


import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    /**
     * Constructs a new frame that is initially invisible.
     * <p/>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @see JComponent#getDefaultLocale
     */
    public MainFrame() throws HeadlessException {
        setBounds(100, 100, 600, 400);
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
