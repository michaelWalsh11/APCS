package Chapters.Unit8Work;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  10/24/24
 * <p>
 * Assignment:   	StringTest
 * <p>
 * Attribution: I worked on this with Christian
 * <p>
 * General Description:   I made I file that has many diffent methods that can be called in order to do the various questions.
 * <p>
 * Advanced:  	Nothing really I just did the questions
 *
 */

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;

public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;
  //Coding Bat problems

  //Number 1:
  public String helloName(String name)
  {
    return "Hello " + name + "!";
  }

  //Number 2:
  public String makeAbba(String a, String b)
  {
    return a + b + b + a;
  }

  //Number 3:
  public String makeTags(String tag, String word)
  {
    return "<" + tag + ">" + word + "</" + tag + ">";
  }

  //Number 4:
  public String extraEnd(String str)
  {
    String name = str.substring(str.length() - 2);
    return name + name + name;
  }

  //Number 5:
  public String firstTwo(String str)
  {
    if (str.length() > 1)
    {
      return str.substring(0, 2);
    }
    return str;
  }

  //Number 6:
  public String firstHalf(String str)
  {
    return str.substring(0, str.length() / 2);
  }

  //Number 7:
  public String conCat(String a, String b)
  {
    if (a != "" && b != "" && a.substring(a.length() - 1).equals(b.substring(0, 1)))
    {
      return a + (b.substring(1));
    }
    return a + b;
  }

  //Number 8:
  public String withoutX(String str)
  {
    if (str.length() > 0 && str.substring(0, 1).equals("x"))
    {
      str = str.substring(1);
    }
    if (str.length() > 0 && str.substring(str.length() - 1).equals("x"))
    {
      str = str.substring(0, str.length() - 1);
    }
    return str;
  }

  //Number 9
  public String withoutEnd(String str)
  {
    return str.substring(1, str.length() - 1);
  }





  //JMAP PROBLEMS
  public static String problem1()
  {
    String filename = "C:\\dictionaries\\words/txt";
    return filename;
  }

  public static boolean problem2(String str)
  {
    return str.endsWith("*");
  }

  public static boolean problem2part2(String str)
  {
    return str.endsWith("**");
  }

  public static String problem3(String str)
  {
    return str.replaceAll("-", "");
  }

  public static String problem4a(String str)
  {
    String month = str.substring(0, 2);
    String day = str.substring(3, 5);
    String year = str.substring(6);

    return day + "-" + month + "-" + year;
  }

  public static String problem4b(String str)
  {
    String month = str.substring(0, str.indexOf("/"));
    String day = str.substring(str.indexOf("/") + 1, str.lastIndexOf("/"));
    String year = str.substring(str.lastIndexOf("/") + 1);

    if (month.length() != 2)
    {
      month = "0" + month;
    }
    if (day.length() != 2)
    {
      day = "0" + day;
    }

    return day + "-" + month + "-" + year;
  }

  public static String problem5a(String str)
  {
    return str.substring(str.lastIndexOf(" ") + 1);
  }
  public static String problem5b(String str)
  {
    return str.substring(str.lastIndexOf(" ") - 1).replaceAll(" ", "");
  }

  public static String problem6(String str)
  {
    return str.substring(1) + str.substring(0, 1);
  }

  public static String problem7(String str)
  {
    String last = str.substring(0, str.indexOf(","));
    String first = str.substring(str.indexOf(",") + 2) + " ";

    return first + last;
  }

  public static String problem10(String str)
  {
    if (str.contains("/*") && str.contains("*/"))
    {
      if (str.indexOf("/*") < str.indexOf("*/"))
      {
        str = str.substring(0, str.indexOf("/*")) + str.substring(str.indexOf("*/") + 2);
      }
    }
    return str;
  }

  public static String problem11(String str, String sub)
  {
    if (str.contains(sub))
    {
      str = str.substring(0, str.indexOf(sub)) + str.substring(str.indexOf(sub) + sub.length());
    }
    return str;
  }

  public static boolean problem13(String str, String section)
  {
    //starts with
    if (str.substring(0, section.length()).equals(section))
    {
      return true;
    }
    if (str.substring(str.length() - section.length()).equals(section))
    {
      return true;
    }
    return false;
  }

  public static String problem14(String str)
  {
    int first = str.indexOf("<");
    int last = str.indexOf(">");
    String tag = "";
    if (first >= 0 && last >= 0)
    {
      tag = "</" + str.substring(first + 1, last) + ">";
    }
    if (str.indexOf(tag) != 0)
    {
      return str.substring(last + 1, str.indexOf(tag));
    }
    return str;
  }


  //Coding Bat

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.YELLOW);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box2.add(input);
    box2.add(Box.createVerticalStrut(20));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public void actionPerformed(ActionEvent e)
  {
    String str = input.getText();

    //str = problem1();
    //str = "" + problem2("*");
    //str = "" + problem2part2("**");
    //str = problem3("892-12-8362");
    //str = problem4b("5/1/2019");
    //str = problem5a("8921 8933 9012 8921");
    //str = problem5b("8921 8933 9012 8921");
    //str = problem6("hello");
    //str = problem7("Walsh, Michael");
    //str = problem10("Hello /* whats up */ you good?");
    //str = problem11("Hello", "ell");
    //str = "" + problem13("I am unintelligent", "iw");
    str = problem14("<b> hello </b>");

    result.setText(str);
    input.selectAll();
  }

  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 360, 160);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

