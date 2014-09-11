package tutorials;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

/**
 * This class is for use as an example of how to convert a normal looking Java
 * application to a Mac themed application.
 * @author JeffreyWalraven
 */
public class MacThemeExample {
    
    public static void main(String[] args) {
        // Create the frame
        JFrame f = new JFrame("Mac Theme Example");
        f.setSize(400, 400);

        // Create the menuBar bar for the application
        JMenuBar menuBar = new JMenuBar();
        // And set it as the application menu bar
        f.setJMenuBar(menuBar);
        
        // Add a file menu with some items that do nothing
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JSeparator());
        fileMenu.add(new JMenuItem("Exit"));
        menuBar.add(fileMenu);
        
        // Add an edit menu with some items that do nothing
        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Copy"));
        editMenu.add(new JMenuItem("Paste"));
        menuBar.add(editMenu);

        // Create a new toolbar
        JToolBar toolBar = new JToolBar();
        f.add(toolBar, BorderLayout.NORTH);
        
        // Create a button for the toolbar
        JButton saveButton = new JButton("Save");
        // Make sure the text is in the correct position
        saveButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        saveButton.setHorizontalTextPosition(SwingConstants.CENTER);
        
        // Set the icon of the button
        saveButton.setIcon(new ImageIcon(MacThemeExample.class.getResource("floppy.png")));
        
        // Make the dimensions of the button consistant
        saveButton.setPreferredSize(new Dimension(80, 60));
        saveButton.setMinimumSize(new Dimension(80, 60));
        saveButton.setMaximumSize(new Dimension(80, 60));
        // Add the button to the toolbar
        toolBar.add(saveButton);
        
        // Create a button for the toolbar
        JButton cogButton = new JButton("Configure");
        // Make sure the text is in the correct position
        cogButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        cogButton.setHorizontalTextPosition(SwingConstants.CENTER);
        
        // Set the icon of the button
        cogButton.setIcon(new ImageIcon(MacThemeExample.class.getResource("cog.png")));
        
        // Make the dimensions of the button consistant
        cogButton.setPreferredSize(new Dimension(80, 60));
        cogButton.setMinimumSize(new Dimension(80, 60));
        cogButton.setMaximumSize(new Dimension(80, 60));
        // Add the button to the toolbar
        toolBar.add(cogButton);
        
        // Create a new JDialog
        JDialog dialog = new JDialog();
        dialog.setTitle("HUD");
        dialog.setSize(300, 350);
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Add a label
        dialog.add(new JLabel("Hello world!  This is a dialog!"), BorderLayout.NORTH);
        
        // Add a button
        dialog.add(new JButton("Click me!"), BorderLayout.SOUTH);
        
        // Show the dialog
        dialog.setVisible(true);

        // Show the JFrame
        f.setVisible(true);
                
    }
}
