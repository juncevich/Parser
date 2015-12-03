package GUI;


import logic.Parser;
import org.jsoup.nodes.Element;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

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
    public MainFrame() throws HeadlessException, IOException {
        setBounds(100, 100, 600, 800);
        Parser parser = new Parser();
        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(parser.getCategoryList().size(),1));
        panelButtons.setPreferredSize(new Dimension(600,750));
        for (Element element : parser.getCategoryList()
             ) {
            panelButtons.add(new JButton(element.text()));

        }


        this.add(new JScrollPane(panelButtons), BorderLayout.WEST);

    }

    public static void main(String[] args) throws IOException {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
