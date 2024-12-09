package Project.SmallProjects.Rainbow; // Chapter 5 Question 27

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  9/18/2024
 * Assignment:   	Chapter 5, Question 27
 * <p>
 * Attribution: Me and Max worked on this project together.
 * <p>
 * General Description: This file generates a properly distributioned rainbow that scales.
 * <p>
 * Advanced:  I completed the assignment with some extra data being printed to help with calculations
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  private static final Color skyColor = new Color(0x86, 0xCE, 0xEB);

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    int xCenter = width / 2;
    int yCenter = (int) (height / 1.5);
 
    // Declare and initialize the radius of the large semicircle:
    int radius = Math.min(width, height) / 2;
    int diameter = radius * 2; //easier math

    //variables to use a starting placeholders for middle and size of rainbow aspects
    double smallArch = 1.6;
    double middleArch = 1.3;
    double backGroundArch = 1.9;

    //tuning prints
    System.out.println("Middle " + (int) (diameter * middleArch));
    System.out.println("Small " + (int) (diameter * smallArch));
    System.out.println("backGround " + (int) (diameter * backGroundArch));
    System.out.println("diameter " + diameter);

    // calculates the diameters of the other circles to base middle off of
    int smallDi = (int) (diameter / smallArch);
    int redDi = diameter;

    // calculate Green information
    int middleDi = (redDi + smallDi) / 2;
    int middleRadius = middleDi / 2;

    //prints the rainbow with corresponding colors and data
    //large red semicircle
    g.setColor(Color.RED);
    g.fillArc(xCenter - radius, yCenter - radius, diameter , diameter , 0, 180);

    //middle green semi-circle
    g.setColor(Color.GREEN);
    g.fillArc(xCenter - middleRadius, yCenter - middleRadius, middleDi, middleDi, 0, 180);

    //small pink semi-circle
    g.setColor(Color.PINK);
    g.fillArc(xCenter - ((int) (radius / smallArch)), yCenter - ((int) (radius / smallArch)), (int) (diameter / smallArch) , (int) (diameter / smallArch) , 0, 180);

    //sky Colored Semi-circle
    g.setColor(skyColor);
    g.fillArc(xCenter - ((int) (radius / backGroundArch)), yCenter + 1 - ((int) (radius / backGroundArch)), (int) (diameter / backGroundArch) , (int) (diameter / backGroundArch) , 0, 180);

  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 600, 400);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
